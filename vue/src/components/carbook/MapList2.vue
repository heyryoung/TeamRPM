<template>
	<div id="app">
		<vue-daum-map
				:appKey="appKey"
				:center="{lat:37.552608, lng:126.937595}"
				:level.sync="level"
				:mapTypeId="mapTypeId"
				:libraries= "services"
				@load="onLoad"
				@update:center="center=$event"
				style="width:500px;height:400px;"/>
	</div>
</template>

<script>
	/* global kakao */
	// kakao 네임스페이스를 사용하기 위헤서 위 주석을 사용해야 함.
	// 아니면 eslint 옵션을 수정해야 함

	import VueDaumMap from 'vue-daum-map'

	export default {
		name: 'app',
		data: () => ({
			appKey: '2a0796961d8f22a7436b53de7505245c',
			// 여기에서 값으로 바인딩 하지않고 template의 prop(center)으로 바로 할당
			//center: {lat:33.450701, lng:126.570667},
			level: 3,
			mapTypeId: VueDaumMap.MapTypeId.NORMAL,
			libraries: [],
			services:[],
			ps: {},
			mapObj: null
		}),
		components: {
			VueDaumMap
		},
		methods: {
			onLoad (map) {
				this.mapObj = map;

				this.keyword()



			},
			keyword(){
				const places = new kakao.maps.services.Places();
				places.categorySearch('OL7', this.cbGetCategory, this.mapObj)




			},
			cbGetCategory(result , status){
				if(status === kakao.maps.services.Status.OK){
					alert('있다')
				}
				else{
					alert('없다')
				}
			},
			addMarker(){


				kakao.maps.event.addListener(new kakao.maps.Marker({
					//position: new kakao.maps.LatLng(33.450701, 126.570667),
					position: this.mapObj.getCenter(),
					map: this.mapObj
				}), 'click', function () {
					alert('marker click')


				})
			},

		}
	}
</script>