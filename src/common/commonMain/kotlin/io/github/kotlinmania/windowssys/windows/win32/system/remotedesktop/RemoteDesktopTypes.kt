package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

public typealias AAAccountingDataType = Int

public typealias AAAuthSchemes = Int

public typealias AATrustClassID = Int

public typealias AePositionFlags = Int

public typealias ClientMessageType = Int

public typealias ConnectionChangeNotification = Int

public typealias KeyCombinationType = Int

public fun interface PchannelInitEventFnFn {
    public operator fun invoke(pinithandle: MutPtr, event: UInt, pdata: MutPtr, datalength: UInt)
}

public typealias PchannelInitEventFn = PchannelInitEventFnFn?

public fun interface PchannelOpenEventFnFn {
    public operator fun invoke(openhandle: UInt, event: UInt, pdata: MutPtr, datalength: UInt, totallength: UInt, dataflags: UInt)
}

public typealias PchannelOpenEventFn = PchannelOpenEventFnFn?

public typealias PluginType = Int

public fun interface PvirtualchannelcloseFn {
    public operator fun invoke(openhandle: UInt): UInt
}

public typealias Pvirtualchannelclose = PvirtualchannelcloseFn?

public fun interface PvirtualchannelentryFn {
    public operator fun invoke(pentrypoints: MutPtr): Bool
}

public typealias Pvirtualchannelentry = PvirtualchannelentryFn?

public fun interface PvirtualchannelinitFn {
    public operator fun invoke(ppinithandle: MutPtr, pchannel: MutPtr, channelcount: Int, versionrequested: UInt, pchanneliniteventproc: PchannelInitEventFn): UInt
}

public typealias Pvirtualchannelinit = PvirtualchannelinitFn?

public fun interface PvirtualchannelopenFn {
    public operator fun invoke(pinithandle: MutPtr, popenhandle: MutPtr, pchannelname: Pcstr, pchannelopeneventproc: PchannelOpenEventFn): UInt
}

public typealias Pvirtualchannelopen = PvirtualchannelopenFn?

public fun interface PvirtualchannelwriteFn {
    public operator fun invoke(openhandle: UInt, pdata: MutPtr, datalength: UInt, puserdata: MutPtr): UInt
}

public typealias Pvirtualchannelwrite = PvirtualchannelwriteFn?

public typealias PasswordEncodingType = Int

public typealias PolicyAttributeType = Int

public typealias RdvTaskStatus = Int

public typealias RdFarmType = Int

public typealias RemoteActionType = Int

public typealias SessionTimeoutActionType = Int

public typealias SnapshotEncodingType = Int

public typealias SnapshotFormatType = Int

public typealias TargetChangeType = Int

public typealias TargetOwner = Int

public typealias TargetPatchState = Int

public typealias TargetState = Int

public typealias TargetType = Int

public typealias TspubPluginPdAssignmentType = Int

public typealias TspubPluginPdResolutionType = Int

public typealias TssbNotificationType = Int

public typealias TssdAddrV46Type = Int

public typealias TssessionState = Int

public typealias TsSbSortBy = Int

public typealias VmHostNotifyStatus = Int

public typealias VmNotifyStatus = Int

public typealias WrdsConnectionSettingLevel = Int

public typealias WrdsListenerSettingLevel = Int

public typealias WrdsSettingLevel = Int

public typealias WrdsSettingStatus = Int

public typealias WrdsSettingType = Int

public typealias WRdsGraphicsChannelType = Int

public typealias WtssbxAddressFamily = Int

public typealias WtssbxMachineDrain = Int

public typealias WtssbxMachineSessionMode = Int

public typealias WtssbxMachineState = Int

public typealias WtssbxNotificationType = Int

public typealias WtssbxSessionState = Int

public typealias WtsCertType = Int

public typealias WtsConfigClass = Int

public typealias WtsConfigSource = Int

public typealias WtsConnectstateClass = Int

public typealias WtsInfoClass = Int

public typealias WtsLogonErrorRedirectorResponse = Int

public typealias WtsRcmDrainState = Int

public typealias WtsRcmServiceState = Int

public typealias WtsSecurityFlags = UInt

public typealias WtsTypeClass = Int

public typealias WtsVirtualClass = Int
