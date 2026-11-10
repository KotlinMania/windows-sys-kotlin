package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverControl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PbusHandler
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PexTimer
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioWorkitem
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.power.SystemPowerState
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionInformationClass

public fun interface AllocateFunctionFn {
    public operator fun invoke(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer?
}

public typealias AllocateFunction = AllocateFunctionFn?

public typealias AlternativeArchitectureType = Int

public typealias ArbiterAction = Int

public typealias ArbiterRequestSource = Int

public typealias ArbiterResult = Int

public typealias BdcbCallbackType = Int

public typealias BdcbClassification = Int

public typealias BdcbStatusUpdateType = Int

public fun interface BootDriverCallbackFunctionFn {
    public operator fun invoke(callbackcontext: COpaquePointer?, classification: BdcbCallbackType, imageinformation: COpaquePointer?)
}

public typealias BootDriverCallbackFunction = BootDriverCallbackFunctionFn?

public fun interface BoundCallbackFn {
    public operator fun invoke(): BoundCallbackStatus
}

public typealias BoundCallback = BoundCallbackFn?

public typealias BoundCallbackStatus = Int

public typealias BusDataType = Int

public typealias BusQueryIdType = Int

public typealias CmShareDisposition = Int

public typealias ConfigurationType = Int

public typealias CreateFileType = Int

public typealias D3coldLastTransitionStatus = Int

public fun interface D3coldRequestAuxPowerFn {
    public operator fun invoke(context: COpaquePointer?, auxpowerinmilliwatts: UInt, retryinseconds: COpaquePointer?): Ntstatus
}

public typealias D3coldRequestAuxPower = D3coldRequestAuxPowerFn?

public fun interface D3coldRequestCorePowerRailFn {
    public operator fun invoke(context: COpaquePointer?, corepowerrailneeded: Boolean)
}

public typealias D3coldRequestCorePowerRail = D3coldRequestCorePowerRailFn?

public fun interface D3coldRequestPerstDelayFn {
    public operator fun invoke(context: COpaquePointer?, delayinmicroseconds: UInt): Ntstatus
}

public typealias D3coldRequestPerstDelay = D3coldRequestPerstDelayFn?

public fun interface DeviceBusSpecificResetHandlerFn {
    public operator fun invoke(interfacecontext: COpaquePointer?, bustype: COpaquePointer?, resettypeselected: DeviceBusSpecificResetType, flags: COpaquePointer?, resetparameters: COpaquePointer?): Ntstatus
}

public typealias DeviceBusSpecificResetHandler = DeviceBusSpecificResetHandlerFn?

public fun interface DeviceChangeCompleteCallbackFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias DeviceChangeCompleteCallback = DeviceChangeCompleteCallbackFn?

public typealias DeviceDirectoryType = Int

public typealias DeviceInstallState = Int

public fun interface DeviceQueryBusSpecificResetHandlerFn {
    public operator fun invoke(interfacecontext: COpaquePointer?, resetinfocount: COpaquePointer?, resetinfosupported: COpaquePointer?): Ntstatus
}

public typealias DeviceQueryBusSpecificResetHandler = DeviceQueryBusSpecificResetHandlerFn?

public typealias DeviceRegistryProperty = Int

public typealias DeviceRelationType = Int

public typealias DeviceRemovalPolicy = Int

public fun interface DeviceResetCompletionFn {
    public operator fun invoke(status: Ntstatus, context: COpaquePointer?)
}

public typealias DeviceResetCompletion = DeviceResetCompletionFn?

public fun interface DeviceResetHandlerFn {
    public operator fun invoke(interfacecontext: COpaquePointer?, resettype: DeviceResetType, flags: UInt, resetparameters: COpaquePointer?): Ntstatus
}

public typealias DeviceResetHandler = DeviceResetHandlerFn?

public typealias DeviceResetType = Int

public typealias DeviceTextType = Int

public typealias DeviceUsageNotificationType = Int

public typealias DeviceWakeDepth = Int

public typealias DirectoryNotifyInformationClass = Int

public typealias DmaCommonBufferExtendedConfigurationAccessType = Int

public typealias DmaCommonBufferExtendedConfigurationType = Int

public fun interface DmaCompletionRoutineFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, deviceobject: COpaquePointer?, completioncontext: COpaquePointer?, status: DmaCompletionStatus)
}

public typealias DmaCompletionRoutine = DmaCompletionRoutineFn?

public typealias DmaCompletionStatus = Int

public typealias DmaSpeed = Int

public typealias DmaWidth = Int

public typealias DomainConfigurationArch = Int

public typealias DriverDirectoryType = Int

public fun interface DriverListControlFn {
    public operator fun invoke(deviceobject: COpaquePointer?, irp: COpaquePointer?, scattergather: COpaquePointer?, context: COpaquePointer?)
}

public typealias DriverListControl = DriverListControlFn?

public typealias DriverRegkeyType = Int

public typealias DriverRuntimeInitFlags = Int

public fun interface EnableVirtualizationFn {
    public operator fun invoke(context: COpaquePointer?, numvfs: UShort, enablevfmigration: Boolean, enablemigrationinterrupt: Boolean, enablevirtualization: Boolean): Ntstatus
}

public typealias EnableVirtualization = EnableVirtualizationFn?

public fun interface EtwenablecallbackFn {
    public operator fun invoke(sourceid: COpaquePointer?, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, filterdata: COpaquePointer?, callbackcontext: COpaquePointer?)
}

public typealias Etwenablecallback = EtwenablecallbackFn?

public fun interface ExpandStackCalloutFn {
    public operator fun invoke(parameter: COpaquePointer?)
}

public typealias ExpandStackCallout = ExpandStackCalloutFn?

public typealias ExtendedAgpRegister = Int

public fun interface ExtCallbackFn {
    public operator fun invoke(timer: PexTimer, context: COpaquePointer?)
}

public typealias ExtCallback = ExtCallbackFn?

public fun interface ExtDeleteCallbackFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias ExtDeleteCallback = ExtDeleteCallbackFn?

public fun interface ExCallbackFunctionFn {
    public operator fun invoke(callbackcontext: COpaquePointer?, argument1: COpaquePointer?, argument2: COpaquePointer?): Ntstatus
}

public typealias ExCallbackFunction = ExCallbackFunctionFn?

public typealias ExPoolPriority = Int

public typealias FaultInformationArch = Int

public typealias FaultInformationArm64Type = Int

public fun interface FpgaBusScanFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias FpgaBusScan = FpgaBusScanFn?

public fun interface FpgaControlConfigSpaceFn {
    public operator fun invoke(context: COpaquePointer?, enable: Boolean): Ntstatus
}

public typealias FpgaControlConfigSpace = FpgaControlConfigSpaceFn?

public fun interface FpgaControlErrorReportingFn {
    public operator fun invoke(context: COpaquePointer?, uncorrectablemask: UInt, correctablemask: UInt, disableerrorreporting: Boolean): Ntstatus
}

public typealias FpgaControlErrorReporting = FpgaControlErrorReportingFn?

public fun interface FpgaControlLinkFn {
    public operator fun invoke(context: COpaquePointer?, enable: Boolean): Ntstatus
}

public typealias FpgaControlLink = FpgaControlLinkFn?

public fun interface FreeFunctionFn {
    public operator fun invoke(buffer: COpaquePointer?)
}

public typealias FreeFunction = FreeFunctionFn?

public fun interface FwmiNotificationCallbackFn {
    public operator fun invoke(wnode: COpaquePointer?, context: COpaquePointer?)
}

public typealias FwmiNotificationCallback = FwmiNotificationCallbackFn?

public fun interface GetD3coldCapabilityFn {
    public operator fun invoke(context: COpaquePointer?, d3coldsupported: COpaquePointer?): Ntstatus
}

public typealias GetD3coldCapability = GetD3coldCapabilityFn?

public fun interface GetD3coldLastTransitionStatusFn {
    public operator fun invoke(context: COpaquePointer?, lasttransitionstatus: COpaquePointer?)
}

public typealias GetD3coldLastTransitionStatus = GetD3coldLastTransitionStatusFn?

public fun interface GetDeviceResetStatusFn {
    public operator fun invoke(interfacecontext: COpaquePointer?, isresetting: COpaquePointer?, resettypeselected: COpaquePointer?, flags: COpaquePointer?): Ntstatus
}

public typealias GetDeviceResetStatus = GetDeviceResetStatusFn?

