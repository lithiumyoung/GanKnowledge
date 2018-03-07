package com.young.ganknowledge.bean;

import java.util.List;

/**
 * Created by lithiumyoung on 2017/7/18.
 */

public class GankDayDataBean {

    /**
     * category : ["Android","福利","休息视频","iOS","瞎推荐"]
     * error : false
     * results : {"Android":[{"_id":"59674e20421aa90c9203d388","createdAt":"2017-07-13T18:40:32.354Z","desc":"startActivity流程，流程图很重要","images":["http://img.gank.io/cd0bf3dc-7e36-4016-a5d1-30d70d3a0ffb"],"publishedAt":"2017-07-17T12:22:21.307Z","source":"web","type":"Android","url":"http://smallsoho.com/android/2017/07/12/startActivity%E6%8E%A2%E7%B4%A2/","used":true,"who":"陈龙博"},{"_id":"596bfc7e421aa90c9203d3a4","createdAt":"2017-07-17T07:53:34.298Z","desc":"Android Studio 实用小技巧","publishedAt":"2017-07-17T12:22:21.307Z","source":"web","type":"Android","url":"http://url.cn/4C0BHCZ","used":true,"who":"陈宇明"},{"_id":"596c1f0d421aa97de5c7c944","createdAt":"2017-07-17T10:21:01.844Z","desc":"非常 Material Design 风格的 Dropdown 效果。","images":["http://img.gank.io/603e66c1-7cd4-4ce1-a631-71e4d84b1092"],"publishedAt":"2017-07-17T12:22:21.307Z","source":"chrome","type":"Android","url":"https://github.com/AnthonyFermin/DropDownView","used":true,"who":"代码家"},{"_id":"596c2a86421aa97de5c7c949","createdAt":"2017-07-17T11:09:58.985Z","desc":"Androidn插件化实现原理，同步解析VirtualApk插件化源码实现，带你走进插件的世界。","images":["http://img.gank.io/5c0f3f22-e0dd-476f-b62a-9d722ba82feb"],"publishedAt":"2017-07-17T12:22:21.307Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/a7b36d682b6f","used":true,"who":"Shuyu Guo"}],"iOS":[{"_id":"596c21ed421aa90ca3bb6b17","createdAt":"2017-07-17T10:33:17.307Z","desc":"What's New in LLVM 9. 这绝不仅仅是一篇 WWDC 2017 Session 411 学习笔记。除了有关 LLVM 9.0 的新特性之外，还有关于静态分析器和 Clang 5 Objective-C ARC 的一点看法和经验。","images":["http://img.gank.io/7a0fbf89-44c8-4382-a628-7b4e872c8af8"],"publishedAt":"2017-07-17T12:22:21.307Z","source":"web","type":"iOS","url":"http://yulingtianxia.com/blog/2017/07/17/What-s-New-in-LLVM-2017/","used":true,"who":"杨萧玉"},{"_id":"596c2421421aa90ca209c476","createdAt":"2017-07-17T10:42:41.714Z","desc":"分布式 Swift 任务队列。","images":["http://img.gank.io/9a6f52a5-62aa-4879-b6b7-892d693c421d"],"publishedAt":"2017-07-17T12:22:21.307Z","source":"chrome","type":"iOS","url":"https://github.com/John-Connolly/SwiftQ","used":true,"who":"S"},{"_id":"596c247f421aa90c9203d3a8","createdAt":"2017-07-17T10:44:15.427Z","desc":"iOS 体系对齐算法组件。","images":["http://img.gank.io/eced716c-1f48-41a8-8173-ff6fbd9333e6"],"publishedAt":"2017-07-17T12:22:21.307Z","source":"chrome","type":"iOS","url":"https://github.com/gbmiranda/iOSAlignmentIndicatorViews","used":true,"who":"S"},{"_id":"596c24a5421aa97de5c7c948","createdAt":"2017-07-17T10:44:53.123Z","desc":"iOS 仿 Android SnackBar 提示效果。","images":["http://img.gank.io/3781d8a8-ec33-43b2-ab68-9f60a9cddb3c"],"publishedAt":"2017-07-17T12:22:21.307Z","source":"chrome","type":"iOS","url":"https://github.com/luispadron/LPSnackbar","used":true,"who":"代码家"}],"休息视频":[{"_id":"596b74d3421aa90ca209c474","createdAt":"2017-07-16T22:14:43.701Z","desc":"10年前的动画比真人还真实！阿斗带你速看顶尖CG《贝奥武夫》爵迹可否一战","publishedAt":"2017-07-17T12:22:21.307Z","source":"chrome","type":"休息视频","url":"http://www.bilibili.com/video/av12261700/","used":true,"who":"LHF"}],"瞎推荐":[{"_id":"596c23f7421aa90ca209c475","createdAt":"2017-07-17T10:41:59.155Z","desc":"微信 Web 端管理面板，管理好友和群聊等等。","publishedAt":"2017-07-17T12:22:21.307Z","source":"chrome","type":"瞎推荐","url":"https://github.com/dongweiming/wechat-admin","used":true,"who":"代码家"}],"福利":[{"_id":"59681987421aa97de5c7c92f","createdAt":"2017-07-14T09:08:23.898Z","desc":"7 月 17 日","publishedAt":"2017-07-17T12:22:21.307Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhj5228gwdj20u00u0qv5.jpg","used":true,"who":"带马甲"}]}
     */

