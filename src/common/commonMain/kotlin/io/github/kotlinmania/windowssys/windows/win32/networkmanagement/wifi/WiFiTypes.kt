package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID

public typealias CH_DESCRIPTION_TYPE = Int

public typealias DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY = UInt

public typealias DEVPROP_PCIDEVICE_ACSSUPPORT = UInt

public typealias DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE = UInt

public typealias DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE = UInt

public typealias DEVPROP_PCIDEVICE_INTERRUPTTYPE = UInt

public typealias DEVPROP_PCIDEVICE_SRIOVSUPPORT = UInt

public typealias DEVPROP_PCIEXPRESSDEVICE_LINKSPEED = UInt

public typealias DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH = UInt

public typealias DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE = UInt

public typealias DEVPROP_PCIEXPRESSDEVICE_SPEC_VERSION = UInt

public typealias DEVPROP_PCIROOTBUS_BUSWIDTH = UInt

public typealias DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE = UInt

public typealias DEVPROP_PCIROOTBUS_SECONDARYINTERFACE = UInt

public typealias DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES = UInt

public fun interface DOT11EXTIHV_ADAPTER_RESETFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE): UInt
}

public typealias DOT11EXTIHV_ADAPTER_RESET = DOT11EXTIHV_ADAPTER_RESETFn?

public fun interface DOT11EXTIHV_CONTROLFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt
}

public typealias DOT11EXTIHV_CONTROL = DOT11EXTIHV_CONTROLFn?

public fun interface DOT11EXTIHV_CREATE_DISCOVERY_PROFILESFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, binsecure: BOOL, pihvprofileparams: Long, pconnectablebssid: Long, pihvdiscoveryprofilelist: Long, pdwreasoncode: Long): UInt
}

public typealias DOT11EXTIHV_CREATE_DISCOVERY_PROFILES = DOT11EXTIHV_CREATE_DISCOVERY_PROFILESFn?

public fun interface DOT11EXTIHV_DEINIT_ADAPTERFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE)
}

public typealias DOT11EXTIHV_DEINIT_ADAPTER = DOT11EXTIHV_DEINIT_ADAPTERFn?

public fun interface DOT11EXTIHV_DEINIT_SERVICEFn {
    public operator fun invoke()
}

public typealias DOT11EXTIHV_DEINIT_SERVICE = DOT11EXTIHV_DEINIT_SERVICEFn?

public fun interface DOT11EXTIHV_GET_VERSION_INFOFn {
    public operator fun invoke(pdot11ihvversioninfo: Long): UInt
}

public typealias DOT11EXTIHV_GET_VERSION_INFO = DOT11EXTIHV_GET_VERSION_INFOFn?

public fun interface DOT11EXTIHV_INIT_ADAPTERFn {
    public operator fun invoke(pdot11adapter: Long, hdot11svchandle: Foundation.HANDLE, phihvextadapter: Long): UInt
}

public typealias DOT11EXTIHV_INIT_ADAPTER = DOT11EXTIHV_INIT_ADAPTERFn?

public fun interface DOT11EXTIHV_INIT_SERVICEFn {
    public operator fun invoke(dwvernumused: UInt, pdot11extapi: Long, pvreserved: Long, pdot11ihvhandlers: Long): UInt
}

public typealias DOT11EXTIHV_INIT_SERVICE = DOT11EXTIHV_INIT_SERVICEFn?

public fun interface DOT11EXTIHV_INIT_VIRTUAL_STATIONFn {
    public operator fun invoke(pdot11extvsapi: Long, pvreserved: Long): UInt
}

public typealias DOT11EXTIHV_INIT_VIRTUAL_STATION = DOT11EXTIHV_INIT_VIRTUAL_STATIONFn?

public fun interface DOT11EXTIHV_IS_UI_REQUEST_PENDINGFn {
    public operator fun invoke(guiduirequest: GUID, pbisrequestpending: Long): UInt
}

public typealias DOT11EXTIHV_IS_UI_REQUEST_PENDING = DOT11EXTIHV_IS_UI_REQUEST_PENDINGFn?

public fun interface DOT11EXTIHV_ONEX_INDICATE_RESULTFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, msonexresult: DOT11_MSONEX_RESULT, pdot11msonexresultparams: Long): UInt
}

public typealias DOT11EXTIHV_ONEX_INDICATE_RESULT = DOT11EXTIHV_ONEX_INDICATE_RESULTFn?

