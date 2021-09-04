let app = new Vue({
    el: '#app',
    data: {
        first_page: [],
        mi_type: [],
        product_type:[],
        left_menu:[],
        lunbo: [],
        lunsi_first: [],
        lunsi_back: []
    },
    created:function() { // auto exec after Vue object load successfully
        // data initialization
        // send ajax request
        let _this = this; // define a variable to represent current object

        axios.get("http://localhost:8000/firstPageData",{params:{}})
            .then(function(ret){   // return data object from Controller
                console.log(ret.data);// { sign: boolean, msg: "", data: null }
                let dataType = ret.data;
                dataType.msg = undefined;
                if(dataType.sign===true){
                    _this.mi_type = dataType.data.urlBean;
                    _this.product_type = dataType.data.ProductType;
                    _this.left_menu = dataType.data.LeftMenu;
                    _this.lunbo = dataType.data.LunBo;
                    _this.lunsi_first = dataType.data.LunsiFirst;
                    _this.lunsi_back = dataType.data.LunsiBack;
                } else{
                    alert(dataType.msg);
                }
            })
    }
})