package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    public operator fun invoke(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr
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
    public operator fun invoke(callbackcontext: ConstPtr, classification: BdcbCallbackType, imageinformation: MutPtr)
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
    public operator fun invoke(context: ConstPtr, auxpowerinmilliwatts: UInt, retryinseconds: MutPtr): Ntstatus
}

public typealias D3coldRequestAuxPower = D3coldRequestAuxPowerFn?

public fun interface D3coldRequestCorePowerRailFn {
    public operator fun invoke(context: ConstPtr, corepowerrailneeded: Boolean)
}

public typealias D3coldRequestCorePowerRail = D3coldRequestCorePowerRailFn?

public fun interface D3coldRequestPerstDelayFn {
    public operator fun invoke(context: ConstPtr, delayinmicroseconds: UInt): Ntstatus
}

public typealias D3coldRequestPerstDelay = D3coldRequestPerstDelayFn?

public fun interface DeviceBusSpecificResetHandlerFn {
    public operator fun invoke(interfacecontext: ConstPtr, bustype: ConstPtr, resettypeselected: DeviceBusSpecificResetType, flags: ConstPtr, resetparameters: ConstPtr): Ntstatus
}

public typealias DeviceBusSpecificResetHandler = DeviceBusSpecificResetHandlerFn?

public fun interface DeviceChangeCompleteCallbackFn {
    public operator fun invoke(context: MutPtr)
}

public typealias DeviceChangeCompleteCallback = DeviceChangeCompleteCallbackFn?

public typealias DeviceDirectoryType = Int

public typealias DeviceInstallState = Int

public fun interface DeviceQueryBusSpecificResetHandlerFn {
    public operator fun invoke(interfacecontext: ConstPtr, resetinfocount: MutPtr, resetinfosupported: MutPtr): Ntstatus
}

public typealias DeviceQueryBusSpecificResetHandler = DeviceQueryBusSpecificResetHandlerFn?

public typealias DeviceRegistryProperty = Int

public typealias DeviceRelationType = Int

public typealias DeviceRemovalPolicy = Int

public fun interface DeviceResetCompletionFn {
    public operator fun invoke(status: Ntstatus, context: MutPtr)
}

public typealias DeviceResetCompletion = DeviceResetCompletionFn?

public fun interface DeviceResetHandlerFn {
    public operator fun invoke(interfacecontext: ConstPtr, resettype: DeviceResetType, flags: UInt, resetparameters: ConstPtr): Ntstatus
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
    public operator fun invoke(dmaadapter: ConstPtr, deviceobject: ConstPtr, completioncontext: ConstPtr, status: DmaCompletionStatus)
}

public typealias DmaCompletionRoutine = DmaCompletionRoutineFn?

public typealias DmaCompletionStatus = Int

public typealias DmaSpeed = Int

public typealias DmaWidth = Int

public typealias DomainConfigurationArch = Int

public typealias DriverDirectoryType = Int

public fun interface DriverListControlFn {
    public operator fun invoke(deviceobject: ConstPtr, irp: ConstPtr, scattergather: ConstPtr, context: ConstPtr)
}

public typealias DriverListControl = DriverListControlFn?

public typealias DriverRegkeyType = Int

public typealias DriverRuntimeInitFlags = Int

public fun interface EnableVirtualizationFn {
    public operator fun invoke(context: MutPtr, numvfs: UShort, enablevfmigration: Boolean, enablemigrationinterrupt: Boolean, enablevirtualization: Boolean): Ntstatus
}

public typealias EnableVirtualization = EnableVirtualizationFn?

public fun interface EtwenablecallbackFn {
    public operator fun invoke(sourceid: ConstPtr, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, filterdata: ConstPtr, callbackcontext: MutPtr)
}

public typealias Etwenablecallback = EtwenablecallbackFn?

public fun interface ExpandStackCalloutFn {
    public operator fun invoke(parameter: ConstPtr)
}

public typealias ExpandStackCallout = ExpandStackCalloutFn?

public typealias ExtendedAgpRegister = Int

public fun interface ExtCallbackFn {
    public operator fun invoke(timer: PexTimer, context: ConstPtr)
}

public typealias ExtCallback = ExtCallbackFn?

public fun interface ExtDeleteCallbackFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias ExtDeleteCallback = ExtDeleteCallbackFn?

public fun interface ExCallbackFunctionFn {
    public operator fun invoke(callbackcontext: ConstPtr, argument1: ConstPtr, argument2: ConstPtr): Ntstatus
}

public typealias ExCallbackFunction = ExCallbackFunctionFn?

public typealias ExPoolPriority = Int

public typealias FaultInformationArch = Int

public typealias FaultInformationArm64Type = Int

public fun interface FpgaBusScanFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias FpgaBusScan = FpgaBusScanFn?

public fun interface FpgaControlConfigSpaceFn {
    public operator fun invoke(context: ConstPtr, enable: Boolean): Ntstatus
}

public typealias FpgaControlConfigSpace = FpgaControlConfigSpaceFn?

public fun interface FpgaControlErrorReportingFn {
    public operator fun invoke(context: ConstPtr, uncorrectablemask: UInt, correctablemask: UInt, disableerrorreporting: Boolean): Ntstatus
}

public typealias FpgaControlErrorReporting = FpgaControlErrorReportingFn?

public fun interface FpgaControlLinkFn {
    public operator fun invoke(context: ConstPtr, enable: Boolean): Ntstatus
}

public typealias FpgaControlLink = FpgaControlLinkFn?

public fun interface FreeFunctionFn {
    public operator fun invoke(buffer: ConstPtr)
}

public typealias FreeFunction = FreeFunctionFn?

public fun interface FwmiNotificationCallbackFn {
    public operator fun invoke(wnode: MutPtr, context: MutPtr)
}

public typealias FwmiNotificationCallback = FwmiNotificationCallbackFn?

public fun interface GetD3coldCapabilityFn {
    public operator fun invoke(context: ConstPtr, d3coldsupported: MutPtr): Ntstatus
}

public typealias GetD3coldCapability = GetD3coldCapabilityFn?

public fun interface GetD3coldLastTransitionStatusFn {
    public operator fun invoke(context: ConstPtr, lasttransitionstatus: MutPtr)
}

public typealias GetD3coldLastTransitionStatus = GetD3coldLastTransitionStatusFn?

public fun interface GetDeviceResetStatusFn {
    public operator fun invoke(interfacecontext: ConstPtr, isresetting: MutPtr, resettypeselected: MutPtr, flags: MutPtr): Ntstatus
}

public typealias GetDeviceResetStatus = GetDeviceResetStatusFn?

public fun interface GetDmaAdapterFn {
    public operator fun invoke(context: MutPtr, devicedescriptor: ConstPtr, numberofmapregisters: MutPtr): MutPtr
}

public typealias GetDmaAdapter = GetDmaAdapterFn?

public fun interface GetIdleWakeInfoFn {
    public operator fun invoke(context: ConstPtr, systempowerstate: SystemPowerState, deepestwakeabledstate: MutPtr): Ntstatus
}

public typealias GetIdleWakeInfo = GetIdleWakeInfoFn?

public fun interface GetSdevIdentifierFn {
    public operator fun invoke(interfacecontext: ConstPtr): ULong
}

public typealias GetSdevIdentifier = GetSdevIdentifierFn?

public fun interface GetSetDeviceDataFn {
    public operator fun invoke(context: MutPtr, datatype: UInt, buffer: MutPtr, offset: UInt, length: UInt): UInt
}

public typealias GetSetDeviceData = GetSetDeviceDataFn?

public fun interface GetUpdatedBusResourceFn {
    public operator fun invoke(context: ConstPtr, updatedresourcelist: MutPtr, updatedtranslatedresourcelist: MutPtr): Ntstatus
}

public typealias GetUpdatedBusResource = GetUpdatedBusResourceFn?

public fun interface GetVirtualDeviceDataFn {
    public operator fun invoke(context: MutPtr, virtualfunction: UShort, buffer: MutPtr, offset: UInt, length: UInt): UInt
}

public typealias GetVirtualDeviceData = GetVirtualDeviceDataFn?

public fun interface GetVirtualDeviceLocationFn {
    public operator fun invoke(context: MutPtr, virtualfunction: UShort, segmentnumber: MutPtr, busnumber: MutPtr, functionnumber: MutPtr): Ntstatus
}

public typealias GetVirtualDeviceLocation = GetVirtualDeviceLocationFn?

public fun interface GetVirtualDeviceResourcesFn {
    public operator fun invoke(context: MutPtr, capturedbusnumbers: MutPtr)
}

public typealias GetVirtualDeviceResources = GetVirtualDeviceResourcesFn?

public fun interface GetVirtualFunctionProbedBarsFn {
    public operator fun invoke(context: MutPtr, baseregistervalues: MutPtr): Ntstatus
}

public typealias GetVirtualFunctionProbedBars = GetVirtualFunctionProbedBarsFn?

public typealias HalApicDestinationMode = Int

public typealias HalDisplayBiosInformation = Int

public typealias HalDmaCrashDumpRegisterType = Int

public typealias HalQueryInformationClass = Int

public typealias HalSetInformationClass = Int

public typealias HardwareCounterType = Int

public fun interface HvlWheaErrorNotificationFn {
    public operator fun invoke(recoverycontext: ConstPtr, platformdirected: Boolean, poisoned: Boolean): Ntstatus
}

public typealias HvlWheaErrorNotification = HvlWheaErrorNotificationFn?

public typealias IntelCacheType = Int

public typealias InterfaceType = Int

public typealias InterlockedResult = Int

public fun interface IommuDeviceCreateFn {
    public operator fun invoke(deviceobject: ConstPtr, deviceconfig: ConstPtr, dmadeviceout: MutPtr): Ntstatus
}

public typealias IommuDeviceCreate = IommuDeviceCreateFn?

public typealias IommuDeviceCreationConfigurationType = Int

public fun interface IommuDeviceDeleteFn {
    public operator fun invoke(dmadevice: ConstPtr): Ntstatus
}

