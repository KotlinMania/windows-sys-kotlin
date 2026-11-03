package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR

public fun interface FOUND_IMAGE_CALLBACKFn {
    public operator fun invoke(context: Long, imageinfo: Long): BOOL
}

public typealias FOUND_IMAGE_CALLBACK = FOUND_IMAGE_CALLBACKFn?

public typealias GUEST_OS_MICROSOFT_IDS = Int

public typealias GUEST_OS_OPENSOURCE_IDS = Int

public typealias GUEST_OS_VENDOR = Int

public fun interface GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACKFn {
    public operator fun invoke(infomessage: PCSTR)
}

public typealias GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK = GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACKFn?

public typealias HDV_DEVICE_HOST_FLAGS = Int

public typealias HDV_DEVICE_TYPE = Int

public typealias HDV_DOORBELL_FLAGS = Int

public typealias HDV_MMIO_MAPPING_FLAGS = Int

public typealias HDV_PCI_BAR_SELECTOR = Int

public fun interface HDV_PCI_DEVICE_GET_DETAILSFn {
    public operator fun invoke(devicecontext: Long, pnpid: Long, probedbarscount: UInt, probedbars: Long): HRESULT
}

public typealias HDV_PCI_DEVICE_GET_DETAILS = HDV_PCI_DEVICE_GET_DETAILSFn?

public fun interface HDV_PCI_DEVICE_INITIALIZEFn {
    public operator fun invoke(devicecontext: Long): HRESULT
}

public typealias HDV_PCI_DEVICE_INITIALIZE = HDV_PCI_DEVICE_INITIALIZEFn?

public fun interface HDV_PCI_DEVICE_SET_CONFIGURATIONFn {
    public operator fun invoke(devicecontext: Long, configurationvaluecount: UInt, configurationvalues: Long): HRESULT
}

public typealias HDV_PCI_DEVICE_SET_CONFIGURATION = HDV_PCI_DEVICE_SET_CONFIGURATIONFn?

public fun interface HDV_PCI_DEVICE_STARTFn {
    public operator fun invoke(devicecontext: Long): HRESULT
}

public typealias HDV_PCI_DEVICE_START = HDV_PCI_DEVICE_STARTFn?

public fun interface HDV_PCI_DEVICE_STOPFn {
    public operator fun invoke(devicecontext: Long)
}

public typealias HDV_PCI_DEVICE_STOP = HDV_PCI_DEVICE_STOPFn?

public fun interface HDV_PCI_DEVICE_TEARDOWNFn {
    public operator fun invoke(devicecontext: Long)
}

public typealias HDV_PCI_DEVICE_TEARDOWN = HDV_PCI_DEVICE_TEARDOWNFn?

public typealias HDV_PCI_INTERFACE_VERSION = Int

public fun interface HDV_PCI_READ_CONFIG_SPACEFn {
    public operator fun invoke(devicecontext: Long, offset: UInt, value: Long): HRESULT
}

public typealias HDV_PCI_READ_CONFIG_SPACE = HDV_PCI_READ_CONFIG_SPACEFn?

public fun interface HDV_PCI_READ_INTERCEPTED_MEMORYFn {
    public operator fun invoke(devicecontext: Long, barindex: HDV_PCI_BAR_SELECTOR, offset: ULong, length: ULong, value: Long): HRESULT
}

public typealias HDV_PCI_READ_INTERCEPTED_MEMORY = HDV_PCI_READ_INTERCEPTED_MEMORYFn?

public fun interface HDV_PCI_WRITE_CONFIG_SPACEFn {
    public operator fun invoke(devicecontext: Long, offset: UInt, value: UInt): HRESULT
}

public typealias HDV_PCI_WRITE_CONFIG_SPACE = HDV_PCI_WRITE_CONFIG_SPACEFn?

public fun interface HDV_PCI_WRITE_INTERCEPTED_MEMORYFn {
    public operator fun invoke(devicecontext: Long, barindex: HDV_PCI_BAR_SELECTOR, offset: ULong, length: ULong, value: Long): HRESULT
}

public typealias HDV_PCI_WRITE_INTERCEPTED_MEMORY = HDV_PCI_WRITE_INTERCEPTED_MEMORYFn?

public typealias PAGING_MODE = Int

public typealias REGISTER_ID = Int

public typealias VIRTUAL_PROCESSOR_ARCH = Int

public typealias VIRTUAL_PROCESSOR_VENDOR = Int

