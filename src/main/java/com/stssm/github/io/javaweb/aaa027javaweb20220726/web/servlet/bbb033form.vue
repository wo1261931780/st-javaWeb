<template>
	<div>
		<el-form
			ref="formModel"
			:disabled="formModelDisabled"
			:hide-required-asterisk="true"
			:model="formModelData"
			:rules="formModelRules"
			label-position="right"
			label-width="125px"
		>
			<el-row :gutter="15">
				<el-col :span="24" style="width: 100%">
					<el-row :gutter="15">
						<el-col :span="24" style="width: 40%">
							<el-row :gutter="15">
								<el-col
									v-if="formModelControl.field105.isShow"
									:offset="0"
									:span="24"
								>
									<el-form-item-ex label="单行文本" prop="field105">
										<el-input
											v-model="formModelData.field105"
											:disabled="formModelControl.field105.disabled"
											:style="{ width: '100%' }"
											clearable
											placeholder="请输入单行文本"
											show-word-limit
										>
										</el-input>
									</el-form-item-ex>
								</el-col>
							</el-row>
						</el-col>
						<el-col :span="24" style="width: 40%">
							<el-row :gutter="15">
								<el-col
									v-if="formModelControl.field108.isShow"
									:offset="0"
									:span="24"
								>
									<el-form-item-ex label="单行文本" prop="field108">
										<el-input
											v-model="formModelData.field108"
											:disabled="formModelControl.field108.disabled"
											:style="{ width: '100%' }"
											clearable
											placeholder="请输入单行文本"
											show-word-limit
										>
										</el-input>
									</el-form-item-ex>
								</el-col>
							</el-row>
						</el-col>
						<el-col :span="24" style="width: 20%">
							<el-row :gutter="15">
								<el-col
									v-if="formModelControl.field110.isShow"
									:offset="0"
									:span="24"
								>
									<el-form-item-ex label-width="0" prop="field110">
										<el-button
											:disabled="formModelControl.field110.disabled"
											:loading="formModelControl.field110.loading"
											type="primary"
											@click.native="formModel_field110ClickHandler"
										>
											自定义按钮
										</el-button>
									</el-form-item-ex>
								</el-col>
								<el-col
									v-if="formModelControl.field112.isShow"
									:offset="0"
									:span="24"
								>
									<el-form-item-ex label-width="0" prop="field112">
										<el-button
											:disabled="formModelControl.field112.disabled"
											:loading="formModelControl.field112.loading"
											type="primary"
											@click.native="formModel_field112ClickHandler"
										>
											自定义按钮
										</el-button>
									</el-form-item-ex>
								</el-col>
							</el-row>
						</el-col>
					</el-row>
				</el-col>
				<el-col :span="24" style="width: 100%">
					<el-row :gutter="15">
						<el-col
							v-if="formModelControl.field103.isShow"
							:offset="0"
							:span="24"
						>
							<el-table
								ref="formModel_field103"
								:data="formModelControl.field103.tableData"
								border
								height="450"
								highlight-current-row
								stripe
								style="width: 100%"
								@current-change="formModel_field103_handleCurrentChange"
							>
								<el-table-column
									v-for="(th, key) in formModelControl.field103.tableHeader"
									:key="key"
									:fixed="key < 0"
									:formatter="th.formatter"
									:label="th.label"
									:min-width="th.width"
									:prop="th.prop"
									:show-overflow-tooltip="true"
								></el-table-column>
							</el-table>
						</el-col>
					</el-row>
				</el-col>
				<el-col v-if="formModelControl.field106.isShow" :offset="0" :span="24">
					<el-pagination
						:current-page.sync="formModelData.currPage"
						:page-size.sync="formModelData.pageSize"
						:page-sizes="[10, 20, 50, 100, 200, 300, 400]"
						:total="formModelControl.field106.total"
						layout="total, sizes, prev, pager, next, jumper"
						@size-change="formModel_query"
						@current-change="formModel_query"
					>
					</el-pagination>
				</el-col>
			</el-row>
		</el-form>
	</div>
</template>
<script>
	export default {
		mixins: [],
		name: "",
		components: {},
		props: [],
		data() {
			return {
				formModelDisabled: false,
				formModelData: {
					field105: undefined,
					field108: undefined,
					currPage: 1,
					pageSize: 20,
				},
				formModelControl: {
					field105: {
						isShowType: "v-if",
						isShow: true,
						disabled: false,
					},
					field108: {
						isShowType: "v-if",
						isShow: true,
						disabled: false,
					},
					field110: {
						isShowType: "v-if",
						isShow: true,
						disabled: false,
						url: undefined,
					},
					field112: {
						isShowType: "v-if",
						isShow: true,
						disabled: false,
						url: undefined,
					},
					field103: {
						isShowType: "v-if",
						isShow: true,
						disabled: false,
						tableHeader: [
							{
								prop: "ziduan1",
								label: "字段1",
								width: 120,
							},
							{
								prop: "ziduan2",
								label: "字段2",
								width: 120,
							},
							{
								prop: "ziduan3",
								label: "字段3",
								width: 120,
							},
							{
								prop: "ziduan4",
								label: "字段4",
								width: 120,
							},
							{
								prop: "ziduan5",
								label: "字段5",
								width: 120,
							},
						],
						url: undefined,
						tableData: [],
						currentRow: null,
					},
					field106: {
						isShowType: "v-if",
						isShow: true,
						disabled: false,
						total: 0,
					},
				},
				formModelRules: {
					field105: [
						{
							required: false,
							message: "请输入单行文本",
							trigger: "blur",
						},
						{
							required: false,
							message: "请输入单行文本",
							trigger: "change",
						},
					],
					field108: [
						{
							required: false,
							message: "请输入单行文本",
							trigger: "blur",
						},
						{
							required: false,
							message: "请输入单行文本",
							trigger: "change",
						},
					],
				},
			};
		},
		computed: {},
		watch: {},
		created() {},
		mounted() {
			var _this = this;
			axios({
				methods: "get",
				url: "",
			}).then(function (resp) {
				this.formModelData = resp.data();
			});
		},
		methods: {
			formModel_field110ClickHandler() {
				//todo here
			},
			formModel_field112ClickHandler() {
				//todo here
			},
			/*搜索表格field103选中行*/
			formModel_field103_handleCurrentChange(val) {
				this.formModelControl.field103.currentRow = val;
			},
		},
	};
</script>
<style scoped></style>
