package com.msk.seller.validator;

import com.hoperun.plug.spring.base.BaseValidator;
import com.msk.common.bean.RsRequest;
import com.msk.core.entity.SlEpBrand;

/**
 * Created by cx on 2016/2/19.
 */
public class ISL231148Validator extends BaseValidator<RsRequest<SlEpBrand>> {

    @Override
    public void validatorData(RsRequest<SlEpBrand> entity) {
        SlEpBrand slEpBrand = entity.getParam();
        if (null != slEpBrand) {
            this.validatorRequired("企业ID",slEpBrand.getEpId());
        }
    }
}