public fun interface GetDmaAdapterFn {
    public operator fun invoke(context: COpaquePointer?, devicedescriptor: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer?
}

public typealias GetDmaAdapter = GetDmaAdapterFn?

public fun interface GetIdleWakeInfoFn {
    public operator fun invoke(context: COpaquePointer?, systempowerstate: SystemPowerState, deepestwakeabledstate: COpaquePointer?): Ntstatus
}

public typealias GetIdleWakeInfo = GetIdleWakeInfoFn?

public fun interface GetSdevIdentifierFn {
    public operator fun invoke(interfacecontext: COpaquePointer?): ULong
}

public typealias GetSdevIdentifier = GetSdevIdentifierFn?

public fun interface GetSetDeviceDataFn {
    public operator fun invoke(context: COpaquePointer?, datatype: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt
}

public typealias GetSetDeviceData = GetSetDeviceDataFn?

public fun interface GetUpdatedBusResourceFn {
    public operator fun invoke(context: COpaquePointer?, updatedresourcelist: COpaquePointer?, updatedtranslatedresourcelist: COpaquePointer?): Ntstatus
}

public typealias GetUpdatedBusResource = GetUpdatedBusResourceFn?

public fun interface GetVirtualDeviceDataFn {
    public operator fun invoke(context: COpaquePointer?, virtualfunction: UShort, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt
}

public typealias GetVirtualDeviceData = GetVirtualDeviceDataFn?

public fun interface GetVirtualDeviceLocationFn {
    public operator fun invoke(context: COpaquePointer?, virtualfunction: UShort, segmentnumber: COpaquePointer?, busnumber: COpaquePointer?, functionnumber: COpaquePointer?): Ntstatus
}

public typealias GetVirtualDeviceLocation = GetVirtualDeviceLocationFn?

public fun interface GetVirtualDeviceResourcesFn {
    public operator fun invoke(context: COpaquePointer?, capturedbusnumbers: COpaquePointer?)
}

public typealias GetVirtualDeviceResources = GetVirtualDeviceResourcesFn?

public fun interface GetVirtualFunctionProbedBarsFn {
    public operator fun invoke(context: COpaquePointer?, baseregistervalues: COpaquePointer?): Ntstatus
}

public typealias GetVirtualFunctionProbedBars = GetVirtualFunctionProbedBarsFn?

public typealias HalApicDestinationMode = Int

public typealias HalDisplayBiosInformation = Int

public typealias HalDmaCrashDumpRegisterType = Int

public typealias HalQueryInformationClass = Int

public typealias HalSetInformationClass = Int

public typealias HardwareCounterType = Int

public fun interface HvlWheaErrorNotificationFn {
    public operator fun invoke(recoverycontext: COpaquePointer?, platformdirected: Boolean, poisoned: Boolean): Ntstatus
}

public typealias HvlWheaErrorNotification = HvlWheaErrorNotificationFn?

public typealias IntelCacheType = Int

public typealias InterfaceType = Int

public typealias InterlockedResult = Int

public fun interface IommuDeviceCreateFn {
    public operator fun invoke(deviceobject: COpaquePointer?, deviceconfig: COpaquePointer?, dmadeviceout: COpaquePointer?): Ntstatus
}

public typealias IommuDeviceCreate = IommuDeviceCreateFn?

public typealias IommuDeviceCreationConfigurationType = Int

public fun interface IommuDeviceDeleteFn {
    public operator fun invoke(dmadevice: COpaquePointer?): Ntstatus
}

public typealias IommuDeviceDelete = IommuDeviceDeleteFn?

public fun interface IommuDeviceFaultHandlerFn {
    public operator fun invoke(context: COpaquePointer?, faultinformation: COpaquePointer?)
}

public typealias IommuDeviceFaultHandler = IommuDeviceFaultHandlerFn?

public fun interface IommuDeviceQueryDomainTypesFn {
    public operator fun invoke(dmadevice: COpaquePointer?, availabledomains: COpaquePointer?)
}

public typealias IommuDeviceQueryDomainTypes = IommuDeviceQueryDomainTypesFn?

public typealias IommuDmaDomainType = Int

public typealias IommuDmaLogicalAllocatorType = Int

public fun interface IommuDomainAttachDeviceFn {
    public operator fun invoke(domain: COpaquePointer?, physicaldeviceobject: COpaquePointer?, inputmappingidbase: UInt, mappingcount: UInt): Ntstatus
}

public typealias IommuDomainAttachDevice = IommuDomainAttachDeviceFn?

public fun interface IommuDomainAttachDeviceExFn {
    public operator fun invoke(domain: COpaquePointer?, dmadevice: COpaquePointer?): Ntstatus
}

public typealias IommuDomainAttachDeviceEx = IommuDomainAttachDeviceExFn?

public fun interface IommuDomainConfigureFn {
    public operator fun invoke(domain: COpaquePointer?, configuration: COpaquePointer?): Ntstatus
}

public typealias IommuDomainConfigure = IommuDomainConfigureFn?

public fun interface IommuDomainCreateFn {
    public operator fun invoke(osmanagedpagetable: Boolean, domainout: COpaquePointer?): Ntstatus
}

public typealias IommuDomainCreate = IommuDomainCreateFn?

public fun interface IommuDomainCreateExFn {
    public operator fun invoke(domaintype: IommuDmaDomainType, flags: IommuDmaDomainCreationFlags, logicalallocatorconfig: COpaquePointer?, reservedregions: COpaquePointer?, domainout: COpaquePointer?): Ntstatus
}

public typealias IommuDomainCreateEx = IommuDomainCreateExFn?

public fun interface IommuDomainDeleteFn {
    public operator fun invoke(domain: COpaquePointer?): Ntstatus
}

public typealias IommuDomainDelete = IommuDomainDeleteFn?

public fun interface IommuDomainDetachDeviceFn {
    public operator fun invoke(domain: COpaquePointer?, physicaldeviceobject: COpaquePointer?, inputmappingid: UInt): Ntstatus
}

public typealias IommuDomainDetachDevice = IommuDomainDetachDeviceFn?

public fun interface IommuDomainDetachDeviceExFn {
    public operator fun invoke(dmadevice: COpaquePointer?): Ntstatus
}

public typealias IommuDomainDetachDeviceEx = IommuDomainDetachDeviceExFn?

public fun interface IommuFlushDomainFn {
    public operator fun invoke(domain: COpaquePointer?): Ntstatus
}

public typealias IommuFlushDomain = IommuFlushDomainFn?

public fun interface IommuFlushDomainVaListFn {
    public operator fun invoke(domain: COpaquePointer?, lastlevel: Boolean, number: UInt, valist: COpaquePointer?): Ntstatus
}

public typealias IommuFlushDomainVaList = IommuFlushDomainVaListFn?

public fun interface IommuFreeReservedLogicalAddressRangeFn {
    public operator fun invoke(logicaladdresstoken: COpaquePointer?): Ntstatus
}

public typealias IommuFreeReservedLogicalAddressRange = IommuFreeReservedLogicalAddressRangeFn?

public fun interface IommuInterfaceStateChangeCallbackFn {
    public operator fun invoke(statechange: COpaquePointer?, context: COpaquePointer?)
}

public typealias IommuInterfaceStateChangeCallback = IommuInterfaceStateChangeCallbackFn?

public fun interface IommuMapIdentityRangeFn {
    public operator fun invoke(domain: COpaquePointer?, permissions: UInt, mdl: COpaquePointer?): Ntstatus
}

public typealias IommuMapIdentityRange = IommuMapIdentityRangeFn?

public fun interface IommuMapIdentityRangeExFn {
    public operator fun invoke(domain: COpaquePointer?, permissions: UInt, physicaladdresstomap: COpaquePointer?): Ntstatus
}

public typealias IommuMapIdentityRangeEx = IommuMapIdentityRangeExFn?

public fun interface IommuMapLogicalRangeFn {
    public operator fun invoke(domain: COpaquePointer?, permissions: UInt, mdl: COpaquePointer?, logicaladdress: ULong): Ntstatus
}

public typealias IommuMapLogicalRange = IommuMapLogicalRangeFn?

public fun interface IommuMapLogicalRangeExFn {
    public operator fun invoke(domain: COpaquePointer?, permissions: UInt, physicaladdresstomap: COpaquePointer?, explicitlogicaladdress: COpaquePointer?, minlogicaladdress: COpaquePointer?, maxlogicaladdress: COpaquePointer?, logicaladdressout: COpaquePointer?): Ntstatus
}

public typealias IommuMapLogicalRangeEx = IommuMapLogicalRangeExFn?

public typealias IommuMapPhysicalAddressType = Int

public fun interface IommuMapReservedLogicalRangeFn {
    public operator fun invoke(logicaladdresstoken: COpaquePointer?, offset: ULong, permissions: UInt, physicaladdresstomap: COpaquePointer?, mappedsegment: COpaquePointer?): Ntstatus
}

public typealias IommuMapReservedLogicalRange = IommuMapReservedLogicalRangeFn?

public fun interface IommuQueryInputMappingsFn {
    public operator fun invoke(physicaldeviceobject: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus
}

public typealias IommuQueryInputMappings = IommuQueryInputMappingsFn?

public fun interface IommuRegisterInterfaceStateChangeCallbackFn {
    public operator fun invoke(statechangecallback: PiommuInterfaceStateChangeCallback, context: COpaquePointer?, dmadevice: COpaquePointer?, statefields: COpaquePointer?): Ntstatus
}

public typealias IommuRegisterInterfaceStateChangeCallback = IommuRegisterInterfaceStateChangeCallbackFn?

public fun interface IommuReserveLogicalAddressRangeFn {
    public operator fun invoke(domain: COpaquePointer?, size: ULong, explicitlogicaladdress: COpaquePointer?, minlogicaladdress: COpaquePointer?, maxlogicaladdress: COpaquePointer?, logicaladdresstoken: COpaquePointer?): Ntstatus
}

public typealias IommuReserveLogicalAddressRange = IommuReserveLogicalAddressRangeFn?

public fun interface IommuSetDeviceFaultReportingFn {
    public operator fun invoke(physicaldeviceobject: COpaquePointer?, inputmappingidbase: UInt, enable: Boolean, faultconfig: COpaquePointer?): Ntstatus
}

public typealias IommuSetDeviceFaultReporting = IommuSetDeviceFaultReportingFn?

public fun interface IommuSetDeviceFaultReportingExFn {
    public operator fun invoke(dmadevice: COpaquePointer?, inputmappingidbase: UInt, enable: Boolean, faultconfig: COpaquePointer?): Ntstatus
}

public typealias IommuSetDeviceFaultReportingEx = IommuSetDeviceFaultReportingExFn?

public fun interface IommuUnmapIdentityRangeFn {
    public operator fun invoke(domain: COpaquePointer?, mdl: COpaquePointer?): Ntstatus
}

public typealias IommuUnmapIdentityRange = IommuUnmapIdentityRangeFn?

public fun interface IommuUnmapIdentityRangeExFn {
    public operator fun invoke(domain: COpaquePointer?, mappedphysicaladdress: COpaquePointer?): Ntstatus
}

public typealias IommuUnmapIdentityRangeEx = IommuUnmapIdentityRangeExFn?

public fun interface IommuUnmapLogicalRangeFn {
    public operator fun invoke(domain: COpaquePointer?, logicaladdress: ULong, numberofpages: ULong): Ntstatus
}

public typealias IommuUnmapLogicalRange = IommuUnmapLogicalRangeFn?

public fun interface IommuUnmapReservedLogicalRangeFn {
    public operator fun invoke(mappedsegment: COpaquePointer?): Ntstatus
}

public typealias IommuUnmapReservedLogicalRange = IommuUnmapReservedLogicalRangeFn?

public fun interface IommuUnregisterInterfaceStateChangeCallbackFn {
    public operator fun invoke(statechangecallback: PiommuInterfaceStateChangeCallback, dmadevice: COpaquePointer?): Ntstatus
}

public typealias IommuUnregisterInterfaceStateChangeCallback = IommuUnregisterInterfaceStateChangeCallbackFn?

public typealias IoAccessMode = Int

public typealias IoAccessType = Int

public typealias IoAllocationAction = Int

public fun interface IoCompletionRoutineFn {
    public operator fun invoke(deviceobject: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?): Ntstatus
}

public typealias IoCompletionRoutine = IoCompletionRoutineFn?

public typealias IoCompletionRoutineResult = Int

public typealias IoContainerInformationClass = Int

public typealias IoContainerNotificationClass = Int

public fun interface IoCsqAcquireLockFn {
    public operator fun invoke(csq: COpaquePointer?, irql: COpaquePointer?)
}

public typealias IoCsqAcquireLock = IoCsqAcquireLockFn?

public fun interface IoCsqCompleteCanceledIrpFn {
    public operator fun invoke(csq: COpaquePointer?, irp: COpaquePointer?)
}

public typealias IoCsqCompleteCanceledIrp = IoCsqCompleteCanceledIrpFn?

public fun interface IoCsqInsertIrpFn {
    public operator fun invoke(csq: COpaquePointer?, irp: COpaquePointer?)
}

public typealias IoCsqInsertIrp = IoCsqInsertIrpFn?

public fun interface IoCsqInsertIrpExFn {
    public operator fun invoke(csq: COpaquePointer?, irp: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus
}

public typealias IoCsqInsertIrpEx = IoCsqInsertIrpExFn?

public fun interface IoCsqPeekNextIrpFn {
    public operator fun invoke(csq: COpaquePointer?, irp: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer?
}

public typealias IoCsqPeekNextIrp = IoCsqPeekNextIrpFn?

public fun interface IoCsqReleaseLockFn {
    public operator fun invoke(csq: COpaquePointer?, irql: UByte)
}

public typealias IoCsqReleaseLock = IoCsqReleaseLockFn?

public fun interface IoCsqRemoveIrpFn {
    public operator fun invoke(csq: COpaquePointer?, irp: COpaquePointer?)
}

public typealias IoCsqRemoveIrp = IoCsqRemoveIrpFn?

public fun interface IoDpcRoutineFn {
    public operator fun invoke(dpc: COpaquePointer?, deviceobject: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?)
}

public typealias IoDpcRoutine = IoDpcRoutineFn?

public typealias IoNotificationEventCategory = Int

public typealias IoPagingPriority = Int

public fun interface IoPersistedMemoryEnumerationCallbackFn {
    public operator fun invoke(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, context: COpaquePointer?): Ntstatus
}

public typealias IoPersistedMemoryEnumerationCallback = IoPersistedMemoryEnumerationCallbackFn?

public typealias IoQueryDeviceDataFormat = Int

public typealias IoSessionEvent = Int

public fun interface IoSessionNotificationFunctionFn {
    public operator fun invoke(sessionobject: COpaquePointer?, ioobject: COpaquePointer?, event: UInt, context: COpaquePointer?, notificationpayload: COpaquePointer?, payloadlength: UInt): Ntstatus
}

public typealias IoSessionNotificationFunction = IoSessionNotificationFunctionFn?

public typealias IoSessionState = Int

public fun interface IoTimerRoutineFn {
    public operator fun invoke(deviceobject: COpaquePointer?, context: COpaquePointer?)
}

public typealias IoTimerRoutine = IoTimerRoutineFn?

public fun interface IoWorkitemRoutineFn {
    public operator fun invoke(deviceobject: COpaquePointer?, context: COpaquePointer?)
}

public typealias IoWorkitemRoutine = IoWorkitemRoutineFn?

public fun interface IoWorkitemRoutineExFn {
    public operator fun invoke(ioobject: COpaquePointer?, context: COpaquePointer?, ioworkitem: PioWorkitem)
}

public typealias IoWorkitemRoutineEx = IoWorkitemRoutineExFn?

public typealias IrqDevicePolicy = Int

public typealias IrqGroupPolicy = Int

public typealias IrqPriority = Int

public typealias KbugcheckBufferDumpState = Int

public typealias KbugcheckCallbackReason = Int

public fun interface KbugcheckCallbackRoutineFn {
    public operator fun invoke(buffer: COpaquePointer?, length: UInt)
}

public typealias KbugcheckCallbackRoutine = KbugcheckCallbackRoutineFn?

public typealias KbugcheckDumpIoType = Int

public fun interface KbugcheckReasonCallbackRoutineFn {
    public operator fun invoke(reason: KbugcheckCallbackReason, record: COpaquePointer?, reasonspecificdata: COpaquePointer?, reasonspecificdatalength: UInt)
}

public typealias KbugcheckReasonCallbackRoutine = KbugcheckReasonCallbackRoutineFn?

public fun interface KdeferredRoutineFn {
    public operator fun invoke(dpc: COpaquePointer?, deferredcontext: COpaquePointer?, systemargument1: COpaquePointer?, systemargument2: COpaquePointer?)
}

public typealias KdeferredRoutine = KdeferredRoutineFn?

public typealias KdpcImportance = Int

public typealias KdCallbackAction = Int

public typealias KdNamespaceEnum = Int

public typealias KdOption = Int

public typealias KeProcessorChangeNotifyState = Int

public typealias KinterruptMode = Int

public typealias KinterruptPolarity = Int

public fun interface KipiBroadcastWorkerFn {
    public operator fun invoke(argument: ULong): ULong
}

public typealias KipiBroadcastWorker = KipiBroadcastWorkerFn?

public fun interface KmessageServiceRoutineFn {
    public operator fun invoke(interrupt: COpaquePointer?, servicecontext: COpaquePointer?, messageid: UInt): Boolean
}

public typealias KmessageServiceRoutine = KmessageServiceRoutineFn?

public typealias KprofileSource = Int

public fun interface KserviceRoutineFn {
    public operator fun invoke(interrupt: COpaquePointer?, servicecontext: COpaquePointer?): Boolean
}

public typealias KserviceRoutine = KserviceRoutineFn?

public fun interface KstartRoutineFn {
    public operator fun invoke(startcontext: COpaquePointer?)
}

public typealias KstartRoutine = KstartRoutineFn?

public fun interface KsynchronizeRoutineFn {
    public operator fun invoke(synchronizecontext: COpaquePointer?): Boolean
}

public typealias KsynchronizeRoutine = KsynchronizeRoutineFn?

public typealias KwaitReason = Int

public typealias LockOperation = Int

public typealias McaExceptionType = Int

public typealias MemoryCachingType = Int

public typealias MemoryCachingTypeOrig = Int

public typealias MemDedicatedAttributeType = Int

public typealias MemSectionExtendedParameterType = Int

public typealias MmMdlPageContentsState = Int

public fun interface MmMdlRoutineFn {
    public operator fun invoke(drivercontext: COpaquePointer?, mappedva: COpaquePointer?)
}

public typealias MmMdlRoutine = MmMdlRoutineFn?

public typealias MmPagePriority = Int

public typealias MmRotateDirection = Int

public typealias MmSystemsize = Int

public typealias Mode = Int

public fun interface NmiCallbackFn {
    public operator fun invoke(context: COpaquePointer?, handled: Boolean): Boolean
}

public typealias NmiCallback = NmiCallbackFn?

public fun interface NpemControlEnableDisableFn {
    public operator fun invoke(context: COpaquePointer?, enablenpem: Boolean): Ntstatus
}

public typealias NpemControlEnableDisable = NpemControlEnableDisableFn?

public fun interface NpemControlQueryControlFn {
    public operator fun invoke(context: COpaquePointer?): UInt
}

public typealias NpemControlQueryControl = NpemControlQueryControlFn?

public fun interface NpemControlQueryStandardCapabilitiesFn {
    public operator fun invoke(context: COpaquePointer?, standardcapabilities: COpaquePointer?): Ntstatus
}

public typealias NpemControlQueryStandardCapabilities = NpemControlQueryStandardCapabilitiesFn?

public fun interface NpemControlSetStandardControlFn {
    public operator fun invoke(context: COpaquePointer?, standardcontrol: NpemControlStandardControlBit, set: Boolean): Ntstatus
}

public typealias NpemControlSetStandardControl = NpemControlSetStandardControlFn?

public typealias NpemControlStandardControlBit = Int

public fun interface NtfsDerefExportedSecurityDescriptorFn {
    public operator fun invoke(vcb: COpaquePointer?, securitydescriptor: PsecurityDescriptor)
}

public typealias NtfsDerefExportedSecurityDescriptor = NtfsDerefExportedSecurityDescriptorFn?

public typealias ObPreopCallbackStatus = Int

public fun interface PallocateAdapterChannelFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, deviceobject: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl, context: COpaquePointer?): Ntstatus
}

public typealias PallocateAdapterChannel = PallocateAdapterChannelFn?

public fun interface PallocateAdapterChannelExFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, deviceobject: COpaquePointer?, dmatransfercontext: COpaquePointer?, numberofmapregisters: UInt, flags: UInt, executionroutine: DriverControl, executioncontext: COpaquePointer?, mapregisterbase: COpaquePointer?): Ntstatus
}

public typealias PallocateAdapterChannelEx = PallocateAdapterChannelExFn?

public fun interface PallocateCommonBufferFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, length: UInt, logicaladdress: COpaquePointer?, cacheenabled: Boolean): COpaquePointer?
}

