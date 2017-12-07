package develop.beta1139.epoxytest

import com.airbnb.epoxy.TypedEpoxyController


/**
 * Created by hara_tomohiro on 2017/12/07.
 */
class TestController : TypedEpoxyController<List<Data>>() {

    override fun buildModels(datas: List<Data>) {
        var id = 0

        for (data in datas) {
            HeaderBindingModel_()
                    .title(data.title)
                    .id(id++)
                    .addTo(this)

            for (item in data.items) {
                TestBindingModel_()
                        .text(item)
                        .id(id++)
                        .addTo(this)
            }
        }
    }
}