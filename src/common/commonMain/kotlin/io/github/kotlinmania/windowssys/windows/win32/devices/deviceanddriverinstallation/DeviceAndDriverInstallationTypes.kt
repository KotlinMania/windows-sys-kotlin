package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public typealias CmCdflags = UInt

public typealias CmCdmask = UInt

public typealias CmDevcap = UInt

public typealias CmDevnodeStatusFlags = UInt

public typealias CmEnumerateFlags = UInt

public typealias CmGetDeviceInterfaceListFlags = UInt

public typealias CmInstallState = UInt

public typealias CmLocateDevnodeFlags = UInt

public typealias CmLogConf = UInt

public typealias CmNotifyAction = Int

public typealias CmNotifyFilterType = Int

public typealias CmProb = UInt

public typealias CmReenumerateFlags = UInt

public typealias CmRemovalPolicy = UInt

public typealias CmRestype = UInt

public typealias Configret = UInt

public typealias DdFlags = UInt

public typealias DiinstalldeviceFlags = UInt

public typealias DiinstalldriverFlags = UInt

public typealias DirollbackdriverFlags = UInt

public typealias DiuninstalldriverFlags = UInt

public typealias DiFunction = UInt

public typealias FileCompressionType = UInt

public typealias Hcmnotification = MutPtr<CVoid>

public typealias Hdevinfo = Long

public typealias InfStyle = UInt

public typealias IodDesflags = UInt

public typealias IrqdFlags = UInt

public typealias MdFlags = UInt

public typealias OemSourceMediaType = UInt

public typealias PcdFlags = UInt

public fun interface PcmNotifyCallbackFn {
    public operator fun invoke(hnotify: Hcmnotification, context: ConstPtr<CVoid>, action: CmNotifyAction, eventdata: ConstPtr<CmNotifyEventData>, eventdatasize: UInt): UInt
}

public typealias PcmNotifyCallback = PcmNotifyCallbackFn?

public fun interface PdetectProgressNotifyFn {
    public operator fun invoke(progressnotifyparam: ConstPtr<CVoid>, detectcomplete: UInt): Bool
}

public typealias PdetectProgressNotify = PdetectProgressNotifyFn?

public typealias PmfFlags = UInt

public typealias PnpVetoType = Int

public fun interface PspDetsigCmpprocFn {
    public operator fun invoke(deviceinfoset: Hdevinfo, newdevicedata: ConstPtr<SpDevinfoData>, existingdevicedata: ConstPtr<SpDevinfoData>, comparecontext: ConstPtr<CVoid>): UInt
}

public typealias PspDetsigCmpproc = PspDetsigCmpprocFn?

public fun interface PspFileCallbackAFn {
    public operator fun invoke(context: ConstPtr<CVoid>, notification: UInt, param1: ULong, param2: ULong): UInt
}

public typealias PspFileCallbackA = PspFileCallbackAFn?

public fun interface PspFileCallbackWFn {
    public operator fun invoke(context: ConstPtr<CVoid>, notification: UInt, param1: ULong, param2: ULong): UInt
}

public typealias PspFileCallbackW = PspFileCallbackWFn?

public typealias SetupscanfilequeueFlags = UInt

public typealias SetupDiDeviceConfigurationFlags = UInt

public typealias SetupDiDeviceCreationFlags = UInt

public typealias SetupDiDeviceInstallFlags = UInt

public typealias SetupDiDeviceInstallFlagsEx = UInt

public typealias SetupDiDriverInstallFlags = UInt

public typealias SetupDiDriverType = UInt

public typealias SetupDiGetClassDevsFlags = UInt

public typealias SetupDiPropertyChangeScope = UInt

public typealias SetupDiRegistryProperty = UInt

public typealias SetupDiRemoveDeviceScope = UInt

public typealias SetupDiStateChange = UInt

public typealias SetupFileOperation = UInt

public typealias SpsvcinstFlags = UInt

public typealias SpCopyStyle = UInt

public typealias SetupFileLogInfo = Int

public typealias UpdatedriverforplugandplaydevicesFlags = UInt