public typealias IommuDeviceDelete = IommuDeviceDeleteFn?

public fun interface IommuDeviceFaultHandlerFn {
    public operator fun invoke(context: MutPtr, faultinformation: MutPtr)
}

public typealias IommuDeviceFaultHandler = IommuDeviceFaultHandlerFn?

public fun interface IommuDeviceQueryDomainTypesFn {
    public operator fun invoke(dmadevice: ConstPtr, availabledomains: MutPtr)
}

public typealias IommuDeviceQueryDomainTypes = IommuDeviceQueryDomainTypesFn?

public typealias IommuDmaDomainType = Int

public typealias IommuDmaLogicalAllocatorType = Int

public fun interface IommuDomainAttachDeviceFn {
    public operator fun invoke(domain: ConstPtr, physicaldeviceobject: ConstPtr, inputmappingidbase: UInt, mappingcount: UInt): Ntstatus
}

public typealias IommuDomainAttachDevice = IommuDomainAttachDeviceFn?

public fun interface IommuDomainAttachDeviceExFn {
    public operator fun invoke(domain: ConstPtr, dmadevice: ConstPtr): Ntstatus
}

public typealias IommuDomainAttachDeviceEx = IommuDomainAttachDeviceExFn?

public fun interface IommuDomainConfigureFn {
    public operator fun invoke(domain: ConstPtr, configuration: ConstPtr): Ntstatus
}

public typealias IommuDomainConfigure = IommuDomainConfigureFn?

public fun interface IommuDomainCreateFn {
    public operator fun invoke(osmanagedpagetable: Boolean, domainout: MutPtr): Ntstatus
}

public typealias IommuDomainCreate = IommuDomainCreateFn?

public fun interface IommuDomainCreateExFn {
    public operator fun invoke(domaintype: IommuDmaDomainType, flags: IommuDmaDomainCreationFlags, logicalallocatorconfig: ConstPtr, reservedregions: ConstPtr, domainout: MutPtr): Ntstatus
}

public typealias IommuDomainCreateEx = IommuDomainCreateExFn?

public fun interface IommuDomainDeleteFn {
    public operator fun invoke(domain: ConstPtr): Ntstatus
}

public typealias IommuDomainDelete = IommuDomainDeleteFn?

public fun interface IommuDomainDetachDeviceFn {
    public operator fun invoke(domain: ConstPtr, physicaldeviceobject: ConstPtr, inputmappingid: UInt): Ntstatus
}

public typealias IommuDomainDetachDevice = IommuDomainDetachDeviceFn?

public fun interface IommuDomainDetachDeviceExFn {
    public operator fun invoke(dmadevice: ConstPtr): Ntstatus
}

public typealias IommuDomainDetachDeviceEx = IommuDomainDetachDeviceExFn?

public fun interface IommuFlushDomainFn {
    public operator fun invoke(domain: ConstPtr): Ntstatus
}

public typealias IommuFlushDomain = IommuFlushDomainFn?

public fun interface IommuFlushDomainVaListFn {
    public operator fun invoke(domain: ConstPtr, lastlevel: Boolean, number: UInt, valist: ConstPtr): Ntstatus
}

public typealias IommuFlushDomainVaList = IommuFlushDomainVaListFn?

public fun interface IommuFreeReservedLogicalAddressRangeFn {
    public operator fun invoke(logicaladdresstoken: ConstPtr): Ntstatus
}

public typealias IommuFreeReservedLogicalAddressRange = IommuFreeReservedLogicalAddressRangeFn?

public fun interface IommuInterfaceStateChangeCallbackFn {
    public operator fun invoke(statechange: ConstPtr, context: ConstPtr)
}

public typealias IommuInterfaceStateChangeCallback = IommuInterfaceStateChangeCallbackFn?

public fun interface IommuMapIdentityRangeFn {
    public operator fun invoke(domain: ConstPtr, permissions: UInt, mdl: ConstPtr): Ntstatus
}

public typealias IommuMapIdentityRange = IommuMapIdentityRangeFn?

public fun interface IommuMapIdentityRangeExFn {
    public operator fun invoke(domain: ConstPtr, permissions: UInt, physicaladdresstomap: ConstPtr): Ntstatus
}

public typealias IommuMapIdentityRangeEx = IommuMapIdentityRangeExFn?

public fun interface IommuMapLogicalRangeFn {
    public operator fun invoke(domain: ConstPtr, permissions: UInt, mdl: ConstPtr, logicaladdress: ULong): Ntstatus
}

public typealias IommuMapLogicalRange = IommuMapLogicalRangeFn?

public fun interface IommuMapLogicalRangeExFn {
    public operator fun invoke(domain: ConstPtr, permissions: UInt, physicaladdresstomap: ConstPtr, explicitlogicaladdress: ConstPtr, minlogicaladdress: ConstPtr, maxlogicaladdress: ConstPtr, logicaladdressout: MutPtr): Ntstatus
}

public typealias IommuMapLogicalRangeEx = IommuMapLogicalRangeExFn?

public typealias IommuMapPhysicalAddressType = Int

public fun interface IommuMapReservedLogicalRangeFn {
    public operator fun invoke(logicaladdresstoken: MutPtr, offset: ULong, permissions: UInt, physicaladdresstomap: ConstPtr, mappedsegment: MutPtr): Ntstatus
}

public typealias IommuMapReservedLogicalRange = IommuMapReservedLogicalRangeFn?

public fun interface IommuQueryInputMappingsFn {
    public operator fun invoke(physicaldeviceobject: ConstPtr, buffer: MutPtr, bufferlength: UInt, returnlength: MutPtr): Ntstatus
}

public typealias IommuQueryInputMappings = IommuQueryInputMappingsFn?

public fun interface IommuRegisterInterfaceStateChangeCallbackFn {
    public operator fun invoke(statechangecallback: PiommuInterfaceStateChangeCallback, context: ConstPtr, dmadevice: ConstPtr, statefields: ConstPtr): Ntstatus
}

public typealias IommuRegisterInterfaceStateChangeCallback = IommuRegisterInterfaceStateChangeCallbackFn?

public fun interface IommuReserveLogicalAddressRangeFn {
    public operator fun invoke(domain: ConstPtr, size: ULong, explicitlogicaladdress: ConstPtr, minlogicaladdress: ConstPtr, maxlogicaladdress: ConstPtr, logicaladdresstoken: MutPtr): Ntstatus
}

public typealias IommuReserveLogicalAddressRange = IommuReserveLogicalAddressRangeFn?

public fun interface IommuSetDeviceFaultReportingFn {
    public operator fun invoke(physicaldeviceobject: ConstPtr, inputmappingidbase: UInt, enable: Boolean, faultconfig: ConstPtr): Ntstatus
}

public typealias IommuSetDeviceFaultReporting = IommuSetDeviceFaultReportingFn?

public fun interface IommuSetDeviceFaultReportingExFn {
    public operator fun invoke(dmadevice: ConstPtr, inputmappingidbase: UInt, enable: Boolean, faultconfig: ConstPtr): Ntstatus
}

public typealias IommuSetDeviceFaultReportingEx = IommuSetDeviceFaultReportingExFn?

public fun interface IommuUnmapIdentityRangeFn {
    public operator fun invoke(domain: ConstPtr, mdl: ConstPtr): Ntstatus
}

public typealias IommuUnmapIdentityRange = IommuUnmapIdentityRangeFn?

public fun interface IommuUnmapIdentityRangeExFn {
    public operator fun invoke(domain: ConstPtr, mappedphysicaladdress: ConstPtr): Ntstatus
}

public typealias IommuUnmapIdentityRangeEx = IommuUnmapIdentityRangeExFn?

public fun interface IommuUnmapLogicalRangeFn {
    public operator fun invoke(domain: ConstPtr, logicaladdress: ULong, numberofpages: ULong): Ntstatus
}

public typealias IommuUnmapLogicalRange = IommuUnmapLogicalRangeFn?

public fun interface IommuUnmapReservedLogicalRangeFn {
    public operator fun invoke(mappedsegment: MutPtr): Ntstatus
}

public typealias IommuUnmapReservedLogicalRange = IommuUnmapReservedLogicalRangeFn?

public fun interface IommuUnregisterInterfaceStateChangeCallbackFn {
    public operator fun invoke(statechangecallback: PiommuInterfaceStateChangeCallback, dmadevice: ConstPtr): Ntstatus
}

public typealias IommuUnregisterInterfaceStateChangeCallback = IommuUnregisterInterfaceStateChangeCallbackFn?

public typealias IoAccessMode = Int

public typealias IoAccessType = Int

public typealias IoAllocationAction = Int

public fun interface IoCompletionRoutineFn {
    public operator fun invoke(deviceobject: ConstPtr, irp: ConstPtr, context: ConstPtr): Ntstatus
}

public typealias IoCompletionRoutine = IoCompletionRoutineFn?

public typealias IoCompletionRoutineResult = Int

public typealias IoContainerInformationClass = Int

public typealias IoContainerNotificationClass = Int

public fun interface IoCsqAcquireLockFn {
    public operator fun invoke(csq: ConstPtr, irql: MutPtr)
}

public typealias IoCsqAcquireLock = IoCsqAcquireLockFn?

public fun interface IoCsqCompleteCanceledIrpFn {
    public operator fun invoke(csq: ConstPtr, irp: ConstPtr)
}

public typealias IoCsqCompleteCanceledIrp = IoCsqCompleteCanceledIrpFn?

public fun interface IoCsqInsertIrpFn {
    public operator fun invoke(csq: ConstPtr, irp: ConstPtr)
}

public typealias IoCsqInsertIrp = IoCsqInsertIrpFn?

public fun interface IoCsqInsertIrpExFn {
    public operator fun invoke(csq: ConstPtr, irp: ConstPtr, insertcontext: ConstPtr): Ntstatus
}

public typealias IoCsqInsertIrpEx = IoCsqInsertIrpExFn?

public fun interface IoCsqPeekNextIrpFn {
    public operator fun invoke(csq: ConstPtr, irp: ConstPtr, peekcontext: ConstPtr): MutPtr
}