    private boolean error;
    private ResultsBean results;
    private List<String> category;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ResultsBean getResults() {
        return results;
    }

    public void setResults(ResultsBean results) {
        this.results = results;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public static class ResultsBean {
        private List<AndroidBean> Android;
        private List<IOSBean> iOS;
        private List<休息视频Bean> 休息视频;
        private List<瞎推荐Bean> 瞎推荐;
        private List<福利Bean> 福利;

        public List<AndroidBean> getAndroid() {
            return Android;
        }

        public void setAndroid(List<AndroidBean> Android) {
            this.Android = Android;
        }

        public List<IOSBean> getIOS() {
            return iOS;
        }

        public void setIOS(List<IOSBean> iOS) {
            this.iOS = iOS;
        }

        public List<休息视频Bean> get休息视频() {
            return 休息视频;
        }

        public void set休息视频(List<休息视频Bean> 休息视频) {
            this.休息视频 = 休息视频;
        }

        public List<瞎推荐Bean> get瞎推荐() {
            return 瞎推荐;
        }

        public void set瞎推荐(List<瞎推荐Bean> 瞎推荐) {
            this.瞎推荐 = 瞎推荐;
        }

        public List<福利Bean> get福利() {
            return 福利;
        }

        public void set福利(List<福利Bean> 福利) {
            this.福利 = 福利;
        }

        public static class AndroidBean {
            /**
             * _id : 59674e20421aa90c9203d388
             * createdAt : 2017-07-13T18:40:32.354Z
             * desc : startActivity流程，流程图很重要
             * images : ["http://img.gank.io/cd0bf3dc-7e36-4016-a5d1-30d70d3a0ffb"]
             * publishedAt : 2017-07-17T12:22:21.307Z
             * source : web
             * type : Android
             * url : http://smallsoho.com/android/2017/07/12/startActivity%E6%8E%A2%E7%B4%A2/
             * used : true
             * who : 陈龙博
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;
            private List<String> images;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }
        }

        public static class IOSBean {
            /**
             * _id : 596c21ed421aa90ca3bb6b17
             * createdAt : 2017-07-17T10:33:17.307Z
             * desc : What's New in LLVM 9. 这绝不仅仅是一篇 WWDC 2017 Session 411 学习笔记。除了有关 LLVM 9.0 的新特性之外，还有关于静态分析器和 Clang 5 Objective-C ARC 的一点看法和经验。
             * images : ["http://img.gank.io/7a0fbf89-44c8-4382-a628-7b4e872c8af8"]
             * publishedAt : 2017-07-17T12:22:21.307Z
             * source : web
             * type : iOS
             * url : http://yulingtianxia.com/blog/2017/07/17/What-s-New-in-LLVM-2017/
             * used : true
             * who : 杨萧玉
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;
            private List<String> images;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }
        }

        public static class 休息视频Bean {
            /**
             * _id : 596b74d3421aa90ca209c474
             * createdAt : 2017-07-16T22:14:43.701Z
             * desc : 10年前的动画比真人还真实！阿斗带你速看顶尖CG《贝奥武夫》爵迹可否一战
             * publishedAt : 2017-07-17T12:22:21.307Z
             * source : chrome
             * type : 休息视频
             * url : http://www.bilibili.com/video/av12261700/
             * used : true
             * who : LHF
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 瞎推荐Bean {
            /**
             * _id : 596c23f7421aa90ca209c475
             * createdAt : 2017-07-17T10:41:59.155Z
             * desc : 微信 Web 端管理面板，管理好友和群聊等等。
             * publishedAt : 2017-07-17T12:22:21.307Z
             * source : chrome
             * type : 瞎推荐
             * url : https://github.com/dongweiming/wechat-admin
             * used : true
             * who : 代码家
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 福利Bean {
            /**
             * _id : 59681987421aa97de5c7c92f
             * createdAt : 2017-07-14T09:08:23.898Z
             * desc : 7 月 17 日
             * publishedAt : 2017-07-17T12:22:21.307Z
             * source : chrome
             * type : 福利
             * url : https://ws1.sinaimg.cn/large/610dc034ly1fhj5228gwdj20u00u0qv5.jpg
             * used : true
             * who : 带马甲
             */

            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }
    }
}
