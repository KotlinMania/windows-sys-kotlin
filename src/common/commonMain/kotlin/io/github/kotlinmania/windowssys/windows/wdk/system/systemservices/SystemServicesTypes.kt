package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CONTROL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PBUS_HANDLER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_TIMER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_WORKITEM
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.power.SYSTEM_POWER_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTION_INFORMATION_CLASS

public fun interface ALLOCATE_FUNCTIONFn {
    public operator fun invoke(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long
}

public typealias ALLOCATE_FUNCTION = ALLOCATE_FUNCTIONFn?

public typealias ALTERNATIVE_ARCHITECTURE_TYPE = Int

public typealias ARBITER_ACTION = Int

public typealias ARBITER_REQUEST_SOURCE = Int

public typealias ARBITER_RESULT = Int

public typealias BDCB_CALLBACK_TYPE = Int

public typealias BDCB_CLASSIFICATION = Int

public typealias BDCB_STATUS_UPDATE_TYPE = Int

public fun interface BOOT_DRIVER_CALLBACK_FUNCTIONFn {
    public operator fun invoke(callbackcontext: Long, classification: BDCB_CALLBACK_TYPE, imageinformation: Long)
}

public typealias BOOT_DRIVER_CALLBACK_FUNCTION = BOOT_DRIVER_CALLBACK_FUNCTIONFn?

public fun interface BOUND_CALLBACKFn {
    public operator fun invoke(): BOUND_CALLBACK_STATUS
}

public typealias BOUND_CALLBACK = BOUND_CALLBACKFn?

public typealias BOUND_CALLBACK_STATUS = Int

public typealias BUS_DATA_TYPE = Int

public typealias BUS_QUERY_ID_TYPE = Int

public typealias CM_SHARE_DISPOSITION = Int

public typealias CONFIGURATION_TYPE = Int

public typealias CREATE_FILE_TYPE = Int

public typealias D3COLD_LAST_TRANSITION_STATUS = Int

public fun interface D3COLD_REQUEST_AUX_POWERFn {
    public operator fun invoke(context: Long, auxpowerinmilliwatts: UInt, retryinseconds: Long): NTSTATUS
}

public typealias D3COLD_REQUEST_AUX_POWER = D3COLD_REQUEST_AUX_POWERFn?

public fun interface D3COLD_REQUEST_CORE_POWER_RAILFn {
    public operator fun invoke(context: Long, corepowerrailneeded: Boolean)
}

public typealias D3COLD_REQUEST_CORE_POWER_RAIL = D3COLD_REQUEST_CORE_POWER_RAILFn?

public fun interface D3COLD_REQUEST_PERST_DELAYFn {
    public operator fun invoke(context: Long, delayinmicroseconds: UInt): NTSTATUS
}

public typealias D3COLD_REQUEST_PERST_DELAY = D3COLD_REQUEST_PERST_DELAYFn?

public fun interface DEVICE_BUS_SPECIFIC_RESET_HANDLERFn {
    public operator fun invoke(interfacecontext: Long, bustype: Long, resettypeselected: DEVICE_BUS_SPECIFIC_RESET_TYPE, flags: Long, resetparameters: Long): NTSTATUS
}

public typealias DEVICE_BUS_SPECIFIC_RESET_HANDLER = DEVICE_BUS_SPECIFIC_RESET_HANDLERFn?

public fun interface DEVICE_CHANGE_COMPLETE_CALLBACKFn {
    public operator fun invoke(context: Long)
}

public typealias DEVICE_CHANGE_COMPLETE_CALLBACK = DEVICE_CHANGE_COMPLETE_CALLBACKFn?

public typealias DEVICE_DIRECTORY_TYPE = Int

public typealias DEVICE_INSTALL_STATE = Int

public fun interface DEVICE_QUERY_BUS_SPECIFIC_RESET_HANDLERFn {
    public operator fun invoke(interfacecontext: Long, resetinfocount: Long, resetinfosupported: Long): NTSTATUS
}

public typealias DEVICE_QUERY_BUS_SPECIFIC_RESET_HANDLER = DEVICE_QUERY_BUS_SPECIFIC_RESET_HANDLERFn?

public typealias DEVICE_REGISTRY_PROPERTY = Int

public typealias DEVICE_RELATION_TYPE = Int

public typealias DEVICE_REMOVAL_POLICY = Int

public fun interface DEVICE_RESET_COMPLETIONFn {
    public operator fun invoke(status: NTSTATUS, context: Long)
}

public typealias DEVICE_RESET_COMPLETION = DEVICE_RESET_COMPLETIONFn?

public fun interface DEVICE_RESET_HANDLERFn {
    public operator fun invoke(interfacecontext: Long, resettype: DEVICE_RESET_TYPE, flags: UInt, resetparameters: Long): NTSTATUS
}

public typealias DEVICE_RESET_HANDLER = DEVICE_RESET_HANDLERFn?

public typealias DEVICE_RESET_TYPE = Int

public typealias DEVICE_TEXT_TYPE = Int

public typealias DEVICE_USAGE_NOTIFICATION_TYPE = Int

public typealias DEVICE_WAKE_DEPTH = Int

public typealias DIRECTORY_NOTIFY_INFORMATION_CLASS = Int

public typealias DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_ACCESS_TYPE = Int

public typealias DMA_COMMON_BUFFER_EXTENDED_CONFIGURATION_TYPE = Int

public fun interface DMA_COMPLETION_ROUTINEFn {
    public operator fun invoke(dmaadapter: Long, deviceobject: Long, completioncontext: Long, status: DMA_COMPLETION_STATUS)
}

public typealias DMA_COMPLETION_ROUTINE = DMA_COMPLETION_ROUTINEFn?

public typealias DMA_COMPLETION_STATUS = Int

public typealias DMA_SPEED = Int

public typealias DMA_WIDTH = Int

public typealias DOMAIN_CONFIGURATION_ARCH = Int

public typealias DRIVER_DIRECTORY_TYPE = Int

public fun interface DRIVER_LIST_CONTROLFn {
    public operator fun invoke(deviceobject: Long, irp: Long, scattergather: Long, context: Long)
}

public typealias DRIVER_LIST_CONTROL = DRIVER_LIST_CONTROLFn?

public typealias DRIVER_REGKEY_TYPE = Int

public typealias DRIVER_RUNTIME_INIT_FLAGS = Int

public fun interface ENABLE_VIRTUALIZATIONFn {
    public operator fun invoke(context: Long, numvfs: UShort, enablevfmigration: Boolean, enablemigrationinterrupt: Boolean, enablevirtualization: Boolean): NTSTATUS
}

public typealias ENABLE_VIRTUALIZATION = ENABLE_VIRTUALIZATIONFn?

public fun interface ETWENABLECALLBACKFn {
    public operator fun invoke(sourceid: Long, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, filterdata: Long, callbackcontext: Long)
}

public typealias ETWENABLECALLBACK = ETWENABLECALLBACKFn?

public fun interface EXPAND_STACK_CALLOUTFn {
    public operator fun invoke(parameter: Long)
}

public typealias EXPAND_STACK_CALLOUT = EXPAND_STACK_CALLOUTFn?

public typealias EXTENDED_AGP_REGISTER = Int

public fun interface EXT_CALLBACKFn {
    public operator fun invoke(timer: PEX_TIMER, context: Long)
}

public typealias EXT_CALLBACK = EXT_CALLBACKFn?

public fun interface EXT_DELETE_CALLBACKFn {
    public operator fun invoke(context: Long)
}

public typealias EXT_DELETE_CALLBACK = EXT_DELETE_CALLBACKFn?

public fun interface EX_CALLBACK_FUNCTIONFn {
    public operator fun invoke(callbackcontext: Long, argument1: Long, argument2: Long): NTSTATUS
}

public typealias EX_CALLBACK_FUNCTION = EX_CALLBACK_FUNCTIONFn?

public typealias EX_POOL_PRIORITY = Int

public typealias FAULT_INFORMATION_ARCH = Int

public typealias FAULT_INFORMATION_ARM64_TYPE = Int

public fun interface FPGA_BUS_SCANFn {
    public operator fun invoke(context: Long)
}

public typealias FPGA_BUS_SCAN = FPGA_BUS_SCANFn?

public fun interface FPGA_CONTROL_CONFIG_SPACEFn {
    public operator fun invoke(context: Long, enable: Boolean): NTSTATUS
}

public typealias FPGA_CONTROL_CONFIG_SPACE = FPGA_CONTROL_CONFIG_SPACEFn?

public fun interface FPGA_CONTROL_ERROR_REPORTINGFn {
    public operator fun invoke(context: Long, uncorrectablemask: UInt, correctablemask: UInt, disableerrorreporting: Boolean): NTSTATUS
}

public typealias FPGA_CONTROL_ERROR_REPORTING = FPGA_CONTROL_ERROR_REPORTINGFn?

public fun interface FPGA_CONTROL_LINKFn {
    public operator fun invoke(context: Long, enable: Boolean): NTSTATUS
}

public typealias FPGA_CONTROL_LINK = FPGA_CONTROL_LINKFn?

public fun interface FREE_FUNCTIONFn {
    public operator fun invoke(buffer: Long)
}

public typealias FREE_FUNCTION = FREE_FUNCTIONFn?

public fun interface FWMI_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(wnode: Long, context: Long)
}

public typealias FWMI_NOTIFICATION_CALLBACK = FWMI_NOTIFICATION_CALLBACKFn?

public fun interface GET_D3COLD_CAPABILITYFn {
    public operator fun invoke(context: Long, d3coldsupported: Long): NTSTATUS
}

public typealias GET_D3COLD_CAPABILITY = GET_D3COLD_CAPABILITYFn?

public fun interface GET_D3COLD_LAST_TRANSITION_STATUSFn {
    public operator fun invoke(context: Long, lasttransitionstatus: Long)
}

public typealias GET_D3COLD_LAST_TRANSITION_STATUS = GET_D3COLD_LAST_TRANSITION_STATUSFn?

public fun interface GET_DEVICE_RESET_STATUSFn {
    public operator fun invoke(interfacecontext: Long, isresetting: Long, resettypeselected: Long, flags: Long): NTSTATUS
}

public typealias GET_DEVICE_RESET_STATUS = GET_DEVICE_RESET_STATUSFn?

public fun interface GET_DMA_ADAPTERFn {
    public operator fun invoke(context: Long, devicedescriptor: Long, numberofmapregisters: Long): Long
}

public typealias GET_DMA_ADAPTER = GET_DMA_ADAPTERFn?

public fun interface GET_IDLE_WAKE_INFOFn {
    public operator fun invoke(context: Long, systempowerstate: SYSTEM_POWER_STATE, deepestwakeabledstate: Long): NTSTATUS
}

public typealias GET_IDLE_WAKE_INFO = GET_IDLE_WAKE_INFOFn?

public fun interface GET_SDEV_IDENTIFIERFn {
    public operator fun invoke(interfacecontext: Long): ULong
}

public typealias GET_SDEV_IDENTIFIER = GET_SDEV_IDENTIFIERFn?

public fun interface GET_SET_DEVICE_DATAFn {
    public operator fun invoke(context: Long, datatype: UInt, buffer: Long, offset: UInt, length: UInt): UInt
}

public typealias GET_SET_DEVICE_DATA = GET_SET_DEVICE_DATAFn?

public fun interface GET_UPDATED_BUS_RESOURCEFn {
    public operator fun invoke(context: Long, updatedresourcelist: Long, updatedtranslatedresourcelist: Long): NTSTATUS
}

public typealias GET_UPDATED_BUS_RESOURCE = GET_UPDATED_BUS_RESOURCEFn?

public fun interface GET_VIRTUAL_DEVICE_DATAFn {
    public operator fun invoke(context: Long, virtualfunction: UShort, buffer: Long, offset: UInt, length: UInt): UInt
}

public typealias GET_VIRTUAL_DEVICE_DATA = GET_VIRTUAL_DEVICE_DATAFn?

public fun interface GET_VIRTUAL_DEVICE_LOCATIONFn {
    public operator fun invoke(context: Long, virtualfunction: UShort, segmentnumber: Long, busnumber: Long, functionnumber: Long): NTSTATUS
}

public typealias GET_VIRTUAL_DEVICE_LOCATION = GET_VIRTUAL_DEVICE_LOCATIONFn?

public fun interface GET_VIRTUAL_DEVICE_RESOURCESFn {
    public operator fun invoke(context: Long, capturedbusnumbers: Long)
}

public typealias GET_VIRTUAL_DEVICE_RESOURCES = GET_VIRTUAL_DEVICE_RESOURCESFn?

public fun interface GET_VIRTUAL_FUNCTION_PROBED_BARSFn {
    public operator fun invoke(context: Long, baseregistervalues: Long): NTSTATUS
}

public typealias GET_VIRTUAL_FUNCTION_PROBED_BARS = GET_VIRTUAL_FUNCTION_PROBED_BARSFn?

public typealias HAL_APIC_DESTINATION_MODE = Int

public typealias HAL_DISPLAY_BIOS_INFORMATION = Int

public typealias HAL_DMA_CRASH_DUMP_REGISTER_TYPE = Int

public typealias HAL_QUERY_INFORMATION_CLASS = Int

public typealias HAL_SET_INFORMATION_CLASS = Int

public typealias HARDWARE_COUNTER_TYPE = Int

public fun interface HVL_WHEA_ERROR_NOTIFICATIONFn {
    public operator fun invoke(recoverycontext: Long, platformdirected: Boolean, poisoned: Boolean): NTSTATUS
}

public typealias HVL_WHEA_ERROR_NOTIFICATION = HVL_WHEA_ERROR_NOTIFICATIONFn?

public typealias INTEL_CACHE_TYPE = Int

public typealias INTERFACE_TYPE = Int

public typealias INTERLOCKED_RESULT = Int

public fun interface IOMMU_DEVICE_CREATEFn {
    public operator fun invoke(deviceobject: Long, deviceconfig: Long, dmadeviceout: Long): NTSTATUS
}

public typealias IOMMU_DEVICE_CREATE = IOMMU_DEVICE_CREATEFn?

public typealias IOMMU_DEVICE_CREATION_CONFIGURATION_TYPE = Int

public fun interface IOMMU_DEVICE_DELETEFn {
    public operator fun invoke(dmadevice: Long): NTSTATUS
}

public typealias IOMMU_DEVICE_DELETE = IOMMU_DEVICE_DELETEFn?

public fun interface IOMMU_DEVICE_FAULT_HANDLERFn {
    public operator fun invoke(context: Long, faultinformation: Long)
}

public typealias IOMMU_DEVICE_FAULT_HANDLER = IOMMU_DEVICE_FAULT_HANDLERFn?

public fun interface IOMMU_DEVICE_QUERY_DOMAIN_TYPESFn {
    public operator fun invoke(dmadevice: Long, availabledomains: Long)
}

public typealias IOMMU_DEVICE_QUERY_DOMAIN_TYPES = IOMMU_DEVICE_QUERY_DOMAIN_TYPESFn?

public typealias IOMMU_DMA_DOMAIN_TYPE = Int

public typealias IOMMU_DMA_LOGICAL_ALLOCATOR_TYPE = Int

public fun interface IOMMU_DOMAIN_ATTACH_DEVICEFn {
    public operator fun invoke(domain: Long, physicaldeviceobject: Long, inputmappingidbase: UInt, mappingcount: UInt): NTSTATUS
}

public typealias IOMMU_DOMAIN_ATTACH_DEVICE = IOMMU_DOMAIN_ATTACH_DEVICEFn?

public fun interface IOMMU_DOMAIN_ATTACH_DEVICE_EXFn {
    public operator fun invoke(domain: Long, dmadevice: Long): NTSTATUS
}

public typealias IOMMU_DOMAIN_ATTACH_DEVICE_EX = IOMMU_DOMAIN_ATTACH_DEVICE_EXFn?

public fun interface IOMMU_DOMAIN_CONFIGUREFn {
    public operator fun invoke(domain: Long, configuration: Long): NTSTATUS
}

public typealias IOMMU_DOMAIN_CONFIGURE = IOMMU_DOMAIN_CONFIGUREFn?

public fun interface IOMMU_DOMAIN_CREATEFn {
    public operator fun invoke(osmanagedpagetable: Boolean, domainout: Long): NTSTATUS
}

public typealias IOMMU_DOMAIN_CREATE = IOMMU_DOMAIN_CREATEFn?

public fun interface IOMMU_DOMAIN_CREATE_EXFn {
    public operator fun invoke(domaintype: IOMMU_DMA_DOMAIN_TYPE, flags: IOMMU_DMA_DOMAIN_CREATION_FLAGS, logicalallocatorconfig: Long, reservedregions: Long, domainout: Long): NTSTATUS
}

public typealias IOMMU_DOMAIN_CREATE_EX = IOMMU_DOMAIN_CREATE_EXFn?

public fun interface IOMMU_DOMAIN_DELETEFn {
    public operator fun invoke(domain: Long): NTSTATUS
}

public typealias IOMMU_DOMAIN_DELETE = IOMMU_DOMAIN_DELETEFn?

public fun interface IOMMU_DOMAIN_DETACH_DEVICEFn {
    public operator fun invoke(domain: Long, physicaldeviceobject: Long, inputmappingid: UInt): NTSTATUS
}

public typealias IOMMU_DOMAIN_DETACH_DEVICE = IOMMU_DOMAIN_DETACH_DEVICEFn?

public fun interface IOMMU_DOMAIN_DETACH_DEVICE_EXFn {
    public operator fun invoke(dmadevice: Long): NTSTATUS
}

public typealias IOMMU_DOMAIN_DETACH_DEVICE_EX = IOMMU_DOMAIN_DETACH_DEVICE_EXFn?

