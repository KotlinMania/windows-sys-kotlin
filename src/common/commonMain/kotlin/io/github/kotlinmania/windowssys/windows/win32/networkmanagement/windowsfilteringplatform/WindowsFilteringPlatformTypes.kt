package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public typealias DlAddressType = Int

public typealias FwpmAppcNetworkCapabilityType = Int

public fun interface FwpmCalloutChangeCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, change: ConstPtr<FwpmCalloutChange0>)
}

public typealias FwpmCalloutChangeCallback0 = FwpmCalloutChangeCallback0Fn?

public typealias FwpmChangeType = Int

public fun interface FwpmConnectionCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, eventtype: FwpmConnectionEventType, connection: ConstPtr<FwpmConnection0>)
}

public typealias FwpmConnectionCallback0 = FwpmConnectionCallback0Fn?

public typealias FwpmConnectionEventType = Int

public fun interface FwpmDynamicKeywordCallback0Fn {
    public operator fun invoke(notification: MutPtr<CVoid>, context: MutPtr<CVoid>)
}

public typealias FwpmDynamicKeywordCallback0 = FwpmDynamicKeywordCallback0Fn?

public typealias FwpmEngineOption = Int

public typealias FwpmFieldType = Int

public fun interface FwpmFilterChangeCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, change: ConstPtr<FwpmFilterChange0>)
}

public typealias FwpmFilterChangeCallback0 = FwpmFilterChangeCallback0Fn?

public typealias FwpmFilterFlags = UInt

public fun interface FwpmNetEventCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, event: ConstPtr<FwpmNetEvent1>)
}

public typealias FwpmNetEventCallback0 = FwpmNetEventCallback0Fn?

public fun interface FwpmNetEventCallback1Fn {
    public operator fun invoke(context: MutPtr<CVoid>, event: ConstPtr<FwpmNetEvent2>)
}

public typealias FwpmNetEventCallback1 = FwpmNetEventCallback1Fn?

public fun interface FwpmNetEventCallback2Fn {
    public operator fun invoke(context: MutPtr<CVoid>, event: ConstPtr<FwpmNetEvent3>)
}

public typealias FwpmNetEventCallback2 = FwpmNetEventCallback2Fn?

public fun interface FwpmNetEventCallback3Fn {
    public operator fun invoke(context: MutPtr<CVoid>, event: ConstPtr<FwpmNetEvent4>)
}

public typealias FwpmNetEventCallback3 = FwpmNetEventCallback3Fn?

public fun interface FwpmNetEventCallback4Fn {
    public operator fun invoke(context: MutPtr<CVoid>, event: ConstPtr<FwpmNetEvent5>)
}

public typealias FwpmNetEventCallback4 = FwpmNetEventCallback4Fn?

public typealias FwpmNetEventType = Int

public fun interface FwpmProviderChangeCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, change: ConstPtr<FwpmProviderChange0>)
}

public typealias FwpmProviderChangeCallback0 = FwpmProviderChangeCallback0Fn?

public fun interface FwpmProviderContextChangeCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, change: ConstPtr<FwpmProviderContextChange0>)
}

public typealias FwpmProviderContextChangeCallback0 = FwpmProviderContextChangeCallback0Fn?

public typealias FwpmProviderContextType = Int

public typealias FwpmServiceState = Int

public fun interface FwpmSublayerChangeCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, change: ConstPtr<FwpmSublayerChange0>)
}

public typealias FwpmSublayerChangeCallback0 = FwpmSublayerChangeCallback0Fn?

public typealias FwpmSubscriptionFlags = UInt

public fun interface FwpmSystemPortsCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, sysports: ConstPtr<FwpmSystemPorts0>)
}

public typealias FwpmSystemPortsCallback0 = FwpmSystemPortsCallback0Fn?

public typealias FwpmSystemPortType = Int

public fun interface FwpmVswitchEventCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, vswitchevent: ConstPtr<FwpmVswitchEvent0>): UInt
}

public typealias FwpmVswitchEventCallback0 = FwpmVswitchEventCallback0Fn?

public typealias FwpmVswitchEventType = Int

public typealias FwpActionType = UInt

public typealias FwpAf = Int

public typealias FwpClassifyOptionType = Int

public typealias FwpDataType = Int

public typealias FwpDirection = Int

public typealias FwpEtherEncapMethod = Int

public typealias FwpFilterEnumType = Int

public typealias FwpIpVersion = Int

public typealias FwpMatchType = Int

public typealias FwpNetworkConnectionPolicySettingType = Int

public typealias FwpVswitchNetworkType = Int

public typealias IkeextAuthenticationImpersonationType = Int

public typealias IkeextAuthenticationMethodType = Int

public typealias IkeextCertAuth = UInt

public typealias IkeextCertConfigType = Int

public typealias IkeextCertCriteriaNameType = Int

public typealias IkeextCertFlags = UInt

public typealias IkeextCipherType = Int

public typealias IkeextDhGroup = Int

public typealias IkeextEapAuthenticationFlags = UInt

public typealias IkeextEmSaState = Int

public typealias IkeextIntegrityType = Int

public typealias IkeextKerberosAuthenticationFlags = UInt

public typealias IkeextKeyModuleType = Int

public typealias IkeextMmSaState = Int

public typealias IkeextPolicyFlag = UInt

public typealias IkeextPresharedKeyAuthenticationFlags = UInt

public typealias IkeextQmSaState = Int

public typealias IkeextReservedAuthenticationFlags = UInt

public typealias IkeextSaRole = Int

public typealias IpsecAuthType = Int

public typealias IpsecCipherType = Int

public typealias IpsecDospFlags = UInt

public typealias IpsecFailurePoint = Int

public fun interface IpsecKeyManagerDictateKey0Fn {
    public operator fun invoke(inboundsadetails: MutPtr<IpsecSaDetails1>, outboundsadetails: MutPtr<IpsecSaDetails1>, keyingmodulegenkey: MutPtr<Bool>): UInt
}

public typealias IpsecKeyManagerDictateKey0 = IpsecKeyManagerDictateKey0Fn?

public fun interface IpsecKeyManagerKeyDictationCheck0Fn {
    public operator fun invoke(iketraffic: ConstPtr<IkeextTraffic0>, willdictatekey: MutPtr<Bool>, weight: MutPtr<UInt>)
}

public typealias IpsecKeyManagerKeyDictationCheck0 = IpsecKeyManagerKeyDictationCheck0Fn?

public fun interface IpsecKeyManagerNotifyKey0Fn {
    public operator fun invoke(inboundsa: ConstPtr<IpsecSaDetails1>, outboundsa: ConstPtr<IpsecSaDetails1>)
}

public typealias IpsecKeyManagerNotifyKey0 = IpsecKeyManagerNotifyKey0Fn?

public typealias IpsecPfsGroup = Int

public typealias IpsecPolicyFlag = UInt

public typealias IpsecSaBundleFlags = UInt

public fun interface IpsecSaContextCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, change: ConstPtr<IpsecSaContextChange0>)
}

public typealias IpsecSaContextCallback0 = IpsecSaContextCallback0Fn?

public typealias IpsecSaContextEventType0 = Int

public typealias IpsecTokenMode = Int

public typealias IpsecTokenPrincipal = Int

public typealias IpsecTokenType = Int

public typealias IpsecTrafficType = Int

public typealias IpsecTransformType = Int