public typealias PallocateCommonBuffer = PallocateCommonBufferFn?

public fun interface PallocateCommonBufferExFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, maximumaddress: COpaquePointer?, length: UInt, logicaladdress: COpaquePointer?, cacheenabled: Boolean, preferrednode: UInt): COpaquePointer?
}

public typealias PallocateCommonBufferEx = PallocateCommonBufferExFn?

public fun interface PallocateCommonBufferVectorFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, lowaddress: Long, highaddress: Long, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, numberofelements: UInt, sizeofelements: ULong, vectorout: COpaquePointer?): Ntstatus
}

public typealias PallocateCommonBufferVector = PallocateCommonBufferVectorFn?

public fun interface PallocateCommonBufferWithBoundsFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, minimumaddress: COpaquePointer?, maximumaddress: COpaquePointer?, length: UInt, flags: UInt, cachetype: COpaquePointer?, preferrednode: UInt, logicaladdress: COpaquePointer?): COpaquePointer?
}

public typealias PallocateCommonBufferWithBounds = PallocateCommonBufferWithBoundsFn?

public fun interface PallocateDomainCommonBufferFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, domainhandle: Handle, maximumaddress: COpaquePointer?, length: UInt, flags: UInt, cachetype: COpaquePointer?, preferrednode: UInt, logicaladdress: COpaquePointer?, virtualaddress: COpaquePointer?): Ntstatus
}

public typealias PallocateDomainCommonBuffer = PallocateDomainCommonBufferFn?

public fun interface PallocateFunctionFn {
    public operator fun invoke(): COpaquePointer?
}

public typealias PallocateFunction = PallocateFunctionFn?

public fun interface PallocateFunctionExFn {
    public operator fun invoke(): COpaquePointer?
}

public typealias PallocateFunctionEx = PallocateFunctionExFn?

public fun interface ParbiterHandlerFn {
    public operator fun invoke(context: COpaquePointer?, action: ArbiterAction, parameters: COpaquePointer?): Ntstatus
}

public typealias ParbiterHandler = ParbiterHandlerFn?

public typealias PartitionInformationClass = Int

public fun interface PbootDriverCallbackFunctionFn {
    public operator fun invoke()
}

public typealias PbootDriverCallbackFunction = PbootDriverCallbackFunctionFn?

public fun interface PboundCallbackFn {
    public operator fun invoke(): BoundCallbackStatus
}

public typealias PboundCallback = PboundCallbackFn?

public fun interface PbuildMdlFromScatterGatherListFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, scattergather: COpaquePointer?, originalmdl: COpaquePointer?, targetmdl: COpaquePointer?): Ntstatus
}

public typealias PbuildMdlFromScatterGatherList = PbuildMdlFromScatterGatherListFn?

public fun interface PbuildScatterGatherListFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, deviceobject: COpaquePointer?, mdl: COpaquePointer?, currentva: COpaquePointer?, length: UInt, executionroutine: DriverListControl, context: COpaquePointer?, writetodevice: Boolean, scattergatherbuffer: COpaquePointer?, scattergatherlength: UInt): Ntstatus
}

public typealias PbuildScatterGatherList = PbuildScatterGatherListFn?

public fun interface PbuildScatterGatherListExFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, deviceobject: COpaquePointer?, dmatransfercontext: COpaquePointer?, mdl: COpaquePointer?, offset: ULong, length: UInt, flags: UInt, executionroutine: DriverListControl, context: COpaquePointer?, writetodevice: Boolean, scattergatherbuffer: COpaquePointer?, scattergatherlength: UInt, dmacompletionroutine: PdmaCompletionRoutine, completioncontext: COpaquePointer?, scattergatherlist: COpaquePointer?): Ntstatus
}

public typealias PbuildScatterGatherListEx = PbuildScatterGatherListExFn?

public fun interface PcalculateScatterGatherListSizeFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mdl: COpaquePointer?, currentva: COpaquePointer?, length: UInt, scattergatherlistsize: COpaquePointer?, pnumberofmapregisters: COpaquePointer?): Ntstatus
}

public typealias PcalculateScatterGatherListSize = PcalculateScatterGatherListSizeFn?

public fun interface PcallbackFunctionFn {
    public operator fun invoke()
}

public typealias PcallbackFunction = PcallbackFunctionFn?

public fun interface PcancelAdapterChannelFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, deviceobject: COpaquePointer?, dmatransfercontext: COpaquePointer?): Boolean
}

public typealias PcancelAdapterChannel = PcancelAdapterChannelFn?

public fun interface PcancelMappedTransferFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, dmatransfercontext: COpaquePointer?): Ntstatus
}

public typealias PcancelMappedTransfer = PcancelMappedTransferFn?

public typealias PciAcsBit = Int

public typealias PciBusWidth = Int

public typealias PciDeviceD3coldStateReason = Int

public fun interface PciErrorHandlerCallbackFn {
    public operator fun invoke()
}

public typealias PciErrorHandlerCallback = PciErrorHandlerCallbackFn?

public typealias PciExpressAspmControl = Int

public typealias PciExpressAspmSupport = Int

public typealias PciExpressCardPresence = Int

public typealias PciExpressDeviceType = Int

public fun interface PciExpressEnterLinkQuiescentModeFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PciExpressEnterLinkQuiescentMode = PciExpressEnterLinkQuiescentModeFn?

public fun interface PciExpressExitLinkQuiescentModeFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PciExpressExitLinkQuiescentMode = PciExpressExitLinkQuiescentModeFn?

public typealias PciExpressIndicatorState = Int

public typealias PciExpressL0sExitLatency = Int

public typealias PciExpressL1ExitLatency = Int

public typealias PciExpressLinkSubstate = Int

public typealias PciExpressMaxPayloadSize = Int

public typealias PciExpressMrlState = Int

public typealias PciExpressPowerState = Int

public typealias PciExpressRcb = Int

public fun interface PciExpressWakeControlFn {
    public operator fun invoke(context: COpaquePointer?, enablewake: Boolean)
}

public typealias PciExpressWakeControl = PciExpressWakeControlFn?

public typealias PciHardwareInterface = Int

public fun interface PciIsDevicePresentFn {
    public operator fun invoke(vendorid: UShort, deviceid: UShort, revisionid: UByte, subvendorid: UShort, subsystemid: UShort, flags: UInt): Boolean
}

public typealias PciIsDevicePresent = PciIsDevicePresentFn?

public fun interface PciIsDevicePresentExFn {
    public operator fun invoke(context: COpaquePointer?, parameters: COpaquePointer?): Boolean
}

public typealias PciIsDevicePresentEx = PciIsDevicePresentExFn?

public fun interface PciLineToPinFn {
    public operator fun invoke(context: COpaquePointer?, pcinewdata: COpaquePointer?, pciolddata: COpaquePointer?)
}

public typealias PciLineToPin = PciLineToPinFn?

public fun interface PciMsixGetEntryFn {
    public operator fun invoke(context: COpaquePointer?, tableentry: UInt, messagenumber: COpaquePointer?, masked: COpaquePointer?): Ntstatus
}

public typealias PciMsixGetEntry = PciMsixGetEntryFn?

public fun interface PciMsixGetTableSizeFn {
    public operator fun invoke(context: COpaquePointer?, tablesize: COpaquePointer?): Ntstatus
}

public typealias PciMsixGetTableSize = PciMsixGetTableSizeFn?

public fun interface PciMsixMaskunmaskEntryFn {
    public operator fun invoke(context: COpaquePointer?, tableentry: UInt): Ntstatus
}

public typealias PciMsixMaskunmaskEntry = PciMsixMaskunmaskEntryFn?

public fun interface PciMsixSetEntryFn {
    public operator fun invoke(context: COpaquePointer?, tableentry: UInt, messagenumber: UInt): Ntstatus
}

public typealias PciMsixSetEntry = PciMsixSetEntryFn?

public fun interface PciPinToLineFn {
    public operator fun invoke(context: COpaquePointer?, pcidata: COpaquePointer?)
}

public typealias PciPinToLine = PciPinToLineFn?

public fun interface PciPrepareMultistageResumeFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias PciPrepareMultistageResume = PciPrepareMultistageResumeFn?

public fun interface PciReadWriteConfigFn {
    public operator fun invoke(context: COpaquePointer?, busoffset: UInt, slot: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt
}

public typealias PciReadWriteConfig = PciReadWriteConfigFn?

public fun interface PciRootBusCapabilityFn {
    public operator fun invoke(context: COpaquePointer?, hardwarecapability: COpaquePointer?)
}

public typealias PciRootBusCapability = PciRootBusCapabilityFn?

public fun interface PciSetAcsFn {
    public operator fun invoke(context: COpaquePointer?, enablesourcevalidation: PciAcsBit, enabletranslationblocking: PciAcsBit, enablep2prequestredirect: PciAcsBit, enablecompletionredirect: PciAcsBit, enableupstreamforwarding: PciAcsBit, enableegresscontrol: PciAcsBit, enabledirecttranslatedp2p: PciAcsBit): Ntstatus
}

public typealias PciSetAcs = PciSetAcsFn?

public fun interface PciSetAcs2Fn {
    public operator fun invoke(context: COpaquePointer?, scenariostomodify: UInt, scenariostate: UInt): Ntstatus
}

public typealias PciSetAcs2 = PciSetAcs2Fn?

public fun interface PciSetAtsFn {
    public operator fun invoke(context: COpaquePointer?, enableats: Boolean): Ntstatus
}

public typealias PciSetAts = PciSetAtsFn?

public fun interface PclfsClientAdvanceTailCallbackFn {
    public operator fun invoke(logfile: COpaquePointer?, targetlsn: COpaquePointer?, clientdata: COpaquePointer?): Ntstatus
}

public typealias PclfsClientAdvanceTailCallback = PclfsClientAdvanceTailCallbackFn?

public fun interface PclfsClientLffHandlerCompleteCallbackFn {
    public operator fun invoke(logfile: COpaquePointer?, operationstatus: Ntstatus, logispinned: Boolean, clientdata: COpaquePointer?)
}

public typealias PclfsClientLffHandlerCompleteCallback = PclfsClientLffHandlerCompleteCallbackFn?

public fun interface PclfsClientLogUnpinnedCallbackFn {
    public operator fun invoke(logfile: COpaquePointer?, clientdata: COpaquePointer?)
}

public typealias PclfsClientLogUnpinnedCallback = PclfsClientLogUnpinnedCallbackFn?

public fun interface PclfsSetLogSizeCompleteCallbackFn {
    public operator fun invoke(logfile: COpaquePointer?, operationstatus: Ntstatus, clientdata: COpaquePointer?)
}

public typealias PclfsSetLogSizeCompleteCallback = PclfsSetLogSizeCompleteCallbackFn?

public fun interface PconfigureAdapterChannelFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, functionnumber: UInt, context: COpaquePointer?): Ntstatus
}

public typealias PconfigureAdapterChannel = PconfigureAdapterChannelFn?

public fun interface PcrashdumpPowerOnFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PcrashdumpPowerOn = PcrashdumpPowerOnFn?

public fun interface PcreateCommonBufferFromMdlFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mdl: COpaquePointer?, extendedconfigs: COpaquePointer?, extendedconfigscount: UInt, logicaladdress: COpaquePointer?): Ntstatus
}

public typealias PcreateCommonBufferFromMdl = PcreateCommonBufferFromMdlFn?

public fun interface PcreateProcessNotifyRoutineFn {
    public operator fun invoke(parentid: Handle, processid: Handle, create: Boolean)
}

public typealias PcreateProcessNotifyRoutine = PcreateProcessNotifyRoutineFn?

public fun interface PcreateProcessNotifyRoutineExFn {
    public operator fun invoke(process: Peprocess, processid: Handle, createinfo: COpaquePointer?)
}

public typealias PcreateProcessNotifyRoutineEx = PcreateProcessNotifyRoutineExFn?

public fun interface PcreateThreadNotifyRoutineFn {
    public operator fun invoke(processid: Handle, threadid: Handle, create: Boolean)
}

public typealias PcreateThreadNotifyRoutine = PcreateThreadNotifyRoutineFn?

public fun interface PcwCallbackFn {
    public operator fun invoke(type: PcwCallbackType, info: COpaquePointer?, context: COpaquePointer?): Ntstatus
}

public typealias PcwCallback = PcwCallbackFn?

public typealias PcwCallbackType = Int

public typealias PcwRegistrationFlags = Int

public fun interface Pd3coldRequestAuxPowerFn {
    public operator fun invoke(): Ntstatus
}

public typealias Pd3coldRequestAuxPower = Pd3coldRequestAuxPowerFn?

public fun interface Pd3coldRequestCorePowerRailFn {
    public operator fun invoke()
}

public typealias Pd3coldRequestCorePowerRail = Pd3coldRequestCorePowerRailFn?

public fun interface Pd3coldRequestPerstDelayFn {
    public operator fun invoke(): Ntstatus
}

public typealias Pd3coldRequestPerstDelay = Pd3coldRequestPerstDelayFn?

public fun interface PdebugDeviceFoundFunctionFn {
    public operator fun invoke(device: COpaquePointer?): KdCallbackAction
}

public typealias PdebugDeviceFoundFunction = PdebugDeviceFoundFunctionFn?

