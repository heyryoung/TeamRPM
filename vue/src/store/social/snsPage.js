import axios from "axios";

const state = {
    boardList: [],
    board:{},
}
const getters = {
    getBoardList: function(state){
        return state.boardList
    }
}
const actions = {
    async viewList(){
        alert(`들어`)
        let url = `http://localhost:8080/viewList`
        axios
            .get(url)
            .then(res => {
                alert(`들어옴`+res.data+res.board)
                if(res.data ==="SUCCESS") {
                    alert(`${res.board}`)
                    this.boardList = res.board
                    for (let i in res.board) {
                        this.board = i
                        this.$store.commit('viewList', this.board)
                    }
                    alert(`${this.boardList}`)
                }
            })
            .catch(() => {
                alert(`viewList axios Error`)
            })
    }

}
const mutations = {
    viewList(state, board){
        state.boardList.push(board)
    }
}

export default {
    state,
    getters,
    actions,
    mutations
}