package com.youyuan.springboot.cache.service;

import com.youyuan.springboot.cache.bean.Employee;
import com.youyuan.springboot.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * @version 1.0
 * @description 员工接口
 * @date 2018/12/19 11:27
 */
@CacheConfig(cacheNames = "emp")//用于公共配置
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询
     * @param id 主键
     * @return
     *
     * @Cacheable:标记方法使用缓存，查询的时候先去缓存中找，如果找到直接返回，没有就穿透数据库，查询出的结果返回并放到缓存
     *      cacheNames:缓存的名字，每个缓存管理器管理多个缓存cache组件，每个cache组件有一个名字
     *      key:缓存的key,默认是方法的参数， 也可以使用spel表达式指定key  例如使用#id获取参数id的值做为缓存的key
     *      keyGenerator:key的生成器，和指定的key二选一
     *      condition:判断条件，条件成立时才把结果缓存起来 condition = "#id>0"
     *      cacheManager:缓存管理器的名字
     *      unless:条件不成立的时候缓存  unless = "result==null"  result是spel表达式中获取返回结果
     */
    //@Cacheable(value = "emp",key = "#id",condition = "#id>0",unless = "#result==null")
    //@Cacheable(value = "emp",key="#root.methodName+'['+#id+']'")//自定义key 配合spel表达式使用  拼接成key  getEmpById[id]
    //@Cacheable(value = "emp",key="'genval['+#id+']'")//自定义key 配合spel表达式使用 指定key的格式  genval[id]
    //@Cacheable(value = "emp",keyGenerator = "keyGenerator")//自定义generatorkey生成器指定key
    @Cacheable(value = "emp",key = "#id")
    public Employee getEmpById(Integer id){
        System.out.println("查询"+id+"号员工");
        return employeeMapper.getEmpById(id);
    }

    /**
     * 保存
     * @param employee  员  工
     */
    public void insert(Employee employee){
        employeeMapper.insert(employee);
    }

    /**
     * 更新
     * @param employee     员  工
     *
     *@CachePut是先执行目标方法，然后获取目标方法返回结果，然后查看缓存中是否存在，存在就更新缓存，不存在添加
     *
     *因为要想查询和更新的时候修改的缓存一次，所以缓存的cachename和key要一致
     *更新缓存时方法要有返回值，返回缓存的内容，因为缓存是针对方法操作
     *
     */
    @CachePut(value = "emp",key = "#employee.id")
    public Employee update(Employee employee){
        employeeMapper.update(employee);
        return employee;
    }

    /**
     * 删除
     * @param id 主键
     *
     * @CacheEvict清除缓存，默认是在目标方法执行后执行
     * cacheName：指定缓存组件名称
     * key：删除缓存的key,需要与保存缓存和修改缓存的key一致,默认是方法参数名
     * allEntries：删除当前缓存组件全部缓存 默认false
     * beforeInvocation：true 在目标方法执行前清除缓存，默认是在目标方法执行后清除缓存，如果方法报错在方法执行前执行那缓存也会删除
     */
    //@CacheEvict(cacheNames = "emp",key = "#id")
    //@CacheEvict(cacheNames = "emp",allEntries = true)
    @CacheEvict(cacheNames = "emp",beforeInvocation = true)
    public void delete(Integer id){
        System.out.println("删除"+id+"号员工");//模拟删除数据库 信息
        //employeeMapper.delete(id);
        int i=10/0;
    }

    /**
     *  根据用户名称查询
     * @param lastName 用户名称 数据
     * @return 用户实体bean
     *
     * @Caching组合注解，包含@Cacheable、@Cacheput、@CacheEvict,每个子注解还可以配置多个
     *
     */
    @Caching(
            cacheable = {
                    @Cacheable(cacheNames = "emp",key="#lastName")
            },
            put = {
                    @CachePut(cacheNames = "emp",key = "#result.id"),
                    @CachePut(cacheNames = "emp",key = "#result.email")
            }
    )
    public Employee getEmpByLastName(String lastName){
        return employeeMapper.getEmpByLastName(lastName);
    }
}