public fun interface PdebugPrintCallbackFn {
    public operator fun invoke(output: COpaquePointer?, componentid: UInt, level: UInt)
}

public typealias PdebugPrintCallback = PdebugPrintCallbackFn?

public fun interface PdeviceBusSpecificResetHandlerFn {
    public operator fun invoke(): Ntstatus
}

public typealias PdeviceBusSpecificResetHandler = PdeviceBusSpecificResetHandlerFn?

public fun interface PdeviceChangeCompleteCallbackFn {
    public operator fun invoke()
}

public typealias PdeviceChangeCompleteCallback = PdeviceChangeCompleteCallbackFn?

public fun interface PdeviceNotifyCallbackFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt)
}

public typealias PdeviceNotifyCallback = PdeviceNotifyCallbackFn?

public fun interface PdeviceNotifyCallback2Fn {
    public operator fun invoke(notificationcontext: COpaquePointer?, notifycode: UInt)
}

public typealias PdeviceNotifyCallback2 = PdeviceNotifyCallback2Fn?

public fun interface PdeviceQueryBusSpecificResetHandlerFn {
    public operator fun invoke(): Ntstatus
}

public typealias PdeviceQueryBusSpecificResetHandler = PdeviceQueryBusSpecificResetHandlerFn?

public fun interface PdeviceResetCompletionFn {
    public operator fun invoke()
}

public typealias PdeviceResetCompletion = PdeviceResetCompletionFn?

public fun interface PdeviceResetHandlerFn {
    public operator fun invoke(): Ntstatus
}

public typealias PdeviceResetHandler = PdeviceResetHandlerFn?

public fun interface PdmaCompletionRoutineFn {
    public operator fun invoke()
}

public typealias PdmaCompletionRoutine = PdmaCompletionRoutineFn?

public fun interface PdriverCmcExceptionCallbackFn {
    public operator fun invoke(context: COpaquePointer?, cmclog: COpaquePointer?)
}

public typealias PdriverCmcExceptionCallback = PdriverCmcExceptionCallbackFn?

public fun interface PdriverCpeExceptionCallbackFn {
    public operator fun invoke(context: COpaquePointer?, cmclog: COpaquePointer?)
}

public typealias PdriverCpeExceptionCallback = PdriverCpeExceptionCallbackFn?

public fun interface PdriverExcptnCallbackFn {
    public operator fun invoke(context: COpaquePointer?, banklog: COpaquePointer?)
}

public typealias PdriverExcptnCallback = PdriverExcptnCallbackFn?

public fun interface PdriverVerifierThunkRoutineFn {
    public operator fun invoke(context: COpaquePointer?): ULong
}

public typealias PdriverVerifierThunkRoutine = PdriverVerifierThunkRoutineFn?

public fun interface PenableVirtualizationFn {
    public operator fun invoke(): Ntstatus
}

public typealias PenableVirtualization = PenableVirtualizationFn?

public fun interface PetwenablecallbackFn {
    public operator fun invoke()
}

public typealias Petwenablecallback = PetwenablecallbackFn?

public fun interface PexpandStackCalloutFn {
    public operator fun invoke()
}

public typealias PexpandStackCallout = PexpandStackCalloutFn?

public fun interface PextCallbackFn {
    public operator fun invoke()
}

public typealias PextCallback = PextCallbackFn?

public fun interface PextDeleteCallbackFn {
    public operator fun invoke()
}

public typealias PextDeleteCallback = PextDeleteCallbackFn?

public fun interface PexCallbackFunctionFn {
    public operator fun invoke(): Ntstatus
}

public typealias PexCallbackFunction = PexCallbackFunctionFn?

public fun interface PflushAdapterBuffersFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: UInt, writetodevice: Boolean): Boolean
}

public typealias PflushAdapterBuffers = PflushAdapterBuffersFn?

public fun interface PflushAdapterBuffersExFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, offset: ULong, length: UInt, writetodevice: Boolean): Ntstatus
}

public typealias PflushAdapterBuffersEx = PflushAdapterBuffersExFn?

public fun interface PflushDmaBufferFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mdl: COpaquePointer?, readoperation: Boolean): Ntstatus
}

public typealias PflushDmaBuffer = PflushDmaBufferFn?

public fun interface PfnfthFn {
    public operator fun invoke(systemfirmwaretableinfo: COpaquePointer?): Ntstatus
}

public typealias Pfnfth = PfnfthFn?

public fun interface PfnInUsePageOfflineNotifyFn {
    public operator fun invoke(page: UInt, flags: Boolean, poisoned: Boolean, context: COpaquePointer?): Boolean
}

public typealias PfnInUsePageOfflineNotify = PfnInUsePageOfflineNotifyFn?

public fun interface PfnNtCommitTransactionFn {
    public operator fun invoke(transactionhandle: Handle, wait: Boolean): Ntstatus
}

public typealias PfnNtCommitTransaction = PfnNtCommitTransactionFn?

public fun interface PfnNtCreateTransactionFn {
    public operator fun invoke(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus
}

public typealias PfnNtCreateTransaction = PfnNtCreateTransactionFn?

public fun interface PfnNtOpenTransactionFn {
    public operator fun invoke(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus
}

public typealias PfnNtOpenTransaction = PfnNtOpenTransactionFn?

public fun interface PfnNtQueryInformationTransactionFn {
    public operator fun invoke(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus
}

public typealias PfnNtQueryInformationTransaction = PfnNtQueryInformationTransactionFn?

public fun interface PfnNtRollbackTransactionFn {
    public operator fun invoke(transactionhandle: Handle, wait: Boolean): Ntstatus
}

public typealias PfnNtRollbackTransaction = PfnNtRollbackTransactionFn?

public fun interface PfnNtSetInformationTransactionFn {
    public operator fun invoke(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus
}

public typealias PfnNtSetInformationTransaction = PfnNtSetInformationTransactionFn?

public fun interface PfnRtlIsNtddiVersionAvailableFn {
    public operator fun invoke(version: UInt): Boolean
}

public typealias PfnRtlIsNtddiVersionAvailable = PfnRtlIsNtddiVersionAvailableFn?

public fun interface PfnRtlIsServicePackVersionInstalledFn {
    public operator fun invoke(version: UInt): Boolean
}

public typealias PfnRtlIsServicePackVersionInstalled = PfnRtlIsServicePackVersionInstalledFn?

public fun interface PfnWheaHighIrqlLogSelEventHandlerFn {
    public operator fun invoke(context: COpaquePointer?, osselrecord: COpaquePointer?): Ntstatus
}

public typealias PfnWheaHighIrqlLogSelEventHandler = PfnWheaHighIrqlLogSelEventHandlerFn?

public fun interface PfpgaBusScanFn {
    public operator fun invoke()
}

public typealias PfpgaBusScan = PfpgaBusScanFn?

public fun interface PfpgaControlConfigSpaceFn {
    public operator fun invoke(): Ntstatus
}

public typealias PfpgaControlConfigSpace = PfpgaControlConfigSpaceFn?

public fun interface PfpgaControlErrorReportingFn {
    public operator fun invoke(): Ntstatus
}

public typealias PfpgaControlErrorReporting = PfpgaControlErrorReportingFn?

public fun interface PfpgaControlLinkFn {
    public operator fun invoke(): Ntstatus
}

public typealias PfpgaControlLink = PfpgaControlLinkFn?

public fun interface PfreeAdapterChannelFn {
    public operator fun invoke(dmaadapter: COpaquePointer?)
}

public typealias PfreeAdapterChannel = PfreeAdapterChannelFn?

public fun interface PfreeAdapterObjectFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, allocationaction: IoAllocationAction)
}

public typealias PfreeAdapterObject = PfreeAdapterObjectFn?

public fun interface PfreeCommonBufferFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, length: UInt, logicaladdress: Long, virtualaddress: COpaquePointer?, cacheenabled: Boolean)
}

public typealias PfreeCommonBuffer = PfreeCommonBufferFn?

public fun interface PfreeCommonBufferFromVectorFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, vector: COpaquePointer?, index: UInt)
}

public typealias PfreeCommonBufferFromVector = PfreeCommonBufferFromVectorFn?

public fun interface PfreeCommonBufferVectorFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, vector: COpaquePointer?)
}

public typealias PfreeCommonBufferVector = PfreeCommonBufferVectorFn?

public fun interface PfreeFunctionExFn {
    public operator fun invoke()
}

public typealias PfreeFunctionEx = PfreeFunctionExFn?

public fun interface PfreeMapRegistersFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mapregisterbase: COpaquePointer?, numberofmapregisters: UInt)
}

public typealias PfreeMapRegisters = PfreeMapRegistersFn?

public fun interface PgetCommonBufferFromVectorByIndexFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, vector: COpaquePointer?, index: UInt, virtualaddressout: COpaquePointer?, logicaladdressout: COpaquePointer?)
}

public typealias PgetCommonBufferFromVectorByIndex = PgetCommonBufferFromVectorByIndexFn?

public fun interface PgetD3coldCapabilityFn {
    public operator fun invoke(): Ntstatus
}

public typealias PgetD3coldCapability = PgetD3coldCapabilityFn?

public fun interface PgetD3coldLastTransitionStatusFn {
    public operator fun invoke()
}

public typealias PgetD3coldLastTransitionStatus = PgetD3coldLastTransitionStatusFn?

public fun interface PgetDeviceResetStatusFn {
    public operator fun invoke(): Ntstatus
}

public typealias PgetDeviceResetStatus = PgetDeviceResetStatusFn?

public fun interface PgetDmaAdapterFn {
    public operator fun invoke(): COpaquePointer?
}

public typealias PgetDmaAdapter = PgetDmaAdapterFn?

public fun interface PgetDmaAdapterInfoFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, adapterinfo: COpaquePointer?): Ntstatus
}

public typealias PgetDmaAdapterInfo = PgetDmaAdapterInfoFn?

public fun interface PgetDmaAlignmentFn {
    public operator fun invoke(dmaadapter: COpaquePointer?): UInt
}

public typealias PgetDmaAlignment = PgetDmaAlignmentFn?

public fun interface PgetDmaDomainFn {
    public operator fun invoke(dmaadapter: COpaquePointer?): Handle
}

public typealias PgetDmaDomain = PgetDmaDomainFn?

public fun interface PgetDmaTransferInfoFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mdl: COpaquePointer?, offset: ULong, length: UInt, writeonly: Boolean, transferinfo: COpaquePointer?): Ntstatus
}

public typealias PgetDmaTransferInfo = PgetDmaTransferInfoFn?

public fun interface PgetIdleWakeInfoFn {
    public operator fun invoke(): Ntstatus
}

public typealias PgetIdleWakeInfo = PgetIdleWakeInfoFn?

public fun interface PgetLocationStringFn {
    public operator fun invoke(context: COpaquePointer?, locationstrings: COpaquePointer?): Ntstatus
}

public typealias PgetLocationString = PgetLocationStringFn?

public fun interface PgetScatterGatherListFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, deviceobject: COpaquePointer?, mdl: COpaquePointer?, currentva: COpaquePointer?, length: UInt, executionroutine: DriverListControl, context: COpaquePointer?, writetodevice: Boolean): Ntstatus
}

public typealias PgetScatterGatherList = PgetScatterGatherListFn?

public fun interface PgetScatterGatherListExFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, deviceobject: COpaquePointer?, dmatransfercontext: COpaquePointer?, mdl: COpaquePointer?, offset: ULong, length: UInt, flags: UInt, executionroutine: DriverListControl, context: COpaquePointer?, writetodevice: Boolean, dmacompletionroutine: PdmaCompletionRoutine, completioncontext: COpaquePointer?, scattergatherlist: COpaquePointer?): Ntstatus
}

public typealias PgetScatterGatherListEx = PgetScatterGatherListExFn?

public fun interface PgetSdevIdentifierFn {
    public operator fun invoke(): ULong
}

public typealias PgetSdevIdentifier = PgetSdevIdentifierFn?

public fun interface PgetSetDeviceDataFn {
    public operator fun invoke(): UInt
}

public typealias PgetSetDeviceData = PgetSetDeviceDataFn?

public fun interface PgetUpdatedBusResourceFn {
    public operator fun invoke(): Ntstatus
}

public typealias PgetUpdatedBusResource = PgetUpdatedBusResourceFn?

public fun interface PgetVirtualDeviceDataFn {
    public operator fun invoke(): UInt
}

public typealias PgetVirtualDeviceData = PgetVirtualDeviceDataFn?

public fun interface PgetVirtualDeviceLocationFn {
    public operator fun invoke(): Ntstatus
}

public typealias PgetVirtualDeviceLocation = PgetVirtualDeviceLocationFn?

public fun interface PgetVirtualDeviceResourcesFn {
    public operator fun invoke()
}

public typealias PgetVirtualDeviceResources = PgetVirtualDeviceResourcesFn?

public fun interface PgetVirtualFunctionProbedBarsFn {
    public operator fun invoke(): Ntstatus
}

public typealias PgetVirtualFunctionProbedBars = PgetVirtualFunctionProbedBarsFn?

public fun interface PgpeClearStatusFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Ntstatus
}

public typealias PgpeClearStatus = PgpeClearStatusFn?

public fun interface PgpeClearStatus2Fn {
    public operator fun invoke(context: COpaquePointer?, objectcontext: COpaquePointer?): Ntstatus
}

public typealias PgpeClearStatus2 = PgpeClearStatus2Fn?

public fun interface PgpeConnectVectorFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: KinterruptMode, param3: Boolean, param4: PgpeServiceRoutine, param5: COpaquePointer?, param6: COpaquePointer?): Ntstatus
}

public typealias PgpeConnectVector = PgpeConnectVectorFn?

public fun interface PgpeConnectVector2Fn {
    public operator fun invoke(context: COpaquePointer?, gpenumber: UInt, mode: KinterruptMode, shareable: Boolean, serviceroutine: PgpeServiceRoutine, servicecontext: COpaquePointer?, objectcontext: COpaquePointer?): Ntstatus
}

public typealias PgpeConnectVector2 = PgpeConnectVector2Fn?

public fun interface PgpeDisableEventFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Ntstatus
}

public typealias PgpeDisableEvent = PgpeDisableEventFn?

public fun interface PgpeDisableEvent2Fn {
    public operator fun invoke(context: COpaquePointer?, objectcontext: COpaquePointer?): Ntstatus
}