public typealias IoCsqPeekNextIrp = IoCsqPeekNextIrpFn?

public fun interface IoCsqReleaseLockFn {
    public operator fun invoke(csq: ConstPtr, irql: UByte)
}

public typealias IoCsqReleaseLock = IoCsqReleaseLockFn?

public fun interface IoCsqRemoveIrpFn {
    public operator fun invoke(csq: ConstPtr, irp: ConstPtr)
}

public typealias IoCsqRemoveIrp = IoCsqRemoveIrpFn?

public fun interface IoDpcRoutineFn {
    public operator fun invoke(dpc: ConstPtr, deviceobject: ConstPtr, irp: MutPtr, context: ConstPtr)
}

public typealias IoDpcRoutine = IoDpcRoutineFn?

public typealias IoNotificationEventCategory = Int

public typealias IoPagingPriority = Int

public fun interface IoPersistedMemoryEnumerationCallbackFn {
    public operator fun invoke(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, datatag: ConstPtr, dataversion: ConstPtr, context: ConstPtr): Ntstatus
}

public typealias IoPersistedMemoryEnumerationCallback = IoPersistedMemoryEnumerationCallbackFn?

public typealias IoQueryDeviceDataFormat = Int

public typealias IoSessionEvent = Int

public fun interface IoSessionNotificationFunctionFn {
    public operator fun invoke(sessionobject: ConstPtr, ioobject: ConstPtr, event: UInt, context: ConstPtr, notificationpayload: ConstPtr, payloadlength: UInt): Ntstatus
}

public typealias IoSessionNotificationFunction = IoSessionNotificationFunctionFn?

public typealias IoSessionState = Int

public fun interface IoTimerRoutineFn {
    public operator fun invoke(deviceobject: ConstPtr, context: ConstPtr)
}

public typealias IoTimerRoutine = IoTimerRoutineFn?

public fun interface IoWorkitemRoutineFn {
    public operator fun invoke(deviceobject: ConstPtr, context: ConstPtr)
}

public typealias IoWorkitemRoutine = IoWorkitemRoutineFn?

public fun interface IoWorkitemRoutineExFn {
    public operator fun invoke(ioobject: ConstPtr, context: ConstPtr, ioworkitem: PioWorkitem)
}

public typealias IoWorkitemRoutineEx = IoWorkitemRoutineExFn?

public typealias IrqDevicePolicy = Int

public typealias IrqGroupPolicy = Int

public typealias IrqPriority = Int

public typealias KbugcheckBufferDumpState = Int

public typealias KbugcheckCallbackReason = Int

public fun interface KbugcheckCallbackRoutineFn {
    public operator fun invoke(buffer: MutPtr, length: UInt)
}

public typealias KbugcheckCallbackRoutine = KbugcheckCallbackRoutineFn?

public typealias KbugcheckDumpIoType = Int

public fun interface KbugcheckReasonCallbackRoutineFn {
    public operator fun invoke(reason: KbugcheckCallbackReason, record: ConstPtr, reasonspecificdata: MutPtr, reasonspecificdatalength: UInt)
}

public typealias KbugcheckReasonCallbackRoutine = KbugcheckReasonCallbackRoutineFn?

public fun interface KdeferredRoutineFn {
    public operator fun invoke(dpc: ConstPtr, deferredcontext: ConstPtr, systemargument1: ConstPtr, systemargument2: ConstPtr)
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
    public operator fun invoke(interrupt: ConstPtr, servicecontext: ConstPtr, messageid: UInt): Boolean
}

public typealias KmessageServiceRoutine = KmessageServiceRoutineFn?

public typealias KprofileSource = Int

public fun interface KserviceRoutineFn {
    public operator fun invoke(interrupt: ConstPtr, servicecontext: ConstPtr): Boolean
}

public typealias KserviceRoutine = KserviceRoutineFn?

public fun interface KstartRoutineFn {
    public operator fun invoke(startcontext: ConstPtr)
}

public typealias KstartRoutine = KstartRoutineFn?

public fun interface KsynchronizeRoutineFn {
    public operator fun invoke(synchronizecontext: ConstPtr): Boolean
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
    public operator fun invoke(drivercontext: ConstPtr, mappedva: ConstPtr)
}

public typealias MmMdlRoutine = MmMdlRoutineFn?

public typealias MmPagePriority = Int

public typealias MmRotateDirection = Int

public typealias MmSystemsize = Int

public typealias Mode = Int

public fun interface NmiCallbackFn {
    public operator fun invoke(context: ConstPtr, handled: Boolean): Boolean
}

public typealias NmiCallback = NmiCallbackFn?

public fun interface NpemControlEnableDisableFn {
    public operator fun invoke(context: ConstPtr, enablenpem: Boolean): Ntstatus
}

public typealias NpemControlEnableDisable = NpemControlEnableDisableFn?

public fun interface NpemControlQueryControlFn {
    public operator fun invoke(context: ConstPtr): UInt
}

public typealias NpemControlQueryControl = NpemControlQueryControlFn?

public fun interface NpemControlQueryStandardCapabilitiesFn {
    public operator fun invoke(context: ConstPtr, standardcapabilities: MutPtr): Ntstatus
}

public typealias NpemControlQueryStandardCapabilities = NpemControlQueryStandardCapabilitiesFn?

public fun interface NpemControlSetStandardControlFn {
    public operator fun invoke(context: ConstPtr, standardcontrol: NpemControlStandardControlBit, set: Boolean): Ntstatus
}

public typealias NpemControlSetStandardControl = NpemControlSetStandardControlFn?

public typealias NpemControlStandardControlBit = Int

public fun interface NtfsDerefExportedSecurityDescriptorFn {
    public operator fun invoke(vcb: ConstPtr, securitydescriptor: PsecurityDescriptor)
}

public typealias NtfsDerefExportedSecurityDescriptor = NtfsDerefExportedSecurityDescriptorFn?

public typealias ObPreopCallbackStatus = Int

public fun interface PallocateAdapterChannelFn {
    public operator fun invoke(dmaadapter: ConstPtr, deviceobject: ConstPtr, numberofmapregisters: UInt, executionroutine: DriverControl, context: ConstPtr): Ntstatus
}

public typealias PallocateAdapterChannel = PallocateAdapterChannelFn?

public fun interface PallocateAdapterChannelExFn {
    public operator fun invoke(dmaadapter: ConstPtr, deviceobject: ConstPtr, dmatransfercontext: ConstPtr, numberofmapregisters: UInt, flags: UInt, executionroutine: DriverControl, executioncontext: ConstPtr, mapregisterbase: MutPtr): Ntstatus
}

public typealias PallocateAdapterChannelEx = PallocateAdapterChannelExFn?

public fun interface PallocateCommonBufferFn {
    public operator fun invoke(dmaadapter: ConstPtr, length: UInt, logicaladdress: MutPtr, cacheenabled: Boolean): MutPtr
}

public typealias PallocateCommonBuffer = PallocateCommonBufferFn?

public fun interface PallocateCommonBufferExFn {
    public operator fun invoke(dmaadapter: ConstPtr, maximumaddress: ConstPtr, length: UInt, logicaladdress: MutPtr, cacheenabled: Boolean, preferrednode: UInt): MutPtr
}

public typealias PallocateCommonBufferEx = PallocateCommonBufferExFn?

public fun interface PallocateCommonBufferVectorFn {
    public operator fun invoke(dmaadapter: ConstPtr, lowaddress: Long, highaddress: Long, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, numberofelements: UInt, sizeofelements: ULong, vectorout: MutPtr): Ntstatus
}

public typealias PallocateCommonBufferVector = PallocateCommonBufferVectorFn?

public fun interface PallocateCommonBufferWithBoundsFn {
    public operator fun invoke(dmaadapter: ConstPtr, minimumaddress: ConstPtr, maximumaddress: ConstPtr, length: UInt, flags: UInt, cachetype: ConstPtr, preferrednode: UInt, logicaladdress: MutPtr): MutPtr
}

public typealias PallocateCommonBufferWithBounds = PallocateCommonBufferWithBoundsFn?

public fun interface PallocateDomainCommonBufferFn {
    public operator fun invoke(dmaadapter: ConstPtr, domainhandle: Handle, maximumaddress: ConstPtr, length: UInt, flags: UInt, cachetype: ConstPtr, preferrednode: UInt, logicaladdress: MutPtr, virtualaddress: MutPtr): Ntstatus
}

public typealias PallocateDomainCommonBuffer = PallocateDomainCommonBufferFn?

public fun interface PallocateFunctionFn {
    public operator fun invoke(): MutPtr
}

public typealias PallocateFunction = PallocateFunctionFn?

public fun interface PallocateFunctionExFn {
    public operator fun invoke(): MutPtr
}

public typealias PallocateFunctionEx = PallocateFunctionExFn?

public fun interface ParbiterHandlerFn {
    public operator fun invoke(context: MutPtr, action: ArbiterAction, parameters: MutPtr): Ntstatus
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
    public operator fun invoke(dmaadapter: ConstPtr, scattergather: ConstPtr, originalmdl: ConstPtr, targetmdl: MutPtr): Ntstatus
}

public typealias PbuildMdlFromScatterGatherList = PbuildMdlFromScatterGatherListFn?

public fun interface PbuildScatterGatherListFn {
    public operator fun invoke(dmaadapter: ConstPtr, deviceobject: ConstPtr, mdl: ConstPtr, currentva: ConstPtr, length: UInt, executionroutine: DriverListControl, context: ConstPtr, writetodevice: Boolean, scattergatherbuffer: ConstPtr, scattergatherlength: UInt): Ntstatus
}

public typealias PbuildScatterGatherList = PbuildScatterGatherListFn?

public fun interface PbuildScatterGatherListExFn {
    public operator fun invoke(dmaadapter: ConstPtr, deviceobject: ConstPtr, dmatransfercontext: ConstPtr, mdl: ConstPtr, offset: ULong, length: UInt, flags: UInt, executionroutine: DriverListControl, context: ConstPtr, writetodevice: Boolean, scattergatherbuffer: ConstPtr, scattergatherlength: UInt, dmacompletionroutine: PdmaCompletionRoutine, completioncontext: ConstPtr, scattergatherlist: MutPtr): Ntstatus
}