public fun interface DOT11EXTIHV_PERFORM_CAPABILITY_MATCHFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, pihvprofileparams: Long, pihvconnprofile: Long, pihvsecprofile: Long, pconnectablebssid: Long, pdwreasoncode: Long): UInt
}

public typealias DOT11EXTIHV_PERFORM_CAPABILITY_MATCH = DOT11EXTIHV_PERFORM_CAPABILITY_MATCHFn?

public fun interface DOT11EXTIHV_PERFORM_POST_ASSOCIATEFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, hsecuritysessionid: Foundation.HANDLE, pportstate: Long, udot11assocparamsbytes: UInt, pdot11assocparams: Long): UInt
}

public typealias DOT11EXTIHV_PERFORM_POST_ASSOCIATE = DOT11EXTIHV_PERFORM_POST_ASSOCIATEFn?

public fun interface DOT11EXTIHV_PERFORM_PRE_ASSOCIATEFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, hconnectsession: Foundation.HANDLE, pihvprofileparams: Long, pihvconnprofile: Long, pihvsecprofile: Long, pconnectablebssid: Long, pdwreasoncode: Long): UInt
}

public typealias DOT11EXTIHV_PERFORM_PRE_ASSOCIATE = DOT11EXTIHV_PERFORM_PRE_ASSOCIATEFn?

public fun interface DOT11EXTIHV_PROCESS_SESSION_CHANGEFn {
    public operator fun invoke(ueventtype: UInt, psessionnotification: Long): UInt
}

public typealias DOT11EXTIHV_PROCESS_SESSION_CHANGE = DOT11EXTIHV_PROCESS_SESSION_CHANGEFn?

public fun interface DOT11EXTIHV_PROCESS_UI_RESPONSEFn {
    public operator fun invoke(guiduirequest: GUID, dwbytecount: UInt, pvresponsebuffer: Long): UInt
}

public typealias DOT11EXTIHV_PROCESS_UI_RESPONSE = DOT11EXTIHV_PROCESS_UI_RESPONSEFn?

public fun interface DOT11EXTIHV_QUERY_UI_REQUESTFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, connectionphase: DOT11EXT_IHV_CONNECTION_PHASE, ppihvuirequest: Long): UInt
}

public typealias DOT11EXTIHV_QUERY_UI_REQUEST = DOT11EXTIHV_QUERY_UI_REQUESTFn?

public fun interface DOT11EXTIHV_RECEIVE_INDICATIONFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, indicationtype: DOT11EXT_IHV_INDICATION_TYPE, ubufferlength: UInt, pvbuffer: Long): UInt
}

public typealias DOT11EXTIHV_RECEIVE_INDICATION = DOT11EXTIHV_RECEIVE_INDICATIONFn?

public fun interface DOT11EXTIHV_RECEIVE_PACKETFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, dwinbuffersize: UInt, pvinbuffer: Long): UInt
}

public typealias DOT11EXTIHV_RECEIVE_PACKET = DOT11EXTIHV_RECEIVE_PACKETFn?

public fun interface DOT11EXTIHV_SEND_PACKET_COMPLETIONFn {
    public operator fun invoke(hsendcompletion: Foundation.HANDLE): UInt
}

public typealias DOT11EXTIHV_SEND_PACKET_COMPLETION = DOT11EXTIHV_SEND_PACKET_COMPLETIONFn?

public fun interface DOT11EXTIHV_STOP_POST_ASSOCIATEFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, ppeer: Long, dot11assocstatus: UInt): UInt
}

public typealias DOT11EXTIHV_STOP_POST_ASSOCIATE = DOT11EXTIHV_STOP_POST_ASSOCIATEFn?

public fun interface DOT11EXTIHV_VALIDATE_PROFILEFn {
    public operator fun invoke(hihvextadapter: Foundation.HANDLE, pihvprofileparams: Long, pihvconnprofile: Long, pihvsecprofile: Long, pdwreasoncode: Long): UInt
}

public typealias DOT11EXTIHV_VALIDATE_PROFILE = DOT11EXTIHV_VALIDATE_PROFILEFn?

public fun interface DOT11EXT_ALLOCATE_BUFFERFn {
    public operator fun invoke(dwbytecount: UInt, ppvbuffer: Long): UInt
}

