package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

public typealias AAAccountingDataType = Int

public typealias AAAuthSchemes = Int

public typealias AATrustClassID = Int

public typealias AE_POSITION_FLAGS = Int

public typealias CLIENT_MESSAGE_TYPE = Int

public typealias CONNECTION_CHANGE_NOTIFICATION = Int

public typealias KeyCombinationType = Int

public fun interface PCHANNEL_INIT_EVENT_FNFn {
    public operator fun invoke(pinithandle: Long, event: UInt, pdata: Long, datalength: UInt)
}

public typealias PCHANNEL_INIT_EVENT_FN = PCHANNEL_INIT_EVENT_FNFn?

public fun interface PCHANNEL_OPEN_EVENT_FNFn {
    public operator fun invoke(openhandle: UInt, event: UInt, pdata: Long, datalength: UInt, totallength: UInt, dataflags: UInt)
}

public typealias PCHANNEL_OPEN_EVENT_FN = PCHANNEL_OPEN_EVENT_FNFn?

public typealias PLUGIN_TYPE = Int

public fun interface PVIRTUALCHANNELCLOSEFn {
    public operator fun invoke(openhandle: UInt): UInt
}

public typealias PVIRTUALCHANNELCLOSE = PVIRTUALCHANNELCLOSEFn?

public fun interface PVIRTUALCHANNELENTRYFn {
    public operator fun invoke(pentrypoints: Long): BOOL
}

public typealias PVIRTUALCHANNELENTRY = PVIRTUALCHANNELENTRYFn?

public fun interface PVIRTUALCHANNELINITFn {
    public operator fun invoke(ppinithandle: Long, pchannel: Long, channelcount: Int, versionrequested: UInt, pchanneliniteventproc: PCHANNEL_INIT_EVENT_FN): UInt
}

public typealias PVIRTUALCHANNELINIT = PVIRTUALCHANNELINITFn?

public fun interface PVIRTUALCHANNELOPENFn {
    public operator fun invoke(pinithandle: Long, popenhandle: Long, pchannelname: PCSTR, pchannelopeneventproc: PCHANNEL_OPEN_EVENT_FN): UInt
}

public typealias PVIRTUALCHANNELOPEN = PVIRTUALCHANNELOPENFn?

public fun interface PVIRTUALCHANNELWRITEFn {
    public operator fun invoke(openhandle: UInt, pdata: Long, datalength: UInt, puserdata: Long): UInt
}

public typealias PVIRTUALCHANNELWRITE = PVIRTUALCHANNELWRITEFn?

public typealias PasswordEncodingType = Int

public typealias PolicyAttributeType = Int

public typealias RDV_TASK_STATUS = Int

public typealias RD_FARM_TYPE = Int

public typealias RemoteActionType = Int

public typealias SESSION_TIMEOUT_ACTION_TYPE = Int

public typealias SnapshotEncodingType = Int

public typealias SnapshotFormatType = Int

public typealias TARGET_CHANGE_TYPE = Int

public typealias TARGET_OWNER = Int

public typealias TARGET_PATCH_STATE = Int

public typealias TARGET_STATE = Int

public typealias TARGET_TYPE = Int

public typealias TSPUB_PLUGIN_PD_ASSIGNMENT_TYPE = Int

public typealias TSPUB_PLUGIN_PD_RESOLUTION_TYPE = Int

public typealias TSSB_NOTIFICATION_TYPE = Int

public typealias TSSD_AddrV46Type = Int

public typealias TSSESSION_STATE = Int

public typealias TS_SB_SORT_BY = Int

public typealias VM_HOST_NOTIFY_STATUS = Int

public typealias VM_NOTIFY_STATUS = Int

public typealias WRDS_CONNECTION_SETTING_LEVEL = Int

public typealias WRDS_LISTENER_SETTING_LEVEL = Int

public typealias WRDS_SETTING_LEVEL = Int

public typealias WRDS_SETTING_STATUS = Int

public typealias WRDS_SETTING_TYPE = Int

public typealias WRdsGraphicsChannelType = Int

public typealias WTSSBX_ADDRESS_FAMILY = Int

public typealias WTSSBX_MACHINE_DRAIN = Int

public typealias WTSSBX_MACHINE_SESSION_MODE = Int

public typealias WTSSBX_MACHINE_STATE = Int

public typealias WTSSBX_NOTIFICATION_TYPE = Int

public typealias WTSSBX_SESSION_STATE = Int

public typealias WTS_CERT_TYPE = Int

public typealias WTS_CONFIG_CLASS = Int

public typealias WTS_CONFIG_SOURCE = Int

public typealias WTS_CONNECTSTATE_CLASS = Int

public typealias WTS_INFO_CLASS = Int

public typealias WTS_LOGON_ERROR_REDIRECTOR_RESPONSE = Int

public typealias WTS_RCM_DRAIN_STATE = Int

public typealias WTS_RCM_SERVICE_STATE = Int

public typealias WTS_SECURITY_FLAGS = UInt

public typealias WTS_TYPE_CLASS = Int

public typealias WTS_VIRTUAL_CLASS = Int
