package xyz.yidajiabei.service;

import xyz.yidajiabei.domain.FirstPage;

import java.util.List;

public interface IFirstPageService {
    public List<FirstPage> queryAll(int type);
}
