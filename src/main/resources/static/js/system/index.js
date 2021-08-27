let app = new Vue({
    el: '#app',
    data: {
        // mi_index: '京东商城',
        // mi_url: 'https://www.jd.com',
        mi_type: []
    },
    created:function() { // auto exec after Vue object load successfully
        // data initialization
        this.mi_type = [
            {name: `小米`, url:`https://www.mi.com/`},
            {name: `淘宝`, url:`https://www.taobao.com/`},
            {name: `京东`, url:`https://www.jd.com/`},
            {name: `拼多多`, url:`https://youhui.pinduoduo.com/`},
        ]
    }
})