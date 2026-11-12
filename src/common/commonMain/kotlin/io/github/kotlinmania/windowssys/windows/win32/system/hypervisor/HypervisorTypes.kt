package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public fun interface FoundImageCallbackFn {
    public operator fun invoke(context: ConstPtr<CVoid>, imageinfo: ConstPtr<DosImageInfo>): Bool
}

public typealias FoundImageCallback = FoundImageCallbackFn?

public typealias GuestOsMicrosoftIds = Int

public typealias GuestOsOpensourceIds = Int

public typealias GuestOsVendor = Int

public fun interface GuestSymbolsProviderDebugInfoCallbackFn {
    public operator fun invoke(infomessage: Pcstr)
}

public typealias GuestSymbolsProviderDebugInfoCallback = GuestSymbolsProviderDebugInfoCallbackFn?

public typealias HdvDeviceHostFlags = Int

public typealias HdvDeviceType = Int

public typealias HdvDoorbellFlags = Int

public typealias HdvMmioMappingFlags = Int

public typealias HdvPciBarSelector = Int

public fun interface HdvPciDeviceGetDetailsFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>, pnpid: MutPtr<HdvPciPnpId>, probedbarscount: UInt, probedbars: MutPtr<UInt>): Hresult
}

public typealias HdvPciDeviceGetDetails = HdvPciDeviceGetDetailsFn?

public fun interface HdvPciDeviceInitializeFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>): Hresult
}

public typealias HdvPciDeviceInitialize = HdvPciDeviceInitializeFn?

public fun interface HdvPciDeviceSetConfigurationFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>, configurationvaluecount: UInt, configurationvalues: ConstPtr<Pcwstr>): Hresult
}

public typealias HdvPciDeviceSetConfiguration = HdvPciDeviceSetConfigurationFn?

public fun interface HdvPciDeviceStartFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>): Hresult
}

public typealias HdvPciDeviceStart = HdvPciDeviceStartFn?

public fun interface HdvPciDeviceStopFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>)
}

public typealias HdvPciDeviceStop = HdvPciDeviceStopFn?

public fun interface HdvPciDeviceTeardownFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>)
}

public typealias HdvPciDeviceTeardown = HdvPciDeviceTeardownFn?

public typealias HdvPciInterfaceVersion = Int

public fun interface HdvPciReadConfigSpaceFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>, offset: UInt, value: MutPtr<UInt>): Hresult
}

public typealias HdvPciReadConfigSpace = HdvPciReadConfigSpaceFn?

public fun interface HdvPciReadInterceptedMemoryFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offset: ULong, length: ULong, value: MutPtr<UByte>): Hresult
}

public typealias HdvPciReadInterceptedMemory = HdvPciReadInterceptedMemoryFn?

public fun interface HdvPciWriteConfigSpaceFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>, offset: UInt, value: UInt): Hresult
}

public typealias HdvPciWriteConfigSpace = HdvPciWriteConfigSpaceFn?

public fun interface HdvPciWriteInterceptedMemoryFn {
    public operator fun invoke(devicecontext: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offset: ULong, length: ULong, value: ConstPtr<UByte>): Hresult
}

public typealias HdvPciWriteInterceptedMemory = HdvPciWriteInterceptedMemoryFn?

public typealias PagingMode = Int

public typealias RegisterId = Int

public typealias VirtualProcessorArch = Int

public typealias VirtualProcessorVendor = Int

public typealias WhvAdviseGpaRangeCode = Int

public typealias WhvAllocateVpciResourceFlags = Int

public typealias WhvCacheType = Int

public typealias WhvCapabilityCode = Int

public typealias WhvCreateVpciDeviceFlags = Int

public fun interface WhvEmulatorGetVirtualProcessorRegistersCallbackFn {
    public operator fun invoke(context: ConstPtr<CVoid>, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: MutPtr<WhvRegisterValue>): Hresult
}

public typealias WhvEmulatorGetVirtualProcessorRegistersCallback = WhvEmulatorGetVirtualProcessorRegistersCallbackFn?

public fun interface WhvEmulatorIoPortCallbackFn {
    public operator fun invoke(context: ConstPtr<CVoid>, ioaccess: MutPtr<WhvEmulatorIoAccessInfo>): Hresult
}

public typealias WhvEmulatorIoPortCallback = WhvEmulatorIoPortCallbackFn?

public fun interface WhvEmulatorMemoryCallbackFn {
    public operator fun invoke(context: ConstPtr<CVoid>, memoryaccess: MutPtr<WhvEmulatorMemoryAccessInfo>): Hresult
}

public typealias WhvEmulatorMemoryCallback = WhvEmulatorMemoryCallbackFn?

public fun interface WhvEmulatorSetVirtualProcessorRegistersCallbackFn {
    public operator fun invoke(context: ConstPtr<CVoid>, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: ConstPtr<WhvRegisterValue>): Hresult
}

public typealias WhvEmulatorSetVirtualProcessorRegistersCallback = WhvEmulatorSetVirtualProcessorRegistersCallbackFn?

public fun interface WhvEmulatorTranslateGvaPageCallbackFn {
    public operator fun invoke(context: ConstPtr<CVoid>, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr<WhvTranslateGvaResultCode>, gpa: MutPtr<ULong>): Hresult
}

public typealias WhvEmulatorTranslateGvaPageCallback = WhvEmulatorTranslateGvaPageCallbackFn?

public typealias WhvExceptionType = Int

public typealias WhvInterruptDestinationMode = Int

public typealias WhvInterruptTriggerMode = Int

public typealias WhvInterruptType = Int

public typealias WhvMapGpaRangeFlags = Int

public typealias WhvMemoryAccessType = Int

public typealias WhvMsrAction = Int

public typealias WhvNotificationPortPropertyCode = Int

public typealias WhvNotificationPortType = Int

public typealias WhvPartitionCounterSet = Int

public typealias WhvPartitionHandle = Long

public typealias WhvPartitionPropertyCode = Int

public typealias WhvProcessorCounterSet = Int

public typealias WhvProcessorVendor = Int

public typealias WhvRegisterName = Int

public typealias WhvRunVpCancelReason = Int

public typealias WhvRunVpExitReason = Int

public typealias WhvTranslateGvaFlags = Int

public typealias WhvTranslateGvaResultCode = Int

public typealias WhvTriggerType = Int

public typealias WhvVirtualProcessorPropertyCode = Int

public typealias WhvVirtualProcessorStateType = Int

public typealias WhvVpciDeviceNotificationType = Int

public typealias WhvVpciDevicePropertyCode = Int

public typealias WhvVpciDeviceRegisterSpace = Int

public typealias WhvVpciInterruptTargetFlags = Int

public typealias WhvVpciMmioRangeFlags = Int

public typealias WhvX64ApicWriteType = Int

public typealias WhvX64CpuidResult2Flags = Int

public typealias WhvX64LocalApicEmulationMode = Int

public typealias WhvX64PendingEventType = Int

public typealias WhvX64PendingInterruptionType = Int

public typealias WhvX64UnsupportedFeatureCode = Int