public typealias PbuildScatterGatherListEx = PbuildScatterGatherListExFn?

public fun interface PcalculateScatterGatherListSizeFn {
    public operator fun invoke(dmaadapter: ConstPtr, mdl: ConstPtr, currentva: ConstPtr, length: UInt, scattergatherlistsize: MutPtr, pnumberofmapregisters: MutPtr): Ntstatus
}

public typealias PcalculateScatterGatherListSize = PcalculateScatterGatherListSizeFn?

public fun interface PcallbackFunctionFn {
    public operator fun invoke()
}

public typealias PcallbackFunction = PcallbackFunctionFn?

public fun interface PcancelAdapterChannelFn {
    public operator fun invoke(dmaadapter: ConstPtr, deviceobject: ConstPtr, dmatransfercontext: ConstPtr): Boolean
}

public typealias PcancelAdapterChannel = PcancelAdapterChannelFn?

public fun interface PcancelMappedTransferFn {
    public operator fun invoke(dmaadapter: ConstPtr, dmatransfercontext: ConstPtr): Ntstatus
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
    public operator fun invoke(context: MutPtr): Ntstatus
}

public typealias PciExpressEnterLinkQuiescentMode = PciExpressEnterLinkQuiescentModeFn?

public fun interface PciExpressExitLinkQuiescentModeFn {
    public operator fun invoke(context: MutPtr): Ntstatus
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
    public operator fun invoke(context: ConstPtr, enablewake: Boolean)
}

public typealias PciExpressWakeControl = PciExpressWakeControlFn?

public typealias PciHardwareInterface = Int

public fun interface PciIsDevicePresentFn {
    public operator fun invoke(vendorid: UShort, deviceid: UShort, revisionid: UByte, subvendorid: UShort, subsystemid: UShort, flags: UInt): Boolean
}

public typealias PciIsDevicePresent = PciIsDevicePresentFn?

public fun interface PciIsDevicePresentExFn {
    public operator fun invoke(context: ConstPtr, parameters: ConstPtr): Boolean
}

public typealias PciIsDevicePresentEx = PciIsDevicePresentExFn?

public fun interface PciLineToPinFn {
    public operator fun invoke(context: ConstPtr, pcinewdata: ConstPtr, pciolddata: ConstPtr)
}

public typealias PciLineToPin = PciLineToPinFn?

public fun interface PciMsixGetEntryFn {
    public operator fun invoke(context: ConstPtr, tableentry: UInt, messagenumber: MutPtr, masked: MutPtr): Ntstatus
}

public typealias PciMsixGetEntry = PciMsixGetEntryFn?

public fun interface PciMsixGetTableSizeFn {
    public operator fun invoke(context: ConstPtr, tablesize: MutPtr): Ntstatus
}

public typealias PciMsixGetTableSize = PciMsixGetTableSizeFn?

public fun interface PciMsixMaskunmaskEntryFn {
    public operator fun invoke(context: ConstPtr, tableentry: UInt): Ntstatus
}

public typealias PciMsixMaskunmaskEntry = PciMsixMaskunmaskEntryFn?

public fun interface PciMsixSetEntryFn {
    public operator fun invoke(context: ConstPtr, tableentry: UInt, messagenumber: UInt): Ntstatus
}

public typealias PciMsixSetEntry = PciMsixSetEntryFn?

public fun interface PciPinToLineFn {
    public operator fun invoke(context: ConstPtr, pcidata: ConstPtr)
}

public typealias PciPinToLine = PciPinToLineFn?

public fun interface PciPrepareMultistageResumeFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias PciPrepareMultistageResume = PciPrepareMultistageResumeFn?

public fun interface PciReadWriteConfigFn {
    public operator fun invoke(context: ConstPtr, busoffset: UInt, slot: UInt, buffer: ConstPtr, offset: UInt, length: UInt): UInt
}

public typealias PciReadWriteConfig = PciReadWriteConfigFn?

public fun interface PciRootBusCapabilityFn {
    public operator fun invoke(context: ConstPtr, hardwarecapability: MutPtr)
}

public typealias PciRootBusCapability = PciRootBusCapabilityFn?

public fun interface PciSetAcsFn {
    public operator fun invoke(context: MutPtr, enablesourcevalidation: PciAcsBit, enabletranslationblocking: PciAcsBit, enablep2prequestredirect: PciAcsBit, enablecompletionredirect: PciAcsBit, enableupstreamforwarding: PciAcsBit, enableegresscontrol: PciAcsBit, enabledirecttranslatedp2p: PciAcsBit): Ntstatus
}

public typealias PciSetAcs = PciSetAcsFn?

public fun interface PciSetAcs2Fn {
    public operator fun invoke(context: MutPtr, scenariostomodify: UInt, scenariostate: UInt): Ntstatus
}

public typealias PciSetAcs2 = PciSetAcs2Fn?

public fun interface PciSetAtsFn {
    public operator fun invoke(context: ConstPtr, enableats: Boolean): Ntstatus
}

public typealias PciSetAts = PciSetAtsFn?

public fun interface PclfsClientAdvanceTailCallbackFn {
    public operator fun invoke(logfile: ConstPtr, targetlsn: ConstPtr, clientdata: ConstPtr): Ntstatus
}

public typealias PclfsClientAdvanceTailCallback = PclfsClientAdvanceTailCallbackFn?

public fun interface PclfsClientLffHandlerCompleteCallbackFn {
    public operator fun invoke(logfile: ConstPtr, operationstatus: Ntstatus, logispinned: Boolean, clientdata: ConstPtr)
}

public typealias PclfsClientLffHandlerCompleteCallback = PclfsClientLffHandlerCompleteCallbackFn?

public fun interface PclfsClientLogUnpinnedCallbackFn {
    public operator fun invoke(logfile: ConstPtr, clientdata: ConstPtr)
}

public typealias PclfsClientLogUnpinnedCallback = PclfsClientLogUnpinnedCallbackFn?

public fun interface PclfsSetLogSizeCompleteCallbackFn {
    public operator fun invoke(logfile: ConstPtr, operationstatus: Ntstatus, clientdata: ConstPtr)
}

public typealias PclfsSetLogSizeCompleteCallback = PclfsSetLogSizeCompleteCallbackFn?

public fun interface PconfigureAdapterChannelFn {
    public operator fun invoke(dmaadapter: ConstPtr, functionnumber: UInt, context: ConstPtr): Ntstatus
}

public typealias PconfigureAdapterChannel = PconfigureAdapterChannelFn?

public fun interface PcrashdumpPowerOnFn {
    public operator fun invoke(context: ConstPtr): Ntstatus
}

public typealias PcrashdumpPowerOn = PcrashdumpPowerOnFn?

public fun interface PcreateCommonBufferFromMdlFn {
    public operator fun invoke(dmaadapter: ConstPtr, mdl: ConstPtr, extendedconfigs: ConstPtr, extendedconfigscount: UInt, logicaladdress: MutPtr): Ntstatus
}

public typealias PcreateCommonBufferFromMdl = PcreateCommonBufferFromMdlFn?

public fun interface PcreateProcessNotifyRoutineFn {
    public operator fun invoke(parentid: Handle, processid: Handle, create: Boolean)
}

public typealias PcreateProcessNotifyRoutine = PcreateProcessNotifyRoutineFn?

public fun interface PcreateProcessNotifyRoutineExFn {
    public operator fun invoke(process: Peprocess, processid: Handle, createinfo: MutPtr)
}

public typealias PcreateProcessNotifyRoutineEx = PcreateProcessNotifyRoutineExFn?

public fun interface PcreateThreadNotifyRoutineFn {
    public operator fun invoke(processid: Handle, threadid: Handle, create: Boolean)
}

public typealias PcreateThreadNotifyRoutine = PcreateThreadNotifyRoutineFn?

public fun interface PcwCallbackFn {
    public operator fun invoke(type: PcwCallbackType, info: ConstPtr, context: ConstPtr): Ntstatus
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
    public operator fun invoke(device: MutPtr): KdCallbackAction
}

public typealias PdebugDeviceFoundFunction = PdebugDeviceFoundFunctionFn?

public fun interface PdebugPrintCallbackFn {
    public operator fun invoke(output: ConstPtr, componentid: UInt, level: UInt)
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
    public operator fun invoke(param0: MutPtr, param1: UInt)
}

public typealias PdeviceNotifyCallback = PdeviceNotifyCallbackFn?

public fun interface PdeviceNotifyCallback2Fn {
    public operator fun invoke(notificationcontext: MutPtr, notifycode: UInt)
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
    public operator fun invoke(context: ConstPtr, cmclog: ConstPtr)
}

public typealias PdriverCmcExceptionCallback = PdriverCmcExceptionCallbackFn?

public fun interface PdriverCpeExceptionCallbackFn {
    public operator fun invoke(context: ConstPtr, cmclog: ConstPtr)
}

public typealias PdriverCpeExceptionCallback = PdriverCpeExceptionCallbackFn?

public fun interface PdriverExcptnCallbackFn {
    public operator fun invoke(context: ConstPtr, banklog: ConstPtr)
}

public typealias PdriverExcptnCallback = PdriverExcptnCallbackFn?

public fun interface PdriverVerifierThunkRoutineFn {
    public operator fun invoke(context: ConstPtr): ULong
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
    public operator fun invoke(dmaadapter: ConstPtr, mdl: ConstPtr, mapregisterbase: ConstPtr, currentva: ConstPtr, length: UInt, writetodevice: Boolean): Boolean
}

public typealias PflushAdapterBuffers = PflushAdapterBuffersFn?

public fun interface PflushAdapterBuffersExFn {
    public operator fun invoke(dmaadapter: ConstPtr, mdl: ConstPtr, mapregisterbase: ConstPtr, offset: ULong, length: UInt, writetodevice: Boolean): Ntstatus
}

