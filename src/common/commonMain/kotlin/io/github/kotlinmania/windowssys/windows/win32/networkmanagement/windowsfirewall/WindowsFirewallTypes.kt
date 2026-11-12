package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias FwDynamicKeywordAddressEnumFlags = Int

public typealias FwDynamicKeywordAddressFlags = Int

public typealias FwDynamicKeywordOriginType = Int

public typealias IcsTargettype = Int

public typealias InetFirewallAcChangeType = Int

public typealias InetFirewallAcCreationType = Int

public typealias NetconmgrEnumFlags = Int

public typealias NetconuiConnectFlags = Int

public typealias NetconCharacteristicFlags = Int

public typealias NetconMediatype = Int

public typealias NetconStatus = Int

public typealias NetconType = Int

public typealias NetisoErrorType = Int

public typealias NetisoFlag = Int

public typealias NetFwAction = Int

public typealias NetFwAuthenticateType = Int

public typealias NetFwEdgeTraversalType = Int

public typealias NetFwIpProtocol = Int

public typealias NetFwIpVersion = Int

public typealias NetFwModifyState = Int

public typealias NetFwPolicyType = Int

public typealias NetFwProfileType = Int

public typealias NetFwProfileType2 = Int

public typealias NetFwRuleCategory = Int

public typealias NetFwRuleDirection = Int

public typealias NetFwScope = Int

public typealias NetFwServiceType = Int

public fun interface PacChangesCallbackFnFn {
    public operator fun invoke(context: ConstPtr, pchange: ConstPtr)
}

public typealias PacChangesCallbackFn = PacChangesCallbackFnFn?

public fun interface PfnFwadddynamickeywordaddress0Fn {
    public operator fun invoke(dynamickeywordaddress: ConstPtr): UInt
}

public typealias PfnFwadddynamickeywordaddress0 = PfnFwadddynamickeywordaddress0Fn?

public fun interface PfnFwdeletedynamickeywordaddress0Fn {
    public operator fun invoke(dynamickeywordaddressid: Guid): UInt
}

public typealias PfnFwdeletedynamickeywordaddress0 = PfnFwdeletedynamickeywordaddress0Fn?

public fun interface PfnFwenumdynamickeywordaddressbyid0Fn {
    public operator fun invoke(dynamickeywordaddressid: Guid, dynamickeywordaddressdata: MutPtr): UInt
}

public typealias PfnFwenumdynamickeywordaddressbyid0 = PfnFwenumdynamickeywordaddressbyid0Fn?

public fun interface PfnFwenumdynamickeywordaddressesbytype0Fn {
    public operator fun invoke(flags: UInt, dynamickeywordaddressdata: MutPtr): UInt
}

public typealias PfnFwenumdynamickeywordaddressesbytype0 = PfnFwenumdynamickeywordaddressesbytype0Fn?

public fun interface PfnFwfreedynamickeywordaddressdata0Fn {
    public operator fun invoke(dynamickeywordaddressdata: ConstPtr): UInt
}

public typealias PfnFwfreedynamickeywordaddressdata0 = PfnFwfreedynamickeywordaddressdata0Fn?

public fun interface PfnFwupdatedynamickeywordaddress0Fn {
    public operator fun invoke(dynamickeywordaddressid: Guid, updatedaddresses: Pcwstr, append: Bool): UInt
}

public typealias PfnFwupdatedynamickeywordaddress0 = PfnFwupdatedynamickeywordaddress0Fn?

public fun interface PnetisoEdpIdCallbackFnFn {
    public operator fun invoke(context: MutPtr, wszenterpriseid: Pcwstr, dwerr: UInt)
}

public typealias PnetisoEdpIdCallbackFn = PnetisoEdpIdCallbackFnFn?

public typealias Sharingconnectiontype = Int

public typealias SharingconnectionEnumFlags = Int
