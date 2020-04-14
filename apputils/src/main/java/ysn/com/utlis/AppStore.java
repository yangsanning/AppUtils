package ysn.com.utlis;

/**
 * @Author yangsanning
 * @ClassName AppStore
 * @Description 应用市场包名
 * @Date 2020/4/15
 * @History 2020/4/15 author: description:
 */
public enum AppStore {

    /**
     * 腾讯应用宝
     */
    YING_YONG_BAO("com.tencent.android.qqdownloader"),

    /**
     * 360手机助手
     */
    QI_HOO("com.qihoo.appstore"),

    /**
     * 百度手机助手
     */
    BAI_DU("com.baidu.appsearch"),

    /**
     * 小米应用商店
     */
    XIAO_MI("com.xiaomi.market"),

    /**
     * 华为应用商店
     */
    HUA_WEI("com.huawei.appmarket"),

    /**
     * Google Play Store
     */
    GOOGLE("com.android.vending"),

    /**
     * 魅族应用市场
     */
    MEI_ZU("com.meizu.mstore"),

    /**
     * 豌豆荚
     */
    WAN_DOU_JIA("com.wandoujia.phoenix2"),

    /**
     * OPPO应用商店
     */
    OPPO("com.oppo.market"),

    /**
     * VIVO应用商店
     */
    VIVO("com.bbk.appstore"),

    /**
     * 搜狗应用市场
     */
    SO_GOU("com.sogou.androidtool"),

    /**
     * 三星应用商店
     */
    SAM_SUNG("com.sec.android.app.samsungapps"),

    /**
     * 联想应用商店
     */
    LENOVO("com.lenovo.leos.appstore"),

    /**
     * 中兴应用商店
     */
    ZHONG_XING("zte.com.market"),

    /**
     * 安智应用商店
     */
    AN_ZHI("com.hiapk.marketpho"),

    /**
     * 应用汇
     */
    YING_YONG_HUI("com.yingyonghui.market"),

    /**
     * GO商店
     */
    GO("com.hiapk.marketpho"),

    /**
     * 酷派应用商店
     */
    KU_PAI("com.yulong.android.coolmart"),

    /**
     * 酷市场
     */
    KU("com.coolapk.market"),

    /**
     * 金立软件商店
     */
    JIN_LI("\tcom.gionee.aora.market"),

    /**
     * 机锋应用市场
     */
    JI_FENG("com.mappn.gfan"),

    /**
     * 安卓市场
     */
    ANDROID("com.hiapk.marketpho"),

    /**
     * 91手机助手
     */
    DRAGON("com.dragon.android.pandaspace"),

    /**
     * PP手机助手
     */
    PP("com.pp.assistant"),
    ;

    public final String appPackage;

    AppStore(String appPackage) {
        this.appPackage = appPackage;
    }
}