public typealias PflushAdapterBuffersEx = PflushAdapterBuffersExFn?

public fun interface PflushDmaBufferFn {
    public operator fun invoke(dmaadapter: ConstPtr, mdl: ConstPtr, readoperation: Boolean): Ntstatus
}

public typealias PflushDmaBuffer = PflushDmaBufferFn?

public fun interface PfnfthFn {
    public operator fun invoke(systemfirmwaretableinfo: MutPtr): Ntstatus
}

public typealias Pfnfth = PfnfthFn?

public fun interface PfnInUsePageOfflineNotifyFn {
    public operator fun invoke(page: UInt, flags: Boolean, poisoned: Boolean, context: ConstPtr): Boolean
}

public typealias PfnInUsePageOfflineNotify = PfnInUsePageOfflineNotifyFn?

public fun interface PfnNtCommitTransactionFn {
    public operator fun invoke(transactionhandle: Handle, wait: Boolean): Ntstatus
}

public typealias PfnNtCommitTransaction = PfnNtCommitTransactionFn?

public fun interface PfnNtCreateTransactionFn {
    public operator fun invoke(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr, description: ConstPtr): Ntstatus
}

public typealias PfnNtCreateTransaction = PfnNtCreateTransactionFn?

public fun interface PfnNtOpenTransactionFn {
    public operator fun invoke(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle): Ntstatus
}

public typealias PfnNtOpenTransaction = PfnNtOpenTransactionFn?

public fun interface PfnNtQueryInformationTransactionFn {
    public operator fun invoke(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr, transactioninformationlength: UInt, returnlength: MutPtr): Ntstatus
}

public typealias PfnNtQueryInformationTransaction = PfnNtQueryInformationTransactionFn?

public fun interface PfnNtRollbackTransactionFn {
    public operator fun invoke(transactionhandle: Handle, wait: Boolean): Ntstatus
}

public typealias PfnNtRollbackTransaction = PfnNtRollbackTransactionFn?

public fun interface PfnNtSetInformationTransactionFn {
    public operator fun invoke(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr, transactioninformationlength: UInt): Ntstatus
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
    public operator fun invoke(context: ConstPtr, osselrecord: ConstPtr): Ntstatus
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
    public operator fun invoke(dmaadapter: ConstPtr)
}

public typealias PfreeAdapterChannel = PfreeAdapterChannelFn?

public fun interface PfreeAdapterObjectFn {
    public operator fun invoke(dmaadapter: ConstPtr, allocationaction: IoAllocationAction)
}

public typealias PfreeAdapterObject = PfreeAdapterObjectFn?

public fun interface PfreeCommonBufferFn {
    public operator fun invoke(dmaadapter: ConstPtr, length: UInt, logicaladdress: Long, virtualaddress: ConstPtr, cacheenabled: Boolean)
}

public typealias PfreeCommonBuffer = PfreeCommonBufferFn?

public fun interface PfreeCommonBufferFromVectorFn {
    public operator fun invoke(dmaadapter: ConstPtr, vector: ConstPtr, index: UInt)
}

public typealias PfreeCommonBufferFromVector = PfreeCommonBufferFromVectorFn?

public fun interface PfreeCommonBufferVectorFn {
    public operator fun invoke(dmaadapter: ConstPtr, vector: ConstPtr)
}

public typealias PfreeCommonBufferVector = PfreeCommonBufferVectorFn?

public fun interface PfreeFunctionExFn {
    public operator fun invoke()
}

public typealias PfreeFunctionEx = PfreeFunctionExFn?

public fun interface PfreeMapRegistersFn {
    public operator fun invoke(dmaadapter: ConstPtr, mapregisterbase: MutPtr, numberofmapregisters: UInt)
}

public typealias PfreeMapRegisters = PfreeMapRegistersFn?

public fun interface PgetCommonBufferFromVectorByIndexFn {
    public operator fun invoke(dmaadapter: ConstPtr, vector: ConstPtr, index: UInt, virtualaddressout: MutPtr, logicaladdressout: MutPtr)
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
    public operator fun invoke(): MutPtr
}

public typealias PgetDmaAdapter = PgetDmaAdapterFn?

public fun interface PgetDmaAdapterInfoFn {
    public operator fun invoke(dmaadapter: ConstPtr, adapterinfo: MutPtr): Ntstatus
}

public typealias PgetDmaAdapterInfo = PgetDmaAdapterInfoFn?

public fun interface PgetDmaAlignmentFn {
    public operator fun invoke(dmaadapter: ConstPtr): UInt
}

public typealias PgetDmaAlignment = PgetDmaAlignmentFn?

public fun interface PgetDmaDomainFn {
    public operator fun invoke(dmaadapter: ConstPtr): Handle
}

public typealias PgetDmaDomain = PgetDmaDomainFn?

public fun interface PgetDmaTransferInfoFn {
    public operator fun invoke(dmaadapter: ConstPtr, mdl: ConstPtr, offset: ULong, length: UInt, writeonly: Boolean, transferinfo: MutPtr): Ntstatus
}

public typealias PgetDmaTransferInfo = PgetDmaTransferInfoFn?

public fun interface PgetIdleWakeInfoFn {
    public operator fun invoke(): Ntstatus
}

public typealias PgetIdleWakeInfo = PgetIdleWakeInfoFn?

public fun interface PgetLocationStringFn {
    public operator fun invoke(context: MutPtr, locationstrings: MutPtr): Ntstatus
}

public typealias PgetLocationString = PgetLocationStringFn?

public fun interface PgetScatterGatherListFn {
    public operator fun invoke(dmaadapter: ConstPtr, deviceobject: ConstPtr, mdl: ConstPtr, currentva: ConstPtr, length: UInt, executionroutine: DriverListControl, context: ConstPtr, writetodevice: Boolean): Ntstatus
}

public typealias PgetScatterGatherList = PgetScatterGatherListFn?

public fun interface PgetScatterGatherListExFn {
    public operator fun invoke(dmaadapter: ConstPtr, deviceobject: ConstPtr, dmatransfercontext: ConstPtr, mdl: ConstPtr, offset: ULong, length: UInt, flags: UInt, executionroutine: DriverListControl, context: ConstPtr, writetodevice: Boolean, dmacompletionroutine: PdmaCompletionRoutine, completioncontext: ConstPtr, scattergatherlist: MutPtr): Ntstatus
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
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Ntstatus
}

public typealias PgpeClearStatus = PgpeClearStatusFn?

public fun interface PgpeClearStatus2Fn {
    public operator fun invoke(context: MutPtr, objectcontext: MutPtr): Ntstatus
}

public typealias PgpeClearStatus2 = PgpeClearStatus2Fn?

public fun interface PgpeConnectVectorFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: KinterruptMode, param3: Boolean, param4: PgpeServiceRoutine, param5: MutPtr, param6: MutPtr): Ntstatus
}

public typealias PgpeConnectVector = PgpeConnectVectorFn?

public fun interface PgpeConnectVector2Fn {
    public operator fun invoke(context: MutPtr, gpenumber: UInt, mode: KinterruptMode, shareable: Boolean, serviceroutine: PgpeServiceRoutine, servicecontext: MutPtr, objectcontext: MutPtr): Ntstatus
}

public typealias PgpeConnectVector2 = PgpeConnectVector2Fn?

public fun interface PgpeDisableEventFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Ntstatus
}

public typealias PgpeDisableEvent = PgpeDisableEventFn?

public fun interface PgpeDisableEvent2Fn {
    public operator fun invoke(context: MutPtr, objectcontext: MutPtr): Ntstatus
}

public typealias PgpeDisableEvent2 = PgpeDisableEvent2Fn?

public fun interface PgpeDisconnectVectorFn {
    public operator fun invoke(param0: MutPtr): Ntstatus
}

public typealias PgpeDisconnectVector = PgpeDisconnectVectorFn?

public fun interface PgpeDisconnectVector2Fn {
    public operator fun invoke(context: MutPtr, objectcontext: MutPtr): Ntstatus
}

public typealias PgpeDisconnectVector2 = PgpeDisconnectVector2Fn?

public fun interface PgpeEnableEventFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Ntstatus
}

public typealias PgpeEnableEvent = PgpeEnableEventFn?

public fun interface PgpeEnableEvent2Fn {
    public operator fun invoke(context: MutPtr, objectcontext: MutPtr): Ntstatus
}

public typealias PgpeEnableEvent2 = PgpeEnableEvent2Fn?

public fun interface PgpeServiceRoutineFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr): Boolean
}

public typealias PgpeServiceRoutine = PgpeServiceRoutineFn?

public fun interface PgpeServiceRoutine2Fn {
    public operator fun invoke(objectcontext: MutPtr, servicecontext: MutPtr): Boolean
}

public typealias PgpeServiceRoutine2 = PgpeServiceRoutine2Fn?

public fun interface PhalioreadwritehandlerFn {
    public operator fun invoke(fread: Boolean, dwaddr: UInt, dwsize: UInt, pdwdata: MutPtr): Ntstatus
}

public typealias Phalioreadwritehandler = PhalioreadwritehandlerFn?

public fun interface PhalmcainterfacelockFn {
    public operator fun invoke()
}

public typealias Phalmcainterfacelock = PhalmcainterfacelockFn?

public fun interface PhalmcainterfacereadregisterFn {
    public operator fun invoke(banknumber: UByte, exception: MutPtr): Ntstatus
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
    public operator fun invoke(dmaadapter: ConstPtr, dmatransfercontext: MutPtr): Ntstatus
}

public typealias PinitializeDmaTransferContext = PinitializeDmaTransferContextFn?

public fun interface PinterfaceDereferenceFn {
    public operator fun invoke(context: MutPtr)
}

public typealias PinterfaceDereference = PinterfaceDereferenceFn?