public fun interface IOMMU_FLUSH_DOMAINFn {
    public operator fun invoke(domain: Long): NTSTATUS
}

public typealias IOMMU_FLUSH_DOMAIN = IOMMU_FLUSH_DOMAINFn?

public fun interface IOMMU_FLUSH_DOMAIN_VA_LISTFn {
    public operator fun invoke(domain: Long, lastlevel: Boolean, number: UInt, valist: Long): NTSTATUS
}

public typealias IOMMU_FLUSH_DOMAIN_VA_LIST = IOMMU_FLUSH_DOMAIN_VA_LISTFn?

public fun interface IOMMU_FREE_RESERVED_LOGICAL_ADDRESS_RANGEFn {
    public operator fun invoke(logicaladdresstoken: Long): NTSTATUS
}

public typealias IOMMU_FREE_RESERVED_LOGICAL_ADDRESS_RANGE = IOMMU_FREE_RESERVED_LOGICAL_ADDRESS_RANGEFn?

public fun interface IOMMU_INTERFACE_STATE_CHANGE_CALLBACKFn {
    public operator fun invoke(statechange: Long, context: Long)
}

public typealias IOMMU_INTERFACE_STATE_CHANGE_CALLBACK = IOMMU_INTERFACE_STATE_CHANGE_CALLBACKFn?

public fun interface IOMMU_MAP_IDENTITY_RANGEFn {
    public operator fun invoke(domain: Long, permissions: UInt, mdl: Long): NTSTATUS
}

public typealias IOMMU_MAP_IDENTITY_RANGE = IOMMU_MAP_IDENTITY_RANGEFn?

public fun interface IOMMU_MAP_IDENTITY_RANGE_EXFn {
    public operator fun invoke(domain: Long, permissions: UInt, physicaladdresstomap: Long): NTSTATUS
}

public typealias IOMMU_MAP_IDENTITY_RANGE_EX = IOMMU_MAP_IDENTITY_RANGE_EXFn?

public fun interface IOMMU_MAP_LOGICAL_RANGEFn {
    public operator fun invoke(domain: Long, permissions: UInt, mdl: Long, logicaladdress: ULong): NTSTATUS
}

public typealias IOMMU_MAP_LOGICAL_RANGE = IOMMU_MAP_LOGICAL_RANGEFn?

public fun interface IOMMU_MAP_LOGICAL_RANGE_EXFn {
    public operator fun invoke(domain: Long, permissions: UInt, physicaladdresstomap: Long, explicitlogicaladdress: Long, minlogicaladdress: Long, maxlogicaladdress: Long, logicaladdressout: Long): NTSTATUS
}

public typealias IOMMU_MAP_LOGICAL_RANGE_EX = IOMMU_MAP_LOGICAL_RANGE_EXFn?

public typealias IOMMU_MAP_PHYSICAL_ADDRESS_TYPE = Int

public fun interface IOMMU_MAP_RESERVED_LOGICAL_RANGEFn {
    public operator fun invoke(logicaladdresstoken: Long, offset: ULong, permissions: UInt, physicaladdresstomap: Long, mappedsegment: Long): NTSTATUS
}

public typealias IOMMU_MAP_RESERVED_LOGICAL_RANGE = IOMMU_MAP_RESERVED_LOGICAL_RANGEFn?