public typealias PgpeDisableEvent2 = PgpeDisableEvent2Fn?

public fun interface PgpeDisconnectVectorFn {
    public operator fun invoke(param0: COpaquePointer?): Ntstatus
}

public typealias PgpeDisconnectVector = PgpeDisconnectVectorFn?

public fun interface PgpeDisconnectVector2Fn {
    public operator fun invoke(context: COpaquePointer?, objectcontext: COpaquePointer?): Ntstatus
}

public typealias PgpeDisconnectVector2 = PgpeDisconnectVector2Fn?

public fun interface PgpeEnableEventFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Ntstatus
}

public typealias PgpeEnableEvent = PgpeEnableEventFn?

public fun interface PgpeEnableEvent2Fn {
    public operator fun invoke(context: COpaquePointer?, objectcontext: COpaquePointer?): Ntstatus
}

public typealias PgpeEnableEvent2 = PgpeEnableEvent2Fn?

public fun interface PgpeServiceRoutineFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Boolean
}

public typealias PgpeServiceRoutine = PgpeServiceRoutineFn?

public fun interface PgpeServiceRoutine2Fn {
    public operator fun invoke(objectcontext: COpaquePointer?, servicecontext: COpaquePointer?): Boolean
}

public typealias PgpeServiceRoutine2 = PgpeServiceRoutine2Fn?

public fun interface PhalioreadwritehandlerFn {
    public operator fun invoke(fread: Boolean, dwaddr: UInt, dwsize: UInt, pdwdata: COpaquePointer?): Ntstatus
}

public typealias Phalioreadwritehandler = PhalioreadwritehandlerFn?

public fun interface PhalmcainterfacelockFn {
    public operator fun invoke()
}

public typealias Phalmcainterfacelock = PhalmcainterfacelockFn?

public fun interface PhalmcainterfacereadregisterFn {
    public operator fun invoke(banknumber: UByte, exception: COpaquePointer?): Ntstatus
}

public typealias Phalmcainterfacereadregister = PhalmcainterfacereadregisterFn?

public fun interface PhalmcainterfaceunlockFn {
    public operator fun invoke()
}

public typealias Phalmcainterfaceunlock = PhalmcainterfaceunlockFn?

public fun interface PhalResetDisplayParametersFn {
    public operator fun invoke(columns: UInt, rows: UInt): Boolean
}

public typealias PhalResetDisplayParameters = PhalResetDisplayParametersFn?

public fun interface PhvlWheaErrorNotificationFn {
    public operator fun invoke(): Ntstatus
}

public typealias PhvlWheaErrorNotification = PhvlWheaErrorNotificationFn?

public typealias PhysicalCounterResourceDescriptorType = Int

public fun interface PinitializeDmaTransferContextFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, dmatransfercontext: COpaquePointer?): Ntstatus
}

public typealias PinitializeDmaTransferContext = PinitializeDmaTransferContextFn?

public fun interface PinterfaceDereferenceFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias PinterfaceDereference = PinterfaceDereferenceFn?

public fun interface PinterfaceReferenceFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias PinterfaceReference = PinterfaceReferenceFn?

public fun interface PiommuDeviceCreateFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDeviceCreate = PiommuDeviceCreateFn?

public fun interface PiommuDeviceDeleteFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDeviceDelete = PiommuDeviceDeleteFn?

public fun interface PiommuDeviceFaultHandlerFn {
    public operator fun invoke()
}

public typealias PiommuDeviceFaultHandler = PiommuDeviceFaultHandlerFn?

public fun interface PiommuDeviceQueryDomainTypesFn {
    public operator fun invoke()
}

public typealias PiommuDeviceQueryDomainTypes = PiommuDeviceQueryDomainTypesFn?

public fun interface PiommuDomainAttachDeviceFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDomainAttachDevice = PiommuDomainAttachDeviceFn?

public fun interface PiommuDomainAttachDeviceExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDomainAttachDeviceEx = PiommuDomainAttachDeviceExFn?

public fun interface PiommuDomainConfigureFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDomainConfigure = PiommuDomainConfigureFn?

public fun interface PiommuDomainCreateFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDomainCreate = PiommuDomainCreateFn?

public fun interface PiommuDomainCreateExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDomainCreateEx = PiommuDomainCreateExFn?

public fun interface PiommuDomainDeleteFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDomainDelete = PiommuDomainDeleteFn?

public fun interface PiommuDomainDetachDeviceFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDomainDetachDevice = PiommuDomainDetachDeviceFn?

public fun interface PiommuDomainDetachDeviceExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuDomainDetachDeviceEx = PiommuDomainDetachDeviceExFn?

public fun interface PiommuFlushDomainFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuFlushDomain = PiommuFlushDomainFn?

public fun interface PiommuFlushDomainVaListFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuFlushDomainVaList = PiommuFlushDomainVaListFn?

public fun interface PiommuFreeReservedLogicalAddressRangeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuFreeReservedLogicalAddressRange = PiommuFreeReservedLogicalAddressRangeFn?

public fun interface PiommuInterfaceStateChangeCallbackFn {
    public operator fun invoke()
}

public typealias PiommuInterfaceStateChangeCallback = PiommuInterfaceStateChangeCallbackFn?

public fun interface PiommuMapIdentityRangeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuMapIdentityRange = PiommuMapIdentityRangeFn?

public fun interface PiommuMapIdentityRangeExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuMapIdentityRangeEx = PiommuMapIdentityRangeExFn?

public fun interface PiommuMapLogicalRangeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuMapLogicalRange = PiommuMapLogicalRangeFn?

public fun interface PiommuMapLogicalRangeExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuMapLogicalRangeEx = PiommuMapLogicalRangeExFn?

public fun interface PiommuMapReservedLogicalRangeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuMapReservedLogicalRange = PiommuMapReservedLogicalRangeFn?

public fun interface PiommuQueryInputMappingsFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuQueryInputMappings = PiommuQueryInputMappingsFn?

public fun interface PiommuRegisterInterfaceStateChangeCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuRegisterInterfaceStateChangeCallback = PiommuRegisterInterfaceStateChangeCallbackFn?

public fun interface PiommuReserveLogicalAddressRangeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuReserveLogicalAddressRange = PiommuReserveLogicalAddressRangeFn?

public fun interface PiommuSetDeviceFaultReportingFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuSetDeviceFaultReporting = PiommuSetDeviceFaultReportingFn?

public fun interface PiommuSetDeviceFaultReportingExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuSetDeviceFaultReportingEx = PiommuSetDeviceFaultReportingExFn?

public fun interface PiommuUnmapIdentityRangeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuUnmapIdentityRange = PiommuUnmapIdentityRangeFn?

public fun interface PiommuUnmapIdentityRangeExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuUnmapIdentityRangeEx = PiommuUnmapIdentityRangeExFn?

public fun interface PiommuUnmapLogicalRangeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuUnmapLogicalRange = PiommuUnmapLogicalRangeFn?

public fun interface PiommuUnmapReservedLogicalRangeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuUnmapReservedLogicalRange = PiommuUnmapReservedLogicalRangeFn?

public fun interface PiommuUnregisterInterfaceStateChangeCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PiommuUnregisterInterfaceStateChangeCallback = PiommuUnregisterInterfaceStateChangeCallbackFn?

public fun interface PioContainerNotificationFunctionFn {
    public operator fun invoke(): Ntstatus
}

public typealias PioContainerNotificationFunction = PioContainerNotificationFunctionFn?

public fun interface PioCsqAcquireLockFn {
    public operator fun invoke()
}

public typealias PioCsqAcquireLock = PioCsqAcquireLockFn?

public fun interface PioCsqCompleteCanceledIrpFn {
    public operator fun invoke()
}

public typealias PioCsqCompleteCanceledIrp = PioCsqCompleteCanceledIrpFn?

public fun interface PioCsqInsertIrpFn {
    public operator fun invoke()
}

public typealias PioCsqInsertIrp = PioCsqInsertIrpFn?

public fun interface PioCsqInsertIrpExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PioCsqInsertIrpEx = PioCsqInsertIrpExFn?

public fun interface PioCsqPeekNextIrpFn {
    public operator fun invoke(): COpaquePointer?
}

public typealias PioCsqPeekNextIrp = PioCsqPeekNextIrpFn?

public fun interface PioCsqReleaseLockFn {
    public operator fun invoke()
}

public typealias PioCsqReleaseLock = PioCsqReleaseLockFn?

public fun interface PioCsqRemoveIrpFn {
    public operator fun invoke()
}

public typealias PioCsqRemoveIrp = PioCsqRemoveIrpFn?

public fun interface PioDeviceEjectCallbackFn {
    public operator fun invoke(status: Ntstatus, context: COpaquePointer?)
}

public typealias PioDeviceEjectCallback = PioDeviceEjectCallbackFn?

public fun interface PioDpcRoutineFn {
    public operator fun invoke()
}

public typealias PioDpcRoutine = PioDpcRoutineFn?

public fun interface PioPersistedMemoryEnumerationCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PioPersistedMemoryEnumerationCallback = PioPersistedMemoryEnumerationCallbackFn?

public fun interface PioQueryDeviceRoutineFn {
    public operator fun invoke(context: COpaquePointer?, pathname: COpaquePointer?, bustype: InterfaceType, busnumber: UInt, businformation: COpaquePointer?, controllertype: ConfigurationType, controllernumber: UInt, controllerinformation: COpaquePointer?, peripheraltype: ConfigurationType, peripheralnumber: UInt, peripheralinformation: COpaquePointer?): Ntstatus
}

public typealias PioQueryDeviceRoutine = PioQueryDeviceRoutineFn?

public fun interface PioSessionNotificationFunctionFn {
    public operator fun invoke(): Ntstatus
}

public typealias PioSessionNotificationFunction = PioSessionNotificationFunctionFn?

public fun interface PioTimerRoutineFn {
    public operator fun invoke()
}

public typealias PioTimerRoutine = PioTimerRoutineFn?

public fun interface PioWorkitemRoutineFn {
    public operator fun invoke()
}

public typealias PioWorkitemRoutine = PioWorkitemRoutineFn?

public fun interface PioWorkitemRoutineExFn {
    public operator fun invoke()
}

public typealias PioWorkitemRoutineEx = PioWorkitemRoutineExFn?

public fun interface PjoinDmaDomainFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, domainhandle: Handle): Ntstatus
}

public typealias PjoinDmaDomain = PjoinDmaDomainFn?

public fun interface PkbugcheckCallbackRoutineFn {
    public operator fun invoke()
}

public typealias PkbugcheckCallbackRoutine = PkbugcheckCallbackRoutineFn?

public fun interface PkbugcheckReasonCallbackRoutineFn {
    public operator fun invoke()
}

public typealias PkbugcheckReasonCallbackRoutine = PkbugcheckReasonCallbackRoutineFn?

public fun interface PkipiBroadcastWorkerFn {
    public operator fun invoke(): ULong
}

public typealias PkipiBroadcastWorker = PkipiBroadcastWorkerFn?

public fun interface PkmessageServiceRoutineFn {
    public operator fun invoke(): Boolean
}

public typealias PkmessageServiceRoutine = PkmessageServiceRoutineFn?

public fun interface PkserviceRoutineFn {
    public operator fun invoke(): Boolean
}

public typealias PkserviceRoutine = PkserviceRoutineFn?

public fun interface PkstartRoutineFn {
    public operator fun invoke()
}

public typealias PkstartRoutine = PkstartRoutineFn?

public fun interface PksynchronizeRoutineFn {
    public operator fun invoke(): Boolean
}

public typealias PksynchronizeRoutine = PksynchronizeRoutineFn?

public fun interface PleaveDmaDomainFn {
    public operator fun invoke(dmaadapter: COpaquePointer?): Ntstatus
}

public typealias PleaveDmaDomain = PleaveDmaDomainFn?

public fun interface PloadImageNotifyRoutineFn {
    public operator fun invoke(fullimagename: COpaquePointer?, processid: Handle, imageinfo: COpaquePointer?)
}

public typealias PloadImageNotifyRoutine = PloadImageNotifyRoutineFn?

public fun interface PmapTransferFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: COpaquePointer?, writetodevice: Boolean): Long
}

public typealias PmapTransfer = PmapTransferFn?

public fun interface PmapTransferExFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, offset: ULong, deviceoffset: UInt, length: COpaquePointer?, writetodevice: Boolean, scattergatherbuffer: COpaquePointer?, scattergatherbufferlength: UInt, dmacompletionroutine: PdmaCompletionRoutine, completioncontext: COpaquePointer?): Ntstatus
}

public typealias PmapTransferEx = PmapTransferExFn?

public fun interface PmmDllInitializeFn {
    public operator fun invoke(registrypath: COpaquePointer?): Ntstatus
}

public typealias PmmDllInitialize = PmmDllInitializeFn?

public fun interface PmmDllUnloadFn {
    public operator fun invoke(): Ntstatus
}

public typealias PmmDllUnload = PmmDllUnloadFn?

public fun interface PmmGetSystemRoutineAddressExFn {
    public operator fun invoke(modulename: COpaquePointer?, functionname: Pcstr): COpaquePointer?
}

public typealias PmmGetSystemRoutineAddressEx = PmmGetSystemRoutineAddressExFn?

public fun interface PmmMdlRoutineFn {
    public operator fun invoke()
}

public typealias PmmMdlRoutine = PmmMdlRoutineFn?

public fun interface PmmRotateCopyCallbackFunctionFn {
    public operator fun invoke(destinationmdl: COpaquePointer?, sourcemdl: COpaquePointer?, context: COpaquePointer?): Ntstatus
}

public typealias PmmRotateCopyCallbackFunction = PmmRotateCopyCallbackFunctionFn?

public fun interface PnmiCallbackFn {
    public operator fun invoke(): Boolean
}

public typealias PnmiCallback = PnmiCallbackFn?

public fun interface PnpemControlEnableDisableFn {
    public operator fun invoke(): Ntstatus
}

public typealias PnpemControlEnableDisable = PnpemControlEnableDisableFn?

public fun interface PnpemControlQueryControlFn {
    public operator fun invoke(): UInt
}

public typealias PnpemControlQueryControl = PnpemControlQueryControlFn?

public fun interface PnpemControlQueryStandardCapabilitiesFn {
    public operator fun invoke(): Ntstatus
}