public fun interface PinterfaceReferenceFn {
    public operator fun invoke(context: MutPtr)
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
    public operator fun invoke(): MutPtr
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
    public operator fun invoke(status: Ntstatus, context: MutPtr)
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
    public operator fun invoke(context: ConstPtr, pathname: ConstPtr, bustype: InterfaceType, busnumber: UInt, businformation: ConstPtr, controllertype: ConfigurationType, controllernumber: UInt, controllerinformation: ConstPtr, peripheraltype: ConfigurationType, peripheralnumber: UInt, peripheralinformation: ConstPtr): Ntstatus
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
    public operator fun invoke(dmaadapter: ConstPtr, domainhandle: Handle): Ntstatus
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
    public operator fun invoke(dmaadapter: ConstPtr): Ntstatus
}

public typealias PleaveDmaDomain = PleaveDmaDomainFn?

public fun interface PloadImageNotifyRoutineFn {
    public operator fun invoke(fullimagename: ConstPtr, processid: Handle, imageinfo: ConstPtr)
}

public typealias PloadImageNotifyRoutine = PloadImageNotifyRoutineFn?

public fun interface PmapTransferFn {
    public operator fun invoke(dmaadapter: ConstPtr, mdl: ConstPtr, mapregisterbase: ConstPtr, currentva: ConstPtr, length: MutPtr, writetodevice: Boolean): Long
}

public typealias PmapTransfer = PmapTransferFn?

public fun interface PmapTransferExFn {
    public operator fun invoke(dmaadapter: ConstPtr, mdl: ConstPtr, mapregisterbase: ConstPtr, offset: ULong, deviceoffset: UInt, length: MutPtr, writetodevice: Boolean, scattergatherbuffer: MutPtr, scattergatherbufferlength: UInt, dmacompletionroutine: PdmaCompletionRoutine, completioncontext: ConstPtr): Ntstatus
}

public typealias PmapTransferEx = PmapTransferExFn?

public fun interface PmmDllInitializeFn {
    public operator fun invoke(registrypath: ConstPtr): Ntstatus
}

public typealias PmmDllInitialize = PmmDllInitializeFn?

public fun interface PmmDllUnloadFn {
    public operator fun invoke(): Ntstatus
}

public typealias PmmDllUnload = PmmDllUnloadFn?

public fun interface PmmGetSystemRoutineAddressExFn {
    public operator fun invoke(modulename: ConstPtr, functionname: Pcstr): MutPtr
}

public typealias PmmGetSystemRoutineAddressEx = PmmGetSystemRoutineAddressExFn?

public fun interface PmmMdlRoutineFn {
    public operator fun invoke()
}

public typealias PmmMdlRoutine = PmmMdlRoutineFn?

public fun interface PmmRotateCopyCallbackFunctionFn {
    public operator fun invoke(destinationmdl: ConstPtr, sourcemdl: ConstPtr, context: ConstPtr): Ntstatus
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
    public operator fun invoke(registrationcontext: ConstPtr, operationinformation: ConstPtr)
}

public typealias PobPostOperationCallback = PobPostOperationCallbackFn?

public fun interface PobPreOperationCallbackFn {
    public operator fun invoke(registrationcontext: ConstPtr, operationinformation: MutPtr): ObPreopCallbackStatus
}

public typealias PobPreOperationCallback = PobPreOperationCallbackFn?

public typealias PoolExtendedParameterType = Int

public typealias PowerMonitorRequestReason = Int

public typealias PowerMonitorRequestType = Int

public typealias PowerPlatformRole = Int

public fun interface PowerSettingCallbackFn {
    public operator fun invoke(settingguid: ConstPtr, value: ConstPtr, valuelength: UInt, context: MutPtr): Ntstatus
}

public typealias PowerSettingCallback = PowerSettingCallbackFn?

public typealias PowerStateType = Int

public typealias PowerUserPresenceType = Int

public fun interface PoFxComponentActiveConditionCallbackFn {
    public operator fun invoke(context: ConstPtr, component: UInt)
}

public typealias PoFxComponentActiveConditionCallback = PoFxComponentActiveConditionCallbackFn?

public fun interface PoFxComponentCriticalTransitionCallbackFn {
    public operator fun invoke(context: ConstPtr, component: UInt, active: Boolean)
}

public typealias PoFxComponentCriticalTransitionCallback = PoFxComponentCriticalTransitionCallbackFn?

public fun interface PoFxComponentIdleConditionCallbackFn {
    public operator fun invoke(context: ConstPtr, component: UInt)
}

public typealias PoFxComponentIdleConditionCallback = PoFxComponentIdleConditionCallbackFn?

public fun interface PoFxComponentIdleStateCallbackFn {
    public operator fun invoke(context: ConstPtr, component: UInt, state: UInt)
}

public typealias PoFxComponentIdleStateCallback = PoFxComponentIdleStateCallbackFn?

public fun interface PoFxComponentPerfStateCallbackFn {
    public operator fun invoke(context: ConstPtr, component: UInt, succeeded: Boolean, requestcontext: ConstPtr)
}

public typealias PoFxComponentPerfStateCallback = PoFxComponentPerfStateCallbackFn?

public fun interface PoFxDevicePowerNotRequiredCallbackFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias PoFxDevicePowerNotRequiredCallback = PoFxDevicePowerNotRequiredCallbackFn?

public fun interface PoFxDevicePowerRequiredCallbackFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias PoFxDevicePowerRequiredCallback = PoFxDevicePowerRequiredCallbackFn?

public fun interface PoFxDirectedPowerDownCallbackFn {
    public operator fun invoke(context: ConstPtr, flags: UInt)
}

public typealias PoFxDirectedPowerDownCallback = PoFxDirectedPowerDownCallbackFn?

public fun interface PoFxDirectedPowerUpCallbackFn {
    public operator fun invoke(context: ConstPtr, flags: UInt)
}

public typealias PoFxDirectedPowerUpCallback = PoFxDirectedPowerUpCallbackFn?

public fun interface PoFxDripsWatchdogCallbackFn {
    public operator fun invoke(context: ConstPtr, physicaldeviceobject: ConstPtr, uniqueid: UInt)
}

public typealias PoFxDripsWatchdogCallback = PoFxDripsWatchdogCallbackFn?

public typealias PoFxPerfStateType = Int

public typealias PoFxPerfStateUnit = Int

public fun interface PoFxPowerControlCallbackFn {
    public operator fun invoke(devicecontext: ConstPtr, powercontrolcode: ConstPtr, inbuffer: ConstPtr, inbuffersize: ULong, outbuffer: MutPtr, outbuffersize: ULong, bytesreturned: MutPtr): Ntstatus
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
    public operator fun invoke(context: ConstPtr, buffer: MutPtr, offset: UInt, length: UInt): UInt
}

public typealias PpciExpressRootPortReadConfigSpace = PpciExpressRootPortReadConfigSpaceFn?

public fun interface PpciExpressRootPortWriteConfigSpaceFn {
    public operator fun invoke(context: ConstPtr, buffer: ConstPtr, offset: UInt, length: UInt): UInt
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
    public operator fun invoke(eventbuffer: ConstPtr, entrysize: ULong, numberofentries: ULong, owninghandle: Handle)
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
    public operator fun invoke(dmaadapter: MutPtr)
}

public typealias PputDmaAdapter = PputDmaAdapterFn?

public fun interface PputScatterGatherListFn {
    public operator fun invoke(dmaadapter: ConstPtr, scattergather: ConstPtr, writetodevice: Boolean)
}

public typealias PputScatterGatherList = PputScatterGatherListFn?

public fun interface PqueryextendedaddressFn {
    public operator fun invoke(context: ConstPtr, extendedaddress: MutPtr)
}

public typealias Pqueryextendedaddress = PqueryextendedaddressFn?

public fun interface PreadDmaCounterFn {
    public operator fun invoke(dmaadapter: ConstPtr): UInt
}

public typealias PreadDmaCounter = PreadDmaCounterFn?

public fun interface PreenumerateSelfFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias PreenumerateSelf = PreenumerateSelfFn?

public fun interface PregisterForDeviceNotificationsFn {
    public operator fun invoke(param0: MutPtr, param1: PdeviceNotifyCallback, param2: MutPtr): Ntstatus
}

public typealias PregisterForDeviceNotifications = PregisterForDeviceNotificationsFn?

public fun interface PregisterForDeviceNotifications2Fn {
    public operator fun invoke(context: MutPtr, notificationhandler: PdeviceNotifyCallback2, notificationcontext: MutPtr): Ntstatus
}

public typealias PregisterForDeviceNotifications2 = PregisterForDeviceNotifications2Fn?

public fun interface PreplaceBeginFn {
    public operator fun invoke(parameters: ConstPtr, context: MutPtr): Ntstatus
}

public typealias PreplaceBegin = PreplaceBeginFn?

public fun interface PreplaceDriverInitFn {
    public operator fun invoke(iface: MutPtr, unused: ConstPtr): Ntstatus
}

public typealias PreplaceDriverInit = PreplaceDriverInitFn?

public fun interface PreplaceEnableDisableHardwareQuiesceFn {
    public operator fun invoke(context: ConstPtr, enable: Boolean): Ntstatus
}

public typealias PreplaceEnableDisableHardwareQuiesce = PreplaceEnableDisableHardwareQuiesceFn?

public fun interface PreplaceEndFn {
    public operator fun invoke(context: ConstPtr): Ntstatus
}

public typealias PreplaceEnd = PreplaceEndFn?

public fun interface PreplaceGetMemoryDestinationFn {
    public operator fun invoke(context: ConstPtr, sourceaddress: Long, destinationaddress: MutPtr): Ntstatus
}

public typealias PreplaceGetMemoryDestination = PreplaceGetMemoryDestinationFn?

public fun interface PreplaceInitiateHardwareMirrorFn {
    public operator fun invoke(context: ConstPtr): Ntstatus
}

public typealias PreplaceInitiateHardwareMirror = PreplaceInitiateHardwareMirrorFn?

public fun interface PreplaceMapMemoryFn {
    public operator fun invoke(targetphysicaladdress: Long, sparephysicaladdress: Long, numberofbytes: MutPtr, targetaddress: MutPtr, spareaddress: MutPtr): Ntstatus
}

public typealias PreplaceMapMemory = PreplaceMapMemoryFn?