public typealias DOT11EXT_ALLOCATE_BUFFER = DOT11EXT_ALLOCATE_BUFFERFn?

public fun interface DOT11EXT_FREE_BUFFERFn {
    public operator fun invoke(pvmemory: Long)
}

public typealias DOT11EXT_FREE_BUFFER = DOT11EXT_FREE_BUFFERFn?

public fun interface DOT11EXT_GET_PROFILE_CUSTOM_USER_DATAFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, hconnectsession: Foundation.HANDLE, dwsessionid: UInt, pdwdatasize: Long, ppvdata: Long): UInt
}

public typealias DOT11EXT_GET_PROFILE_CUSTOM_USER_DATA = DOT11EXT_GET_PROFILE_CUSTOM_USER_DATAFn?

public typealias DOT11EXT_IHV_CONNECTION_PHASE = Int

public typealias DOT11EXT_IHV_INDICATION_TYPE = Int

public fun interface DOT11EXT_NIC_SPECIFIC_EXTENSIONFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, dwinbuffersize: UInt, pvinbuffer: Long, pdwoutbuffersize: Long, pvoutbuffer: Long): UInt
}

public typealias DOT11EXT_NIC_SPECIFIC_EXTENSION = DOT11EXT_NIC_SPECIFIC_EXTENSIONFn?

public fun interface DOT11EXT_ONEX_STARTFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, peapattributes: Long): UInt
}

public typealias DOT11EXT_ONEX_START = DOT11EXT_ONEX_STARTFn?

public fun interface DOT11EXT_ONEX_STOPFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE): UInt
}

public typealias DOT11EXT_ONEX_STOP = DOT11EXT_ONEX_STOPFn?

public fun interface DOT11EXT_POST_ASSOCIATE_COMPLETIONFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, hsecuritysessionid: Foundation.HANDLE, ppeer: Long, dwreasoncode: UInt, dwwin32error: UInt): UInt
}

public typealias DOT11EXT_POST_ASSOCIATE_COMPLETION = DOT11EXT_POST_ASSOCIATE_COMPLETIONFn?

public fun interface DOT11EXT_PRE_ASSOCIATE_COMPLETIONFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, hconnectsession: Foundation.HANDLE, dwreasoncode: UInt, dwwin32error: UInt): UInt
}

public typealias DOT11EXT_PRE_ASSOCIATE_COMPLETION = DOT11EXT_PRE_ASSOCIATE_COMPLETIONFn?

public fun interface DOT11EXT_PROCESS_ONEX_PACKETFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, dwinpacketsize: UInt, pvinpacket: Long): UInt
}

public typealias DOT11EXT_PROCESS_ONEX_PACKET = DOT11EXT_PROCESS_ONEX_PACKETFn?

public fun interface DOT11EXT_QUERY_VIRTUAL_STATION_PROPERTIESFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, pbisvirtualstation: Long, pgprimary: Long, pvreserved: Long): UInt
}

public typealias DOT11EXT_QUERY_VIRTUAL_STATION_PROPERTIES = DOT11EXT_QUERY_VIRTUAL_STATION_PROPERTIESFn?

public fun interface DOT11EXT_RELEASE_VIRTUAL_STATIONFn {
    public operator fun invoke(hdot11primaryhandle: Foundation.HANDLE, pvreserved: Long): UInt
}

public typealias DOT11EXT_RELEASE_VIRTUAL_STATION = DOT11EXT_RELEASE_VIRTUAL_STATIONFn?

public fun interface DOT11EXT_REQUEST_VIRTUAL_STATIONFn {
    public operator fun invoke(hdot11primaryhandle: Foundation.HANDLE, pvreserved: Long): UInt
}

public typealias DOT11EXT_REQUEST_VIRTUAL_STATION = DOT11EXT_REQUEST_VIRTUAL_STATIONFn?

public fun interface DOT11EXT_SEND_NOTIFICATIONFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, pnotificationdata: Long): UInt
}

public typealias DOT11EXT_SEND_NOTIFICATION = DOT11EXT_SEND_NOTIFICATIONFn?

public fun interface DOT11EXT_SEND_PACKETFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, upacketlen: UInt, pvpacket: Long, hsendcompletion: Foundation.HANDLE): UInt
}

public typealias DOT11EXT_SEND_PACKET = DOT11EXT_SEND_PACKETFn?

