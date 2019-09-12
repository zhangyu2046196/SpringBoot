package com.youyuan.elasticsearch.repository;

import com.youyuan.elasticsearch.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhangyu
 * @version 1.0
 * @description 自定义接口继承ElasticsearchRepository接口
 * @date 2018/12/27 11:10
 */
public interface EsRepository extends ElasticsearchRepository<Book,Integer> {
}
