package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS = Int

public typealias FW_DYNAMIC_KEYWORD_ADDRESS_FLAGS = Int

public typealias FW_DYNAMIC_KEYWORD_ORIGIN_TYPE = Int

public typealias ICS_TARGETTYPE = Int

public typealias INET_FIREWALL_AC_CHANGE_TYPE = Int

public typealias INET_FIREWALL_AC_CREATION_TYPE = Int

public typealias NETCONMGR_ENUM_FLAGS = Int

public typealias NETCONUI_CONNECT_FLAGS = Int

public typealias NETCON_CHARACTERISTIC_FLAGS = Int

public typealias NETCON_MEDIATYPE = Int

public typealias NETCON_STATUS = Int

public typealias NETCON_TYPE = Int

public typealias NETISO_ERROR_TYPE = Int

public typealias NETISO_FLAG = Int

public typealias NET_FW_ACTION = Int

public typealias NET_FW_AUTHENTICATE_TYPE = Int

public typealias NET_FW_EDGE_TRAVERSAL_TYPE = Int

public typealias NET_FW_IP_PROTOCOL = Int

public typealias NET_FW_IP_VERSION = Int

public typealias NET_FW_MODIFY_STATE = Int

public typealias NET_FW_POLICY_TYPE = Int

public typealias NET_FW_PROFILE_TYPE = Int

public typealias NET_FW_PROFILE_TYPE2 = Int

public typealias NET_FW_RULE_CATEGORY = Int

public typealias NET_FW_RULE_DIRECTION = Int

public typealias NET_FW_SCOPE = Int

public typealias NET_FW_SERVICE_TYPE = Int

public fun interface PAC_CHANGES_CALLBACK_FNFn {
    public operator fun invoke(context: Long, pchange: Long)
}

public typealias PAC_CHANGES_CALLBACK_FN = PAC_CHANGES_CALLBACK_FNFn?

public fun interface PFN_FWADDDYNAMICKEYWORDADDRESS0Fn {
    public operator fun invoke(dynamickeywordaddress: Long): UInt
}

public typealias PFN_FWADDDYNAMICKEYWORDADDRESS0 = PFN_FWADDDYNAMICKEYWORDADDRESS0Fn?

public fun interface PFN_FWDELETEDYNAMICKEYWORDADDRESS0Fn {
    public operator fun invoke(dynamickeywordaddressid: GUID): UInt
}

public typealias PFN_FWDELETEDYNAMICKEYWORDADDRESS0 = PFN_FWDELETEDYNAMICKEYWORDADDRESS0Fn?

public fun interface PFN_FWENUMDYNAMICKEYWORDADDRESSBYID0Fn {
    public operator fun invoke(dynamickeywordaddressid: GUID, dynamickeywordaddressdata: Long): UInt
}

public typealias PFN_FWENUMDYNAMICKEYWORDADDRESSBYID0 = PFN_FWENUMDYNAMICKEYWORDADDRESSBYID0Fn?

public fun interface PFN_FWENUMDYNAMICKEYWORDADDRESSESBYTYPE0Fn {
    public operator fun invoke(flags: UInt, dynamickeywordaddressdata: Long): UInt
}

public typealias PFN_FWENUMDYNAMICKEYWORDADDRESSESBYTYPE0 = PFN_FWENUMDYNAMICKEYWORDADDRESSESBYTYPE0Fn?

public fun interface PFN_FWFREEDYNAMICKEYWORDADDRESSDATA0Fn {
    public operator fun invoke(dynamickeywordaddressdata: Long): UInt
}

public typealias PFN_FWFREEDYNAMICKEYWORDADDRESSDATA0 = PFN_FWFREEDYNAMICKEYWORDADDRESSDATA0Fn?

public fun interface PFN_FWUPDATEDYNAMICKEYWORDADDRESS0Fn {
    public operator fun invoke(dynamickeywordaddressid: GUID, updatedaddresses: PCWSTR, append: BOOL): UInt
}

public typealias PFN_FWUPDATEDYNAMICKEYWORDADDRESS0 = PFN_FWUPDATEDYNAMICKEYWORDADDRESS0Fn?

public fun interface PNETISO_EDP_ID_CALLBACK_FNFn {
    public operator fun invoke(context: Long, wszenterpriseid: PCWSTR, dwerr: UInt)
}

public typealias PNETISO_EDP_ID_CALLBACK_FN = PNETISO_EDP_ID_CALLBACK_FNFn?

public typealias SHARINGCONNECTIONTYPE = Int

public typealias SHARINGCONNECTION_ENUM_FLAGS = Int