public fun interface DOT11EXT_SEND_UI_REQUESTFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, pihvuirequest: Long): UInt
}

public typealias DOT11EXT_SEND_UI_REQUEST = DOT11EXT_SEND_UI_REQUESTFn?

public fun interface DOT11EXT_SET_AUTH_ALGORITHMFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, dwauthalgo: UInt): UInt
}

public typealias DOT11EXT_SET_AUTH_ALGORITHM = DOT11EXT_SET_AUTH_ALGORITHMFn?

public fun interface DOT11EXT_SET_CURRENT_PROFILEFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, hconnectsession: Foundation.HANDLE, pihvconnprofile: Long, pihvsecprofile: Long): UInt
}

public typealias DOT11EXT_SET_CURRENT_PROFILE = DOT11EXT_SET_CURRENT_PROFILEFn?

public fun interface DOT11EXT_SET_DEFAULT_KEYFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, pkey: Long, dot11direction: DOT11_DIRECTION): UInt
}

public typealias DOT11EXT_SET_DEFAULT_KEY = DOT11EXT_SET_DEFAULT_KEYFn?

public fun interface DOT11EXT_SET_DEFAULT_KEY_IDFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, udefaultkeyid: UInt): UInt
}

public typealias DOT11EXT_SET_DEFAULT_KEY_ID = DOT11EXT_SET_DEFAULT_KEY_IDFn?

public fun interface DOT11EXT_SET_ETHERTYPE_HANDLINGFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, umaxbacklog: UInt, unumofexemption: UInt, pexemption: Long, unumofregistration: UInt, pusregistration: Long): UInt
}

public typealias DOT11EXT_SET_ETHERTYPE_HANDLING = DOT11EXT_SET_ETHERTYPE_HANDLINGFn?

public fun interface DOT11EXT_SET_EXCLUDE_UNENCRYPTEDFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, bexcludeunencrypted: BOOL): UInt
}

public typealias DOT11EXT_SET_EXCLUDE_UNENCRYPTED = DOT11EXT_SET_EXCLUDE_UNENCRYPTEDFn?

public fun interface DOT11EXT_SET_KEY_MAPPING_KEYFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, pkey: Long): UInt
}

public typealias DOT11EXT_SET_KEY_MAPPING_KEY = DOT11EXT_SET_KEY_MAPPING_KEYFn?

public fun interface DOT11EXT_SET_MULTICAST_CIPHER_ALGORITHMFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, dwmulticastcipheralgo: UInt): UInt
}

public typealias DOT11EXT_SET_MULTICAST_CIPHER_ALGORITHM = DOT11EXT_SET_MULTICAST_CIPHER_ALGORITHMFn?

public fun interface DOT11EXT_SET_PROFILE_CUSTOM_USER_DATAFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, hconnectsession: Foundation.HANDLE, dwsessionid: UInt, dwdatasize: UInt, pvdata: Long): UInt
}

public typealias DOT11EXT_SET_PROFILE_CUSTOM_USER_DATA = DOT11EXT_SET_PROFILE_CUSTOM_USER_DATAFn?

public fun interface DOT11EXT_SET_UNICAST_CIPHER_ALGORITHMFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, dwunicastcipheralgo: UInt): UInt
}

public typealias DOT11EXT_SET_UNICAST_CIPHER_ALGORITHM = DOT11EXT_SET_UNICAST_CIPHER_ALGORITHMFn?

public fun interface DOT11EXT_SET_VIRTUAL_STATION_AP_PROPERTIESFn {
    public operator fun invoke(hdot11svchandle: Foundation.HANDLE, hconnectsession: Foundation.HANDLE, dwnumproperties: UInt, pproperties: Long, pvreserved: Long): UInt
}

public typealias DOT11EXT_SET_VIRTUAL_STATION_AP_PROPERTIES = DOT11EXT_SET_VIRTUAL_STATION_AP_PROPERTIESFn?

public typealias DOT11_AC_PARAM = Int

public typealias DOT11_ADHOC_AUTH_ALGORITHM = Int

public typealias DOT11_ADHOC_CIPHER_ALGORITHM = Int

public typealias DOT11_ADHOC_CONNECT_FAIL_REASON = Int

public typealias DOT11_ADHOC_NETWORK_CONNECTION_STATUS = Int

public typealias DOT11_ANQP_QUERY_RESULT = Int

