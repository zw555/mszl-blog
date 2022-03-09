package cn.glwsq.blog.controller;

import cn.glwsq.blog.service.ArticleService;
import cn.glwsq.blog.vo.Result;
import cn.glwsq.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // json数据进行交互
@RequestMapping("/articles") // 父url
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 首页 文章列表
     * @param pageParams
     * @return
     */
    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }
}