public fun interface PreplaceMirrorPhysicalMemoryFn {
    public operator fun invoke(context: ConstPtr, physicaladdress: Long, bytecount: Long): Ntstatus
}

public typealias PreplaceMirrorPhysicalMemory = PreplaceMirrorPhysicalMemoryFn?

public fun interface PreplaceMirrorPlatformMemoryFn {
    public operator fun invoke(context: ConstPtr): Ntstatus
}

public typealias PreplaceMirrorPlatformMemory = PreplaceMirrorPlatformMemoryFn?

public fun interface PreplaceSetProcessorIdFn {
    public operator fun invoke(context: ConstPtr, apicid: UInt, target: Boolean): Ntstatus
}

public typealias PreplaceSetProcessorId = PreplaceSetProcessorIdFn?

public fun interface PreplaceSwapFn {
    public operator fun invoke(context: ConstPtr): Ntstatus
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
    public operator fun invoke(callbackcontext: ConstPtr, changecontext: ConstPtr, operationstatus: MutPtr)
}

public typealias ProcessorCallbackFunction = ProcessorCallbackFunctionFn?

public fun interface ProcessorHaltRoutineFn {
    public operator fun invoke(context: MutPtr): Ntstatus
}

public typealias ProcessorHaltRoutine = ProcessorHaltRoutineFn?

public fun interface PrtlAvlAllocateRoutineFn {
    public operator fun invoke(): MutPtr
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
    public operator fun invoke(): MutPtr
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
    public operator fun invoke(plugincontext: MutPtr, bufferlength: UInt, errorrecord: ConstPtr): Ntstatus
}

public typealias PshedPiAttemptErrorRecovery = PshedPiAttemptErrorRecoveryFn?

public fun interface PshedPiClearErrorRecordFn {
    public operator fun invoke(plugincontext: MutPtr, flags: UInt, errorrecordid: ULong): Ntstatus
}

public typealias PshedPiClearErrorRecord = PshedPiClearErrorRecordFn?

public fun interface PshedPiClearErrorStatusFn {
    public operator fun invoke(plugincontext: MutPtr, errorsource: ConstPtr, bufferlength: UInt, errorrecord: ConstPtr): Ntstatus
}

public typealias PshedPiClearErrorStatus = PshedPiClearErrorStatusFn?

public fun interface PshedPiDisableErrorSourceFn {
    public operator fun invoke(plugincontext: MutPtr, errorsource: ConstPtr): Ntstatus
}

public typealias PshedPiDisableErrorSource = PshedPiDisableErrorSourceFn?

public fun interface PshedPiEnableErrorSourceFn {
    public operator fun invoke(plugincontext: MutPtr, errorsource: ConstPtr): Ntstatus
}

public typealias PshedPiEnableErrorSource = PshedPiEnableErrorSourceFn?

public typealias PshedPiErrReadingPcieOverrides = Int

public fun interface PshedPiFinalizeErrorRecordFn {
    public operator fun invoke(plugincontext: MutPtr, errorsource: ConstPtr, bufferlength: UInt, errorrecord: MutPtr): Ntstatus
}

public typealias PshedPiFinalizeErrorRecord = PshedPiFinalizeErrorRecordFn?

public fun interface PshedPiGetAllErrorSourcesFn {
    public operator fun invoke(plugincontext: MutPtr, count: MutPtr, errorsrcs: MutPtr, length: MutPtr): Ntstatus
}

public typealias PshedPiGetAllErrorSources = PshedPiGetAllErrorSourcesFn?

public fun interface PshedPiGetErrorSourceInfoFn {
    public operator fun invoke(plugincontext: MutPtr, errorsource: MutPtr): Ntstatus
}

public typealias PshedPiGetErrorSourceInfo = PshedPiGetErrorSourceInfoFn?

public fun interface PshedPiGetInjectionCapabilitiesFn {
    public operator fun invoke(plugincontext: MutPtr, capabilities: MutPtr): Ntstatus
}

public typealias PshedPiGetInjectionCapabilities = PshedPiGetInjectionCapabilitiesFn?

public fun interface PshedPiInjectErrorFn {
    public operator fun invoke(plugincontext: MutPtr, errortype: ULong, parameter1: ULong, parameter2: ULong, parameter3: ULong, parameter4: ULong): Ntstatus
}

public typealias PshedPiInjectError = PshedPiInjectErrorFn?

public fun interface PshedPiReadErrorRecordFn {
    public operator fun invoke(plugincontext: MutPtr, flags: UInt, errorrecordid: ULong, nexterrorrecordid: MutPtr, recordlength: MutPtr, errorrecord: MutPtr): Ntstatus
}

public typealias PshedPiReadErrorRecord = PshedPiReadErrorRecordFn?

public fun interface PshedPiRetrieveErrorInfoFn {
    public operator fun invoke(plugincontext: MutPtr, errorsource: ConstPtr, bufferlength: ULong, packet: MutPtr): Ntstatus
}

public typealias PshedPiRetrieveErrorInfo = PshedPiRetrieveErrorInfoFn?

public fun interface PshedPiSetErrorSourceInfoFn {
    public operator fun invoke(plugincontext: MutPtr, errorsource: ConstPtr): Ntstatus
}

public typealias PshedPiSetErrorSourceInfo = PshedPiSetErrorSourceInfoFn?

public fun interface PshedPiWriteErrorRecordFn {
    public operator fun invoke(plugincontext: MutPtr, flags: UInt, recordlength: UInt, errorrecord: ConstPtr): Ntstatus
}

public typealias PshedPiWriteErrorRecord = PshedPiWriteErrorRecordFn?

public fun interface PtimerApcRoutineFn {
    public operator fun invoke(timercontext: ConstPtr, timerlowvalue: UInt, timerhighvalue: Int)
}

public typealias PtimerApcRoutine = PtimerApcRoutineFn?

public fun interface PtmDeviceDisableFn {
    public operator fun invoke(context: ConstPtr): Ntstatus
}

public typealias PtmDeviceDisable = PtmDeviceDisableFn?

public fun interface PtmDeviceEnableFn {
    public operator fun invoke(context: ConstPtr): Ntstatus
}

public typealias PtmDeviceEnable = PtmDeviceEnableFn?

public fun interface PtmDeviceQueryGranularityFn {
    public operator fun invoke(context: ConstPtr, granularity: MutPtr): Ntstatus
}

public typealias PtmDeviceQueryGranularity = PtmDeviceQueryGranularityFn?

public fun interface PtmDeviceQueryTimeSourceFn {
    public operator fun invoke(context: ConstPtr, timesource: MutPtr): Ntstatus
}

public typealias PtmDeviceQueryTimeSource = PtmDeviceQueryTimeSourceFn?

public fun interface PtmPropagateRoutineFn {
    public operator fun invoke(propagationcookie: ConstPtr, callbackdata: ConstPtr, propagationstatus: Ntstatus, transactionguid: Guid): Ntstatus
}

public typealias PtmPropagateRoutine = PtmPropagateRoutineFn?

public fun interface PtmRmNotificationFn {
    public operator fun invoke(enlistmentobject: ConstPtr, rmcontext: ConstPtr, transactioncontext: ConstPtr, transactionnotification: UInt, tmvirtualclock: MutPtr, argumentlength: UInt, argument: ConstPtr): Ntstatus
}

public typealias PtmRmNotification = PtmRmNotificationFn?

public fun interface PtranslateBusAddressFn {
    public operator fun invoke(): Boolean
}

public typealias PtranslateBusAddress = PtranslateBusAddressFn?

public fun interface PtranslateResourceHandlerFn {
    public operator fun invoke(context: MutPtr, source: ConstPtr, direction: ResourceTranslationDirection, alternativescount: UInt, alternatives: ConstPtr, physicaldeviceobject: ConstPtr, target: MutPtr): Ntstatus
}

public typealias PtranslateResourceHandler = PtranslateResourceHandlerFn?

public fun interface PtranslateResourceRequirementsHandlerFn {
    public operator fun invoke(context: MutPtr, source: ConstPtr, physicaldeviceobject: ConstPtr, targetcount: MutPtr, target: MutPtr): Ntstatus
}

public typealias PtranslateResourceRequirementsHandler = PtranslateResourceRequirementsHandlerFn?

public fun interface PunregisterForDeviceNotificationsFn {
    public operator fun invoke(param0: MutPtr, param1: PdeviceNotifyCallback)
}

public typealias PunregisterForDeviceNotifications = PunregisterForDeviceNotificationsFn?

public fun interface PunregisterForDeviceNotifications2Fn {
    public operator fun invoke(context: MutPtr)
}

public typealias PunregisterForDeviceNotifications2 = PunregisterForDeviceNotifications2Fn?

public fun interface PciLine2PinFn {
    public operator fun invoke(bushandler: ConstPtr, roothandler: ConstPtr, slotnumber: PciSlotNumber, pcinewdata: ConstPtr, pciolddata: ConstPtr)
}

public typealias PciLine2Pin = PciLine2PinFn?

public fun interface PciPin2LineFn {
    public operator fun invoke(bushandler: ConstPtr, roothandler: ConstPtr, slotnumber: PciSlotNumber, pcidata: ConstPtr)
}

public typealias PciPin2Line = PciPin2LineFn?

public typealias RegNotifyClass = Int

public fun interface RequestPowerCompleteFn {
    public operator fun invoke(deviceobject: ConstPtr, minorfunction: UByte, powerstate: PowerState, context: ConstPtr, iostatus: ConstPtr)
}

public typealias RequestPowerComplete = RequestPowerCompleteFn?

public typealias ResourceTranslationDirection = Int

public fun interface RtlAvlAllocateRoutineFn {
    public operator fun invoke(table: ConstPtr, bytesize: UInt): MutPtr
}

public typealias RtlAvlAllocateRoutine = RtlAvlAllocateRoutineFn?

public fun interface RtlAvlCompareRoutineFn {
    public operator fun invoke(table: ConstPtr, firststruct: ConstPtr, secondstruct: ConstPtr): RtlGenericCompareResults
}