public typealias PnpemControlQueryStandardCapabilities = PnpemControlQueryStandardCapabilitiesFn?

public fun interface PnpemControlSetStandardControlFn {
    public operator fun invoke(): Ntstatus
}

public typealias PnpemControlSetStandardControl = PnpemControlSetStandardControlFn?

public fun interface PntfsDerefExportedSecurityDescriptorFn {
    public operator fun invoke()
}

public typealias PntfsDerefExportedSecurityDescriptor = PntfsDerefExportedSecurityDescriptorFn?

public fun interface PobPostOperationCallbackFn {
    public operator fun invoke(registrationcontext: COpaquePointer?, operationinformation: COpaquePointer?)
}

public typealias PobPostOperationCallback = PobPostOperationCallbackFn?

public fun interface PobPreOperationCallbackFn {
    public operator fun invoke(registrationcontext: COpaquePointer?, operationinformation: COpaquePointer?): ObPreopCallbackStatus
}

public typealias PobPreOperationCallback = PobPreOperationCallbackFn?

public typealias PoolExtendedParameterType = Int

public typealias PowerMonitorRequestReason = Int

public typealias PowerMonitorRequestType = Int

public typealias PowerPlatformRole = Int

public fun interface PowerSettingCallbackFn {
    public operator fun invoke(settingguid: COpaquePointer?, value: COpaquePointer?, valuelength: UInt, context: COpaquePointer?): Ntstatus
}

public typealias PowerSettingCallback = PowerSettingCallbackFn?

public typealias PowerStateType = Int

public typealias PowerUserPresenceType = Int

public fun interface PoFxComponentActiveConditionCallbackFn {
    public operator fun invoke(context: COpaquePointer?, component: UInt)
}

public typealias PoFxComponentActiveConditionCallback = PoFxComponentActiveConditionCallbackFn?

public fun interface PoFxComponentCriticalTransitionCallbackFn {
    public operator fun invoke(context: COpaquePointer?, component: UInt, active: Boolean)
}

public typealias PoFxComponentCriticalTransitionCallback = PoFxComponentCriticalTransitionCallbackFn?

public fun interface PoFxComponentIdleConditionCallbackFn {
    public operator fun invoke(context: COpaquePointer?, component: UInt)
}

public typealias PoFxComponentIdleConditionCallback = PoFxComponentIdleConditionCallbackFn?

public fun interface PoFxComponentIdleStateCallbackFn {
    public operator fun invoke(context: COpaquePointer?, component: UInt, state: UInt)
}

public typealias PoFxComponentIdleStateCallback = PoFxComponentIdleStateCallbackFn?

public fun interface PoFxComponentPerfStateCallbackFn {
    public operator fun invoke(context: COpaquePointer?, component: UInt, succeeded: Boolean, requestcontext: COpaquePointer?)
}

public typealias PoFxComponentPerfStateCallback = PoFxComponentPerfStateCallbackFn?

public fun interface PoFxDevicePowerNotRequiredCallbackFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias PoFxDevicePowerNotRequiredCallback = PoFxDevicePowerNotRequiredCallbackFn?

public fun interface PoFxDevicePowerRequiredCallbackFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias PoFxDevicePowerRequiredCallback = PoFxDevicePowerRequiredCallbackFn?

public fun interface PoFxDirectedPowerDownCallbackFn {
    public operator fun invoke(context: COpaquePointer?, flags: UInt)
}

public typealias PoFxDirectedPowerDownCallback = PoFxDirectedPowerDownCallbackFn?

public fun interface PoFxDirectedPowerUpCallbackFn {
    public operator fun invoke(context: COpaquePointer?, flags: UInt)
}

public typealias PoFxDirectedPowerUpCallback = PoFxDirectedPowerUpCallbackFn?

public fun interface PoFxDripsWatchdogCallbackFn {
    public operator fun invoke(context: COpaquePointer?, physicaldeviceobject: COpaquePointer?, uniqueid: UInt)
}

public typealias PoFxDripsWatchdogCallback = PoFxDripsWatchdogCallbackFn?

public typealias PoFxPerfStateType = Int

public typealias PoFxPerfStateUnit = Int

public fun interface PoFxPowerControlCallbackFn {
    public operator fun invoke(devicecontext: COpaquePointer?, powercontrolcode: COpaquePointer?, inbuffer: COpaquePointer?, inbuffersize: ULong, outbuffer: COpaquePointer?, outbuffersize: ULong, bytesreturned: COpaquePointer?): Ntstatus
}

public typealias PoFxPowerControlCallback = PoFxPowerControlCallbackFn?

public typealias PoThermalRequestType = Int

public fun interface PpciExpressEnterLinkQuiescentModeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciExpressEnterLinkQuiescentMode = PpciExpressEnterLinkQuiescentModeFn?

public fun interface PpciExpressExitLinkQuiescentModeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciExpressExitLinkQuiescentMode = PpciExpressExitLinkQuiescentModeFn?