public typealias DOT11_ASSOCIATION_STATE = Int

public typealias DOT11_AUTH_ALGORITHM = Int

public typealias DOT11_BAND = Int

public typealias DOT11_BSS_TYPE = Int

public typealias DOT11_CIPHER_ALGORITHM = Int

public typealias DOT11_DIRECTION = Int

public typealias DOT11_DIVERSITY_SUPPORT = Int

public typealias DOT11_DS_INFO = Int

public typealias DOT11_HOP_ALGO_ADOPTED = Int

public typealias DOT11_KEY_DIRECTION = Int

public typealias DOT11_MANUFACTURING_CALLBACK_TYPE = Int

public typealias DOT11_MANUFACTURING_SELF_TEST_TYPE = Int

public typealias DOT11_MANUFACTURING_TEST_TYPE = Int

public typealias DOT11_MSONEX_RESULT = Int

public typealias DOT11_OFFLOAD_TYPE = Int

public typealias DOT11_PHY_TYPE = Int

public typealias DOT11_POWER_MODE = Int

public typealias DOT11_POWER_MODE_REASON = Int

public typealias DOT11_RADIO_STATE = Int

public typealias DOT11_RESET_TYPE = Int

public typealias DOT11_SCAN_TYPE = Int

public typealias DOT11_TEMP_TYPE = Int

public typealias DOT11_UPDATE_IE_OP = Int

public typealias DOT11_WFD_DISCOVER_TYPE = Int

public typealias DOT11_WFD_SCAN_TYPE = Int

public typealias DOT11_WPS_CONFIG_METHOD = Int

public typealias DOT11_WPS_DEVICE_PASSWORD_ID = Int

public typealias ONEX_AUTH_IDENTITY = Int

public typealias ONEX_AUTH_RESTART_REASON = Int

public typealias ONEX_AUTH_STATUS = Int

public typealias ONEX_EAP_METHOD_BACKEND_SUPPORT = Int

public typealias ONEX_NOTIFICATION_TYPE = Int

public typealias ONEX_REASON_CODE = Int

public fun interface WFD_OPEN_SESSION_COMPLETE_CALLBACKFn {
    public operator fun invoke(hsessionhandle: Foundation.HANDLE, pvcontext: Long, guidsessioninterface: GUID, dwerror: UInt, dwreasoncode: UInt)
}

public typealias WFD_OPEN_SESSION_COMPLETE_CALLBACK = WFD_OPEN_SESSION_COMPLETE_CALLBACKFn?

public typealias WFD_ROLE_TYPE = Int

public typealias WLAN_ADHOC_NETWORK_STATE = Int

public typealias WLAN_AUTOCONF_OPCODE = Int

public typealias WLAN_CONNECTION_MODE = Int

public typealias WLAN_CONNECTION_NOTIFICATION_FLAGS = UInt

public typealias WLAN_FILTER_LIST_TYPE = Int

public typealias WLAN_HOSTED_NETWORK_NOTIFICATION_CODE = Int

public typealias WLAN_HOSTED_NETWORK_OPCODE = Int

public typealias WLAN_HOSTED_NETWORK_PEER_AUTH_STATE = Int

public typealias WLAN_HOSTED_NETWORK_REASON = Int

public typealias WLAN_HOSTED_NETWORK_STATE = Int

public typealias WLAN_IHV_CONTROL_TYPE = Int

public typealias WLAN_INTERFACE_STATE = Int

public typealias WLAN_INTERFACE_TYPE = Int

public typealias WLAN_INTF_OPCODE = Int

public typealias WLAN_NOTIFICATION_ACM = Int

public fun interface WLAN_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(param0: Long, param1: Long)
}

public typealias WLAN_NOTIFICATION_CALLBACK = WLAN_NOTIFICATION_CALLBACKFn?

public typealias WLAN_NOTIFICATION_MSM = Int

public typealias WLAN_NOTIFICATION_SECURITY = Int

public typealias WLAN_NOTIFICATION_SOURCES = UInt

public typealias WLAN_OPCODE_VALUE_TYPE = Int

public typealias WLAN_OPERATIONAL_STATE = Int

public typealias WLAN_POWER_SETTING = Int

public typealias WLAN_SECURABLE_OBJECT = Int

public typealias WLAN_SET_EAPHOST_FLAGS = UInt

public typealias WL_DISPLAY_PAGES = Int
