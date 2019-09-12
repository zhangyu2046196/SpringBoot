package com.youyuan.elasticsearch;

import com.youyuan.elasticsearch.bean.Actile;
import com.youyuan.elasticsearch.bean.Book;
import com.youyuan.elasticsearch.repository.EsRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03ElasticsearchApplicationTests {

	private final String INDEX="youyuan";//ealsticsearch的index

	private final String TYPE="news";//elasticsearch的type

	@Autowired
	private JestClient jestClient;

	@Autowired
	private EsRepository esRepository;

	/**
	 * 通过repository接口和elasticsearch交互
	 */
	@Test
	public void save(){
		System.out.println(esRepository);
		esRepository.save(new Book(1,"三国","罗贯中"));
	}

	/**
	 * 保存信息
	 */
	@Test
	public void contextLoads() {
		//保存的内容
		Actile actile=new Actile(1,"罗贯中","三国","精彩的内容......");
		//创建索引内容
		Index index = new Index.Builder(actile).index(INDEX).type(TYPE).build();
		try {
			//执行保存
			jestClient.execute(index);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询信息
	 */
	@Test
	public void search(){
		//查询条件
		String json="{\n" +
				"    \"query\" : {\n" +
				"        \"match_phrase\" : {\n" +
				"            \"title\" : \"三国\"\n" +
				"        }\n" +
				"    }\n" +
				"}";
		//创建查询条件和指定index type
		Search search = new Search.Builder(json).addIndex(INDEX).addType(TYPE).build();
		try {
			//执行查询
			SearchResult searchResult = jestClient.execute(search);
			System.out.println("查询结果"+searchResult.getJsonString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