public typealias RtlAvlCompareRoutine = RtlAvlCompareRoutineFn?

public fun interface RtlAvlFreeRoutineFn {
    public operator fun invoke(table: ConstPtr, buffer: ConstPtr)
}

public typealias RtlAvlFreeRoutine = RtlAvlFreeRoutineFn?

public fun interface RtlAvlMatchFunctionFn {
    public operator fun invoke(table: ConstPtr, userdata: ConstPtr, matchdata: ConstPtr): Ntstatus
}

public typealias RtlAvlMatchFunction = RtlAvlMatchFunctionFn?

public fun interface RtlGenericAllocateRoutineFn {
    public operator fun invoke(table: ConstPtr, bytesize: UInt): MutPtr
}

public typealias RtlGenericAllocateRoutine = RtlGenericAllocateRoutineFn?

public typealias RtlGenericCompareResults = Int

public fun interface RtlGenericCompareRoutineFn {
    public operator fun invoke(table: ConstPtr, firststruct: ConstPtr, secondstruct: ConstPtr): RtlGenericCompareResults
}

public typealias RtlGenericCompareRoutine = RtlGenericCompareRoutineFn?

public fun interface RtlGenericFreeRoutineFn {
    public operator fun invoke(table: ConstPtr, buffer: ConstPtr)
}

public typealias RtlGenericFreeRoutine = RtlGenericFreeRoutineFn?

public fun interface RtlQueryRegistryRoutineFn {
    public operator fun invoke(valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr, valuelength: UInt, context: ConstPtr, entrycontext: ConstPtr): Ntstatus
}

public typealias RtlQueryRegistryRoutine = RtlQueryRegistryRoutineFn?

public fun interface RtlRunOnceInitFnFn {
    public operator fun invoke(runonce: MutPtr, parameter: MutPtr, context: MutPtr): UInt
}

public typealias RtlRunOnceInitFn = RtlRunOnceInitFnFn?

public fun interface SecureDriverProcessDereferenceFn {
    public operator fun invoke(interfacecontext: ConstPtr, process: Peprocess)
}

public typealias SecureDriverProcessDereference = SecureDriverProcessDereferenceFn?

public fun interface SecureDriverProcessReferenceFn {
    public operator fun invoke(interfacecontext: ConstPtr): Peprocess
}

public typealias SecureDriverProcessReference = SecureDriverProcessReferenceFn?

public typealias SecurityContextTrackingMode = UByte

public typealias SecurityOperationCode = Int

public fun interface SetD3coldSupportFn {
    public operator fun invoke(context: ConstPtr, d3coldsupport: Boolean)
}

public typealias SetD3coldSupport = SetD3coldSupportFn?

public fun interface SetVirtualDeviceDataFn {
    public operator fun invoke(context: MutPtr, virtualfunction: UShort, buffer: ConstPtr, offset: UInt, length: UInt): UInt
}

public typealias SetVirtualDeviceData = SetVirtualDeviceDataFn?

public typealias SeImageType = Int

public fun interface SeImageVerificationCallbackFunctionFn {
    public operator fun invoke(callbackcontext: ConstPtr, imagetype: SeImageType, imageinformation: MutPtr)
}

public typealias SeImageVerificationCallbackFunction = SeImageVerificationCallbackFunctionFn?

public typealias SeImageVerificationCallbackType = Int

public fun interface SiloContextCleanupCallbackFn {
    public operator fun invoke(silocontext: ConstPtr)
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
    public operator fun invoke(context: MutPtr, busaddress: Long, length: UInt, addressspace: MutPtr, translatedaddress: MutPtr): Boolean
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
    public operator fun invoke(parameter: ConstPtr)
}

public typealias WorkerThreadRoutine = WorkerThreadRoutineFn?

public typealias WorkQueueType = Int

public fun interface PHalAssignSlotResourcesFn {
    public operator fun invoke(registrypath: ConstPtr, driverclassname: ConstPtr, driverobject: ConstPtr, deviceobject: ConstPtr, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: MutPtr): Ntstatus
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
    public operator fun invoke(deviceobject: ConstPtr, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: MutPtr)
}

public typealias PHalExamineMbr = PHalExamineMbrFn?

public fun interface PHalFindBusAddressTranslationFn {
    public operator fun invoke(busaddress: Long, addressspace: MutPtr, translatedaddress: MutPtr, context: MutPtr, nextbus: Boolean): Boolean
}

public typealias PHalFindBusAddressTranslation = PHalFindBusAddressTranslationFn?

public fun interface PHalGetAcpiTableFn {
    public operator fun invoke(signature: UInt, oemid: Pcstr, oemtableid: Pcstr): MutPtr
}

public typealias PHalGetAcpiTable = PHalGetAcpiTableFn?

public fun interface PHalGetDmaAdapterFn {
    public operator fun invoke(physicaldeviceobject: ConstPtr, devicedescriptor: ConstPtr, numberofmapregisters: MutPtr): MutPtr
}

public typealias PHalGetDmaAdapter = PHalGetDmaAdapterFn?

public fun interface PHalGetInterruptTranslatorFn {
    public operator fun invoke(parentinterfacetype: InterfaceType, parentbusnumber: UInt, bridgeinterfacetype: InterfaceType, size: UShort, version: UShort, translator: MutPtr, bridgebusnumber: MutPtr): Ntstatus
}

public typealias PHalGetInterruptTranslator = PHalGetInterruptTranslatorFn?

public fun interface PHalGetPrmCacheFn {
    public operator fun invoke(firmwarelist: MutPtr, updatelist: MutPtr)
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
    public operator fun invoke(pmdriverdispatchtable: ConstPtr, pmhaldispatchtable: MutPtr): Ntstatus
}

public typealias PHalInitPowerManagement = PHalInitPowerManagementFn?

public fun interface PHalIoReadPartitionTableFn {
    public operator fun invoke(deviceobject: ConstPtr, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: MutPtr): Ntstatus
}

public typealias PHalIoReadPartitionTable = PHalIoReadPartitionTableFn?

public fun interface PHalIoSetPartitionInformationFn {
    public operator fun invoke(deviceobject: ConstPtr, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus
}

public typealias PHalIoSetPartitionInformation = PHalIoSetPartitionInformationFn?

public fun interface PHalIoWritePartitionTableFn {
    public operator fun invoke(deviceobject: ConstPtr, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: ConstPtr): Ntstatus
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
    public operator fun invoke(bushandler: PbusHandler, buffersize: UInt, slotnumbers: MutPtr, returnedlength: MutPtr): Ntstatus
}

public typealias PHalQueryBusSlots = PHalQueryBusSlotsFn?

public fun interface PHalQuerySystemInformationFn {
    public operator fun invoke(informationclass: HalQueryInformationClass, buffersize: UInt, buffer: MutPtr, returnedlength: MutPtr): Ntstatus
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
    public operator fun invoke(informationclass: HalSetInformationClass, buffersize: UInt, buffer: ConstPtr): Ntstatus
}

public typealias PHalSetSystemInformation = PHalSetSystemInformationFn?

public fun interface PHalStartMirroringFn {
    public operator fun invoke(): Ntstatus
}

public typealias PHalStartMirroring = PHalStartMirroringFn?

public fun interface PHalTranslateBusAddressFn {
    public operator fun invoke(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr, translatedaddress: MutPtr): Boolean
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
    public operator fun invoke(loaderblock: ConstPtr, device: MutPtr, callback: PdebugDeviceFoundFunction): Ntstatus
}

public typealias PKdEnumerateDebuggingDevices = PKdEnumerateDebuggingDevicesFn?

public fun interface PKdGetAcpiTablePhase0Fn {
    public operator fun invoke(loaderblock: ConstPtr, signature: UInt): MutPtr
}

public typealias PKdGetAcpiTablePhase0 = PKdGetAcpiTablePhase0Fn?

public fun interface PKdGetPciDataByOffsetFn {
    public operator fun invoke(busnumber: UInt, slotnumber: UInt, buffer: MutPtr, offset: UInt, length: UInt): UInt
}

public typealias PKdGetPciDataByOffset = PKdGetPciDataByOffsetFn?

public fun interface PKdMapPhysicalMemory64Fn {
    public operator fun invoke(physicaladdress: Long, numberpages: UInt, flushcurrenttlb: Boolean): MutPtr
}

public typealias PKdMapPhysicalMemory64 = PKdMapPhysicalMemory64Fn?

public fun interface PKdReleaseIntegratedDeviceForDebuggingFn {
    public operator fun invoke(integrateddevice: MutPtr): Ntstatus
}

public typealias PKdReleaseIntegratedDeviceForDebugging = PKdReleaseIntegratedDeviceForDebuggingFn?

public fun interface PKdReleasePciDeviceForDebuggingFn {
    public operator fun invoke(pcidevice: MutPtr): Ntstatus
}

public typealias PKdReleasePciDeviceForDebugging = PKdReleasePciDeviceForDebuggingFn?

public fun interface PKdSetPciDataByOffsetFn {
    public operator fun invoke(busnumber: UInt, slotnumber: UInt, buffer: ConstPtr, offset: UInt, length: UInt): UInt
}

public typealias PKdSetPciDataByOffset = PKdSetPciDataByOffsetFn?

public fun interface PKdSetupIntegratedDeviceForDebuggingFn {
    public operator fun invoke(loaderblock: ConstPtr, integrateddevice: MutPtr): Ntstatus
}

public typealias PKdSetupIntegratedDeviceForDebugging = PKdSetupIntegratedDeviceForDebuggingFn?

public fun interface PKdSetupPciDeviceForDebuggingFn {
    public operator fun invoke(loaderblock: ConstPtr, pcidevice: MutPtr): Ntstatus
}

public typealias PKdSetupPciDeviceForDebugging = PKdSetupPciDeviceForDebuggingFn?

public fun interface PKdUnmapVirtualAddressFn {
    public operator fun invoke(virtualaddress: ConstPtr, numberpages: UInt, flushcurrenttlb: Boolean)
}

public typealias PKdUnmapVirtualAddress = PKdUnmapVirtualAddressFn?