public typealias WHV_ADVISE_GPA_RANGE_CODE = Int

public typealias WHV_ALLOCATE_VPCI_RESOURCE_FLAGS = Int

public typealias WHV_CACHE_TYPE = Int

public typealias WHV_CAPABILITY_CODE = Int

public typealias WHV_CREATE_VPCI_DEVICE_FLAGS = Int

public fun interface WHV_EMULATOR_GET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACKFn {
    public operator fun invoke(context: Long, registernames: Long, registercount: UInt, registervalues: Long): HRESULT
}

public typealias WHV_EMULATOR_GET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK = WHV_EMULATOR_GET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACKFn?

public fun interface WHV_EMULATOR_IO_PORT_CALLBACKFn {
    public operator fun invoke(context: Long, ioaccess: Long): HRESULT
}

public typealias WHV_EMULATOR_IO_PORT_CALLBACK = WHV_EMULATOR_IO_PORT_CALLBACKFn?

public fun interface WHV_EMULATOR_MEMORY_CALLBACKFn {
    public operator fun invoke(context: Long, memoryaccess: Long): HRESULT
}

public typealias WHV_EMULATOR_MEMORY_CALLBACK = WHV_EMULATOR_MEMORY_CALLBACKFn?

public fun interface WHV_EMULATOR_SET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACKFn {
    public operator fun invoke(context: Long, registernames: Long, registercount: UInt, registervalues: Long): HRESULT
}

public typealias WHV_EMULATOR_SET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK = WHV_EMULATOR_SET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACKFn?

public fun interface WHV_EMULATOR_TRANSLATE_GVA_PAGE_CALLBACKFn {
    public operator fun invoke(context: Long, gva: ULong, translateflags: WHV_TRANSLATE_GVA_FLAGS, translationresult: Long, gpa: Long): HRESULT
}

public typealias WHV_EMULATOR_TRANSLATE_GVA_PAGE_CALLBACK = WHV_EMULATOR_TRANSLATE_GVA_PAGE_CALLBACKFn?

public typealias WHV_EXCEPTION_TYPE = Int

public typealias WHV_INTERRUPT_DESTINATION_MODE = Int

public typealias WHV_INTERRUPT_TRIGGER_MODE = Int

public typealias WHV_INTERRUPT_TYPE = Int

public typealias WHV_MAP_GPA_RANGE_FLAGS = Int

public typealias WHV_MEMORY_ACCESS_TYPE = Int

public typealias WHV_MSR_ACTION = Int

public typealias WHV_NOTIFICATION_PORT_PROPERTY_CODE = Int

public typealias WHV_NOTIFICATION_PORT_TYPE = Int

public typealias WHV_PARTITION_COUNTER_SET = Int

public typealias WHV_PARTITION_HANDLE = Long

public typealias WHV_PARTITION_PROPERTY_CODE = Int

public typealias WHV_PROCESSOR_COUNTER_SET = Int

public typealias WHV_PROCESSOR_VENDOR = Int

public typealias WHV_REGISTER_NAME = Int

public typealias WHV_RUN_VP_CANCEL_REASON = Int

public typealias WHV_RUN_VP_EXIT_REASON = Int

public typealias WHV_TRANSLATE_GVA_FLAGS = Int

public typealias WHV_TRANSLATE_GVA_RESULT_CODE = Int

public typealias WHV_TRIGGER_TYPE = Int

public typealias WHV_VIRTUAL_PROCESSOR_PROPERTY_CODE = Int

public typealias WHV_VIRTUAL_PROCESSOR_STATE_TYPE = Int

public typealias WHV_VPCI_DEVICE_NOTIFICATION_TYPE = Int

public typealias WHV_VPCI_DEVICE_PROPERTY_CODE = Int

public typealias WHV_VPCI_DEVICE_REGISTER_SPACE = Int

public typealias WHV_VPCI_INTERRUPT_TARGET_FLAGS = Int

public typealias WHV_VPCI_MMIO_RANGE_FLAGS = Int

public typealias WHV_X64_APIC_WRITE_TYPE = Int

public typealias WHV_X64_CPUID_RESULT2_FLAGS = Int

public typealias WHV_X64_LOCAL_APIC_EMULATION_MODE = Int

public typealias WHV_X64_PENDING_EVENT_TYPE = Int

public typealias WHV_X64_PENDING_INTERRUPTION_TYPE = Int

public typealias WHV_X64_UNSUPPORTED_FEATURE_CODE = Int
