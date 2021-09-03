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
        
        axios.get("http://localhost:8000/miTypeList",{params:{}})
            .then(function(ret){   // return data object from Controller
                console.log(ret.data);// { sign: boolean, msg: "", data: null }
                let dataType = ret.data;
                dataType.msg = undefined;
                if(dataType.sign===true){
                    // this.mi_type
                    //_this.mi_type = dataType.data;
                } else{
                    alert(dataType.msg);
                }
            })
        axios.get("http://localhost:8000/productTypeList",{params:{}})
            .then(function(ret){   // return data object from Controller
                console.log(ret.data);// { sign: boolean, msg: "", data: null }
                let dataType = ret.data;
                if(dataType.sign===true){
                    // this.product_type
                    //_this.product_type = dataType.data;
                } else{
                    alert(dataType.msg);
                }
            })
        axios.get("http://localhost:8000/leftMenuList",{params:{}})
            .then(function(ret){   // return data object from Controller
                console.log(ret.data);// { sign: boolean, msg: "", data: null }
                let dataType = ret.data;
                if(dataType.sign===true){
                    // this.left_menu
                    //_this.left_menu = dataType.data;
                } else{
                    alert(dataType.msg);
                }
            })
        axios.get("http://localhost:8000/lunBoList",{params:{}})
            .then(function(ret){   // return data object from Controller
                console.log(ret.data);// { sign: boolean, msg: "", data: null }
                let dataType = ret.data;
                if(dataType.sign===true){
                    // this.lunbo
                    //_this.lunbo = dataType.data;
                } else{
                    alert(dataType.msg);
                }
            })
        axios.get("http://localhost:8000/lunsiFirstList",{params:{}})
            .then(function(ret){   // return data object from Controller
                console.log(ret.data);// { sign: boolean, msg: "", data: null }
                let dataType = ret.data;
                if(dataType.sign===true){
                    // this.lunsi_first
                    //_this.lunsi_first = dataType.data;
                } else{
                    alert(dataType.msg);
                }
            })
        axios.get("http://localhost:8000/lunsiBackList",{params:{}})
            .then(function(ret){   // return data object from Controller
                console.log(ret.data);// { sign: boolean, msg: "", data: null }
                let dataType = ret.data;
                if(dataType.sign===true){
                    // this.lunsi_back
                    //_this.lunsi_back = dataType.data;
                } else{
                    alert(dataType.msg);
                }
            })
    }
})