public fun interface PpciExpressRootPortReadConfigSpaceFn {
    public operator fun invoke(context: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt
}

public typealias PpciExpressRootPortReadConfigSpace = PpciExpressRootPortReadConfigSpaceFn?

public fun interface PpciExpressRootPortWriteConfigSpaceFn {
    public operator fun invoke(context: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt
}

public typealias PpciExpressRootPortWriteConfigSpace = PpciExpressRootPortWriteConfigSpaceFn?

public fun interface PpciExpressWakeControlFn {
    public operator fun invoke()
}

public typealias PpciExpressWakeControl = PpciExpressWakeControlFn?

public fun interface PpciIsDevicePresentFn {
    public operator fun invoke(): Boolean
}

public typealias PpciIsDevicePresent = PpciIsDevicePresentFn?

public fun interface PpciIsDevicePresentExFn {
    public operator fun invoke(): Boolean
}

public typealias PpciIsDevicePresentEx = PpciIsDevicePresentExFn?

public fun interface PpciLineToPinFn {
    public operator fun invoke()
}

public typealias PpciLineToPin = PpciLineToPinFn?

public fun interface PpciMsixGetEntryFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciMsixGetEntry = PpciMsixGetEntryFn?

public fun interface PpciMsixGetTableSizeFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciMsixGetTableSize = PpciMsixGetTableSizeFn?

public fun interface PpciMsixMaskunmaskEntryFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciMsixMaskunmaskEntry = PpciMsixMaskunmaskEntryFn?

public fun interface PpciMsixSetEntryFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciMsixSetEntry = PpciMsixSetEntryFn?

public fun interface PpciPinToLineFn {
    public operator fun invoke()
}

public typealias PpciPinToLine = PpciPinToLineFn?

public fun interface PpciPrepareMultistageResumeFn {
    public operator fun invoke()
}

public typealias PpciPrepareMultistageResume = PpciPrepareMultistageResumeFn?

public fun interface PpciReadWriteConfigFn {
    public operator fun invoke(): UInt
}

public typealias PpciReadWriteConfig = PpciReadWriteConfigFn?

public fun interface PpciRootBusCapabilityFn {
    public operator fun invoke()
}

public typealias PpciRootBusCapability = PpciRootBusCapabilityFn?

public fun interface PpciSetAcsFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciSetAcs = PpciSetAcsFn?

public fun interface PpciSetAcs2Fn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciSetAcs2 = PpciSetAcs2Fn?

public fun interface PpciSetAtsFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpciSetAts = PpciSetAtsFn?

public fun interface PpcwCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpcwCallback = PpcwCallbackFn?

public fun interface PphysicalCounterEventBufferOverflowHandlerFn {
    public operator fun invoke(eventbuffer: COpaquePointer?, entrysize: ULong, numberofentries: ULong, owninghandle: Handle)
}

public typealias PphysicalCounterEventBufferOverflowHandler = PphysicalCounterEventBufferOverflowHandlerFn?

public fun interface PphysicalCounterOverflowHandlerFn {
    public operator fun invoke(overflowbits: ULong, owninghandle: Handle)
}

public typealias PphysicalCounterOverflowHandler = PphysicalCounterOverflowHandlerFn?

public fun interface PpowerSettingCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpowerSettingCallback = PpowerSettingCallbackFn?

public fun interface PpoFxComponentActiveConditionCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxComponentActiveConditionCallback = PpoFxComponentActiveConditionCallbackFn?

public fun interface PpoFxComponentCriticalTransitionCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxComponentCriticalTransitionCallback = PpoFxComponentCriticalTransitionCallbackFn?

public fun interface PpoFxComponentIdleConditionCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxComponentIdleConditionCallback = PpoFxComponentIdleConditionCallbackFn?

public fun interface PpoFxComponentIdleStateCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxComponentIdleStateCallback = PpoFxComponentIdleStateCallbackFn?

public fun interface PpoFxComponentPerfStateCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxComponentPerfStateCallback = PpoFxComponentPerfStateCallbackFn?

public fun interface PpoFxDevicePowerNotRequiredCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxDevicePowerNotRequiredCallback = PpoFxDevicePowerNotRequiredCallbackFn?

public fun interface PpoFxDevicePowerRequiredCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxDevicePowerRequiredCallback = PpoFxDevicePowerRequiredCallbackFn?

public fun interface PpoFxDirectedPowerDownCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxDirectedPowerDownCallback = PpoFxDirectedPowerDownCallbackFn?

public fun interface PpoFxDirectedPowerUpCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxDirectedPowerUpCallback = PpoFxDirectedPowerUpCallbackFn?

public fun interface PpoFxDripsWatchdogCallbackFn {
    public operator fun invoke()
}

public typealias PpoFxDripsWatchdogCallback = PpoFxDripsWatchdogCallbackFn?

public fun interface PpoFxPowerControlCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PpoFxPowerControlCallback = PpoFxPowerControlCallbackFn?

public fun interface PprocessorCallbackFunctionFn {
    public operator fun invoke()
}

public typealias PprocessorCallbackFunction = PprocessorCallbackFunctionFn?

public fun interface PprocessorHaltRoutineFn {
    public operator fun invoke(): Ntstatus
}

public typealias PprocessorHaltRoutine = PprocessorHaltRoutineFn?

public fun interface PptmDeviceDisableFn {
    public operator fun invoke(): Ntstatus
}

public typealias PptmDeviceDisable = PptmDeviceDisableFn?

public fun interface PptmDeviceEnableFn {
    public operator fun invoke(): Ntstatus
}

public typealias PptmDeviceEnable = PptmDeviceEnableFn?

public fun interface PptmDeviceQueryGranularityFn {
    public operator fun invoke(): Ntstatus
}

public typealias PptmDeviceQueryGranularity = PptmDeviceQueryGranularityFn?

public fun interface PptmDeviceQueryTimeSourceFn {
    public operator fun invoke(): Ntstatus
}

public typealias PptmDeviceQueryTimeSource = PptmDeviceQueryTimeSourceFn?

public fun interface PputDmaAdapterFn {
    public operator fun invoke(dmaadapter: COpaquePointer?)
}

public typealias PputDmaAdapter = PputDmaAdapterFn?

public fun interface PputScatterGatherListFn {
    public operator fun invoke(dmaadapter: COpaquePointer?, scattergather: COpaquePointer?, writetodevice: Boolean)
}

public typealias PputScatterGatherList = PputScatterGatherListFn?

public fun interface PqueryextendedaddressFn {
    public operator fun invoke(context: COpaquePointer?, extendedaddress: COpaquePointer?)
}

public typealias Pqueryextendedaddress = PqueryextendedaddressFn?

public fun interface PreadDmaCounterFn {
    public operator fun invoke(dmaadapter: COpaquePointer?): UInt
}

public typealias PreadDmaCounter = PreadDmaCounterFn?

public fun interface PreenumerateSelfFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias PreenumerateSelf = PreenumerateSelfFn?

public fun interface PregisterForDeviceNotificationsFn {
    public operator fun invoke(param0: COpaquePointer?, param1: PdeviceNotifyCallback, param2: COpaquePointer?): Ntstatus
}

public typealias PregisterForDeviceNotifications = PregisterForDeviceNotificationsFn?

public fun interface PregisterForDeviceNotifications2Fn {
    public operator fun invoke(context: COpaquePointer?, notificationhandler: PdeviceNotifyCallback2, notificationcontext: COpaquePointer?): Ntstatus
}

public typealias PregisterForDeviceNotifications2 = PregisterForDeviceNotifications2Fn?

public fun interface PreplaceBeginFn {
    public operator fun invoke(parameters: COpaquePointer?, context: COpaquePointer?): Ntstatus
}

public typealias PreplaceBegin = PreplaceBeginFn?

public fun interface PreplaceDriverInitFn {
    public operator fun invoke(iface: COpaquePointer?, unused: COpaquePointer?): Ntstatus
}

public typealias PreplaceDriverInit = PreplaceDriverInitFn?

public fun interface PreplaceEnableDisableHardwareQuiesceFn {
    public operator fun invoke(context: COpaquePointer?, enable: Boolean): Ntstatus
}

public typealias PreplaceEnableDisableHardwareQuiesce = PreplaceEnableDisableHardwareQuiesceFn?

public fun interface PreplaceEndFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PreplaceEnd = PreplaceEndFn?

public fun interface PreplaceGetMemoryDestinationFn {
    public operator fun invoke(context: COpaquePointer?, sourceaddress: Long, destinationaddress: COpaquePointer?): Ntstatus
}

public typealias PreplaceGetMemoryDestination = PreplaceGetMemoryDestinationFn?

public fun interface PreplaceInitiateHardwareMirrorFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PreplaceInitiateHardwareMirror = PreplaceInitiateHardwareMirrorFn?

public fun interface PreplaceMapMemoryFn {
    public operator fun invoke(targetphysicaladdress: Long, sparephysicaladdress: Long, numberofbytes: COpaquePointer?, targetaddress: COpaquePointer?, spareaddress: COpaquePointer?): Ntstatus
}

public typealias PreplaceMapMemory = PreplaceMapMemoryFn?

public fun interface PreplaceMirrorPhysicalMemoryFn {
    public operator fun invoke(context: COpaquePointer?, physicaladdress: Long, bytecount: Long): Ntstatus
}

public typealias PreplaceMirrorPhysicalMemory = PreplaceMirrorPhysicalMemoryFn?

public fun interface PreplaceMirrorPlatformMemoryFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PreplaceMirrorPlatformMemory = PreplaceMirrorPlatformMemoryFn?

public fun interface PreplaceSetProcessorIdFn {
    public operator fun invoke(context: COpaquePointer?, apicid: UInt, target: Boolean): Ntstatus
}

public typealias PreplaceSetProcessorId = PreplaceSetProcessorIdFn?

public fun interface PreplaceSwapFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PreplaceSwap = PreplaceSwapFn?

public fun interface PreplaceUnloadFn {
    public operator fun invoke()
}

public typealias PreplaceUnload = PreplaceUnloadFn?

public fun interface PrequestPowerCompleteFn {
    public operator fun invoke()
}

public typealias PrequestPowerComplete = PrequestPowerCompleteFn?

public fun interface ProcessorCallbackFunctionFn {
    public operator fun invoke(callbackcontext: COpaquePointer?, changecontext: COpaquePointer?, operationstatus: COpaquePointer?)
}

public typealias ProcessorCallbackFunction = ProcessorCallbackFunctionFn?

public fun interface ProcessorHaltRoutineFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias ProcessorHaltRoutine = ProcessorHaltRoutineFn?

public fun interface PrtlAvlAllocateRoutineFn {
    public operator fun invoke(): COpaquePointer?
}

public typealias PrtlAvlAllocateRoutine = PrtlAvlAllocateRoutineFn?

public fun interface PrtlAvlCompareRoutineFn {
    public operator fun invoke(): RtlGenericCompareResults
}

public typealias PrtlAvlCompareRoutine = PrtlAvlCompareRoutineFn?

public fun interface PrtlAvlFreeRoutineFn {
    public operator fun invoke()
}

public typealias PrtlAvlFreeRoutine = PrtlAvlFreeRoutineFn?

public fun interface PrtlAvlMatchFunctionFn {
    public operator fun invoke(): Ntstatus
}

public typealias PrtlAvlMatchFunction = PrtlAvlMatchFunctionFn?

public fun interface PrtlGenericAllocateRoutineFn {
    public operator fun invoke(): COpaquePointer?
}

public typealias PrtlGenericAllocateRoutine = PrtlGenericAllocateRoutineFn?

public fun interface PrtlGenericCompareRoutineFn {
    public operator fun invoke(): RtlGenericCompareResults
}

public typealias PrtlGenericCompareRoutine = PrtlGenericCompareRoutineFn?

public fun interface PrtlGenericFreeRoutineFn {
    public operator fun invoke()
}

public typealias PrtlGenericFreeRoutine = PrtlGenericFreeRoutineFn?

public fun interface PrtlQueryRegistryRoutineFn {
    public operator fun invoke(): Ntstatus
}

public typealias PrtlQueryRegistryRoutine = PrtlQueryRegistryRoutineFn?

public fun interface PrtlRunOnceInitFnFn {
    public operator fun invoke(): UInt
}

public typealias PrtlRunOnceInitFn = PrtlRunOnceInitFnFn?

public typealias Pscreateprocessnotifytype = Int

public typealias Pscreatethreadnotifytype = Int

public fun interface PsecureDriverProcessDereferenceFn {
    public operator fun invoke()
}

public typealias PsecureDriverProcessDereference = PsecureDriverProcessDereferenceFn?

public fun interface PsecureDriverProcessReferenceFn {
    public operator fun invoke(): Peprocess
}

public typealias PsecureDriverProcessReference = PsecureDriverProcessReferenceFn?

public fun interface PsetD3coldSupportFn {
    public operator fun invoke()
}

public typealias PsetD3coldSupport = PsetD3coldSupportFn?

public fun interface PsetVirtualDeviceDataFn {
    public operator fun invoke(): UInt
}

public typealias PsetVirtualDeviceData = PsetVirtualDeviceDataFn?

public fun interface PseImageVerificationCallbackFunctionFn {
    public operator fun invoke()
}

public typealias PseImageVerificationCallbackFunction = PseImageVerificationCallbackFunctionFn?

public fun interface PshedPiAttemptErrorRecoveryFn {
    public operator fun invoke(plugincontext: COpaquePointer?, bufferlength: UInt, errorrecord: COpaquePointer?): Ntstatus
}

public typealias PshedPiAttemptErrorRecovery = PshedPiAttemptErrorRecoveryFn?

public fun interface PshedPiClearErrorRecordFn {
    public operator fun invoke(plugincontext: COpaquePointer?, flags: UInt, errorrecordid: ULong): Ntstatus
}

public typealias PshedPiClearErrorRecord = PshedPiClearErrorRecordFn?

public fun interface PshedPiClearErrorStatusFn {
    public operator fun invoke(plugincontext: COpaquePointer?, errorsource: COpaquePointer?, bufferlength: UInt, errorrecord: COpaquePointer?): Ntstatus
}

public typealias PshedPiClearErrorStatus = PshedPiClearErrorStatusFn?

public fun interface PshedPiDisableErrorSourceFn {
    public operator fun invoke(plugincontext: COpaquePointer?, errorsource: COpaquePointer?): Ntstatus
}

public typealias PshedPiDisableErrorSource = PshedPiDisableErrorSourceFn?

public fun interface PshedPiEnableErrorSourceFn {
    public operator fun invoke(plugincontext: COpaquePointer?, errorsource: COpaquePointer?): Ntstatus
}

public typealias PshedPiEnableErrorSource = PshedPiEnableErrorSourceFn?

public typealias PshedPiErrReadingPcieOverrides = Int

public fun interface PshedPiFinalizeErrorRecordFn {
    public operator fun invoke(plugincontext: COpaquePointer?, errorsource: COpaquePointer?, bufferlength: UInt, errorrecord: COpaquePointer?): Ntstatus
}

public typealias PshedPiFinalizeErrorRecord = PshedPiFinalizeErrorRecordFn?

public fun interface PshedPiGetAllErrorSourcesFn {
    public operator fun invoke(plugincontext: COpaquePointer?, count: COpaquePointer?, errorsrcs: COpaquePointer?, length: COpaquePointer?): Ntstatus
}

public typealias PshedPiGetAllErrorSources = PshedPiGetAllErrorSourcesFn?

public fun interface PshedPiGetErrorSourceInfoFn {
    public operator fun invoke(plugincontext: COpaquePointer?, errorsource: COpaquePointer?): Ntstatus
}

public typealias PshedPiGetErrorSourceInfo = PshedPiGetErrorSourceInfoFn?

public fun interface PshedPiGetInjectionCapabilitiesFn {
    public operator fun invoke(plugincontext: COpaquePointer?, capabilities: COpaquePointer?): Ntstatus
}

public typealias PshedPiGetInjectionCapabilities = PshedPiGetInjectionCapabilitiesFn?

public fun interface PshedPiInjectErrorFn {
    public operator fun invoke(plugincontext: COpaquePointer?, errortype: ULong, parameter1: ULong, parameter2: ULong, parameter3: ULong, parameter4: ULong): Ntstatus
}

public typealias PshedPiInjectError = PshedPiInjectErrorFn?

public fun interface PshedPiReadErrorRecordFn {
    public operator fun invoke(plugincontext: COpaquePointer?, flags: UInt, errorrecordid: ULong, nexterrorrecordid: COpaquePointer?, recordlength: COpaquePointer?, errorrecord: COpaquePointer?): Ntstatus
}

public typealias PshedPiReadErrorRecord = PshedPiReadErrorRecordFn?

public fun interface PshedPiRetrieveErrorInfoFn {
    public operator fun invoke(plugincontext: COpaquePointer?, errorsource: COpaquePointer?, bufferlength: ULong, packet: COpaquePointer?): Ntstatus
}

public typealias PshedPiRetrieveErrorInfo = PshedPiRetrieveErrorInfoFn?

public fun interface PshedPiSetErrorSourceInfoFn {
    public operator fun invoke(plugincontext: COpaquePointer?, errorsource: COpaquePointer?): Ntstatus
}

public typealias PshedPiSetErrorSourceInfo = PshedPiSetErrorSourceInfoFn?

public fun interface PshedPiWriteErrorRecordFn {
    public operator fun invoke(plugincontext: COpaquePointer?, flags: UInt, recordlength: UInt, errorrecord: COpaquePointer?): Ntstatus
}

public typealias PshedPiWriteErrorRecord = PshedPiWriteErrorRecordFn?

public fun interface PtimerApcRoutineFn {
    public operator fun invoke(timercontext: COpaquePointer?, timerlowvalue: UInt, timerhighvalue: Int)
}

public typealias PtimerApcRoutine = PtimerApcRoutineFn?

public fun interface PtmDeviceDisableFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PtmDeviceDisable = PtmDeviceDisableFn?

public fun interface PtmDeviceEnableFn {
    public operator fun invoke(context: COpaquePointer?): Ntstatus
}

public typealias PtmDeviceEnable = PtmDeviceEnableFn?

public fun interface PtmDeviceQueryGranularityFn {
    public operator fun invoke(context: COpaquePointer?, granularity: COpaquePointer?): Ntstatus
}

public typealias PtmDeviceQueryGranularity = PtmDeviceQueryGranularityFn?

public fun interface PtmDeviceQueryTimeSourceFn {
    public operator fun invoke(context: COpaquePointer?, timesource: COpaquePointer?): Ntstatus
}

public typealias PtmDeviceQueryTimeSource = PtmDeviceQueryTimeSourceFn?

public fun interface PtmPropagateRoutineFn {
    public operator fun invoke(propagationcookie: COpaquePointer?, callbackdata: COpaquePointer?, propagationstatus: Ntstatus, transactionguid: Guid): Ntstatus
}

public typealias PtmPropagateRoutine = PtmPropagateRoutineFn?

public fun interface PtmRmNotificationFn {
    public operator fun invoke(enlistmentobject: COpaquePointer?, rmcontext: COpaquePointer?, transactioncontext: COpaquePointer?, transactionnotification: UInt, tmvirtualclock: COpaquePointer?, argumentlength: UInt, argument: COpaquePointer?): Ntstatus
}

public typealias PtmRmNotification = PtmRmNotificationFn?

public fun interface PtranslateBusAddressFn {
    public operator fun invoke(): Boolean
}

public typealias PtranslateBusAddress = PtranslateBusAddressFn?

public fun interface PtranslateResourceHandlerFn {
    public operator fun invoke(context: COpaquePointer?, source: COpaquePointer?, direction: ResourceTranslationDirection, alternativescount: UInt, alternatives: COpaquePointer?, physicaldeviceobject: COpaquePointer?, target: COpaquePointer?): Ntstatus
}

public typealias PtranslateResourceHandler = PtranslateResourceHandlerFn?

public fun interface PtranslateResourceRequirementsHandlerFn {
    public operator fun invoke(context: COpaquePointer?, source: COpaquePointer?, physicaldeviceobject: COpaquePointer?, targetcount: COpaquePointer?, target: COpaquePointer?): Ntstatus
}

public typealias PtranslateResourceRequirementsHandler = PtranslateResourceRequirementsHandlerFn?

public fun interface PunregisterForDeviceNotificationsFn {
    public operator fun invoke(param0: COpaquePointer?, param1: PdeviceNotifyCallback)
}

public typealias PunregisterForDeviceNotifications = PunregisterForDeviceNotificationsFn?

public fun interface PunregisterForDeviceNotifications2Fn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias PunregisterForDeviceNotifications2 = PunregisterForDeviceNotifications2Fn?

public fun interface PciLine2PinFn {
    public operator fun invoke(bushandler: COpaquePointer?, roothandler: COpaquePointer?, slotnumber: PciSlotNumber, pcinewdata: COpaquePointer?, pciolddata: COpaquePointer?)
}

public typealias PciLine2Pin = PciLine2PinFn?

public fun interface PciPin2LineFn {
    public operator fun invoke(bushandler: COpaquePointer?, roothandler: COpaquePointer?, slotnumber: PciSlotNumber, pcidata: COpaquePointer?)
}

public typealias PciPin2Line = PciPin2LineFn?

public typealias RegNotifyClass = Int

public fun interface RequestPowerCompleteFn {
    public operator fun invoke(deviceobject: COpaquePointer?, minorfunction: UByte, powerstate: PowerState, context: COpaquePointer?, iostatus: COpaquePointer?)
}

public typealias RequestPowerComplete = RequestPowerCompleteFn?

public typealias ResourceTranslationDirection = Int

public fun interface RtlAvlAllocateRoutineFn {
    public operator fun invoke(table: COpaquePointer?, bytesize: UInt): COpaquePointer?
}

public typealias RtlAvlAllocateRoutine = RtlAvlAllocateRoutineFn?

public fun interface RtlAvlCompareRoutineFn {
    public operator fun invoke(table: COpaquePointer?, firststruct: COpaquePointer?, secondstruct: COpaquePointer?): RtlGenericCompareResults
}

public typealias RtlAvlCompareRoutine = RtlAvlCompareRoutineFn?

public fun interface RtlAvlFreeRoutineFn {
    public operator fun invoke(table: COpaquePointer?, buffer: COpaquePointer?)
}

public typealias RtlAvlFreeRoutine = RtlAvlFreeRoutineFn?

public fun interface RtlAvlMatchFunctionFn {
    public operator fun invoke(table: COpaquePointer?, userdata: COpaquePointer?, matchdata: COpaquePointer?): Ntstatus
}

public typealias RtlAvlMatchFunction = RtlAvlMatchFunctionFn?

public fun interface RtlGenericAllocateRoutineFn {
    public operator fun invoke(table: COpaquePointer?, bytesize: UInt): COpaquePointer?
}

public typealias RtlGenericAllocateRoutine = RtlGenericAllocateRoutineFn?

public typealias RtlGenericCompareResults = Int

public fun interface RtlGenericCompareRoutineFn {
    public operator fun invoke(table: COpaquePointer?, firststruct: COpaquePointer?, secondstruct: COpaquePointer?): RtlGenericCompareResults
}

public typealias RtlGenericCompareRoutine = RtlGenericCompareRoutineFn?

public fun interface RtlGenericFreeRoutineFn {
    public operator fun invoke(table: COpaquePointer?, buffer: COpaquePointer?)
}

public typealias RtlGenericFreeRoutine = RtlGenericFreeRoutineFn?

public fun interface RtlQueryRegistryRoutineFn {
    public operator fun invoke(valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuelength: UInt, context: COpaquePointer?, entrycontext: COpaquePointer?): Ntstatus
}

public typealias RtlQueryRegistryRoutine = RtlQueryRegistryRoutineFn?

public fun interface RtlRunOnceInitFnFn {
    public operator fun invoke(runonce: COpaquePointer?, parameter: COpaquePointer?, context: COpaquePointer?): UInt
}

public typealias RtlRunOnceInitFn = RtlRunOnceInitFnFn?

public fun interface SecureDriverProcessDereferenceFn {
    public operator fun invoke(interfacecontext: COpaquePointer?, process: Peprocess)
}

public typealias SecureDriverProcessDereference = SecureDriverProcessDereferenceFn?

public fun interface SecureDriverProcessReferenceFn {
    public operator fun invoke(interfacecontext: COpaquePointer?): Peprocess
}

public typealias SecureDriverProcessReference = SecureDriverProcessReferenceFn?

public typealias SecurityContextTrackingMode = UByte

public typealias SecurityOperationCode = Int

public fun interface SetD3coldSupportFn {
    public operator fun invoke(context: COpaquePointer?, d3coldsupport: Boolean)
}

public typealias SetD3coldSupport = SetD3coldSupportFn?

public fun interface SetVirtualDeviceDataFn {
    public operator fun invoke(context: COpaquePointer?, virtualfunction: UShort, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt
}

public typealias SetVirtualDeviceData = SetVirtualDeviceDataFn?

public typealias SeImageType = Int

public fun interface SeImageVerificationCallbackFunctionFn {
    public operator fun invoke(callbackcontext: COpaquePointer?, imagetype: SeImageType, imageinformation: COpaquePointer?)
}

public typealias SeImageVerificationCallbackFunction = SeImageVerificationCallbackFunctionFn?

public typealias SeImageVerificationCallbackType = Int

public fun interface SiloContextCleanupCallbackFn {
    public operator fun invoke(silocontext: COpaquePointer?)
}

public typealias SiloContextCleanupCallback = SiloContextCleanupCallbackFn?

public fun interface SiloMonitorCreateCallbackFn {
    public operator fun invoke(silo: Pesilo): Ntstatus
}

public typealias SiloMonitorCreateCallback = SiloMonitorCreateCallbackFn?

public fun interface SiloMonitorTerminateCallbackFn {
    public operator fun invoke(silo: Pesilo)
}

public typealias SiloMonitorTerminateCallback = SiloMonitorTerminateCallbackFn?

public typealias SocSubsystemType = Int

public typealias StateLocationType = Int

public typealias SubsystemInformationType = Int

public typealias SystemFirmwareTableAction = Int

public typealias SystemPowerCondition = Int

public typealias TableSearchResult = Int

public typealias TraceInformationClass = Int

public fun interface TranslateBusAddressFn {
    public operator fun invoke(context: COpaquePointer?, busaddress: Long, length: UInt, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean
}

public typealias TranslateBusAddress = TranslateBusAddressFn?

public typealias WheapDpcErrorEventType = Int

public typealias WheapPfaOfflineDecisionType = Int

public typealias WheaBugcheckRecoveryLogType = Int

public typealias WheaCpuVendor = Int

public typealias WheaErrorPacketDataFormat = Int

public typealias WheaErrorSeverity = Int

public fun interface WheaErrorSourceCorrectFn {
    public operator fun invoke(): Ntstatus
}

public typealias WheaErrorSourceCorrect = WheaErrorSourceCorrectFn?

public fun interface WheaErrorSourceCreateRecordFn {
    public operator fun invoke(): Ntstatus
}

public typealias WheaErrorSourceCreateRecord = WheaErrorSourceCreateRecordFn?

public fun interface WheaErrorSourceInitializeFn {
    public operator fun invoke(): Ntstatus
}

public typealias WheaErrorSourceInitialize = WheaErrorSourceInitializeFn?

public fun interface WheaErrorSourceRecoverFn {
    public operator fun invoke(): Ntstatus
}

public typealias WheaErrorSourceRecover = WheaErrorSourceRecoverFn?

public fun interface WheaErrorSourceUninitializeFn {
    public operator fun invoke()
}

public typealias WheaErrorSourceUninitialize = WheaErrorSourceUninitializeFn?

public typealias WheaErrorType = Int

public typealias WheaEventLogEntryId = Int

public typealias WheaEventLogEntryType = Int

public typealias WheaPciexpressDeviceType = Int

public typealias WheaPciRecoverySignal = Int

public typealias WheaPciRecoveryStatus = Int

public typealias WheaPfaRemoveTrigger = Int

public typealias WheaPshedPluginEnableNotifyErrors = Int

public typealias WheaRawDataFormat = Int

public typealias WheaRecoveryContextErrorType = Int

public typealias WheaRecoveryFailureReason = Int

public typealias WheaRecoveryType = Int

public fun interface WheaSignalHandlerOverrideCallbackFn {
    public operator fun invoke(): Boolean
}

public typealias WheaSignalHandlerOverrideCallback = WheaSignalHandlerOverrideCallbackFn?

public typealias WheaThrottleType = Int

public fun interface WmiNotificationCallbackFn {
    public operator fun invoke()
}

public typealias WmiNotificationCallback = WmiNotificationCallbackFn?

public fun interface WorkerThreadRoutineFn {
    public operator fun invoke(parameter: COpaquePointer?)
}

public typealias WorkerThreadRoutine = WorkerThreadRoutineFn?

public typealias WorkQueueType = Int

public fun interface PHalAssignSlotResourcesFn {
    public operator fun invoke(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: COpaquePointer?): Ntstatus
}

public typealias PHalAssignSlotResources = PHalAssignSlotResourcesFn?

public fun interface PHalEndMirroringFn {
    public operator fun invoke(passnumber: UInt): Ntstatus
}

public typealias PHalEndMirroring = PHalEndMirroringFn?

public fun interface PHalEndOfBootFn {
    public operator fun invoke()
}

public typealias PHalEndOfBoot = PHalEndOfBootFn?

public fun interface PHalExamineMbrFn {
    public operator fun invoke(deviceobject: COpaquePointer?, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: COpaquePointer?)
}

public typealias PHalExamineMbr = PHalExamineMbrFn?

public fun interface PHalFindBusAddressTranslationFn {
    public operator fun invoke(busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?, context: COpaquePointer?, nextbus: Boolean): Boolean
}

public typealias PHalFindBusAddressTranslation = PHalFindBusAddressTranslationFn?

public fun interface PHalGetAcpiTableFn {
    public operator fun invoke(signature: UInt, oemid: Pcstr, oemtableid: Pcstr): COpaquePointer?
}

public typealias PHalGetAcpiTable = PHalGetAcpiTableFn?

public fun interface PHalGetDmaAdapterFn {
    public operator fun invoke(physicaldeviceobject: COpaquePointer?, devicedescriptor: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer?
}

public typealias PHalGetDmaAdapter = PHalGetDmaAdapterFn?

public fun interface PHalGetInterruptTranslatorFn {
    public operator fun invoke(parentinterfacetype: InterfaceType, parentbusnumber: UInt, bridgeinterfacetype: InterfaceType, size: UShort, version: UShort, translator: COpaquePointer?, bridgebusnumber: COpaquePointer?): Ntstatus
}

public typealias PHalGetInterruptTranslator = PHalGetInterruptTranslatorFn?

public fun interface PHalGetPrmCacheFn {
    public operator fun invoke(firmwarelist: COpaquePointer?, updatelist: COpaquePointer?)
}

public typealias PHalGetPrmCache = PHalGetPrmCacheFn?

public fun interface PHalHaltSystemFn {
    public operator fun invoke()
}

public typealias PHalHaltSystem = PHalHaltSystemFn?

public fun interface PHalHandlerForBusFn {
    public operator fun invoke(interfacetype: InterfaceType, busnumber: UInt): PbusHandler
}

public typealias PHalHandlerForBus = PHalHandlerForBusFn?

public fun interface PHalInitPnpDriverFn {
    public operator fun invoke(): Ntstatus
}

public typealias PHalInitPnpDriver = PHalInitPnpDriverFn?

public fun interface PHalInitPowerManagementFn {
    public operator fun invoke(pmdriverdispatchtable: COpaquePointer?, pmhaldispatchtable: COpaquePointer?): Ntstatus
}

public typealias PHalInitPowerManagement = PHalInitPowerManagementFn?

public fun interface PHalIoReadPartitionTableFn {
    public operator fun invoke(deviceobject: COpaquePointer?, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: COpaquePointer?): Ntstatus
}

public typealias PHalIoReadPartitionTable = PHalIoReadPartitionTableFn?

public fun interface PHalIoSetPartitionInformationFn {
    public operator fun invoke(deviceobject: COpaquePointer?, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus
}

public typealias PHalIoSetPartitionInformation = PHalIoSetPartitionInformationFn?

public fun interface PHalIoWritePartitionTableFn {
    public operator fun invoke(deviceobject: COpaquePointer?, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: COpaquePointer?): Ntstatus
}

public typealias PHalIoWritePartitionTable = PHalIoWritePartitionTableFn?

public fun interface PHalMirrorPhysicalMemoryFn {
    public operator fun invoke(physicaladdress: Long, numberofbytes: Long): Ntstatus
}

public typealias PHalMirrorPhysicalMemory = PHalMirrorPhysicalMemoryFn?

public fun interface PHalMirrorVerifyFn {
    public operator fun invoke(physicaladdress: Long, numberofbytes: Long): Ntstatus
}

public typealias PHalMirrorVerify = PHalMirrorVerifyFn?

public fun interface PHalQueryBusSlotsFn {
    public operator fun invoke(bushandler: PbusHandler, buffersize: UInt, slotnumbers: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus
}

public typealias PHalQueryBusSlots = PHalQueryBusSlotsFn?

public fun interface PHalQuerySystemInformationFn {
    public operator fun invoke(informationclass: HalQueryInformationClass, buffersize: UInt, buffer: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus
}

public typealias PHalQuerySystemInformation = PHalQuerySystemInformationFn?

public fun interface PHalReferenceBusHandlerFn {
    public operator fun invoke(bushandler: PbusHandler)
}

public typealias PHalReferenceBusHandler = PHalReferenceBusHandlerFn?

public fun interface PHalResetDisplayFn {
    public operator fun invoke(): Boolean
}

public typealias PHalResetDisplay = PHalResetDisplayFn?

public fun interface PHalSetPciErrorHandlerCallbackFn {
    public operator fun invoke(callback: PciErrorHandlerCallback)
}

public typealias PHalSetPciErrorHandlerCallback = PHalSetPciErrorHandlerCallbackFn?

public fun interface PHalSetSystemInformationFn {
    public operator fun invoke(informationclass: HalSetInformationClass, buffersize: UInt, buffer: COpaquePointer?): Ntstatus
}

public typealias PHalSetSystemInformation = PHalSetSystemInformationFn?

public fun interface PHalStartMirroringFn {
    public operator fun invoke(): Ntstatus
}

public typealias PHalStartMirroring = PHalStartMirroringFn?

public fun interface PHalTranslateBusAddressFn {
    public operator fun invoke(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean
}

public typealias PHalTranslateBusAddress = PHalTranslateBusAddressFn?

public fun interface PHalVectorToIdtentryFn {
    public operator fun invoke(vector: UInt): UByte
}

public typealias PHalVectorToIdtentry = PHalVectorToIdtentryFn?

public fun interface PKdCheckPowerButtonFn {
    public operator fun invoke()
}

public typealias PKdCheckPowerButton = PKdCheckPowerButtonFn?

public fun interface PKdEnumerateDebuggingDevicesFn {
    public operator fun invoke(loaderblock: COpaquePointer?, device: COpaquePointer?, callback: PdebugDeviceFoundFunction): Ntstatus
}

public typealias PKdEnumerateDebuggingDevices = PKdEnumerateDebuggingDevicesFn?

public fun interface PKdGetAcpiTablePhase0Fn {
    public operator fun invoke(loaderblock: COpaquePointer?, signature: UInt): COpaquePointer?
}

public typealias PKdGetAcpiTablePhase0 = PKdGetAcpiTablePhase0Fn?

public fun interface PKdGetPciDataByOffsetFn {
    public operator fun invoke(busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt
}

public typealias PKdGetPciDataByOffset = PKdGetPciDataByOffsetFn?

public fun interface PKdMapPhysicalMemory64Fn {
    public operator fun invoke(physicaladdress: Long, numberpages: UInt, flushcurrenttlb: Boolean): COpaquePointer?
}

public typealias PKdMapPhysicalMemory64 = PKdMapPhysicalMemory64Fn?

public fun interface PKdReleaseIntegratedDeviceForDebuggingFn {
    public operator fun invoke(integrateddevice: COpaquePointer?): Ntstatus
}

public typealias PKdReleaseIntegratedDeviceForDebugging = PKdReleaseIntegratedDeviceForDebuggingFn?

public fun interface PKdReleasePciDeviceForDebuggingFn {
    public operator fun invoke(pcidevice: COpaquePointer?): Ntstatus
}

public typealias PKdReleasePciDeviceForDebugging = PKdReleasePciDeviceForDebuggingFn?

public fun interface PKdSetPciDataByOffsetFn {
    public operator fun invoke(busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt
}

public typealias PKdSetPciDataByOffset = PKdSetPciDataByOffsetFn?

public fun interface PKdSetupIntegratedDeviceForDebuggingFn {
    public operator fun invoke(loaderblock: COpaquePointer?, integrateddevice: COpaquePointer?): Ntstatus
}

public typealias PKdSetupIntegratedDeviceForDebugging = PKdSetupIntegratedDeviceForDebuggingFn?

public fun interface PKdSetupPciDeviceForDebuggingFn {
    public operator fun invoke(loaderblock: COpaquePointer?, pcidevice: COpaquePointer?): Ntstatus
}

public typealias PKdSetupPciDeviceForDebugging = PKdSetupPciDeviceForDebuggingFn?

public fun interface PKdUnmapVirtualAddressFn {
    public operator fun invoke(virtualaddress: COpaquePointer?, numberpages: UInt, flushcurrenttlb: Boolean)
}

public typealias PKdUnmapVirtualAddress = PKdUnmapVirtualAddressFn?