public fun interface IOMMU_QUERY_INPUT_MAPPINGSFn {
    public operator fun invoke(physicaldeviceobject: Long, buffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS
}

public typealias IOMMU_QUERY_INPUT_MAPPINGS = IOMMU_QUERY_INPUT_MAPPINGSFn?

public fun interface IOMMU_REGISTER_INTERFACE_STATE_CHANGE_CALLBACKFn {
    public operator fun invoke(statechangecallback: PIOMMU_INTERFACE_STATE_CHANGE_CALLBACK, context: Long, dmadevice: Long, statefields: Long): NTSTATUS
}

public typealias IOMMU_REGISTER_INTERFACE_STATE_CHANGE_CALLBACK = IOMMU_REGISTER_INTERFACE_STATE_CHANGE_CALLBACKFn?

public fun interface IOMMU_RESERVE_LOGICAL_ADDRESS_RANGEFn {
    public operator fun invoke(domain: Long, size: ULong, explicitlogicaladdress: Long, minlogicaladdress: Long, maxlogicaladdress: Long, logicaladdresstoken: Long): NTSTATUS
}

public typealias IOMMU_RESERVE_LOGICAL_ADDRESS_RANGE = IOMMU_RESERVE_LOGICAL_ADDRESS_RANGEFn?

public fun interface IOMMU_SET_DEVICE_FAULT_REPORTINGFn {
    public operator fun invoke(physicaldeviceobject: Long, inputmappingidbase: UInt, enable: Boolean, faultconfig: Long): NTSTATUS
}

public typealias IOMMU_SET_DEVICE_FAULT_REPORTING = IOMMU_SET_DEVICE_FAULT_REPORTINGFn?

public fun interface IOMMU_SET_DEVICE_FAULT_REPORTING_EXFn {
    public operator fun invoke(dmadevice: Long, inputmappingidbase: UInt, enable: Boolean, faultconfig: Long): NTSTATUS
}

public typealias IOMMU_SET_DEVICE_FAULT_REPORTING_EX = IOMMU_SET_DEVICE_FAULT_REPORTING_EXFn?

public fun interface IOMMU_UNMAP_IDENTITY_RANGEFn {
    public operator fun invoke(domain: Long, mdl: Long): NTSTATUS
}

public typealias IOMMU_UNMAP_IDENTITY_RANGE = IOMMU_UNMAP_IDENTITY_RANGEFn?

public fun interface IOMMU_UNMAP_IDENTITY_RANGE_EXFn {
    public operator fun invoke(domain: Long, mappedphysicaladdress: Long): NTSTATUS
}

public typealias IOMMU_UNMAP_IDENTITY_RANGE_EX = IOMMU_UNMAP_IDENTITY_RANGE_EXFn?

public fun interface IOMMU_UNMAP_LOGICAL_RANGEFn {
    public operator fun invoke(domain: Long, logicaladdress: ULong, numberofpages: ULong): NTSTATUS
}

public typealias IOMMU_UNMAP_LOGICAL_RANGE = IOMMU_UNMAP_LOGICAL_RANGEFn?

public fun interface IOMMU_UNMAP_RESERVED_LOGICAL_RANGEFn {
    public operator fun invoke(mappedsegment: Long): NTSTATUS
}

public typealias IOMMU_UNMAP_RESERVED_LOGICAL_RANGE = IOMMU_UNMAP_RESERVED_LOGICAL_RANGEFn?

public fun interface IOMMU_UNREGISTER_INTERFACE_STATE_CHANGE_CALLBACKFn {
    public operator fun invoke(statechangecallback: PIOMMU_INTERFACE_STATE_CHANGE_CALLBACK, dmadevice: Long): NTSTATUS
}

public typealias IOMMU_UNREGISTER_INTERFACE_STATE_CHANGE_CALLBACK = IOMMU_UNREGISTER_INTERFACE_STATE_CHANGE_CALLBACKFn?

public typealias IO_ACCESS_MODE = Int

public typealias IO_ACCESS_TYPE = Int

public typealias IO_ALLOCATION_ACTION = Int

public fun interface IO_COMPLETION_ROUTINEFn {
    public operator fun invoke(deviceobject: Long, irp: Long, context: Long): NTSTATUS
}

public typealias IO_COMPLETION_ROUTINE = IO_COMPLETION_ROUTINEFn?

public typealias IO_COMPLETION_ROUTINE_RESULT = Int

public typealias IO_CONTAINER_INFORMATION_CLASS = Int

public typealias IO_CONTAINER_NOTIFICATION_CLASS = Int

public fun interface IO_CSQ_ACQUIRE_LOCKFn {
    public operator fun invoke(csq: Long, irql: Long)
}

public typealias IO_CSQ_ACQUIRE_LOCK = IO_CSQ_ACQUIRE_LOCKFn?

public fun interface IO_CSQ_COMPLETE_CANCELED_IRPFn {
    public operator fun invoke(csq: Long, irp: Long)
}

public typealias IO_CSQ_COMPLETE_CANCELED_IRP = IO_CSQ_COMPLETE_CANCELED_IRPFn?

public fun interface IO_CSQ_INSERT_IRPFn {
    public operator fun invoke(csq: Long, irp: Long)
}

public typealias IO_CSQ_INSERT_IRP = IO_CSQ_INSERT_IRPFn?

public fun interface IO_CSQ_INSERT_IRP_EXFn {
    public operator fun invoke(csq: Long, irp: Long, insertcontext: Long): NTSTATUS
}

public typealias IO_CSQ_INSERT_IRP_EX = IO_CSQ_INSERT_IRP_EXFn?

public fun interface IO_CSQ_PEEK_NEXT_IRPFn {
    public operator fun invoke(csq: Long, irp: Long, peekcontext: Long): Long
}

public typealias IO_CSQ_PEEK_NEXT_IRP = IO_CSQ_PEEK_NEXT_IRPFn?

public fun interface IO_CSQ_RELEASE_LOCKFn {
    public operator fun invoke(csq: Long, irql: UByte)
}

public typealias IO_CSQ_RELEASE_LOCK = IO_CSQ_RELEASE_LOCKFn?

public fun interface IO_CSQ_REMOVE_IRPFn {
    public operator fun invoke(csq: Long, irp: Long)
}

public typealias IO_CSQ_REMOVE_IRP = IO_CSQ_REMOVE_IRPFn?

public fun interface IO_DPC_ROUTINEFn {
    public operator fun invoke(dpc: Long, deviceobject: Long, irp: Long, context: Long)
}

public typealias IO_DPC_ROUTINE = IO_DPC_ROUTINEFn?

public typealias IO_NOTIFICATION_EVENT_CATEGORY = Int

public typealias IO_PAGING_PRIORITY = Int

public fun interface IO_PERSISTED_MEMORY_ENUMERATION_CALLBACKFn {
    public operator fun invoke(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, context: Long): NTSTATUS
}

public typealias IO_PERSISTED_MEMORY_ENUMERATION_CALLBACK = IO_PERSISTED_MEMORY_ENUMERATION_CALLBACKFn?

public typealias IO_QUERY_DEVICE_DATA_FORMAT = Int

public typealias IO_SESSION_EVENT = Int

public fun interface IO_SESSION_NOTIFICATION_FUNCTIONFn {
    public operator fun invoke(sessionobject: Long, ioobject: Long, event: UInt, context: Long, notificationpayload: Long, payloadlength: UInt): NTSTATUS
}

public typealias IO_SESSION_NOTIFICATION_FUNCTION = IO_SESSION_NOTIFICATION_FUNCTIONFn?

public typealias IO_SESSION_STATE = Int

public fun interface IO_TIMER_ROUTINEFn {
    public operator fun invoke(deviceobject: Long, context: Long)
}

public typealias IO_TIMER_ROUTINE = IO_TIMER_ROUTINEFn?

public fun interface IO_WORKITEM_ROUTINEFn {
    public operator fun invoke(deviceobject: Long, context: Long)
}

public typealias IO_WORKITEM_ROUTINE = IO_WORKITEM_ROUTINEFn?

public fun interface IO_WORKITEM_ROUTINE_EXFn {
    public operator fun invoke(ioobject: Long, context: Long, ioworkitem: PIO_WORKITEM)
}

public typealias IO_WORKITEM_ROUTINE_EX = IO_WORKITEM_ROUTINE_EXFn?

public typealias IRQ_DEVICE_POLICY = Int

public typealias IRQ_GROUP_POLICY = Int

public typealias IRQ_PRIORITY = Int

public typealias KBUGCHECK_BUFFER_DUMP_STATE = Int

public typealias KBUGCHECK_CALLBACK_REASON = Int

public fun interface KBUGCHECK_CALLBACK_ROUTINEFn {
    public operator fun invoke(buffer: Long, length: UInt)
}

public typealias KBUGCHECK_CALLBACK_ROUTINE = KBUGCHECK_CALLBACK_ROUTINEFn?

public typealias KBUGCHECK_DUMP_IO_TYPE = Int

public fun interface KBUGCHECK_REASON_CALLBACK_ROUTINEFn {
    public operator fun invoke(reason: KBUGCHECK_CALLBACK_REASON, record: Long, reasonspecificdata: Long, reasonspecificdatalength: UInt)
}

public typealias KBUGCHECK_REASON_CALLBACK_ROUTINE = KBUGCHECK_REASON_CALLBACK_ROUTINEFn?

public fun interface KDEFERRED_ROUTINEFn {
    public operator fun invoke(dpc: Long, deferredcontext: Long, systemargument1: Long, systemargument2: Long)
}

public typealias KDEFERRED_ROUTINE = KDEFERRED_ROUTINEFn?

public typealias KDPC_IMPORTANCE = Int

public typealias KD_CALLBACK_ACTION = Int

public typealias KD_NAMESPACE_ENUM = Int

public typealias KD_OPTION = Int

public typealias KE_PROCESSOR_CHANGE_NOTIFY_STATE = Int

public typealias KINTERRUPT_MODE = Int

public typealias KINTERRUPT_POLARITY = Int

public fun interface KIPI_BROADCAST_WORKERFn {
    public operator fun invoke(argument: ULong): ULong
}

public typealias KIPI_BROADCAST_WORKER = KIPI_BROADCAST_WORKERFn?

public fun interface KMESSAGE_SERVICE_ROUTINEFn {
    public operator fun invoke(interrupt: Long, servicecontext: Long, messageid: UInt): Boolean
}

public typealias KMESSAGE_SERVICE_ROUTINE = KMESSAGE_SERVICE_ROUTINEFn?

public typealias KPROFILE_SOURCE = Int

public fun interface KSERVICE_ROUTINEFn {
    public operator fun invoke(interrupt: Long, servicecontext: Long): Boolean
}

public typealias KSERVICE_ROUTINE = KSERVICE_ROUTINEFn?

public fun interface KSTART_ROUTINEFn {
    public operator fun invoke(startcontext: Long)
}

public typealias KSTART_ROUTINE = KSTART_ROUTINEFn?

public fun interface KSYNCHRONIZE_ROUTINEFn {
    public operator fun invoke(synchronizecontext: Long): Boolean
}

public typealias KSYNCHRONIZE_ROUTINE = KSYNCHRONIZE_ROUTINEFn?

public typealias KWAIT_REASON = Int

public typealias LOCK_OPERATION = Int

public typealias MCA_EXCEPTION_TYPE = Int

public typealias MEMORY_CACHING_TYPE = Int

public typealias MEMORY_CACHING_TYPE_ORIG = Int

public typealias MEM_DEDICATED_ATTRIBUTE_TYPE = Int

public typealias MEM_SECTION_EXTENDED_PARAMETER_TYPE = Int

public typealias MM_MDL_PAGE_CONTENTS_STATE = Int

public fun interface MM_MDL_ROUTINEFn {
    public operator fun invoke(drivercontext: Long, mappedva: Long)
}

public typealias MM_MDL_ROUTINE = MM_MDL_ROUTINEFn?

public typealias MM_PAGE_PRIORITY = Int

public typealias MM_ROTATE_DIRECTION = Int

public typealias MM_SYSTEMSIZE = Int

public typealias MODE = Int

public fun interface NMI_CALLBACKFn {
    public operator fun invoke(context: Long, handled: Boolean): Boolean
}

public typealias NMI_CALLBACK = NMI_CALLBACKFn?

public fun interface NPEM_CONTROL_ENABLE_DISABLEFn {
    public operator fun invoke(context: Long, enablenpem: Boolean): NTSTATUS
}

public typealias NPEM_CONTROL_ENABLE_DISABLE = NPEM_CONTROL_ENABLE_DISABLEFn?

public fun interface NPEM_CONTROL_QUERY_CONTROLFn {
    public operator fun invoke(context: Long): UInt
}

public typealias NPEM_CONTROL_QUERY_CONTROL = NPEM_CONTROL_QUERY_CONTROLFn?

public fun interface NPEM_CONTROL_QUERY_STANDARD_CAPABILITIESFn {
    public operator fun invoke(context: Long, standardcapabilities: Long): NTSTATUS
}

public typealias NPEM_CONTROL_QUERY_STANDARD_CAPABILITIES = NPEM_CONTROL_QUERY_STANDARD_CAPABILITIESFn?

public fun interface NPEM_CONTROL_SET_STANDARD_CONTROLFn {
    public operator fun invoke(context: Long, standardcontrol: NPEM_CONTROL_STANDARD_CONTROL_BIT, set: Boolean): NTSTATUS
}

public typealias NPEM_CONTROL_SET_STANDARD_CONTROL = NPEM_CONTROL_SET_STANDARD_CONTROLFn?

public typealias NPEM_CONTROL_STANDARD_CONTROL_BIT = Int

public fun interface NTFS_DEREF_EXPORTED_SECURITY_DESCRIPTORFn {
    public operator fun invoke(vcb: Long, securitydescriptor: PSECURITY_DESCRIPTOR)
}

public typealias NTFS_DEREF_EXPORTED_SECURITY_DESCRIPTOR = NTFS_DEREF_EXPORTED_SECURITY_DESCRIPTORFn?

public typealias OB_PREOP_CALLBACK_STATUS = Int

public fun interface PALLOCATE_ADAPTER_CHANNELFn {
    public operator fun invoke(dmaadapter: Long, deviceobject: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL, context: Long): NTSTATUS
}

public typealias PALLOCATE_ADAPTER_CHANNEL = PALLOCATE_ADAPTER_CHANNELFn?

public fun interface PALLOCATE_ADAPTER_CHANNEL_EXFn {
    public operator fun invoke(dmaadapter: Long, deviceobject: Long, dmatransfercontext: Long, numberofmapregisters: UInt, flags: UInt, executionroutine: DRIVER_CONTROL, executioncontext: Long, mapregisterbase: Long): NTSTATUS
}

public typealias PALLOCATE_ADAPTER_CHANNEL_EX = PALLOCATE_ADAPTER_CHANNEL_EXFn?

public fun interface PALLOCATE_COMMON_BUFFERFn {
    public operator fun invoke(dmaadapter: Long, length: UInt, logicaladdress: Long, cacheenabled: Boolean): Long
}

public typealias PALLOCATE_COMMON_BUFFER = PALLOCATE_COMMON_BUFFERFn?

public fun interface PALLOCATE_COMMON_BUFFER_EXFn {
    public operator fun invoke(dmaadapter: Long, maximumaddress: Long, length: UInt, logicaladdress: Long, cacheenabled: Boolean, preferrednode: UInt): Long
}

public typealias PALLOCATE_COMMON_BUFFER_EX = PALLOCATE_COMMON_BUFFER_EXFn?

public fun interface PALLOCATE_COMMON_BUFFER_VECTORFn {
    public operator fun invoke(dmaadapter: Long, lowaddress: Long, highaddress: Long, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt, numberofelements: UInt, sizeofelements: ULong, vectorout: Long): NTSTATUS
}

public typealias PALLOCATE_COMMON_BUFFER_VECTOR = PALLOCATE_COMMON_BUFFER_VECTORFn?

public fun interface PALLOCATE_COMMON_BUFFER_WITH_BOUNDSFn {
    public operator fun invoke(dmaadapter: Long, minimumaddress: Long, maximumaddress: Long, length: UInt, flags: UInt, cachetype: Long, preferrednode: UInt, logicaladdress: Long): Long
}

public typealias PALLOCATE_COMMON_BUFFER_WITH_BOUNDS = PALLOCATE_COMMON_BUFFER_WITH_BOUNDSFn?

public fun interface PALLOCATE_DOMAIN_COMMON_BUFFERFn {
    public operator fun invoke(dmaadapter: Long, domainhandle: HANDLE, maximumaddress: Long, length: UInt, flags: UInt, cachetype: Long, preferrednode: UInt, logicaladdress: Long, virtualaddress: Long): NTSTATUS
}

public typealias PALLOCATE_DOMAIN_COMMON_BUFFER = PALLOCATE_DOMAIN_COMMON_BUFFERFn?

public fun interface PALLOCATE_FUNCTIONFn {
    public operator fun invoke(): Long
}

public typealias PALLOCATE_FUNCTION = PALLOCATE_FUNCTIONFn?

public fun interface PALLOCATE_FUNCTION_EXFn {
    public operator fun invoke(): Long
}

public typealias PALLOCATE_FUNCTION_EX = PALLOCATE_FUNCTION_EXFn?

public fun interface PARBITER_HANDLERFn {
    public operator fun invoke(context: Long, action: ARBITER_ACTION, parameters: Long): NTSTATUS
}

public typealias PARBITER_HANDLER = PARBITER_HANDLERFn?

public typealias PARTITION_INFORMATION_CLASS = Int

public fun interface PBOOT_DRIVER_CALLBACK_FUNCTIONFn {
    public operator fun invoke()
}

public typealias PBOOT_DRIVER_CALLBACK_FUNCTION = PBOOT_DRIVER_CALLBACK_FUNCTIONFn?

public fun interface PBOUND_CALLBACKFn {
    public operator fun invoke(): BOUND_CALLBACK_STATUS
}

public typealias PBOUND_CALLBACK = PBOUND_CALLBACKFn?

public fun interface PBUILD_MDL_FROM_SCATTER_GATHER_LISTFn {
    public operator fun invoke(dmaadapter: Long, scattergather: Long, originalmdl: Long, targetmdl: Long): NTSTATUS
}

public typealias PBUILD_MDL_FROM_SCATTER_GATHER_LIST = PBUILD_MDL_FROM_SCATTER_GATHER_LISTFn?

public fun interface PBUILD_SCATTER_GATHER_LISTFn {
    public operator fun invoke(dmaadapter: Long, deviceobject: Long, mdl: Long, currentva: Long, length: UInt, executionroutine: DRIVER_LIST_CONTROL, context: Long, writetodevice: Boolean, scattergatherbuffer: Long, scattergatherlength: UInt): NTSTATUS
}

public typealias PBUILD_SCATTER_GATHER_LIST = PBUILD_SCATTER_GATHER_LISTFn?

public fun interface PBUILD_SCATTER_GATHER_LIST_EXFn {
    public operator fun invoke(dmaadapter: Long, deviceobject: Long, dmatransfercontext: Long, mdl: Long, offset: ULong, length: UInt, flags: UInt, executionroutine: DRIVER_LIST_CONTROL, context: Long, writetodevice: Boolean, scattergatherbuffer: Long, scattergatherlength: UInt, dmacompletionroutine: PDMA_COMPLETION_ROUTINE, completioncontext: Long, scattergatherlist: Long): NTSTATUS
}

public typealias PBUILD_SCATTER_GATHER_LIST_EX = PBUILD_SCATTER_GATHER_LIST_EXFn?

public fun interface PCALCULATE_SCATTER_GATHER_LIST_SIZEFn {
    public operator fun invoke(dmaadapter: Long, mdl: Long, currentva: Long, length: UInt, scattergatherlistsize: Long, pnumberofmapregisters: Long): NTSTATUS
}

public typealias PCALCULATE_SCATTER_GATHER_LIST_SIZE = PCALCULATE_SCATTER_GATHER_LIST_SIZEFn?

public fun interface PCALLBACK_FUNCTIONFn {
    public operator fun invoke()
}

public typealias PCALLBACK_FUNCTION = PCALLBACK_FUNCTIONFn?

public fun interface PCANCEL_ADAPTER_CHANNELFn {
    public operator fun invoke(dmaadapter: Long, deviceobject: Long, dmatransfercontext: Long): Boolean
}

public typealias PCANCEL_ADAPTER_CHANNEL = PCANCEL_ADAPTER_CHANNELFn?

public fun interface PCANCEL_MAPPED_TRANSFERFn {
    public operator fun invoke(dmaadapter: Long, dmatransfercontext: Long): NTSTATUS
}

public typealias PCANCEL_MAPPED_TRANSFER = PCANCEL_MAPPED_TRANSFERFn?

public typealias PCI_ACS_BIT = Int

public typealias PCI_BUS_WIDTH = Int

public typealias PCI_DEVICE_D3COLD_STATE_REASON = Int

public fun interface PCI_ERROR_HANDLER_CALLBACKFn {
    public operator fun invoke()
}

public typealias PCI_ERROR_HANDLER_CALLBACK = PCI_ERROR_HANDLER_CALLBACKFn?

public typealias PCI_EXPRESS_ASPM_CONTROL = Int

public typealias PCI_EXPRESS_ASPM_SUPPORT = Int

public typealias PCI_EXPRESS_CARD_PRESENCE = Int

public typealias PCI_EXPRESS_DEVICE_TYPE = Int

public fun interface PCI_EXPRESS_ENTER_LINK_QUIESCENT_MODEFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PCI_EXPRESS_ENTER_LINK_QUIESCENT_MODE = PCI_EXPRESS_ENTER_LINK_QUIESCENT_MODEFn?

public fun interface PCI_EXPRESS_EXIT_LINK_QUIESCENT_MODEFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PCI_EXPRESS_EXIT_LINK_QUIESCENT_MODE = PCI_EXPRESS_EXIT_LINK_QUIESCENT_MODEFn?

public typealias PCI_EXPRESS_INDICATOR_STATE = Int

public typealias PCI_EXPRESS_L0s_EXIT_LATENCY = Int

public typealias PCI_EXPRESS_L1_EXIT_LATENCY = Int

public typealias PCI_EXPRESS_LINK_SUBSTATE = Int

public typealias PCI_EXPRESS_MAX_PAYLOAD_SIZE = Int

public typealias PCI_EXPRESS_MRL_STATE = Int

public typealias PCI_EXPRESS_POWER_STATE = Int

public typealias PCI_EXPRESS_RCB = Int

public fun interface PCI_EXPRESS_WAKE_CONTROLFn {
    public operator fun invoke(context: Long, enablewake: Boolean)
}

public typealias PCI_EXPRESS_WAKE_CONTROL = PCI_EXPRESS_WAKE_CONTROLFn?

public typealias PCI_HARDWARE_INTERFACE = Int

public fun interface PCI_IS_DEVICE_PRESENTFn {
    public operator fun invoke(vendorid: UShort, deviceid: UShort, revisionid: UByte, subvendorid: UShort, subsystemid: UShort, flags: UInt): Boolean
}

public typealias PCI_IS_DEVICE_PRESENT = PCI_IS_DEVICE_PRESENTFn?

public fun interface PCI_IS_DEVICE_PRESENT_EXFn {
    public operator fun invoke(context: Long, parameters: Long): Boolean
}

public typealias PCI_IS_DEVICE_PRESENT_EX = PCI_IS_DEVICE_PRESENT_EXFn?

public fun interface PCI_LINE_TO_PINFn {
    public operator fun invoke(context: Long, pcinewdata: Long, pciolddata: Long)
}

public typealias PCI_LINE_TO_PIN = PCI_LINE_TO_PINFn?

public fun interface PCI_MSIX_GET_ENTRYFn {
    public operator fun invoke(context: Long, tableentry: UInt, messagenumber: Long, masked: Long): NTSTATUS
}

public typealias PCI_MSIX_GET_ENTRY = PCI_MSIX_GET_ENTRYFn?

public fun interface PCI_MSIX_GET_TABLE_SIZEFn {
    public operator fun invoke(context: Long, tablesize: Long): NTSTATUS
}

public typealias PCI_MSIX_GET_TABLE_SIZE = PCI_MSIX_GET_TABLE_SIZEFn?

public fun interface PCI_MSIX_MASKUNMASK_ENTRYFn {
    public operator fun invoke(context: Long, tableentry: UInt): NTSTATUS
}

public typealias PCI_MSIX_MASKUNMASK_ENTRY = PCI_MSIX_MASKUNMASK_ENTRYFn?

public fun interface PCI_MSIX_SET_ENTRYFn {
    public operator fun invoke(context: Long, tableentry: UInt, messagenumber: UInt): NTSTATUS
}

public typealias PCI_MSIX_SET_ENTRY = PCI_MSIX_SET_ENTRYFn?

public fun interface PCI_PIN_TO_LINEFn {
    public operator fun invoke(context: Long, pcidata: Long)
}

public typealias PCI_PIN_TO_LINE = PCI_PIN_TO_LINEFn?

public fun interface PCI_PREPARE_MULTISTAGE_RESUMEFn {
    public operator fun invoke(context: Long)
}

public typealias PCI_PREPARE_MULTISTAGE_RESUME = PCI_PREPARE_MULTISTAGE_RESUMEFn?

public fun interface PCI_READ_WRITE_CONFIGFn {
    public operator fun invoke(context: Long, busoffset: UInt, slot: UInt, buffer: Long, offset: UInt, length: UInt): UInt
}

public typealias PCI_READ_WRITE_CONFIG = PCI_READ_WRITE_CONFIGFn?

public fun interface PCI_ROOT_BUS_CAPABILITYFn {
    public operator fun invoke(context: Long, hardwarecapability: Long)
}

public typealias PCI_ROOT_BUS_CAPABILITY = PCI_ROOT_BUS_CAPABILITYFn?

public fun interface PCI_SET_ACSFn {
    public operator fun invoke(context: Long, enablesourcevalidation: PCI_ACS_BIT, enabletranslationblocking: PCI_ACS_BIT, enablep2prequestredirect: PCI_ACS_BIT, enablecompletionredirect: PCI_ACS_BIT, enableupstreamforwarding: PCI_ACS_BIT, enableegresscontrol: PCI_ACS_BIT, enabledirecttranslatedp2p: PCI_ACS_BIT): NTSTATUS
}

public typealias PCI_SET_ACS = PCI_SET_ACSFn?

public fun interface PCI_SET_ACS2Fn {
    public operator fun invoke(context: Long, scenariostomodify: UInt, scenariostate: UInt): NTSTATUS
}

public typealias PCI_SET_ACS2 = PCI_SET_ACS2Fn?

public fun interface PCI_SET_ATSFn {
    public operator fun invoke(context: Long, enableats: Boolean): NTSTATUS
}

public typealias PCI_SET_ATS = PCI_SET_ATSFn?

public fun interface PCLFS_CLIENT_ADVANCE_TAIL_CALLBACKFn {
    public operator fun invoke(logfile: Long, targetlsn: Long, clientdata: Long): NTSTATUS
}

public typealias PCLFS_CLIENT_ADVANCE_TAIL_CALLBACK = PCLFS_CLIENT_ADVANCE_TAIL_CALLBACKFn?

public fun interface PCLFS_CLIENT_LFF_HANDLER_COMPLETE_CALLBACKFn {
    public operator fun invoke(logfile: Long, operationstatus: NTSTATUS, logispinned: Boolean, clientdata: Long)
}

public typealias PCLFS_CLIENT_LFF_HANDLER_COMPLETE_CALLBACK = PCLFS_CLIENT_LFF_HANDLER_COMPLETE_CALLBACKFn?

public fun interface PCLFS_CLIENT_LOG_UNPINNED_CALLBACKFn {
    public operator fun invoke(logfile: Long, clientdata: Long)
}

public typealias PCLFS_CLIENT_LOG_UNPINNED_CALLBACK = PCLFS_CLIENT_LOG_UNPINNED_CALLBACKFn?

public fun interface PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACKFn {
    public operator fun invoke(logfile: Long, operationstatus: NTSTATUS, clientdata: Long)
}

public typealias PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK = PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACKFn?

public fun interface PCONFIGURE_ADAPTER_CHANNELFn {
    public operator fun invoke(dmaadapter: Long, functionnumber: UInt, context: Long): NTSTATUS
}

public typealias PCONFIGURE_ADAPTER_CHANNEL = PCONFIGURE_ADAPTER_CHANNELFn?

public fun interface PCRASHDUMP_POWER_ONFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PCRASHDUMP_POWER_ON = PCRASHDUMP_POWER_ONFn?

public fun interface PCREATE_COMMON_BUFFER_FROM_MDLFn {
    public operator fun invoke(dmaadapter: Long, mdl: Long, extendedconfigs: Long, extendedconfigscount: UInt, logicaladdress: Long): NTSTATUS
}

public typealias PCREATE_COMMON_BUFFER_FROM_MDL = PCREATE_COMMON_BUFFER_FROM_MDLFn?

public fun interface PCREATE_PROCESS_NOTIFY_ROUTINEFn {
    public operator fun invoke(parentid: HANDLE, processid: HANDLE, create: Boolean)
}

public typealias PCREATE_PROCESS_NOTIFY_ROUTINE = PCREATE_PROCESS_NOTIFY_ROUTINEFn?

public fun interface PCREATE_PROCESS_NOTIFY_ROUTINE_EXFn {
    public operator fun invoke(process: PEPROCESS, processid: HANDLE, createinfo: Long)
}

public typealias PCREATE_PROCESS_NOTIFY_ROUTINE_EX = PCREATE_PROCESS_NOTIFY_ROUTINE_EXFn?

public fun interface PCREATE_THREAD_NOTIFY_ROUTINEFn {
    public operator fun invoke(processid: HANDLE, threadid: HANDLE, create: Boolean)
}

public typealias PCREATE_THREAD_NOTIFY_ROUTINE = PCREATE_THREAD_NOTIFY_ROUTINEFn?

public fun interface PCW_CALLBACKFn {
    public operator fun invoke(type: PCW_CALLBACK_TYPE, info: Long, context: Long): NTSTATUS
}

public typealias PCW_CALLBACK = PCW_CALLBACKFn?

public typealias PCW_CALLBACK_TYPE = Int

public typealias PCW_REGISTRATION_FLAGS = Int

public fun interface PD3COLD_REQUEST_AUX_POWERFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PD3COLD_REQUEST_AUX_POWER = PD3COLD_REQUEST_AUX_POWERFn?

public fun interface PD3COLD_REQUEST_CORE_POWER_RAILFn {
    public operator fun invoke()
}

public typealias PD3COLD_REQUEST_CORE_POWER_RAIL = PD3COLD_REQUEST_CORE_POWER_RAILFn?

public fun interface PD3COLD_REQUEST_PERST_DELAYFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PD3COLD_REQUEST_PERST_DELAY = PD3COLD_REQUEST_PERST_DELAYFn?

public fun interface PDEBUG_DEVICE_FOUND_FUNCTIONFn {
    public operator fun invoke(device: Long): KD_CALLBACK_ACTION
}

public typealias PDEBUG_DEVICE_FOUND_FUNCTION = PDEBUG_DEVICE_FOUND_FUNCTIONFn?

public fun interface PDEBUG_PRINT_CALLBACKFn {
    public operator fun invoke(output: Long, componentid: UInt, level: UInt)
}

public typealias PDEBUG_PRINT_CALLBACK = PDEBUG_PRINT_CALLBACKFn?

public fun interface PDEVICE_BUS_SPECIFIC_RESET_HANDLERFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PDEVICE_BUS_SPECIFIC_RESET_HANDLER = PDEVICE_BUS_SPECIFIC_RESET_HANDLERFn?

public fun interface PDEVICE_CHANGE_COMPLETE_CALLBACKFn {
    public operator fun invoke()
}

public typealias PDEVICE_CHANGE_COMPLETE_CALLBACK = PDEVICE_CHANGE_COMPLETE_CALLBACKFn?

public fun interface PDEVICE_NOTIFY_CALLBACKFn {
    public operator fun invoke(param0: Long, param1: UInt)
}

public typealias PDEVICE_NOTIFY_CALLBACK = PDEVICE_NOTIFY_CALLBACKFn?

public fun interface PDEVICE_NOTIFY_CALLBACK2Fn {
    public operator fun invoke(notificationcontext: Long, notifycode: UInt)
}

public typealias PDEVICE_NOTIFY_CALLBACK2 = PDEVICE_NOTIFY_CALLBACK2Fn?

public fun interface PDEVICE_QUERY_BUS_SPECIFIC_RESET_HANDLERFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PDEVICE_QUERY_BUS_SPECIFIC_RESET_HANDLER = PDEVICE_QUERY_BUS_SPECIFIC_RESET_HANDLERFn?

public fun interface PDEVICE_RESET_COMPLETIONFn {
    public operator fun invoke()
}

public typealias PDEVICE_RESET_COMPLETION = PDEVICE_RESET_COMPLETIONFn?

public fun interface PDEVICE_RESET_HANDLERFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PDEVICE_RESET_HANDLER = PDEVICE_RESET_HANDLERFn?

public fun interface PDMA_COMPLETION_ROUTINEFn {
    public operator fun invoke()
}

public typealias PDMA_COMPLETION_ROUTINE = PDMA_COMPLETION_ROUTINEFn?

public fun interface PDRIVER_CMC_EXCEPTION_CALLBACKFn {
    public operator fun invoke(context: Long, cmclog: Long)
}

public typealias PDRIVER_CMC_EXCEPTION_CALLBACK = PDRIVER_CMC_EXCEPTION_CALLBACKFn?

public fun interface PDRIVER_CPE_EXCEPTION_CALLBACKFn {
    public operator fun invoke(context: Long, cmclog: Long)
}

public typealias PDRIVER_CPE_EXCEPTION_CALLBACK = PDRIVER_CPE_EXCEPTION_CALLBACKFn?

public fun interface PDRIVER_EXCPTN_CALLBACKFn {
    public operator fun invoke(context: Long, banklog: Long)
}

public typealias PDRIVER_EXCPTN_CALLBACK = PDRIVER_EXCPTN_CALLBACKFn?

public fun interface PDRIVER_VERIFIER_THUNK_ROUTINEFn {
    public operator fun invoke(context: Long): ULong
}

public typealias PDRIVER_VERIFIER_THUNK_ROUTINE = PDRIVER_VERIFIER_THUNK_ROUTINEFn?

public fun interface PENABLE_VIRTUALIZATIONFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PENABLE_VIRTUALIZATION = PENABLE_VIRTUALIZATIONFn?

public fun interface PETWENABLECALLBACKFn {
    public operator fun invoke()
}

public typealias PETWENABLECALLBACK = PETWENABLECALLBACKFn?

public fun interface PEXPAND_STACK_CALLOUTFn {
    public operator fun invoke()
}

public typealias PEXPAND_STACK_CALLOUT = PEXPAND_STACK_CALLOUTFn?

public fun interface PEXT_CALLBACKFn {
    public operator fun invoke()
}

public typealias PEXT_CALLBACK = PEXT_CALLBACKFn?

public fun interface PEXT_DELETE_CALLBACKFn {
    public operator fun invoke()
}

public typealias PEXT_DELETE_CALLBACK = PEXT_DELETE_CALLBACKFn?

public fun interface PEX_CALLBACK_FUNCTIONFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PEX_CALLBACK_FUNCTION = PEX_CALLBACK_FUNCTIONFn?

public fun interface PFLUSH_ADAPTER_BUFFERSFn {
    public operator fun invoke(dmaadapter: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: UInt, writetodevice: Boolean): Boolean
}

public typealias PFLUSH_ADAPTER_BUFFERS = PFLUSH_ADAPTER_BUFFERSFn?

public fun interface PFLUSH_ADAPTER_BUFFERS_EXFn {
    public operator fun invoke(dmaadapter: Long, mdl: Long, mapregisterbase: Long, offset: ULong, length: UInt, writetodevice: Boolean): NTSTATUS
}

public typealias PFLUSH_ADAPTER_BUFFERS_EX = PFLUSH_ADAPTER_BUFFERS_EXFn?

public fun interface PFLUSH_DMA_BUFFERFn {
    public operator fun invoke(dmaadapter: Long, mdl: Long, readoperation: Boolean): NTSTATUS
}

public typealias PFLUSH_DMA_BUFFER = PFLUSH_DMA_BUFFERFn?

public fun interface PFNFTHFn {
    public operator fun invoke(systemfirmwaretableinfo: Long): NTSTATUS
}

public typealias PFNFTH = PFNFTHFn?

public fun interface PFN_IN_USE_PAGE_OFFLINE_NOTIFYFn {
    public operator fun invoke(page: UInt, flags: Boolean, poisoned: Boolean, context: Long): Boolean
}

public typealias PFN_IN_USE_PAGE_OFFLINE_NOTIFY = PFN_IN_USE_PAGE_OFFLINE_NOTIFYFn?

public fun interface PFN_NT_COMMIT_TRANSACTIONFn {
    public operator fun invoke(transactionhandle: HANDLE, wait: Boolean): NTSTATUS
}

public typealias PFN_NT_COMMIT_TRANSACTION = PFN_NT_COMMIT_TRANSACTIONFn?

public fun interface PFN_NT_CREATE_TRANSACTIONFn {
    public operator fun invoke(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS
}

public typealias PFN_NT_CREATE_TRANSACTION = PFN_NT_CREATE_TRANSACTIONFn?

public fun interface PFN_NT_OPEN_TRANSACTIONFn {
    public operator fun invoke(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS
}

public typealias PFN_NT_OPEN_TRANSACTION = PFN_NT_OPEN_TRANSACTIONFn?

public fun interface PFN_NT_QUERY_INFORMATION_TRANSACTIONFn {
    public operator fun invoke(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS
}

public typealias PFN_NT_QUERY_INFORMATION_TRANSACTION = PFN_NT_QUERY_INFORMATION_TRANSACTIONFn?

public fun interface PFN_NT_ROLLBACK_TRANSACTIONFn {
    public operator fun invoke(transactionhandle: HANDLE, wait: Boolean): NTSTATUS
}

public typealias PFN_NT_ROLLBACK_TRANSACTION = PFN_NT_ROLLBACK_TRANSACTIONFn?

public fun interface PFN_NT_SET_INFORMATION_TRANSACTIONFn {
    public operator fun invoke(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS
}

public typealias PFN_NT_SET_INFORMATION_TRANSACTION = PFN_NT_SET_INFORMATION_TRANSACTIONFn?

public fun interface PFN_RTL_IS_NTDDI_VERSION_AVAILABLEFn {
    public operator fun invoke(version: UInt): Boolean
}

public typealias PFN_RTL_IS_NTDDI_VERSION_AVAILABLE = PFN_RTL_IS_NTDDI_VERSION_AVAILABLEFn?

public fun interface PFN_RTL_IS_SERVICE_PACK_VERSION_INSTALLEDFn {
    public operator fun invoke(version: UInt): Boolean
}

public typealias PFN_RTL_IS_SERVICE_PACK_VERSION_INSTALLED = PFN_RTL_IS_SERVICE_PACK_VERSION_INSTALLEDFn?

public fun interface PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLERFn {
    public operator fun invoke(context: Long, osselrecord: Long): NTSTATUS
}

public typealias PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLER = PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLERFn?

public fun interface PFPGA_BUS_SCANFn {
    public operator fun invoke()
}

public typealias PFPGA_BUS_SCAN = PFPGA_BUS_SCANFn?

public fun interface PFPGA_CONTROL_CONFIG_SPACEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PFPGA_CONTROL_CONFIG_SPACE = PFPGA_CONTROL_CONFIG_SPACEFn?

public fun interface PFPGA_CONTROL_ERROR_REPORTINGFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PFPGA_CONTROL_ERROR_REPORTING = PFPGA_CONTROL_ERROR_REPORTINGFn?

public fun interface PFPGA_CONTROL_LINKFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PFPGA_CONTROL_LINK = PFPGA_CONTROL_LINKFn?

public fun interface PFREE_ADAPTER_CHANNELFn {
    public operator fun invoke(dmaadapter: Long)
}

public typealias PFREE_ADAPTER_CHANNEL = PFREE_ADAPTER_CHANNELFn?

public fun interface PFREE_ADAPTER_OBJECTFn {
    public operator fun invoke(dmaadapter: Long, allocationaction: IO_ALLOCATION_ACTION)
}

public typealias PFREE_ADAPTER_OBJECT = PFREE_ADAPTER_OBJECTFn?

public fun interface PFREE_COMMON_BUFFERFn {
    public operator fun invoke(dmaadapter: Long, length: UInt, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean)
}

public typealias PFREE_COMMON_BUFFER = PFREE_COMMON_BUFFERFn?

public fun interface PFREE_COMMON_BUFFER_FROM_VECTORFn {
    public operator fun invoke(dmaadapter: Long, vector: Long, index: UInt)
}

public typealias PFREE_COMMON_BUFFER_FROM_VECTOR = PFREE_COMMON_BUFFER_FROM_VECTORFn?

public fun interface PFREE_COMMON_BUFFER_VECTORFn {
    public operator fun invoke(dmaadapter: Long, vector: Long)
}

public typealias PFREE_COMMON_BUFFER_VECTOR = PFREE_COMMON_BUFFER_VECTORFn?

public fun interface PFREE_FUNCTION_EXFn {
    public operator fun invoke()
}

public typealias PFREE_FUNCTION_EX = PFREE_FUNCTION_EXFn?

public fun interface PFREE_MAP_REGISTERSFn {
    public operator fun invoke(dmaadapter: Long, mapregisterbase: Long, numberofmapregisters: UInt)
}

public typealias PFREE_MAP_REGISTERS = PFREE_MAP_REGISTERSFn?

public fun interface PGET_COMMON_BUFFER_FROM_VECTOR_BY_INDEXFn {
    public operator fun invoke(dmaadapter: Long, vector: Long, index: UInt, virtualaddressout: Long, logicaladdressout: Long)
}

public typealias PGET_COMMON_BUFFER_FROM_VECTOR_BY_INDEX = PGET_COMMON_BUFFER_FROM_VECTOR_BY_INDEXFn?

public fun interface PGET_D3COLD_CAPABILITYFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PGET_D3COLD_CAPABILITY = PGET_D3COLD_CAPABILITYFn?

public fun interface PGET_D3COLD_LAST_TRANSITION_STATUSFn {
    public operator fun invoke()
}

public typealias PGET_D3COLD_LAST_TRANSITION_STATUS = PGET_D3COLD_LAST_TRANSITION_STATUSFn?

public fun interface PGET_DEVICE_RESET_STATUSFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PGET_DEVICE_RESET_STATUS = PGET_DEVICE_RESET_STATUSFn?

public fun interface PGET_DMA_ADAPTERFn {
    public operator fun invoke(): Long
}

public typealias PGET_DMA_ADAPTER = PGET_DMA_ADAPTERFn?

public fun interface PGET_DMA_ADAPTER_INFOFn {
    public operator fun invoke(dmaadapter: Long, adapterinfo: Long): NTSTATUS
}

public typealias PGET_DMA_ADAPTER_INFO = PGET_DMA_ADAPTER_INFOFn?

public fun interface PGET_DMA_ALIGNMENTFn {
    public operator fun invoke(dmaadapter: Long): UInt
}

public typealias PGET_DMA_ALIGNMENT = PGET_DMA_ALIGNMENTFn?

public fun interface PGET_DMA_DOMAINFn {
    public operator fun invoke(dmaadapter: Long): HANDLE
}

public typealias PGET_DMA_DOMAIN = PGET_DMA_DOMAINFn?

public fun interface PGET_DMA_TRANSFER_INFOFn {
    public operator fun invoke(dmaadapter: Long, mdl: Long, offset: ULong, length: UInt, writeonly: Boolean, transferinfo: Long): NTSTATUS
}

public typealias PGET_DMA_TRANSFER_INFO = PGET_DMA_TRANSFER_INFOFn?

public fun interface PGET_IDLE_WAKE_INFOFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PGET_IDLE_WAKE_INFO = PGET_IDLE_WAKE_INFOFn?

public fun interface PGET_LOCATION_STRINGFn {
    public operator fun invoke(context: Long, locationstrings: Long): NTSTATUS
}

public typealias PGET_LOCATION_STRING = PGET_LOCATION_STRINGFn?

public fun interface PGET_SCATTER_GATHER_LISTFn {
    public operator fun invoke(dmaadapter: Long, deviceobject: Long, mdl: Long, currentva: Long, length: UInt, executionroutine: DRIVER_LIST_CONTROL, context: Long, writetodevice: Boolean): NTSTATUS
}

public typealias PGET_SCATTER_GATHER_LIST = PGET_SCATTER_GATHER_LISTFn?

public fun interface PGET_SCATTER_GATHER_LIST_EXFn {
    public operator fun invoke(dmaadapter: Long, deviceobject: Long, dmatransfercontext: Long, mdl: Long, offset: ULong, length: UInt, flags: UInt, executionroutine: DRIVER_LIST_CONTROL, context: Long, writetodevice: Boolean, dmacompletionroutine: PDMA_COMPLETION_ROUTINE, completioncontext: Long, scattergatherlist: Long): NTSTATUS
}

public typealias PGET_SCATTER_GATHER_LIST_EX = PGET_SCATTER_GATHER_LIST_EXFn?

public fun interface PGET_SDEV_IDENTIFIERFn {
    public operator fun invoke(): ULong
}

public typealias PGET_SDEV_IDENTIFIER = PGET_SDEV_IDENTIFIERFn?

public fun interface PGET_SET_DEVICE_DATAFn {
    public operator fun invoke(): UInt
}

public typealias PGET_SET_DEVICE_DATA = PGET_SET_DEVICE_DATAFn?

public fun interface PGET_UPDATED_BUS_RESOURCEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PGET_UPDATED_BUS_RESOURCE = PGET_UPDATED_BUS_RESOURCEFn?

public fun interface PGET_VIRTUAL_DEVICE_DATAFn {
    public operator fun invoke(): UInt
}

public typealias PGET_VIRTUAL_DEVICE_DATA = PGET_VIRTUAL_DEVICE_DATAFn?

public fun interface PGET_VIRTUAL_DEVICE_LOCATIONFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PGET_VIRTUAL_DEVICE_LOCATION = PGET_VIRTUAL_DEVICE_LOCATIONFn?

public fun interface PGET_VIRTUAL_DEVICE_RESOURCESFn {
    public operator fun invoke()
}

public typealias PGET_VIRTUAL_DEVICE_RESOURCES = PGET_VIRTUAL_DEVICE_RESOURCESFn?

public fun interface PGET_VIRTUAL_FUNCTION_PROBED_BARSFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PGET_VIRTUAL_FUNCTION_PROBED_BARS = PGET_VIRTUAL_FUNCTION_PROBED_BARSFn?

public fun interface PGPE_CLEAR_STATUSFn {
    public operator fun invoke(param0: Long, param1: Long): NTSTATUS
}

public typealias PGPE_CLEAR_STATUS = PGPE_CLEAR_STATUSFn?

public fun interface PGPE_CLEAR_STATUS2Fn {
    public operator fun invoke(context: Long, objectcontext: Long): NTSTATUS
}

public typealias PGPE_CLEAR_STATUS2 = PGPE_CLEAR_STATUS2Fn?

public fun interface PGPE_CONNECT_VECTORFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: KINTERRUPT_MODE, param3: Boolean, param4: PGPE_SERVICE_ROUTINE, param5: Long, param6: Long): NTSTATUS
}

public typealias PGPE_CONNECT_VECTOR = PGPE_CONNECT_VECTORFn?

public fun interface PGPE_CONNECT_VECTOR2Fn {
    public operator fun invoke(context: Long, gpenumber: UInt, mode: KINTERRUPT_MODE, shareable: Boolean, serviceroutine: PGPE_SERVICE_ROUTINE, servicecontext: Long, objectcontext: Long): NTSTATUS
}

public typealias PGPE_CONNECT_VECTOR2 = PGPE_CONNECT_VECTOR2Fn?

public fun interface PGPE_DISABLE_EVENTFn {
    public operator fun invoke(param0: Long, param1: Long): NTSTATUS
}

public typealias PGPE_DISABLE_EVENT = PGPE_DISABLE_EVENTFn?

public fun interface PGPE_DISABLE_EVENT2Fn {
    public operator fun invoke(context: Long, objectcontext: Long): NTSTATUS
}

public typealias PGPE_DISABLE_EVENT2 = PGPE_DISABLE_EVENT2Fn?

public fun interface PGPE_DISCONNECT_VECTORFn {
    public operator fun invoke(param0: Long): NTSTATUS
}

public typealias PGPE_DISCONNECT_VECTOR = PGPE_DISCONNECT_VECTORFn?

public fun interface PGPE_DISCONNECT_VECTOR2Fn {
    public operator fun invoke(context: Long, objectcontext: Long): NTSTATUS
}

public typealias PGPE_DISCONNECT_VECTOR2 = PGPE_DISCONNECT_VECTOR2Fn?

public fun interface PGPE_ENABLE_EVENTFn {
    public operator fun invoke(param0: Long, param1: Long): NTSTATUS
}

public typealias PGPE_ENABLE_EVENT = PGPE_ENABLE_EVENTFn?

public fun interface PGPE_ENABLE_EVENT2Fn {
    public operator fun invoke(context: Long, objectcontext: Long): NTSTATUS
}

public typealias PGPE_ENABLE_EVENT2 = PGPE_ENABLE_EVENT2Fn?

public fun interface PGPE_SERVICE_ROUTINEFn {
    public operator fun invoke(param0: Long, param1: Long): Boolean
}

public typealias PGPE_SERVICE_ROUTINE = PGPE_SERVICE_ROUTINEFn?

public fun interface PGPE_SERVICE_ROUTINE2Fn {
    public operator fun invoke(objectcontext: Long, servicecontext: Long): Boolean
}

public typealias PGPE_SERVICE_ROUTINE2 = PGPE_SERVICE_ROUTINE2Fn?

public fun interface PHALIOREADWRITEHANDLERFn {
    public operator fun invoke(fread: Boolean, dwaddr: UInt, dwsize: UInt, pdwdata: Long): NTSTATUS
}

public typealias PHALIOREADWRITEHANDLER = PHALIOREADWRITEHANDLERFn?

public fun interface PHALMCAINTERFACELOCKFn {
    public operator fun invoke()
}

public typealias PHALMCAINTERFACELOCK = PHALMCAINTERFACELOCKFn?

public fun interface PHALMCAINTERFACEREADREGISTERFn {
    public operator fun invoke(banknumber: UByte, exception: Long): NTSTATUS
}

public typealias PHALMCAINTERFACEREADREGISTER = PHALMCAINTERFACEREADREGISTERFn?

public fun interface PHALMCAINTERFACEUNLOCKFn {
    public operator fun invoke()
}

public typealias PHALMCAINTERFACEUNLOCK = PHALMCAINTERFACEUNLOCKFn?

public fun interface PHAL_RESET_DISPLAY_PARAMETERSFn {
    public operator fun invoke(columns: UInt, rows: UInt): Boolean
}

public typealias PHAL_RESET_DISPLAY_PARAMETERS = PHAL_RESET_DISPLAY_PARAMETERSFn?

public fun interface PHVL_WHEA_ERROR_NOTIFICATIONFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PHVL_WHEA_ERROR_NOTIFICATION = PHVL_WHEA_ERROR_NOTIFICATIONFn?

public typealias PHYSICAL_COUNTER_RESOURCE_DESCRIPTOR_TYPE = Int

public fun interface PINITIALIZE_DMA_TRANSFER_CONTEXTFn {
    public operator fun invoke(dmaadapter: Long, dmatransfercontext: Long): NTSTATUS
}

public typealias PINITIALIZE_DMA_TRANSFER_CONTEXT = PINITIALIZE_DMA_TRANSFER_CONTEXTFn?

public fun interface PINTERFACE_DEREFERENCEFn {
    public operator fun invoke(context: Long)
}

public typealias PINTERFACE_DEREFERENCE = PINTERFACE_DEREFERENCEFn?

public fun interface PINTERFACE_REFERENCEFn {
    public operator fun invoke(context: Long)
}

public typealias PINTERFACE_REFERENCE = PINTERFACE_REFERENCEFn?

public fun interface PIOMMU_DEVICE_CREATEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DEVICE_CREATE = PIOMMU_DEVICE_CREATEFn?

public fun interface PIOMMU_DEVICE_DELETEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DEVICE_DELETE = PIOMMU_DEVICE_DELETEFn?

public fun interface PIOMMU_DEVICE_FAULT_HANDLERFn {
    public operator fun invoke()
}

public typealias PIOMMU_DEVICE_FAULT_HANDLER = PIOMMU_DEVICE_FAULT_HANDLERFn?

public fun interface PIOMMU_DEVICE_QUERY_DOMAIN_TYPESFn {
    public operator fun invoke()
}

public typealias PIOMMU_DEVICE_QUERY_DOMAIN_TYPES = PIOMMU_DEVICE_QUERY_DOMAIN_TYPESFn?

public fun interface PIOMMU_DOMAIN_ATTACH_DEVICEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DOMAIN_ATTACH_DEVICE = PIOMMU_DOMAIN_ATTACH_DEVICEFn?

public fun interface PIOMMU_DOMAIN_ATTACH_DEVICE_EXFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DOMAIN_ATTACH_DEVICE_EX = PIOMMU_DOMAIN_ATTACH_DEVICE_EXFn?

public fun interface PIOMMU_DOMAIN_CONFIGUREFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DOMAIN_CONFIGURE = PIOMMU_DOMAIN_CONFIGUREFn?

public fun interface PIOMMU_DOMAIN_CREATEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DOMAIN_CREATE = PIOMMU_DOMAIN_CREATEFn?

public fun interface PIOMMU_DOMAIN_CREATE_EXFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DOMAIN_CREATE_EX = PIOMMU_DOMAIN_CREATE_EXFn?

public fun interface PIOMMU_DOMAIN_DELETEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DOMAIN_DELETE = PIOMMU_DOMAIN_DELETEFn?

public fun interface PIOMMU_DOMAIN_DETACH_DEVICEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DOMAIN_DETACH_DEVICE = PIOMMU_DOMAIN_DETACH_DEVICEFn?

public fun interface PIOMMU_DOMAIN_DETACH_DEVICE_EXFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_DOMAIN_DETACH_DEVICE_EX = PIOMMU_DOMAIN_DETACH_DEVICE_EXFn?

public fun interface PIOMMU_FLUSH_DOMAINFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_FLUSH_DOMAIN = PIOMMU_FLUSH_DOMAINFn?

public fun interface PIOMMU_FLUSH_DOMAIN_VA_LISTFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_FLUSH_DOMAIN_VA_LIST = PIOMMU_FLUSH_DOMAIN_VA_LISTFn?

public fun interface PIOMMU_FREE_RESERVED_LOGICAL_ADDRESS_RANGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_FREE_RESERVED_LOGICAL_ADDRESS_RANGE = PIOMMU_FREE_RESERVED_LOGICAL_ADDRESS_RANGEFn?

public fun interface PIOMMU_INTERFACE_STATE_CHANGE_CALLBACKFn {
    public operator fun invoke()
}

public typealias PIOMMU_INTERFACE_STATE_CHANGE_CALLBACK = PIOMMU_INTERFACE_STATE_CHANGE_CALLBACKFn?

public fun interface PIOMMU_MAP_IDENTITY_RANGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_MAP_IDENTITY_RANGE = PIOMMU_MAP_IDENTITY_RANGEFn?

public fun interface PIOMMU_MAP_IDENTITY_RANGE_EXFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_MAP_IDENTITY_RANGE_EX = PIOMMU_MAP_IDENTITY_RANGE_EXFn?

public fun interface PIOMMU_MAP_LOGICAL_RANGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_MAP_LOGICAL_RANGE = PIOMMU_MAP_LOGICAL_RANGEFn?

public fun interface PIOMMU_MAP_LOGICAL_RANGE_EXFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_MAP_LOGICAL_RANGE_EX = PIOMMU_MAP_LOGICAL_RANGE_EXFn?

public fun interface PIOMMU_MAP_RESERVED_LOGICAL_RANGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_MAP_RESERVED_LOGICAL_RANGE = PIOMMU_MAP_RESERVED_LOGICAL_RANGEFn?

public fun interface PIOMMU_QUERY_INPUT_MAPPINGSFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_QUERY_INPUT_MAPPINGS = PIOMMU_QUERY_INPUT_MAPPINGSFn?

public fun interface PIOMMU_REGISTER_INTERFACE_STATE_CHANGE_CALLBACKFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_REGISTER_INTERFACE_STATE_CHANGE_CALLBACK = PIOMMU_REGISTER_INTERFACE_STATE_CHANGE_CALLBACKFn?

public fun interface PIOMMU_RESERVE_LOGICAL_ADDRESS_RANGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_RESERVE_LOGICAL_ADDRESS_RANGE = PIOMMU_RESERVE_LOGICAL_ADDRESS_RANGEFn?

public fun interface PIOMMU_SET_DEVICE_FAULT_REPORTINGFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_SET_DEVICE_FAULT_REPORTING = PIOMMU_SET_DEVICE_FAULT_REPORTINGFn?

public fun interface PIOMMU_SET_DEVICE_FAULT_REPORTING_EXFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_SET_DEVICE_FAULT_REPORTING_EX = PIOMMU_SET_DEVICE_FAULT_REPORTING_EXFn?

public fun interface PIOMMU_UNMAP_IDENTITY_RANGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_UNMAP_IDENTITY_RANGE = PIOMMU_UNMAP_IDENTITY_RANGEFn?

public fun interface PIOMMU_UNMAP_IDENTITY_RANGE_EXFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_UNMAP_IDENTITY_RANGE_EX = PIOMMU_UNMAP_IDENTITY_RANGE_EXFn?

public fun interface PIOMMU_UNMAP_LOGICAL_RANGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_UNMAP_LOGICAL_RANGE = PIOMMU_UNMAP_LOGICAL_RANGEFn?

public fun interface PIOMMU_UNMAP_RESERVED_LOGICAL_RANGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_UNMAP_RESERVED_LOGICAL_RANGE = PIOMMU_UNMAP_RESERVED_LOGICAL_RANGEFn?

public fun interface PIOMMU_UNREGISTER_INTERFACE_STATE_CHANGE_CALLBACKFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIOMMU_UNREGISTER_INTERFACE_STATE_CHANGE_CALLBACK = PIOMMU_UNREGISTER_INTERFACE_STATE_CHANGE_CALLBACKFn?

public fun interface PIO_CONTAINER_NOTIFICATION_FUNCTIONFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIO_CONTAINER_NOTIFICATION_FUNCTION = PIO_CONTAINER_NOTIFICATION_FUNCTIONFn?

public fun interface PIO_CSQ_ACQUIRE_LOCKFn {
    public operator fun invoke()
}

public typealias PIO_CSQ_ACQUIRE_LOCK = PIO_CSQ_ACQUIRE_LOCKFn?

public fun interface PIO_CSQ_COMPLETE_CANCELED_IRPFn {
    public operator fun invoke()
}

public typealias PIO_CSQ_COMPLETE_CANCELED_IRP = PIO_CSQ_COMPLETE_CANCELED_IRPFn?

public fun interface PIO_CSQ_INSERT_IRPFn {
    public operator fun invoke()
}

public typealias PIO_CSQ_INSERT_IRP = PIO_CSQ_INSERT_IRPFn?

public fun interface PIO_CSQ_INSERT_IRP_EXFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIO_CSQ_INSERT_IRP_EX = PIO_CSQ_INSERT_IRP_EXFn?

public fun interface PIO_CSQ_PEEK_NEXT_IRPFn {
    public operator fun invoke(): Long
}

public typealias PIO_CSQ_PEEK_NEXT_IRP = PIO_CSQ_PEEK_NEXT_IRPFn?

public fun interface PIO_CSQ_RELEASE_LOCKFn {
    public operator fun invoke()
}

public typealias PIO_CSQ_RELEASE_LOCK = PIO_CSQ_RELEASE_LOCKFn?

public fun interface PIO_CSQ_REMOVE_IRPFn {
    public operator fun invoke()
}

public typealias PIO_CSQ_REMOVE_IRP = PIO_CSQ_REMOVE_IRPFn?

public fun interface PIO_DEVICE_EJECT_CALLBACKFn {
    public operator fun invoke(status: NTSTATUS, context: Long)
}

public typealias PIO_DEVICE_EJECT_CALLBACK = PIO_DEVICE_EJECT_CALLBACKFn?

public fun interface PIO_DPC_ROUTINEFn {
    public operator fun invoke()
}

public typealias PIO_DPC_ROUTINE = PIO_DPC_ROUTINEFn?

public fun interface PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACKFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACK = PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACKFn?

public fun interface PIO_QUERY_DEVICE_ROUTINEFn {
    public operator fun invoke(context: Long, pathname: Long, bustype: INTERFACE_TYPE, busnumber: UInt, businformation: Long, controllertype: CONFIGURATION_TYPE, controllernumber: UInt, controllerinformation: Long, peripheraltype: CONFIGURATION_TYPE, peripheralnumber: UInt, peripheralinformation: Long): NTSTATUS
}

public typealias PIO_QUERY_DEVICE_ROUTINE = PIO_QUERY_DEVICE_ROUTINEFn?

public fun interface PIO_SESSION_NOTIFICATION_FUNCTIONFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PIO_SESSION_NOTIFICATION_FUNCTION = PIO_SESSION_NOTIFICATION_FUNCTIONFn?

public fun interface PIO_TIMER_ROUTINEFn {
    public operator fun invoke()
}

public typealias PIO_TIMER_ROUTINE = PIO_TIMER_ROUTINEFn?

public fun interface PIO_WORKITEM_ROUTINEFn {
    public operator fun invoke()
}

public typealias PIO_WORKITEM_ROUTINE = PIO_WORKITEM_ROUTINEFn?

public fun interface PIO_WORKITEM_ROUTINE_EXFn {
    public operator fun invoke()
}

public typealias PIO_WORKITEM_ROUTINE_EX = PIO_WORKITEM_ROUTINE_EXFn?

public fun interface PJOIN_DMA_DOMAINFn {
    public operator fun invoke(dmaadapter: Long, domainhandle: HANDLE): NTSTATUS
}

public typealias PJOIN_DMA_DOMAIN = PJOIN_DMA_DOMAINFn?

public fun interface PKBUGCHECK_CALLBACK_ROUTINEFn {
    public operator fun invoke()
}

public typealias PKBUGCHECK_CALLBACK_ROUTINE = PKBUGCHECK_CALLBACK_ROUTINEFn?

public fun interface PKBUGCHECK_REASON_CALLBACK_ROUTINEFn {
    public operator fun invoke()
}

public typealias PKBUGCHECK_REASON_CALLBACK_ROUTINE = PKBUGCHECK_REASON_CALLBACK_ROUTINEFn?

public fun interface PKIPI_BROADCAST_WORKERFn {
    public operator fun invoke(): ULong
}

public typealias PKIPI_BROADCAST_WORKER = PKIPI_BROADCAST_WORKERFn?

public fun interface PKMESSAGE_SERVICE_ROUTINEFn {
    public operator fun invoke(): Boolean
}

public typealias PKMESSAGE_SERVICE_ROUTINE = PKMESSAGE_SERVICE_ROUTINEFn?

public fun interface PKSERVICE_ROUTINEFn {
    public operator fun invoke(): Boolean
}

public typealias PKSERVICE_ROUTINE = PKSERVICE_ROUTINEFn?

public fun interface PKSTART_ROUTINEFn {
    public operator fun invoke()
}

public typealias PKSTART_ROUTINE = PKSTART_ROUTINEFn?

public fun interface PKSYNCHRONIZE_ROUTINEFn {
    public operator fun invoke(): Boolean
}

public typealias PKSYNCHRONIZE_ROUTINE = PKSYNCHRONIZE_ROUTINEFn?

public fun interface PLEAVE_DMA_DOMAINFn {
    public operator fun invoke(dmaadapter: Long): NTSTATUS
}

public typealias PLEAVE_DMA_DOMAIN = PLEAVE_DMA_DOMAINFn?

public fun interface PLOAD_IMAGE_NOTIFY_ROUTINEFn {
    public operator fun invoke(fullimagename: Long, processid: HANDLE, imageinfo: Long)
}

public typealias PLOAD_IMAGE_NOTIFY_ROUTINE = PLOAD_IMAGE_NOTIFY_ROUTINEFn?

public fun interface PMAP_TRANSFERFn {
    public operator fun invoke(dmaadapter: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long
}

public typealias PMAP_TRANSFER = PMAP_TRANSFERFn?

public fun interface PMAP_TRANSFER_EXFn {
    public operator fun invoke(dmaadapter: Long, mdl: Long, mapregisterbase: Long, offset: ULong, deviceoffset: UInt, length: Long, writetodevice: Boolean, scattergatherbuffer: Long, scattergatherbufferlength: UInt, dmacompletionroutine: PDMA_COMPLETION_ROUTINE, completioncontext: Long): NTSTATUS
}

public typealias PMAP_TRANSFER_EX = PMAP_TRANSFER_EXFn?

public fun interface PMM_DLL_INITIALIZEFn {
    public operator fun invoke(registrypath: Long): NTSTATUS
}

public typealias PMM_DLL_INITIALIZE = PMM_DLL_INITIALIZEFn?

public fun interface PMM_DLL_UNLOADFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PMM_DLL_UNLOAD = PMM_DLL_UNLOADFn?

public fun interface PMM_GET_SYSTEM_ROUTINE_ADDRESS_EXFn {
    public operator fun invoke(modulename: Long, functionname: PCSTR): Long
}

public typealias PMM_GET_SYSTEM_ROUTINE_ADDRESS_EX = PMM_GET_SYSTEM_ROUTINE_ADDRESS_EXFn?

public fun interface PMM_MDL_ROUTINEFn {
    public operator fun invoke()
}

public typealias PMM_MDL_ROUTINE = PMM_MDL_ROUTINEFn?

public fun interface PMM_ROTATE_COPY_CALLBACK_FUNCTIONFn {
    public operator fun invoke(destinationmdl: Long, sourcemdl: Long, context: Long): NTSTATUS
}

public typealias PMM_ROTATE_COPY_CALLBACK_FUNCTION = PMM_ROTATE_COPY_CALLBACK_FUNCTIONFn?

public fun interface PNMI_CALLBACKFn {
    public operator fun invoke(): Boolean
}

public typealias PNMI_CALLBACK = PNMI_CALLBACKFn?

public fun interface PNPEM_CONTROL_ENABLE_DISABLEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PNPEM_CONTROL_ENABLE_DISABLE = PNPEM_CONTROL_ENABLE_DISABLEFn?

public fun interface PNPEM_CONTROL_QUERY_CONTROLFn {
    public operator fun invoke(): UInt
}

public typealias PNPEM_CONTROL_QUERY_CONTROL = PNPEM_CONTROL_QUERY_CONTROLFn?

public fun interface PNPEM_CONTROL_QUERY_STANDARD_CAPABILITIESFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PNPEM_CONTROL_QUERY_STANDARD_CAPABILITIES = PNPEM_CONTROL_QUERY_STANDARD_CAPABILITIESFn?

public fun interface PNPEM_CONTROL_SET_STANDARD_CONTROLFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PNPEM_CONTROL_SET_STANDARD_CONTROL = PNPEM_CONTROL_SET_STANDARD_CONTROLFn?

public fun interface PNTFS_DEREF_EXPORTED_SECURITY_DESCRIPTORFn {
    public operator fun invoke()
}

public typealias PNTFS_DEREF_EXPORTED_SECURITY_DESCRIPTOR = PNTFS_DEREF_EXPORTED_SECURITY_DESCRIPTORFn?

public fun interface POB_POST_OPERATION_CALLBACKFn {
    public operator fun invoke(registrationcontext: Long, operationinformation: Long)
}

public typealias POB_POST_OPERATION_CALLBACK = POB_POST_OPERATION_CALLBACKFn?

public fun interface POB_PRE_OPERATION_CALLBACKFn {
    public operator fun invoke(registrationcontext: Long, operationinformation: Long): OB_PREOP_CALLBACK_STATUS
}

public typealias POB_PRE_OPERATION_CALLBACK = POB_PRE_OPERATION_CALLBACKFn?

public typealias POOL_EXTENDED_PARAMETER_TYPE = Int

public typealias POWER_MONITOR_REQUEST_REASON = Int

public typealias POWER_MONITOR_REQUEST_TYPE = Int

public typealias POWER_PLATFORM_ROLE = Int

public fun interface POWER_SETTING_CALLBACKFn {
    public operator fun invoke(settingguid: Long, value: Long, valuelength: UInt, context: Long): NTSTATUS
}

public typealias POWER_SETTING_CALLBACK = POWER_SETTING_CALLBACKFn?

public typealias POWER_STATE_TYPE = Int

public typealias POWER_USER_PRESENCE_TYPE = Int

public fun interface PO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACKFn {
    public operator fun invoke(context: Long, component: UInt)
}

public typealias PO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACK = PO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACKFn?

public fun interface PO_FX_COMPONENT_CRITICAL_TRANSITION_CALLBACKFn {
    public operator fun invoke(context: Long, component: UInt, active: Boolean)
}

public typealias PO_FX_COMPONENT_CRITICAL_TRANSITION_CALLBACK = PO_FX_COMPONENT_CRITICAL_TRANSITION_CALLBACKFn?

public fun interface PO_FX_COMPONENT_IDLE_CONDITION_CALLBACKFn {
    public operator fun invoke(context: Long, component: UInt)
}

public typealias PO_FX_COMPONENT_IDLE_CONDITION_CALLBACK = PO_FX_COMPONENT_IDLE_CONDITION_CALLBACKFn?

public fun interface PO_FX_COMPONENT_IDLE_STATE_CALLBACKFn {
    public operator fun invoke(context: Long, component: UInt, state: UInt)
}

public typealias PO_FX_COMPONENT_IDLE_STATE_CALLBACK = PO_FX_COMPONENT_IDLE_STATE_CALLBACKFn?

public fun interface PO_FX_COMPONENT_PERF_STATE_CALLBACKFn {
    public operator fun invoke(context: Long, component: UInt, succeeded: Boolean, requestcontext: Long)
}

public typealias PO_FX_COMPONENT_PERF_STATE_CALLBACK = PO_FX_COMPONENT_PERF_STATE_CALLBACKFn?

public fun interface PO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACKFn {
    public operator fun invoke(context: Long)
}

public typealias PO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACK = PO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACKFn?

public fun interface PO_FX_DEVICE_POWER_REQUIRED_CALLBACKFn {
    public operator fun invoke(context: Long)
}

public typealias PO_FX_DEVICE_POWER_REQUIRED_CALLBACK = PO_FX_DEVICE_POWER_REQUIRED_CALLBACKFn?

public fun interface PO_FX_DIRECTED_POWER_DOWN_CALLBACKFn {
    public operator fun invoke(context: Long, flags: UInt)
}

public typealias PO_FX_DIRECTED_POWER_DOWN_CALLBACK = PO_FX_DIRECTED_POWER_DOWN_CALLBACKFn?

public fun interface PO_FX_DIRECTED_POWER_UP_CALLBACKFn {
    public operator fun invoke(context: Long, flags: UInt)
}

public typealias PO_FX_DIRECTED_POWER_UP_CALLBACK = PO_FX_DIRECTED_POWER_UP_CALLBACKFn?

public fun interface PO_FX_DRIPS_WATCHDOG_CALLBACKFn {
    public operator fun invoke(context: Long, physicaldeviceobject: Long, uniqueid: UInt)
}

public typealias PO_FX_DRIPS_WATCHDOG_CALLBACK = PO_FX_DRIPS_WATCHDOG_CALLBACKFn?

public typealias PO_FX_PERF_STATE_TYPE = Int

public typealias PO_FX_PERF_STATE_UNIT = Int

public fun interface PO_FX_POWER_CONTROL_CALLBACKFn {
    public operator fun invoke(devicecontext: Long, powercontrolcode: Long, inbuffer: Long, inbuffersize: ULong, outbuffer: Long, outbuffersize: ULong, bytesreturned: Long): NTSTATUS
}

public typealias PO_FX_POWER_CONTROL_CALLBACK = PO_FX_POWER_CONTROL_CALLBACKFn?

public typealias PO_THERMAL_REQUEST_TYPE = Int

public fun interface PPCI_EXPRESS_ENTER_LINK_QUIESCENT_MODEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_EXPRESS_ENTER_LINK_QUIESCENT_MODE = PPCI_EXPRESS_ENTER_LINK_QUIESCENT_MODEFn?

public fun interface PPCI_EXPRESS_EXIT_LINK_QUIESCENT_MODEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_EXPRESS_EXIT_LINK_QUIESCENT_MODE = PPCI_EXPRESS_EXIT_LINK_QUIESCENT_MODEFn?

public fun interface PPCI_EXPRESS_ROOT_PORT_READ_CONFIG_SPACEFn {
    public operator fun invoke(context: Long, buffer: Long, offset: UInt, length: UInt): UInt
}

public typealias PPCI_EXPRESS_ROOT_PORT_READ_CONFIG_SPACE = PPCI_EXPRESS_ROOT_PORT_READ_CONFIG_SPACEFn?

public fun interface PPCI_EXPRESS_ROOT_PORT_WRITE_CONFIG_SPACEFn {
    public operator fun invoke(context: Long, buffer: Long, offset: UInt, length: UInt): UInt
}

public typealias PPCI_EXPRESS_ROOT_PORT_WRITE_CONFIG_SPACE = PPCI_EXPRESS_ROOT_PORT_WRITE_CONFIG_SPACEFn?

public fun interface PPCI_EXPRESS_WAKE_CONTROLFn {
    public operator fun invoke()
}

public typealias PPCI_EXPRESS_WAKE_CONTROL = PPCI_EXPRESS_WAKE_CONTROLFn?

public fun interface PPCI_IS_DEVICE_PRESENTFn {
    public operator fun invoke(): Boolean
}

public typealias PPCI_IS_DEVICE_PRESENT = PPCI_IS_DEVICE_PRESENTFn?

public fun interface PPCI_IS_DEVICE_PRESENT_EXFn {
    public operator fun invoke(): Boolean
}

public typealias PPCI_IS_DEVICE_PRESENT_EX = PPCI_IS_DEVICE_PRESENT_EXFn?

public fun interface PPCI_LINE_TO_PINFn {
    public operator fun invoke()
}

public typealias PPCI_LINE_TO_PIN = PPCI_LINE_TO_PINFn?

public fun interface PPCI_MSIX_GET_ENTRYFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_MSIX_GET_ENTRY = PPCI_MSIX_GET_ENTRYFn?

public fun interface PPCI_MSIX_GET_TABLE_SIZEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_MSIX_GET_TABLE_SIZE = PPCI_MSIX_GET_TABLE_SIZEFn?

public fun interface PPCI_MSIX_MASKUNMASK_ENTRYFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_MSIX_MASKUNMASK_ENTRY = PPCI_MSIX_MASKUNMASK_ENTRYFn?

public fun interface PPCI_MSIX_SET_ENTRYFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_MSIX_SET_ENTRY = PPCI_MSIX_SET_ENTRYFn?

public fun interface PPCI_PIN_TO_LINEFn {
    public operator fun invoke()
}

public typealias PPCI_PIN_TO_LINE = PPCI_PIN_TO_LINEFn?

public fun interface PPCI_PREPARE_MULTISTAGE_RESUMEFn {
    public operator fun invoke()
}

public typealias PPCI_PREPARE_MULTISTAGE_RESUME = PPCI_PREPARE_MULTISTAGE_RESUMEFn?

public fun interface PPCI_READ_WRITE_CONFIGFn {
    public operator fun invoke(): UInt
}

public typealias PPCI_READ_WRITE_CONFIG = PPCI_READ_WRITE_CONFIGFn?

public fun interface PPCI_ROOT_BUS_CAPABILITYFn {
    public operator fun invoke()
}

public typealias PPCI_ROOT_BUS_CAPABILITY = PPCI_ROOT_BUS_CAPABILITYFn?

public fun interface PPCI_SET_ACSFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_SET_ACS = PPCI_SET_ACSFn?

public fun interface PPCI_SET_ACS2Fn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_SET_ACS2 = PPCI_SET_ACS2Fn?

public fun interface PPCI_SET_ATSFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCI_SET_ATS = PPCI_SET_ATSFn?

public fun interface PPCW_CALLBACKFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPCW_CALLBACK = PPCW_CALLBACKFn?

public fun interface PPHYSICAL_COUNTER_EVENT_BUFFER_OVERFLOW_HANDLERFn {
    public operator fun invoke(eventbuffer: Long, entrysize: ULong, numberofentries: ULong, owninghandle: HANDLE)
}

public typealias PPHYSICAL_COUNTER_EVENT_BUFFER_OVERFLOW_HANDLER = PPHYSICAL_COUNTER_EVENT_BUFFER_OVERFLOW_HANDLERFn?

public fun interface PPHYSICAL_COUNTER_OVERFLOW_HANDLERFn {
    public operator fun invoke(overflowbits: ULong, owninghandle: HANDLE)
}

public typealias PPHYSICAL_COUNTER_OVERFLOW_HANDLER = PPHYSICAL_COUNTER_OVERFLOW_HANDLERFn?

public fun interface PPOWER_SETTING_CALLBACKFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPOWER_SETTING_CALLBACK = PPOWER_SETTING_CALLBACKFn?

public fun interface PPO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACK = PPO_FX_COMPONENT_ACTIVE_CONDITION_CALLBACKFn?

public fun interface PPO_FX_COMPONENT_CRITICAL_TRANSITION_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_COMPONENT_CRITICAL_TRANSITION_CALLBACK = PPO_FX_COMPONENT_CRITICAL_TRANSITION_CALLBACKFn?

public fun interface PPO_FX_COMPONENT_IDLE_CONDITION_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_COMPONENT_IDLE_CONDITION_CALLBACK = PPO_FX_COMPONENT_IDLE_CONDITION_CALLBACKFn?

public fun interface PPO_FX_COMPONENT_IDLE_STATE_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_COMPONENT_IDLE_STATE_CALLBACK = PPO_FX_COMPONENT_IDLE_STATE_CALLBACKFn?

public fun interface PPO_FX_COMPONENT_PERF_STATE_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_COMPONENT_PERF_STATE_CALLBACK = PPO_FX_COMPONENT_PERF_STATE_CALLBACKFn?

public fun interface PPO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACK = PPO_FX_DEVICE_POWER_NOT_REQUIRED_CALLBACKFn?

public fun interface PPO_FX_DEVICE_POWER_REQUIRED_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_DEVICE_POWER_REQUIRED_CALLBACK = PPO_FX_DEVICE_POWER_REQUIRED_CALLBACKFn?

public fun interface PPO_FX_DIRECTED_POWER_DOWN_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_DIRECTED_POWER_DOWN_CALLBACK = PPO_FX_DIRECTED_POWER_DOWN_CALLBACKFn?

public fun interface PPO_FX_DIRECTED_POWER_UP_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_DIRECTED_POWER_UP_CALLBACK = PPO_FX_DIRECTED_POWER_UP_CALLBACKFn?

public fun interface PPO_FX_DRIPS_WATCHDOG_CALLBACKFn {
    public operator fun invoke()
}

public typealias PPO_FX_DRIPS_WATCHDOG_CALLBACK = PPO_FX_DRIPS_WATCHDOG_CALLBACKFn?

public fun interface PPO_FX_POWER_CONTROL_CALLBACKFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPO_FX_POWER_CONTROL_CALLBACK = PPO_FX_POWER_CONTROL_CALLBACKFn?

public fun interface PPROCESSOR_CALLBACK_FUNCTIONFn {
    public operator fun invoke()
}

public typealias PPROCESSOR_CALLBACK_FUNCTION = PPROCESSOR_CALLBACK_FUNCTIONFn?

public fun interface PPROCESSOR_HALT_ROUTINEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPROCESSOR_HALT_ROUTINE = PPROCESSOR_HALT_ROUTINEFn?

public fun interface PPTM_DEVICE_DISABLEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPTM_DEVICE_DISABLE = PPTM_DEVICE_DISABLEFn?

public fun interface PPTM_DEVICE_ENABLEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPTM_DEVICE_ENABLE = PPTM_DEVICE_ENABLEFn?

public fun interface PPTM_DEVICE_QUERY_GRANULARITYFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPTM_DEVICE_QUERY_GRANULARITY = PPTM_DEVICE_QUERY_GRANULARITYFn?

public fun interface PPTM_DEVICE_QUERY_TIME_SOURCEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PPTM_DEVICE_QUERY_TIME_SOURCE = PPTM_DEVICE_QUERY_TIME_SOURCEFn?

public fun interface PPUT_DMA_ADAPTERFn {
    public operator fun invoke(dmaadapter: Long)
}

public typealias PPUT_DMA_ADAPTER = PPUT_DMA_ADAPTERFn?

public fun interface PPUT_SCATTER_GATHER_LISTFn {
    public operator fun invoke(dmaadapter: Long, scattergather: Long, writetodevice: Boolean)
}

public typealias PPUT_SCATTER_GATHER_LIST = PPUT_SCATTER_GATHER_LISTFn?

public fun interface PQUERYEXTENDEDADDRESSFn {
    public operator fun invoke(context: Long, extendedaddress: Long)
}

public typealias PQUERYEXTENDEDADDRESS = PQUERYEXTENDEDADDRESSFn?

public fun interface PREAD_DMA_COUNTERFn {
    public operator fun invoke(dmaadapter: Long): UInt
}

public typealias PREAD_DMA_COUNTER = PREAD_DMA_COUNTERFn?

public fun interface PREENUMERATE_SELFFn {
    public operator fun invoke(context: Long)
}

public typealias PREENUMERATE_SELF = PREENUMERATE_SELFFn?

public fun interface PREGISTER_FOR_DEVICE_NOTIFICATIONSFn {
    public operator fun invoke(param0: Long, param1: PDEVICE_NOTIFY_CALLBACK, param2: Long): NTSTATUS
}

public typealias PREGISTER_FOR_DEVICE_NOTIFICATIONS = PREGISTER_FOR_DEVICE_NOTIFICATIONSFn?

public fun interface PREGISTER_FOR_DEVICE_NOTIFICATIONS2Fn {
    public operator fun invoke(context: Long, notificationhandler: PDEVICE_NOTIFY_CALLBACK2, notificationcontext: Long): NTSTATUS
}

public typealias PREGISTER_FOR_DEVICE_NOTIFICATIONS2 = PREGISTER_FOR_DEVICE_NOTIFICATIONS2Fn?

public fun interface PREPLACE_BEGINFn {
    public operator fun invoke(parameters: Long, context: Long): NTSTATUS
}

public typealias PREPLACE_BEGIN = PREPLACE_BEGINFn?

public fun interface PREPLACE_DRIVER_INITFn {
    public operator fun invoke(iface: Long, unused: Long): NTSTATUS
}

public typealias PREPLACE_DRIVER_INIT = PREPLACE_DRIVER_INITFn?

public fun interface PREPLACE_ENABLE_DISABLE_HARDWARE_QUIESCEFn {
    public operator fun invoke(context: Long, enable: Boolean): NTSTATUS
}

public typealias PREPLACE_ENABLE_DISABLE_HARDWARE_QUIESCE = PREPLACE_ENABLE_DISABLE_HARDWARE_QUIESCEFn?

public fun interface PREPLACE_ENDFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PREPLACE_END = PREPLACE_ENDFn?

public fun interface PREPLACE_GET_MEMORY_DESTINATIONFn {
    public operator fun invoke(context: Long, sourceaddress: Long, destinationaddress: Long): NTSTATUS
}

public typealias PREPLACE_GET_MEMORY_DESTINATION = PREPLACE_GET_MEMORY_DESTINATIONFn?

public fun interface PREPLACE_INITIATE_HARDWARE_MIRRORFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PREPLACE_INITIATE_HARDWARE_MIRROR = PREPLACE_INITIATE_HARDWARE_MIRRORFn?

public fun interface PREPLACE_MAP_MEMORYFn {
    public operator fun invoke(targetphysicaladdress: Long, sparephysicaladdress: Long, numberofbytes: Long, targetaddress: Long, spareaddress: Long): NTSTATUS
}

public typealias PREPLACE_MAP_MEMORY = PREPLACE_MAP_MEMORYFn?

public fun interface PREPLACE_MIRROR_PHYSICAL_MEMORYFn {
    public operator fun invoke(context: Long, physicaladdress: Long, bytecount: Long): NTSTATUS
}

public typealias PREPLACE_MIRROR_PHYSICAL_MEMORY = PREPLACE_MIRROR_PHYSICAL_MEMORYFn?

public fun interface PREPLACE_MIRROR_PLATFORM_MEMORYFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PREPLACE_MIRROR_PLATFORM_MEMORY = PREPLACE_MIRROR_PLATFORM_MEMORYFn?

public fun interface PREPLACE_SET_PROCESSOR_IDFn {
    public operator fun invoke(context: Long, apicid: UInt, target: Boolean): NTSTATUS
}

public typealias PREPLACE_SET_PROCESSOR_ID = PREPLACE_SET_PROCESSOR_IDFn?

public fun interface PREPLACE_SWAPFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PREPLACE_SWAP = PREPLACE_SWAPFn?

public fun interface PREPLACE_UNLOADFn {
    public operator fun invoke()
}

public typealias PREPLACE_UNLOAD = PREPLACE_UNLOADFn?

public fun interface PREQUEST_POWER_COMPLETEFn {
    public operator fun invoke()
}

public typealias PREQUEST_POWER_COMPLETE = PREQUEST_POWER_COMPLETEFn?

public fun interface PROCESSOR_CALLBACK_FUNCTIONFn {
    public operator fun invoke(callbackcontext: Long, changecontext: Long, operationstatus: Long)
}

public typealias PROCESSOR_CALLBACK_FUNCTION = PROCESSOR_CALLBACK_FUNCTIONFn?

public fun interface PROCESSOR_HALT_ROUTINEFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PROCESSOR_HALT_ROUTINE = PROCESSOR_HALT_ROUTINEFn?

public fun interface PRTL_AVL_ALLOCATE_ROUTINEFn {
    public operator fun invoke(): Long
}

public typealias PRTL_AVL_ALLOCATE_ROUTINE = PRTL_AVL_ALLOCATE_ROUTINEFn?

public fun interface PRTL_AVL_COMPARE_ROUTINEFn {
    public operator fun invoke(): RTL_GENERIC_COMPARE_RESULTS
}

public typealias PRTL_AVL_COMPARE_ROUTINE = PRTL_AVL_COMPARE_ROUTINEFn?

public fun interface PRTL_AVL_FREE_ROUTINEFn {
    public operator fun invoke()
}

public typealias PRTL_AVL_FREE_ROUTINE = PRTL_AVL_FREE_ROUTINEFn?

public fun interface PRTL_AVL_MATCH_FUNCTIONFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PRTL_AVL_MATCH_FUNCTION = PRTL_AVL_MATCH_FUNCTIONFn?

public fun interface PRTL_GENERIC_ALLOCATE_ROUTINEFn {
    public operator fun invoke(): Long
}

public typealias PRTL_GENERIC_ALLOCATE_ROUTINE = PRTL_GENERIC_ALLOCATE_ROUTINEFn?

public fun interface PRTL_GENERIC_COMPARE_ROUTINEFn {
    public operator fun invoke(): RTL_GENERIC_COMPARE_RESULTS
}

public typealias PRTL_GENERIC_COMPARE_ROUTINE = PRTL_GENERIC_COMPARE_ROUTINEFn?

public fun interface PRTL_GENERIC_FREE_ROUTINEFn {
    public operator fun invoke()
}

public typealias PRTL_GENERIC_FREE_ROUTINE = PRTL_GENERIC_FREE_ROUTINEFn?

public fun interface PRTL_QUERY_REGISTRY_ROUTINEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PRTL_QUERY_REGISTRY_ROUTINE = PRTL_QUERY_REGISTRY_ROUTINEFn?

public fun interface PRTL_RUN_ONCE_INIT_FNFn {
    public operator fun invoke(): UInt
}

public typealias PRTL_RUN_ONCE_INIT_FN = PRTL_RUN_ONCE_INIT_FNFn?

public typealias PSCREATEPROCESSNOTIFYTYPE = Int

public typealias PSCREATETHREADNOTIFYTYPE = Int

public fun interface PSECURE_DRIVER_PROCESS_DEREFERENCEFn {
    public operator fun invoke()
}

public typealias PSECURE_DRIVER_PROCESS_DEREFERENCE = PSECURE_DRIVER_PROCESS_DEREFERENCEFn?

public fun interface PSECURE_DRIVER_PROCESS_REFERENCEFn {
    public operator fun invoke(): PEPROCESS
}

public typealias PSECURE_DRIVER_PROCESS_REFERENCE = PSECURE_DRIVER_PROCESS_REFERENCEFn?

public fun interface PSET_D3COLD_SUPPORTFn {
    public operator fun invoke()
}

public typealias PSET_D3COLD_SUPPORT = PSET_D3COLD_SUPPORTFn?

public fun interface PSET_VIRTUAL_DEVICE_DATAFn {
    public operator fun invoke(): UInt
}

public typealias PSET_VIRTUAL_DEVICE_DATA = PSET_VIRTUAL_DEVICE_DATAFn?

public fun interface PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTIONFn {
    public operator fun invoke()
}

public typealias PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTION = PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTIONFn?

public fun interface PSHED_PI_ATTEMPT_ERROR_RECOVERYFn {
    public operator fun invoke(plugincontext: Long, bufferlength: UInt, errorrecord: Long): NTSTATUS
}

public typealias PSHED_PI_ATTEMPT_ERROR_RECOVERY = PSHED_PI_ATTEMPT_ERROR_RECOVERYFn?

public fun interface PSHED_PI_CLEAR_ERROR_RECORDFn {
    public operator fun invoke(plugincontext: Long, flags: UInt, errorrecordid: ULong): NTSTATUS
}

public typealias PSHED_PI_CLEAR_ERROR_RECORD = PSHED_PI_CLEAR_ERROR_RECORDFn?

public fun interface PSHED_PI_CLEAR_ERROR_STATUSFn {
    public operator fun invoke(plugincontext: Long, errorsource: Long, bufferlength: UInt, errorrecord: Long): NTSTATUS
}

public typealias PSHED_PI_CLEAR_ERROR_STATUS = PSHED_PI_CLEAR_ERROR_STATUSFn?

public fun interface PSHED_PI_DISABLE_ERROR_SOURCEFn {
    public operator fun invoke(plugincontext: Long, errorsource: Long): NTSTATUS
}

public typealias PSHED_PI_DISABLE_ERROR_SOURCE = PSHED_PI_DISABLE_ERROR_SOURCEFn?

public fun interface PSHED_PI_ENABLE_ERROR_SOURCEFn {
    public operator fun invoke(plugincontext: Long, errorsource: Long): NTSTATUS
}

public typealias PSHED_PI_ENABLE_ERROR_SOURCE = PSHED_PI_ENABLE_ERROR_SOURCEFn?

public typealias PSHED_PI_ERR_READING_PCIE_OVERRIDES = Int

public fun interface PSHED_PI_FINALIZE_ERROR_RECORDFn {
    public operator fun invoke(plugincontext: Long, errorsource: Long, bufferlength: UInt, errorrecord: Long): NTSTATUS
}

public typealias PSHED_PI_FINALIZE_ERROR_RECORD = PSHED_PI_FINALIZE_ERROR_RECORDFn?

public fun interface PSHED_PI_GET_ALL_ERROR_SOURCESFn {
    public operator fun invoke(plugincontext: Long, count: Long, errorsrcs: Long, length: Long): NTSTATUS
}

public typealias PSHED_PI_GET_ALL_ERROR_SOURCES = PSHED_PI_GET_ALL_ERROR_SOURCESFn?

public fun interface PSHED_PI_GET_ERROR_SOURCE_INFOFn {
    public operator fun invoke(plugincontext: Long, errorsource: Long): NTSTATUS
}

public typealias PSHED_PI_GET_ERROR_SOURCE_INFO = PSHED_PI_GET_ERROR_SOURCE_INFOFn?

public fun interface PSHED_PI_GET_INJECTION_CAPABILITIESFn {
    public operator fun invoke(plugincontext: Long, capabilities: Long): NTSTATUS
}

public typealias PSHED_PI_GET_INJECTION_CAPABILITIES = PSHED_PI_GET_INJECTION_CAPABILITIESFn?

public fun interface PSHED_PI_INJECT_ERRORFn {
    public operator fun invoke(plugincontext: Long, errortype: ULong, parameter1: ULong, parameter2: ULong, parameter3: ULong, parameter4: ULong): NTSTATUS
}

public typealias PSHED_PI_INJECT_ERROR = PSHED_PI_INJECT_ERRORFn?

public fun interface PSHED_PI_READ_ERROR_RECORDFn {
    public operator fun invoke(plugincontext: Long, flags: UInt, errorrecordid: ULong, nexterrorrecordid: Long, recordlength: Long, errorrecord: Long): NTSTATUS
}

public typealias PSHED_PI_READ_ERROR_RECORD = PSHED_PI_READ_ERROR_RECORDFn?

public fun interface PSHED_PI_RETRIEVE_ERROR_INFOFn {
    public operator fun invoke(plugincontext: Long, errorsource: Long, bufferlength: ULong, packet: Long): NTSTATUS
}

public typealias PSHED_PI_RETRIEVE_ERROR_INFO = PSHED_PI_RETRIEVE_ERROR_INFOFn?

public fun interface PSHED_PI_SET_ERROR_SOURCE_INFOFn {
    public operator fun invoke(plugincontext: Long, errorsource: Long): NTSTATUS
}

public typealias PSHED_PI_SET_ERROR_SOURCE_INFO = PSHED_PI_SET_ERROR_SOURCE_INFOFn?

public fun interface PSHED_PI_WRITE_ERROR_RECORDFn {
    public operator fun invoke(plugincontext: Long, flags: UInt, recordlength: UInt, errorrecord: Long): NTSTATUS
}

public typealias PSHED_PI_WRITE_ERROR_RECORD = PSHED_PI_WRITE_ERROR_RECORDFn?

public fun interface PTIMER_APC_ROUTINEFn {
    public operator fun invoke(timercontext: Long, timerlowvalue: UInt, timerhighvalue: Int)
}

public typealias PTIMER_APC_ROUTINE = PTIMER_APC_ROUTINEFn?

public fun interface PTM_DEVICE_DISABLEFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PTM_DEVICE_DISABLE = PTM_DEVICE_DISABLEFn?

public fun interface PTM_DEVICE_ENABLEFn {
    public operator fun invoke(context: Long): NTSTATUS
}

public typealias PTM_DEVICE_ENABLE = PTM_DEVICE_ENABLEFn?

public fun interface PTM_DEVICE_QUERY_GRANULARITYFn {
    public operator fun invoke(context: Long, granularity: Long): NTSTATUS
}

public typealias PTM_DEVICE_QUERY_GRANULARITY = PTM_DEVICE_QUERY_GRANULARITYFn?

public fun interface PTM_DEVICE_QUERY_TIME_SOURCEFn {
    public operator fun invoke(context: Long, timesource: Long): NTSTATUS
}

public typealias PTM_DEVICE_QUERY_TIME_SOURCE = PTM_DEVICE_QUERY_TIME_SOURCEFn?

public fun interface PTM_PROPAGATE_ROUTINEFn {
    public operator fun invoke(propagationcookie: Long, callbackdata: Long, propagationstatus: NTSTATUS, transactionguid: GUID): NTSTATUS
}

public typealias PTM_PROPAGATE_ROUTINE = PTM_PROPAGATE_ROUTINEFn?

public fun interface PTM_RM_NOTIFICATIONFn {
    public operator fun invoke(enlistmentobject: Long, rmcontext: Long, transactioncontext: Long, transactionnotification: UInt, tmvirtualclock: Long, argumentlength: UInt, argument: Long): NTSTATUS
}

public typealias PTM_RM_NOTIFICATION = PTM_RM_NOTIFICATIONFn?

public fun interface PTRANSLATE_BUS_ADDRESSFn {
    public operator fun invoke(): Boolean
}

public typealias PTRANSLATE_BUS_ADDRESS = PTRANSLATE_BUS_ADDRESSFn?

public fun interface PTRANSLATE_RESOURCE_HANDLERFn {
    public operator fun invoke(context: Long, source: Long, direction: RESOURCE_TRANSLATION_DIRECTION, alternativescount: UInt, alternatives: Long, physicaldeviceobject: Long, target: Long): NTSTATUS
}

public typealias PTRANSLATE_RESOURCE_HANDLER = PTRANSLATE_RESOURCE_HANDLERFn?

public fun interface PTRANSLATE_RESOURCE_REQUIREMENTS_HANDLERFn {
    public operator fun invoke(context: Long, source: Long, physicaldeviceobject: Long, targetcount: Long, target: Long): NTSTATUS
}

public typealias PTRANSLATE_RESOURCE_REQUIREMENTS_HANDLER = PTRANSLATE_RESOURCE_REQUIREMENTS_HANDLERFn?

public fun interface PUNREGISTER_FOR_DEVICE_NOTIFICATIONSFn {
    public operator fun invoke(param0: Long, param1: PDEVICE_NOTIFY_CALLBACK)
}

public typealias PUNREGISTER_FOR_DEVICE_NOTIFICATIONS = PUNREGISTER_FOR_DEVICE_NOTIFICATIONSFn?

public fun interface PUNREGISTER_FOR_DEVICE_NOTIFICATIONS2Fn {
    public operator fun invoke(context: Long)
}

public typealias PUNREGISTER_FOR_DEVICE_NOTIFICATIONS2 = PUNREGISTER_FOR_DEVICE_NOTIFICATIONS2Fn?

public fun interface PciLine2PinFn {
    public operator fun invoke(bushandler: Long, roothandler: Long, slotnumber: PCI_SLOT_NUMBER, pcinewdata: Long, pciolddata: Long)
}

public typealias PciLine2Pin = PciLine2PinFn?

public fun interface PciPin2LineFn {
    public operator fun invoke(bushandler: Long, roothandler: Long, slotnumber: PCI_SLOT_NUMBER, pcidata: Long)
}

public typealias PciPin2Line = PciPin2LineFn?

public fun interface PciReadWriteConfigFn {
    public operator fun invoke(bushandler: Long, slot: PCI_SLOT_NUMBER, buffer: Long, offset: UInt, length: UInt)
}

public typealias PciReadWriteConfig = PciReadWriteConfigFn?

public typealias REG_NOTIFY_CLASS = Int

public fun interface REQUEST_POWER_COMPLETEFn {
    public operator fun invoke(deviceobject: Long, minorfunction: UByte, powerstate: POWER_STATE, context: Long, iostatus: Long)
}

public typealias REQUEST_POWER_COMPLETE = REQUEST_POWER_COMPLETEFn?

public typealias RESOURCE_TRANSLATION_DIRECTION = Int

public fun interface RTL_AVL_ALLOCATE_ROUTINEFn {
    public operator fun invoke(table: Long, bytesize: UInt): Long
}

public typealias RTL_AVL_ALLOCATE_ROUTINE = RTL_AVL_ALLOCATE_ROUTINEFn?

public fun interface RTL_AVL_COMPARE_ROUTINEFn {
    public operator fun invoke(table: Long, firststruct: Long, secondstruct: Long): RTL_GENERIC_COMPARE_RESULTS
}

public typealias RTL_AVL_COMPARE_ROUTINE = RTL_AVL_COMPARE_ROUTINEFn?

public fun interface RTL_AVL_FREE_ROUTINEFn {
    public operator fun invoke(table: Long, buffer: Long)
}

public typealias RTL_AVL_FREE_ROUTINE = RTL_AVL_FREE_ROUTINEFn?

public fun interface RTL_AVL_MATCH_FUNCTIONFn {
    public operator fun invoke(table: Long, userdata: Long, matchdata: Long): NTSTATUS
}

public typealias RTL_AVL_MATCH_FUNCTION = RTL_AVL_MATCH_FUNCTIONFn?

public fun interface RTL_GENERIC_ALLOCATE_ROUTINEFn {
    public operator fun invoke(table: Long, bytesize: UInt): Long
}

public typealias RTL_GENERIC_ALLOCATE_ROUTINE = RTL_GENERIC_ALLOCATE_ROUTINEFn?

public typealias RTL_GENERIC_COMPARE_RESULTS = Int

public fun interface RTL_GENERIC_COMPARE_ROUTINEFn {
    public operator fun invoke(table: Long, firststruct: Long, secondstruct: Long): RTL_GENERIC_COMPARE_RESULTS
}

public typealias RTL_GENERIC_COMPARE_ROUTINE = RTL_GENERIC_COMPARE_ROUTINEFn?

public fun interface RTL_GENERIC_FREE_ROUTINEFn {
    public operator fun invoke(table: Long, buffer: Long)
}

public typealias RTL_GENERIC_FREE_ROUTINE = RTL_GENERIC_FREE_ROUTINEFn?

public fun interface RTL_QUERY_REGISTRY_ROUTINEFn {
    public operator fun invoke(valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuelength: UInt, context: Long, entrycontext: Long): NTSTATUS
}

public typealias RTL_QUERY_REGISTRY_ROUTINE = RTL_QUERY_REGISTRY_ROUTINEFn?

public fun interface RTL_RUN_ONCE_INIT_FNFn {
    public operator fun invoke(runonce: Long, parameter: Long, context: Long): UInt
}

public typealias RTL_RUN_ONCE_INIT_FN = RTL_RUN_ONCE_INIT_FNFn?

public fun interface SECURE_DRIVER_PROCESS_DEREFERENCEFn {
    public operator fun invoke(interfacecontext: Long, process: PEPROCESS)
}

public typealias SECURE_DRIVER_PROCESS_DEREFERENCE = SECURE_DRIVER_PROCESS_DEREFERENCEFn?

public fun interface SECURE_DRIVER_PROCESS_REFERENCEFn {
    public operator fun invoke(interfacecontext: Long): PEPROCESS
}

public typealias SECURE_DRIVER_PROCESS_REFERENCE = SECURE_DRIVER_PROCESS_REFERENCEFn?

public typealias SECURITY_CONTEXT_TRACKING_MODE = UByte

public typealias SECURITY_OPERATION_CODE = Int

public fun interface SET_D3COLD_SUPPORTFn {
    public operator fun invoke(context: Long, d3coldsupport: Boolean)
}

public typealias SET_D3COLD_SUPPORT = SET_D3COLD_SUPPORTFn?

public fun interface SET_VIRTUAL_DEVICE_DATAFn {
    public operator fun invoke(context: Long, virtualfunction: UShort, buffer: Long, offset: UInt, length: UInt): UInt
}

public typealias SET_VIRTUAL_DEVICE_DATA = SET_VIRTUAL_DEVICE_DATAFn?

public typealias SE_IMAGE_TYPE = Int

public fun interface SE_IMAGE_VERIFICATION_CALLBACK_FUNCTIONFn {
    public operator fun invoke(callbackcontext: Long, imagetype: SE_IMAGE_TYPE, imageinformation: Long)
}

public typealias SE_IMAGE_VERIFICATION_CALLBACK_FUNCTION = SE_IMAGE_VERIFICATION_CALLBACK_FUNCTIONFn?

public typealias SE_IMAGE_VERIFICATION_CALLBACK_TYPE = Int

public fun interface SILO_CONTEXT_CLEANUP_CALLBACKFn {
    public operator fun invoke(silocontext: Long)
}

public typealias SILO_CONTEXT_CLEANUP_CALLBACK = SILO_CONTEXT_CLEANUP_CALLBACKFn?

public fun interface SILO_MONITOR_CREATE_CALLBACKFn {
    public operator fun invoke(silo: PESILO): NTSTATUS
}

public typealias SILO_MONITOR_CREATE_CALLBACK = SILO_MONITOR_CREATE_CALLBACKFn?

public fun interface SILO_MONITOR_TERMINATE_CALLBACKFn {
    public operator fun invoke(silo: PESILO)
}

public typealias SILO_MONITOR_TERMINATE_CALLBACK = SILO_MONITOR_TERMINATE_CALLBACKFn?

public typealias SOC_SUBSYSTEM_TYPE = Int

public typealias STATE_LOCATION_TYPE = Int

public typealias SUBSYSTEM_INFORMATION_TYPE = Int

public typealias SYSTEM_FIRMWARE_TABLE_ACTION = Int

public typealias SYSTEM_POWER_CONDITION = Int

public typealias TABLE_SEARCH_RESULT = Int

public typealias TRACE_INFORMATION_CLASS = Int

public fun interface TRANSLATE_BUS_ADDRESSFn {
    public operator fun invoke(context: Long, busaddress: Long, length: UInt, addressspace: Long, translatedaddress: Long): Boolean
}

public typealias TRANSLATE_BUS_ADDRESS = TRANSLATE_BUS_ADDRESSFn?

public typealias WHEAP_DPC_ERROR_EVENT_TYPE = Int

public typealias WHEAP_PFA_OFFLINE_DECISION_TYPE = Int

public typealias WHEA_BUGCHECK_RECOVERY_LOG_TYPE = Int

public typealias WHEA_CPU_VENDOR = Int

public typealias WHEA_ERROR_PACKET_DATA_FORMAT = Int

public typealias WHEA_ERROR_SEVERITY = Int

public fun interface WHEA_ERROR_SOURCE_CORRECTFn {
    public operator fun invoke(): NTSTATUS
}

public typealias WHEA_ERROR_SOURCE_CORRECT = WHEA_ERROR_SOURCE_CORRECTFn?

public fun interface WHEA_ERROR_SOURCE_CREATE_RECORDFn {
    public operator fun invoke(): NTSTATUS
}

public typealias WHEA_ERROR_SOURCE_CREATE_RECORD = WHEA_ERROR_SOURCE_CREATE_RECORDFn?

public fun interface WHEA_ERROR_SOURCE_INITIALIZEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias WHEA_ERROR_SOURCE_INITIALIZE = WHEA_ERROR_SOURCE_INITIALIZEFn?

public fun interface WHEA_ERROR_SOURCE_RECOVERFn {
    public operator fun invoke(): NTSTATUS
}

public typealias WHEA_ERROR_SOURCE_RECOVER = WHEA_ERROR_SOURCE_RECOVERFn?

public fun interface WHEA_ERROR_SOURCE_UNINITIALIZEFn {
    public operator fun invoke()
}

public typealias WHEA_ERROR_SOURCE_UNINITIALIZE = WHEA_ERROR_SOURCE_UNINITIALIZEFn?

public typealias WHEA_ERROR_TYPE = Int

public typealias WHEA_EVENT_LOG_ENTRY_ID = Int

public typealias WHEA_EVENT_LOG_ENTRY_TYPE = Int

public typealias WHEA_PCIEXPRESS_DEVICE_TYPE = Int

public typealias WHEA_PCI_RECOVERY_SIGNAL = Int

public typealias WHEA_PCI_RECOVERY_STATUS = Int

public typealias WHEA_PFA_REMOVE_TRIGGER = Int

public typealias WHEA_PSHED_PLUGIN_ENABLE_NOTIFY_ERRORS = Int

public typealias WHEA_RAW_DATA_FORMAT = Int

public typealias WHEA_RECOVERY_CONTEXT_ERROR_TYPE = Int

public typealias WHEA_RECOVERY_FAILURE_REASON = Int

public typealias WHEA_RECOVERY_TYPE = Int

public fun interface WHEA_SIGNAL_HANDLER_OVERRIDE_CALLBACKFn {
    public operator fun invoke(): Boolean
}

public typealias WHEA_SIGNAL_HANDLER_OVERRIDE_CALLBACK = WHEA_SIGNAL_HANDLER_OVERRIDE_CALLBACKFn?

public typealias WHEA_THROTTLE_TYPE = Int

public fun interface WMI_NOTIFICATION_CALLBACKFn {
    public operator fun invoke()
}

public typealias WMI_NOTIFICATION_CALLBACK = WMI_NOTIFICATION_CALLBACKFn?

public fun interface WORKER_THREAD_ROUTINEFn {
    public operator fun invoke(parameter: Long)
}

public typealias WORKER_THREAD_ROUTINE = WORKER_THREAD_ROUTINEFn?

public typealias WORK_QUEUE_TYPE = Int

public fun interface _WHEA_ERROR_SOURCE_CORRECTFn {
    public operator fun invoke(errorsource: Long, maximumsectionlength: Long): NTSTATUS
}

public typealias _WHEA_ERROR_SOURCE_CORRECT = _WHEA_ERROR_SOURCE_CORRECTFn?

public fun interface _WHEA_ERROR_SOURCE_CREATE_RECORDFn {
    public operator fun invoke(errorsource: Long, errorpacket: Long, errorrecord: Long, buffersize: UInt, context: Long): NTSTATUS
}

public typealias _WHEA_ERROR_SOURCE_CREATE_RECORD = _WHEA_ERROR_SOURCE_CREATE_RECORDFn?

public fun interface _WHEA_ERROR_SOURCE_INITIALIZEFn {
    public operator fun invoke(phase: UInt, errorsource: Long, context: Long): NTSTATUS
}

public typealias _WHEA_ERROR_SOURCE_INITIALIZE = _WHEA_ERROR_SOURCE_INITIALIZEFn?

public fun interface _WHEA_ERROR_SOURCE_RECOVERFn {
    public operator fun invoke(recoverycontext: Long, severity: Long): NTSTATUS
}

public typealias _WHEA_ERROR_SOURCE_RECOVER = _WHEA_ERROR_SOURCE_RECOVERFn?

public fun interface _WHEA_ERROR_SOURCE_UNINITIALIZEFn {
    public operator fun invoke(context: Long)
}

public typealias _WHEA_ERROR_SOURCE_UNINITIALIZE = _WHEA_ERROR_SOURCE_UNINITIALIZEFn?

public fun interface _WHEA_SIGNAL_HANDLER_OVERRIDE_CALLBACKFn {
    public operator fun invoke(context: ULong): Boolean
}

public typealias _WHEA_SIGNAL_HANDLER_OVERRIDE_CALLBACK = _WHEA_SIGNAL_HANDLER_OVERRIDE_CALLBACKFn?

public fun interface pHalAssignSlotResourcesFn {
    public operator fun invoke(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, allocatedresources: Long): NTSTATUS
}

public typealias pHalAssignSlotResources = pHalAssignSlotResourcesFn?

public fun interface pHalEndMirroringFn {
    public operator fun invoke(passnumber: UInt): NTSTATUS
}

public typealias pHalEndMirroring = pHalEndMirroringFn?

public fun interface pHalEndOfBootFn {
    public operator fun invoke()
}

public typealias pHalEndOfBoot = pHalEndOfBootFn?

public fun interface pHalExamineMBRFn {
    public operator fun invoke(deviceobject: Long, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: Long)
}

public typealias pHalExamineMBR = pHalExamineMBRFn?

public fun interface pHalFindBusAddressTranslationFn {
    public operator fun invoke(busaddress: Long, addressspace: Long, translatedaddress: Long, context: Long, nextbus: Boolean): Boolean
}

public typealias pHalFindBusAddressTranslation = pHalFindBusAddressTranslationFn?

public fun interface pHalGetAcpiTableFn {
    public operator fun invoke(signature: UInt, oemid: PCSTR, oemtableid: PCSTR): Long
}

public typealias pHalGetAcpiTable = pHalGetAcpiTableFn?

public fun interface pHalGetDmaAdapterFn {
    public operator fun invoke(physicaldeviceobject: Long, devicedescriptor: Long, numberofmapregisters: Long): Long
}

public typealias pHalGetDmaAdapter = pHalGetDmaAdapterFn?

public fun interface pHalGetInterruptTranslatorFn {
    public operator fun invoke(parentinterfacetype: INTERFACE_TYPE, parentbusnumber: UInt, bridgeinterfacetype: INTERFACE_TYPE, size: UShort, version: UShort, translator: Long, bridgebusnumber: Long): NTSTATUS
}

public typealias pHalGetInterruptTranslator = pHalGetInterruptTranslatorFn?

public fun interface pHalGetPrmCacheFn {
    public operator fun invoke(firmwarelist: Long, updatelist: Long)
}

public typealias pHalGetPrmCache = pHalGetPrmCacheFn?

public fun interface pHalHaltSystemFn {
    public operator fun invoke()
}

public typealias pHalHaltSystem = pHalHaltSystemFn?

public fun interface pHalHandlerForBusFn {
    public operator fun invoke(interfacetype: INTERFACE_TYPE, busnumber: UInt): PBUS_HANDLER
}

public typealias pHalHandlerForBus = pHalHandlerForBusFn?

public fun interface pHalInitPnpDriverFn {
    public operator fun invoke(): NTSTATUS
}

public typealias pHalInitPnpDriver = pHalInitPnpDriverFn?

public fun interface pHalInitPowerManagementFn {
    public operator fun invoke(pmdriverdispatchtable: Long, pmhaldispatchtable: Long): NTSTATUS
}

public typealias pHalInitPowerManagement = pHalInitPowerManagementFn?

public fun interface pHalIoReadPartitionTableFn {
    public operator fun invoke(deviceobject: Long, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: Long): NTSTATUS
}

public typealias pHalIoReadPartitionTable = pHalIoReadPartitionTableFn?

public fun interface pHalIoSetPartitionInformationFn {
    public operator fun invoke(deviceobject: Long, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): NTSTATUS
}

public typealias pHalIoSetPartitionInformation = pHalIoSetPartitionInformationFn?

public fun interface pHalIoWritePartitionTableFn {
    public operator fun invoke(deviceobject: Long, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: Long): NTSTATUS
}

public typealias pHalIoWritePartitionTable = pHalIoWritePartitionTableFn?

public fun interface pHalMirrorPhysicalMemoryFn {
    public operator fun invoke(physicaladdress: Long, numberofbytes: Long): NTSTATUS
}

public typealias pHalMirrorPhysicalMemory = pHalMirrorPhysicalMemoryFn?

public fun interface pHalMirrorVerifyFn {
    public operator fun invoke(physicaladdress: Long, numberofbytes: Long): NTSTATUS
}

public typealias pHalMirrorVerify = pHalMirrorVerifyFn?

public fun interface pHalQueryBusSlotsFn {
    public operator fun invoke(bushandler: PBUS_HANDLER, buffersize: UInt, slotnumbers: Long, returnedlength: Long): NTSTATUS
}

public typealias pHalQueryBusSlots = pHalQueryBusSlotsFn?

public fun interface pHalQuerySystemInformationFn {
    public operator fun invoke(informationclass: HAL_QUERY_INFORMATION_CLASS, buffersize: UInt, buffer: Long, returnedlength: Long): NTSTATUS
}

public typealias pHalQuerySystemInformation = pHalQuerySystemInformationFn?

public fun interface pHalReferenceBusHandlerFn {
    public operator fun invoke(bushandler: PBUS_HANDLER)
}

public typealias pHalReferenceBusHandler = pHalReferenceBusHandlerFn?

public fun interface pHalResetDisplayFn {
    public operator fun invoke(): Boolean
}

public typealias pHalResetDisplay = pHalResetDisplayFn?

public fun interface pHalSetPciErrorHandlerCallbackFn {
    public operator fun invoke(callback: PCI_ERROR_HANDLER_CALLBACK)
}

public typealias pHalSetPciErrorHandlerCallback = pHalSetPciErrorHandlerCallbackFn?

public fun interface pHalSetSystemInformationFn {
    public operator fun invoke(informationclass: HAL_SET_INFORMATION_CLASS, buffersize: UInt, buffer: Long): NTSTATUS
}

public typealias pHalSetSystemInformation = pHalSetSystemInformationFn?

public fun interface pHalStartMirroringFn {
    public operator fun invoke(): NTSTATUS
}

public typealias pHalStartMirroring = pHalStartMirroringFn?

public fun interface pHalTranslateBusAddressFn {
    public operator fun invoke(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean
}

public typealias pHalTranslateBusAddress = pHalTranslateBusAddressFn?

public fun interface pHalVectorToIDTEntryFn {
    public operator fun invoke(vector: UInt): UByte
}

public typealias pHalVectorToIDTEntry = pHalVectorToIDTEntryFn?

public fun interface pKdCheckPowerButtonFn {
    public operator fun invoke()
}

public typealias pKdCheckPowerButton = pKdCheckPowerButtonFn?

public fun interface pKdEnumerateDebuggingDevicesFn {
    public operator fun invoke(loaderblock: Long, device: Long, callback: PDEBUG_DEVICE_FOUND_FUNCTION): NTSTATUS
}

public typealias pKdEnumerateDebuggingDevices = pKdEnumerateDebuggingDevicesFn?

public fun interface pKdGetAcpiTablePhase0Fn {
    public operator fun invoke(loaderblock: Long, signature: UInt): Long
}

public typealias pKdGetAcpiTablePhase0 = pKdGetAcpiTablePhase0Fn?

public fun interface pKdGetPciDataByOffsetFn {
    public operator fun invoke(busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt
}

public typealias pKdGetPciDataByOffset = pKdGetPciDataByOffsetFn?

public fun interface pKdMapPhysicalMemory64Fn {
    public operator fun invoke(physicaladdress: Long, numberpages: UInt, flushcurrenttlb: Boolean): Long
}

public typealias pKdMapPhysicalMemory64 = pKdMapPhysicalMemory64Fn?

public fun interface pKdReleaseIntegratedDeviceForDebuggingFn {
    public operator fun invoke(integrateddevice: Long): NTSTATUS
}

public typealias pKdReleaseIntegratedDeviceForDebugging = pKdReleaseIntegratedDeviceForDebuggingFn?

public fun interface pKdReleasePciDeviceForDebuggingFn {
    public operator fun invoke(pcidevice: Long): NTSTATUS
}

public typealias pKdReleasePciDeviceForDebugging = pKdReleasePciDeviceForDebuggingFn?

public fun interface pKdSetPciDataByOffsetFn {
    public operator fun invoke(busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt
}

public typealias pKdSetPciDataByOffset = pKdSetPciDataByOffsetFn?

public fun interface pKdSetupIntegratedDeviceForDebuggingFn {
    public operator fun invoke(loaderblock: Long, integrateddevice: Long): NTSTATUS
}

public typealias pKdSetupIntegratedDeviceForDebugging = pKdSetupIntegratedDeviceForDebuggingFn?

public fun interface pKdSetupPciDeviceForDebuggingFn {
    public operator fun invoke(loaderblock: Long, pcidevice: Long): NTSTATUS
}

public typealias pKdSetupPciDeviceForDebugging = pKdSetupPciDeviceForDebuggingFn?

public fun interface pKdUnmapVirtualAddressFn {
    public operator fun invoke(virtualaddress: Long, numberpages: UInt, flushcurrenttlb: Boolean)
}

public typealias pKdUnmapVirtualAddress = pKdUnmapVirtualAddressFn?
