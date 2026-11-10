package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ABNORMAL_RESET_DETECTED: BugcheckError = 327u

public val ACPI_BIOS_ERROR: BugcheckError = 165u

public val ACPI_BIOS_FATAL_ERROR: BugcheckError = 224u

public val ACPI_DRIVER_INTERNAL: BugcheckError = 163u

public val ACPI_FIRMWARE_WATCHDOG_TIMEOUT: BugcheckError = 464u

public val ACTIVE_EX_WORKER_THREAD_TERMINATION: BugcheckError = 233u

public val AGP_GART_CORRUPTION: BugcheckError = 261u

public val AGP_ILLEGALLY_REPROGRAMMED: BugcheckError = 262u

public val AGP_INTERNAL: BugcheckError = 277u

public val AGP_INVALID_ACCESS: BugcheckError = 260u

public val APC_INDEX_MISMATCH: BugcheckError = 1u

public val API_VERSION_NUMBER: UInt = 12u

public val APP_TAGGING_INITIALIZATION_FAILED: BugcheckError = 266u

public val ASSIGN_DRIVE_LETTERS_FAILED: BugcheckError = 114u

public val ATDISK_DRIVER_INTERNAL: BugcheckError = 66u

public val ATTEMPTED_EXECUTE_OF_NOEXECUTE_MEMORY: BugcheckError = 252u

public val ATTEMPTED_SWITCH_FROM_DPC: BugcheckError = 184u

public val ATTEMPTED_WRITE_TO_CM_PROTECTED_STORAGE: BugcheckError = 284u

public val ATTEMPTED_WRITE_TO_READONLY_MEMORY: BugcheckError = 190u

public val AUDIT_FAILURE: BugcheckError = 134u

public val AZURE_DEVICE_FW_DUMP: BugcheckError = 482u

public val ADDR_MODE1616: AddressMode = 0

public val ADDR_MODE1632: AddressMode = 1

public val ADDR_MODE_FLAT: AddressMode = 3

public val ADDR_MODE_REAL: AddressMode = 2

public val BAD_EXHANDLE: BugcheckError = 167u

public val BAD_OBJECT_HEADER: BugcheckError = 393u

public val BAD_POOL_CALLER: BugcheckError = 194u

public val BAD_POOL_HEADER: BugcheckError = 25u

public val BAD_SYSTEM_CONFIG_INFO: BugcheckError = 116u

public val BC_BLUETOOTH_VERIFIER_FAULT: BugcheckError = 3070u

public val BC_BTHMINI_VERIFIER_FAULT: BugcheckError = 3071u

public val BGI_DETECTED_VIOLATION: BugcheckError = 177u

public val BIND_ALL_IMAGES: UInt = 4u

public val BIND_CACHE_IMPORT_DLLS: UInt = 8u

public val BIND_NO_BOUND_IMPORTS: UInt = 1u

public val BIND_NO_UPDATE: UInt = 2u

public val BIND_REPORT_64BIT_VA: UInt = 16u

public val BITLOCKER_FATAL_ERROR: BugcheckError = 288u

public val BLUETOOTH_ERROR_RECOVERY_LIVEDUMP: BugcheckError = 422u

public val BOOTING_IN_SAFEMODE_DSREPAIR: BugcheckError = 170u

public val BOOTING_IN_SAFEMODE_MINIMAL: BugcheckError = 168u

public val BOOTING_IN_SAFEMODE_NETWORK: BugcheckError = 169u

public val BOOTLOG_ENABLED: BugcheckError = 183u

public val BOOTLOG_LOADED: BugcheckError = 181u

public val BOOTLOG_NOT_LOADED: BugcheckError = 182u

public val BOOTPROC_INITIALIZATION_FAILED: BugcheckError = 110u

public val BOUND_IMAGE_UNSUPPORTED: BugcheckError = 151u

public val BREAKAWAY_CABLE_TRANSITION: BugcheckError = 483u

public val BUGCHECK_CONTEXT_MODIFIER: BugcheckError = 2147483648u

public val BUGCODE_ID_DRIVER: BugcheckError = 210u

public val BUGCODE_MBBADAPTER_DRIVER: BugcheckError = 477u

public val BUGCODE_NDIS_DRIVER: BugcheckError = 124u

public val BUGCODE_NDIS_DRIVER_LIVE_DUMP: BugcheckError = 350u

public val BUGCODE_NETADAPTER_DRIVER: BugcheckError = 414u

public val BUGCODE_USB3_DRIVER: BugcheckError = 324u

public val BUGCODE_USB_DRIVER: BugcheckError = 254u

public val BUGCODE_WIFIADAPTER_DRIVER: BugcheckError = 478u

public val BIND_EXPAND_FILE_HEADERS: ImagehlpStatusReason = 10

public val BIND_FORWARDER: ImagehlpStatusReason = 7

public val BIND_FORWARDER32: ImagehlpStatusReason = 16

public val BIND_FORWARDER64: ImagehlpStatusReason = 17

public val BIND_FORWARDER_NOT: ImagehlpStatusReason = 8

public val BIND_FORWARDER_NOT32: ImagehlpStatusReason = 18

public val BIND_FORWARDER_NOT64: ImagehlpStatusReason = 19

public val BIND_IMAGE_COMPLETE: ImagehlpStatusReason = 11

public val BIND_IMAGE_MODIFIED: ImagehlpStatusReason = 9

public val BIND_IMPORT_MODULE: ImagehlpStatusReason = 5

public val BIND_IMPORT_MODULE_FAILED: ImagehlpStatusReason = 3

public val BIND_IMPORT_PROCEDURE: ImagehlpStatusReason = 6

public val BIND_IMPORT_PROCEDURE32: ImagehlpStatusReason = 14

public val BIND_IMPORT_PROCEDURE64: ImagehlpStatusReason = 15

public val BIND_IMPORT_PROCEDURE_FAILED: ImagehlpStatusReason = 4

public val BIND_MISMATCHED_SYMBOLS: ImagehlpStatusReason = 12

public val BIND_NO_ROOM_IN_IMAGE: ImagehlpStatusReason = 2

public val BIND_OUT_OF_MEMORY: ImagehlpStatusReason = 0

public val BIND_RVA_TO_VA_FAILED: ImagehlpStatusReason = 1

public val BIND_SYMBOLS_NOT_UPDATED: ImagehlpStatusReason = 13

public val CACHE_INITIALIZATION_FAILED: BugcheckError = 102u

public val CACHE_MANAGER: BugcheckError = 52u

public val CALL_HAS_NOT_RETURNED_WATCHDOG_TIMEOUT_LIVEDUMP: BugcheckError = 419u

public val CANCEL_STATE_IN_COMPLETED_IRP: BugcheckError = 72u

public val CANNOT_WRITE_CONFIGURATION: BugcheckError = 117u

public val CBA_CHECK_ARM_MACHINE_THUMB_TYPE_OVERRIDE: UInt = 2147483648u

public val CBA_CHECK_ENGOPT_DISALLOW_NETWORK_PATHS: UInt = 1879048192u

public val CBA_DEBUG_INFO: UInt = 268435456u

public val CBA_DEFERRED_SYMBOL_LOAD_CANCEL: UInt = 7u

public val CBA_DEFERRED_SYMBOL_LOAD_COMPLETE: UInt = 2u

public val CBA_DEFERRED_SYMBOL_LOAD_FAILURE: UInt = 3u

public val CBA_DEFERRED_SYMBOL_LOAD_PARTIAL: UInt = 32u

public val CBA_DEFERRED_SYMBOL_LOAD_START: UInt = 1u

public val CBA_DUPLICATE_SYMBOL: UInt = 5u

public val CBA_ENGINE_PRESENT: UInt = 1610612736u

public val CBA_EVENT: UInt = 16u

public val CBA_MAP_JIT_SYMBOL: UInt = 2684354560u

public val CBA_READ_MEMORY: UInt = 6u

public val CBA_SET_OPTIONS: UInt = 8u

public val CBA_SRCSRV_EVENT: UInt = 1073741824u

public val CBA_SRCSRV_INFO: UInt = 536870912u

public val CBA_SYMBOLS_UNLOADED: UInt = 4u

public val CBA_UPDATE_STATUS_BAR: UInt = 1342177280u

public val CBA_XML_LOG: UInt = 2415919104u

public val CDFS_FILE_SYSTEM: BugcheckError = 38u

public val CERT_PE_IMAGE_DIGEST_ALL_IMPORT_INFO: UInt = 4u

public val CERT_PE_IMAGE_DIGEST_DEBUG_INFO: UInt = 1u

public val CERT_PE_IMAGE_DIGEST_NON_PE_INFO: UInt = 8u

public val CERT_PE_IMAGE_DIGEST_RESOURCES: UInt = 2u

public val CERT_SECTION_TYPE_ANY: UInt = 255u

public val CHECKSUM_MAPVIEW_FAILURE: UInt = 3u

public val CHECKSUM_MAP_FAILURE: UInt = 2u

public val CHECKSUM_OPEN_FAILURE: UInt = 1u

public val CHECKSUM_SUCCESS: UInt = 0u

public val CHECKSUM_UNICODE_FAILURE: UInt = 4u

public val CHIPSET_DETECTED_ERROR: BugcheckError = 185u

public val CID_HANDLE_CREATION: BugcheckError = 22u

public val CID_HANDLE_DELETION: BugcheckError = 23u

public val CLOCK_WATCHDOG_TIMEOUT: BugcheckError = 257u

public val CLUSTER_CLUSPORT_STATUS_IO_TIMEOUT_LIVEDUMP: BugcheckError = 377u

public val CLUSTER_CSVFS_LIVEDUMP: BugcheckError = 392u

public val CLUSTER_CSV_CLUSSVC_DISCONNECT_WATCHDOG: BugcheckError = 368u

public val CLUSTER_CSV_CLUSTER_WATCHDOG_LIVEDUMP: BugcheckError = 363u

public val CLUSTER_CSV_SNAPSHOT_DEVICE_INFO_TIMEOUT_LIVEDUMP: BugcheckError = 359u

public val CLUSTER_CSV_STATE_TRANSITION_INTERVAL_TIMEOUT_LIVEDUMP: BugcheckError = 367u

public val CLUSTER_CSV_STATE_TRANSITION_TIMEOUT_LIVEDUMP: BugcheckError = 360u

public val CLUSTER_CSV_STATUS_IO_TIMEOUT_LIVEDUMP: BugcheckError = 357u

public val CLUSTER_CSV_VOLUME_ARRIVAL_LIVEDUMP: BugcheckError = 361u

public val CLUSTER_CSV_VOLUME_REMOVAL_LIVEDUMP: BugcheckError = 362u

public val CLUSTER_RESOURCE_CALL_TIMEOUT_LIVEDUMP: BugcheckError = 358u

public val CLUSTER_SVHDX_LIVEDUMP: BugcheckError = 413u

public val CNSS_FILE_SYSTEM_FILTER: BugcheckError = 164u

public val CONFIG_INITIALIZATION_FAILED: BugcheckError = 103u

public val CONFIG_LIST_FAILED: BugcheckError = 115u

public val CONNECTED_STANDBY_WATCHDOG_TIMEOUT_LIVEDUMP: BugcheckError = 351u

public val CONTEXT_ALL_AMD64: ContextFlags = 1048607u

public val CONTEXT_ALL_ARM: ContextFlags = 2097167u

public val CONTEXT_ALL_ARM64: ContextFlags = 4194335u

public val CONTEXT_ALL_X86: ContextFlags = 65599u

public val CONTEXT_AMD64: ContextFlags = 1048576u

public val CONTEXT_ARM: ContextFlags = 2097152u

public val CONTEXT_ARM64: ContextFlags = 4194304u

public val CONTEXT_CONTROL_AMD64: ContextFlags = 1048577u

public val CONTEXT_CONTROL_ARM: ContextFlags = 2097153u

public val CONTEXT_CONTROL_ARM64: ContextFlags = 4194305u

public val CONTEXT_CONTROL_X86: ContextFlags = 65537u

public val CONTEXT_DEBUG_REGISTERS_AMD64: ContextFlags = 1048592u

public val CONTEXT_DEBUG_REGISTERS_ARM: ContextFlags = 2097160u

public val CONTEXT_DEBUG_REGISTERS_ARM64: ContextFlags = 4194312u

public val CONTEXT_DEBUG_REGISTERS_X86: ContextFlags = 65552u

public val CONTEXT_EXCEPTION_ACTIVE_AMD64: ContextFlags = 134217728u

public val CONTEXT_EXCEPTION_ACTIVE_ARM: ContextFlags = 134217728u

public val CONTEXT_EXCEPTION_ACTIVE_ARM64: ContextFlags = 134217728u

public val CONTEXT_EXCEPTION_ACTIVE_X86: ContextFlags = 134217728u

public val CONTEXT_EXCEPTION_REPORTING_AMD64: ContextFlags = 2147483648u

public val CONTEXT_EXCEPTION_REPORTING_ARM: ContextFlags = 2147483648u

public val CONTEXT_EXCEPTION_REPORTING_ARM64: ContextFlags = 2147483648u

public val CONTEXT_EXCEPTION_REPORTING_X86: ContextFlags = 2147483648u

public val CONTEXT_EXCEPTION_REQUEST_AMD64: ContextFlags = 1073741824u

public val CONTEXT_EXCEPTION_REQUEST_ARM: ContextFlags = 1073741824u

public val CONTEXT_EXCEPTION_REQUEST_ARM64: ContextFlags = 1073741824u

public val CONTEXT_EXCEPTION_REQUEST_X86: ContextFlags = 1073741824u

public val CONTEXT_EXTENDED_REGISTERS_X86: ContextFlags = 65568u

public val CONTEXT_FLOATING_POINT_AMD64: ContextFlags = 1048584u

public val CONTEXT_FLOATING_POINT_ARM: ContextFlags = 2097156u

public val CONTEXT_FLOATING_POINT_ARM64: ContextFlags = 4194308u

public val CONTEXT_FLOATING_POINT_X86: ContextFlags = 65544u

public val CONTEXT_FULL_AMD64: ContextFlags = 1048587u

public val CONTEXT_FULL_ARM: ContextFlags = 2097159u

public val CONTEXT_FULL_ARM64: ContextFlags = 4194311u

public val CONTEXT_FULL_X86: ContextFlags = 65543u

public val CONTEXT_INTEGER_AMD64: ContextFlags = 1048578u

public val CONTEXT_INTEGER_ARM: ContextFlags = 2097154u

public val CONTEXT_INTEGER_ARM64: ContextFlags = 4194306u

public val CONTEXT_INTEGER_X86: ContextFlags = 65538u

public val CONTEXT_KERNEL_CET_AMD64: ContextFlags = 1048704u

public val CONTEXT_KERNEL_DEBUGGER_AMD64: ContextFlags = 67108864u

public val CONTEXT_RET_TO_GUEST_ARM64: ContextFlags = 1073741824u

public val CONTEXT_SEGMENTS_AMD64: ContextFlags = 1048580u

public val CONTEXT_SEGMENTS_X86: ContextFlags = 65540u

public val CONTEXT_SERVICE_ACTIVE_AMD64: ContextFlags = 268435456u

public val CONTEXT_SERVICE_ACTIVE_ARM: ContextFlags = 268435456u

public val CONTEXT_SERVICE_ACTIVE_ARM64: ContextFlags = 268435456u

public val CONTEXT_SERVICE_ACTIVE_X86: ContextFlags = 268435456u

public val CONTEXT_UNWOUND_TO_CALL_AMD64: ContextFlags = 536870912u

public val CONTEXT_UNWOUND_TO_CALL_ARM: ContextFlags = 536870912u

public val CONTEXT_UNWOUND_TO_CALL_ARM64: ContextFlags = 536870912u

public val CONTEXT_X18_ARM64: ContextFlags = 4194320u

public val CONTEXT_X86: ContextFlags = 65536u

public val CONTEXT_XSTATE_AMD64: ContextFlags = 1048640u

public val CONTEXT_XSTATE_X86: ContextFlags = 65600u

public val COREMSGCALL_INTERNAL_ERROR: BugcheckError = 371u

public val COREMSG_INTERNAL_ERROR: BugcheckError = 372u

public val CORRUPT_ACCESS_TOKEN: BugcheckError = 40u

public val CRASHDUMP_WATCHDOG_TIMEOUT: BugcheckError = 486u

public val CREATE_DELETE_LOCK_NOT_LOCKED: BugcheckError = 20u

public val CREATE_PROCESS_DEBUG_EVENT: DebugEventCode = 3u

public val CREATE_THREAD_DEBUG_EVENT: DebugEventCode = 2u

public val CRITICAL_INITIALIZATION_FAILURE: BugcheckError = 317u

public val CRITICAL_OBJECT_TERMINATION: BugcheckError = 244u

public val CRITICAL_PROCESS_DIED: BugcheckError = 239u

public val CRITICAL_SERVICE_FAILED: BugcheckError = 90u

public val CRITICAL_STRUCTURE_CORRUPTION: BugcheckError = 265u

public val CRYPTO_LIBRARY_INTERNAL_ERROR: BugcheckError = 369u

public val CRYPTO_SELF_TEST_FAILURE: BugcheckError = 291u

public val CANCEL_CALLBACK: MinidumpCallbackType = 6

public val COMMENT_STREAM_A: MinidumpStreamType = 10

public val COMMENT_STREAM_W: MinidumpStreamType = 11

public val DAM_WATCHDOG_TIMEOUT: BugcheckError = 491u

public val DATA_BUS_ERROR: BugcheckError = 46u

public val DATA_COHERENCY_EXCEPTION: BugcheckError = 85u

public val DBGPROP_ATTRIB_ACCESS_FINAL: DbgpropAttribFlags = 32768

public val DBGPROP_ATTRIB_ACCESS_PRIVATE: DbgpropAttribFlags = 8192

public val DBGPROP_ATTRIB_ACCESS_PROTECTED: DbgpropAttribFlags = 16384

public val DBGPROP_ATTRIB_ACCESS_PUBLIC: DbgpropAttribFlags = 4096

public val DBGPROP_ATTRIB_FRAME_INCATCHBLOCK: DbgpropAttribFlags = 33554432

public val DBGPROP_ATTRIB_FRAME_INFINALLYBLOCK: DbgpropAttribFlags = 67108864

public val DBGPROP_ATTRIB_FRAME_INTRYBLOCK: DbgpropAttribFlags = 16777216

public val DBGPROP_ATTRIB_HAS_EXTENDED_ATTRIBS: DbgpropAttribFlags = 8388608

public val DBGPROP_ATTRIB_NO_ATTRIB: DbgpropAttribFlags = 0

public val DBGPROP_ATTRIB_STORAGE_FIELD: DbgpropAttribFlags = 262144

public val DBGPROP_ATTRIB_STORAGE_GLOBAL: DbgpropAttribFlags = 65536

public val DBGPROP_ATTRIB_STORAGE_STATIC: DbgpropAttribFlags = 131072

public val DBGPROP_ATTRIB_STORAGE_VIRTUAL: DbgpropAttribFlags = 524288

public val DBGPROP_ATTRIB_TYPE_IS_CONSTANT: DbgpropAttribFlags = 1048576

public val DBGPROP_ATTRIB_TYPE_IS_SYNCHRONIZED: DbgpropAttribFlags = 2097152

public val DBGPROP_ATTRIB_TYPE_IS_VOLATILE: DbgpropAttribFlags = 4194304

public val DBGPROP_ATTRIB_VALUE_IS_EVENT: DbgpropAttribFlags = 512

public val DBGPROP_ATTRIB_VALUE_IS_EXPANDABLE: DbgpropAttribFlags = 16

public val DBGPROP_ATTRIB_VALUE_IS_FAKE: DbgpropAttribFlags = 32

public val DBGPROP_ATTRIB_VALUE_IS_INVALID: DbgpropAttribFlags = 8

public val DBGPROP_ATTRIB_VALUE_IS_METHOD: DbgpropAttribFlags = 256

public val DBGPROP_ATTRIB_VALUE_IS_RAW_STRING: DbgpropAttribFlags = 1024

public val DBGPROP_ATTRIB_VALUE_IS_RETURN_VALUE: DbgpropAttribFlags = 134217728

public val DBGPROP_ATTRIB_VALUE_PENDING_MUTATION: DbgpropAttribFlags = 268435456

public val DBGPROP_ATTRIB_VALUE_READONLY: DbgpropAttribFlags = 2048

public val DBGPROP_INFO_ATTRIBUTES: DbgpropInfo = 8

public val DBGPROP_INFO_AUTOEXPAND: DbgpropInfo = 134217728

public val DBGPROP_INFO_BEAUTIFY: DbgpropInfo = 33554432

public val DBGPROP_INFO_CALLTOSTRING: DbgpropInfo = 67108864

public val DBGPROP_INFO_DEBUGPROP: DbgpropInfo = 16

public val DBGPROP_INFO_FULLNAME: DbgpropInfo = 32

public val DBGPROP_INFO_NAME: DbgpropInfo = 1

public val DBGPROP_INFO_TYPE: DbgpropInfo = 2

public val DBGPROP_INFO_VALUE: DbgpropInfo = 4

public val DBHHEADER_CVMISC: ModloadDataType = 2u

public val DBHHEADER_DEBUGDIRS: ModloadDataType = 1u

public val DBHHEADER_PDBGUID: UInt = 3u

public val DEREF_UNKNOWN_LOGON_SESSION: BugcheckError = 70u

public val DEVICE_DIAGNOSTIC_LOG_LIVEDUMP: BugcheckError = 481u

public val DEVICE_QUEUE_NOT_BUSY: BugcheckError = 2u

public val DEVICE_REFERENCE_COUNT_NOT_ZERO: BugcheckError = 54u

public val DFSC_FILE_SYSTEM: BugcheckError = 267u

public val DFS_FILE_SYSTEM: BugcheckError = 130u

public val DIRECTED_FX_TRANSITION_LIVEDUMP: BugcheckError = 425u

public val DIRTY_MAPPED_PAGES_CONGESTION: BugcheckError = 235u

public val DIRTY_NOWRITE_PAGES_CONGESTION: BugcheckError = 253u

public val DISORDERLY_SHUTDOWN: BugcheckError = 243u

public val DMA_COMMON_BUFFER_VECTOR_ERROR: BugcheckError = 476u

public val DMP_CONTEXT_RECORD_SIZE_32: UInt = 1200u

public val DMP_CONTEXT_RECORD_SIZE_64: UInt = 3000u

public val DMP_HEADER_COMMENT_SIZE: UInt = 128u

public val DMP_PHYSICAL_MEMORY_BLOCK_SIZE_32: UInt = 700u

public val DMP_PHYSICAL_MEMORY_BLOCK_SIZE_64: UInt = 700u

public val DMP_RESERVED_0_SIZE_32: UInt = 1760u

public val DMP_RESERVED_0_SIZE_64: UInt = 4008u

public val DMP_RESERVED_2_SIZE_32: UInt = 16u

public val DMP_RESERVED_3_SIZE_32: UInt = 56u

public val DPC_WATCHDOG_TIMEOUT: BugcheckError = 258u

public val DPC_WATCHDOG_VIOLATION: BugcheckError = 307u

public val DRIPS_SW_HW_DIVERGENCE_LIVEDUMP: BugcheckError = 420u

public val DRIVER_CAUGHT_MODIFYING_FREED_POOL: BugcheckError = 198u

public val DRIVER_CORRUPTED_EXPOOL: BugcheckError = 197u

public val DRIVER_CORRUPTED_MMPOOL: BugcheckError = 208u

public val DRIVER_CORRUPTED_SYSPTES: BugcheckError = 219u

public val DRIVER_INVALID_CRUNTIME_PARAMETER: BugcheckError = 272u

public val DRIVER_INVALID_STACK_ACCESS: BugcheckError = 220u

public val DRIVER_IRQL_NOT_LESS_OR_EQUAL: BugcheckError = 209u

public val DRIVER_LEFT_LOCKED_PAGES_IN_PROCESS: BugcheckError = 203u

public val DRIVER_OVERRAN_STACK_BUFFER: BugcheckError = 247u

public val DRIVER_PAGE_FAULT_BEYOND_END_OF_ALLOCATION: BugcheckError = 214u

public val DRIVER_PAGE_FAULT_BEYOND_END_OF_ALLOCATION_M: BugcheckError = 268435670u

public val DRIVER_PAGE_FAULT_IN_FREED_SPECIAL_POOL: BugcheckError = 213u

public val DRIVER_PNP_WATCHDOG: BugcheckError = 469u

public val DRIVER_PORTION_MUST_BE_NONPAGED: BugcheckError = 211u

public val DRIVER_POWER_STATE_FAILURE: BugcheckError = 159u

public val DRIVER_RETURNED_HOLDING_CANCEL_LOCK: BugcheckError = 283u

public val DRIVER_RETURNED_STATUS_REPARSE_FOR_VOLUME_OPEN: BugcheckError = 249u

public val DRIVER_UNLOADED_WITHOUT_CANCELLING_PENDING_OPERATIONS: BugcheckError = 206u

public val DRIVER_UNMAPPING_INVALID_VIEW: BugcheckError = 215u

public val DRIVER_USED_EXCESSIVE_PTES: BugcheckError = 216u

public val DRIVER_VERIFIER_DETECTED_VIOLATION: BugcheckError = 196u

public val DRIVER_VERIFIER_DETECTED_VIOLATION_LIVEDUMP: BugcheckError = 452u

public val DRIVER_VERIFIER_DMA_VIOLATION: BugcheckError = 230u

public val DRIVER_VERIFIER_IOMANAGER_VIOLATION: BugcheckError = 201u

public val DRIVER_VERIFIER_TRACKING_LIVE_DUMP: BugcheckError = 485u

public val DRIVER_VIOLATION: BugcheckError = 289u

public val DRIVE_EXTENDER: BugcheckError = 308u

public val DSLFLAG_MISMATCHED_DBG: UInt = 2u

public val DSLFLAG_MISMATCHED_PDB: UInt = 1u

public val DUMP_SUMMARY_VALID_CURRENT_USER_VA: UInt = 2u

public val DUMP_SUMMARY_VALID_KERNEL_VA: UInt = 1u

public val DUMP_TYPE_AUTOMATIC: DumpType = 7

public val DUMP_TYPE_BITMAP_FULL: DumpType = 5

public val DUMP_TYPE_BITMAP_KERNEL: DumpType = 6

public val DUMP_TYPE_FULL: DumpType = 1

public val DUMP_TYPE_HEADER: DumpType = 3

public val DUMP_TYPE_INVALID: DumpType = -1

public val DUMP_TYPE_SUMMARY: DumpType = 2

public val DUMP_TYPE_TRIAGE: DumpType = 4

public val DUMP_TYPE_UNKNOWN: DumpType = 0

public val DYNAMIC_ADD_PROCESSOR_MISMATCH: BugcheckError = 304u

public val EFS_FATAL_ERROR: BugcheckError = 471u

public val ELAM_DRIVER_DETECTED_FATAL_ERROR: BugcheckError = 376u

public val EMPTY_THREAD_REAPER_LIST: BugcheckError = 19u

public val EM_INITIALIZATION_ERROR: BugcheckError = 282u

public val END_OF_NT_EVALUATION_PERIOD: BugcheckError = 152u

public val ERESOURCE_INVALID_RELEASE: BugcheckError = 366u

public val ERRATA_WORKAROUND_UNSUCCESSFUL: BugcheckError = 318u

public val ERROR_IMAGE_NOT_STRIPPED: UInt = 34816u

public val ERROR_NO_DBG_POINTER: UInt = 34817u

public val ERROR_NO_PDB_POINTER: UInt = 34818u

public val ESLFLAG_FULLPATH: UInt = 1u

public val ESLFLAG_INLINE_SITE: UInt = 16u

public val ESLFLAG_NEAREST: UInt = 2u

public val ESLFLAG_NEXT: UInt = 8u

public val ESLFLAG_PREV: UInt = 4u

public val EVENT_SRCSPEW: UInt = 100u

public val EVENT_SRCSPEW_END: UInt = 199u

public val EVENT_SRCSPEW_START: UInt = 100u

public val EVENT_TRACING_FATAL_ERROR: BugcheckError = 285u

public val EXCEPTION_CONTINUE_EXECUTION: Int = -1

public val EXCEPTION_CONTINUE_SEARCH: Int = 0

public val EXCEPTION_DEBUG_EVENT: DebugEventCode = 1u

public val EXCEPTION_EXECUTE_HANDLER: Int = 1

public val EXCEPTION_ON_INVALID_STACK: BugcheckError = 426u

public val EXCEPTION_SCOPE_INVALID: BugcheckError = 333u

public val EXFAT_FILE_SYSTEM: BugcheckError = 300u

public val EXIT_PROCESS_DEBUG_EVENT: DebugEventCode = 5u

public val EXIT_THREAD_DEBUG_EVENT: DebugEventCode = 4u

public val EXRESOURCE_TIMEOUT_LIVEDUMP: BugcheckError = 460u

public val EXT_OUTPUT_VER: UInt = 1u

public val EX_PROP_INFO_DEBUGEXTPROP: ExPropInfoFlags = 4096

public val EX_PROP_INFO_ID: ExPropInfoFlags = 256

public val EX_PROP_INFO_LOCKBYTES: ExPropInfoFlags = 2048

public val EX_PROP_INFO_NTYPE: ExPropInfoFlags = 512

public val EX_PROP_INFO_NVALUE: ExPropInfoFlags = 1024

public val EXCEPTION_STREAM: MinidumpStreamType = 6

public val FACILITY_AAF: FacilityCode = 18u

public val FACILITY_ACCELERATOR: FacilityCode = 1536u

public val FACILITY_ACS: FacilityCode = 20u

public val FACILITY_ACTION_QUEUE: FacilityCode = 44u

public val FACILITY_AUDCLNT: FacilityCode = 2185u

public val FACILITY_AUDIO: FacilityCode = 102u

public val FACILITY_AUDIOSTREAMING: FacilityCode = 1094u

public val FACILITY_BACKGROUNDCOPY: FacilityCode = 32u

public val FACILITY_BCD: FacilityCode = 57u

public val FACILITY_BLB: FacilityCode = 120u

public val FACILITY_BLBUI: FacilityCode = 128u

public val FACILITY_BLB_CLI: FacilityCode = 121u

public val FACILITY_BLUETOOTH_ATT: FacilityCode = 101u

public val FACILITY_CERT: FacilityCode = 11u

public val FACILITY_CMI: FacilityCode = 54u

public val FACILITY_COMPLUS: FacilityCode = 17u

public val FACILITY_CONFIGURATION: FacilityCode = 33u

public val FACILITY_CONTROL: FacilityCode = 10u

public val FACILITY_DAF: FacilityCode = 100u

public val FACILITY_DEBUGGERS: FacilityCode = 176u

public val FACILITY_DEFRAG: FacilityCode = 2304u

public val FACILITY_DELIVERY_OPTIMIZATION: FacilityCode = 208u

public val FACILITY_DEPLOYMENT_SERVICES_BINLSVC: FacilityCode = 261u

public val FACILITY_DEPLOYMENT_SERVICES_CONTENT_PROVIDER: FacilityCode = 293u

public val FACILITY_DEPLOYMENT_SERVICES_DRIVER_PROVISIONING: FacilityCode = 278u

public val FACILITY_DEPLOYMENT_SERVICES_IMAGING: FacilityCode = 258u

public val FACILITY_DEPLOYMENT_SERVICES_MANAGEMENT: FacilityCode = 259u

public val FACILITY_DEPLOYMENT_SERVICES_MULTICAST_CLIENT: FacilityCode = 290u

public val FACILITY_DEPLOYMENT_SERVICES_MULTICAST_SERVER: FacilityCode = 289u

public val FACILITY_DEPLOYMENT_SERVICES_PXE: FacilityCode = 263u

public val FACILITY_DEPLOYMENT_SERVICES_SERVER: FacilityCode = 257u

public val FACILITY_DEPLOYMENT_SERVICES_TFTP: FacilityCode = 264u

public val FACILITY_DEPLOYMENT_SERVICES_TRANSPORT_MANAGEMENT: FacilityCode = 272u

public val FACILITY_DEPLOYMENT_SERVICES_UTIL: FacilityCode = 260u

public val FACILITY_DEVICE_UPDATE_AGENT: FacilityCode = 135u

public val FACILITY_DIRECT2D: FacilityCode = 2201u

public val FACILITY_DIRECT3D10: FacilityCode = 2169u

public val FACILITY_DIRECT3D11: FacilityCode = 2172u

public val FACILITY_DIRECT3D11_DEBUG: FacilityCode = 2173u

public val FACILITY_DIRECT3D12: FacilityCode = 2174u

public val FACILITY_DIRECT3D12_DEBUG: FacilityCode = 2175u

public val FACILITY_DIRECTMUSIC: FacilityCode = 2168u

public val FACILITY_DIRECTORYSERVICE: FacilityCode = 37u

public val FACILITY_DISPATCH: FacilityCode = 2u

public val FACILITY_DLS: FacilityCode = 153u

public val FACILITY_DMSERVER: FacilityCode = 256u

public val FACILITY_DPLAY: FacilityCode = 21u

public val FACILITY_DRVSERVICING: FacilityCode = 136u

public val FACILITY_DXCORE: FacilityCode = 2176u

public val FACILITY_DXGI: FacilityCode = 2170u

public val FACILITY_DXGI_DDI: FacilityCode = 2171u

public val FACILITY_EAP: FacilityCode = 66u

public val FACILITY_EAS: FacilityCode = 85u

public val FACILITY_FVE: FacilityCode = 49u

public val FACILITY_FWP: FacilityCode = 50u

public val FACILITY_GAME: FacilityCode = 2340u

public val FACILITY_GRAPHICS: FacilityCode = 38u

public val FACILITY_HSP_SERVICES: FacilityCode = 296u

public val FACILITY_HSP_SOFTWARE: FacilityCode = 297u

public val FACILITY_HTTP: FacilityCode = 25u

public val FACILITY_INPUT: FacilityCode = 64u

public val FACILITY_INTERNET: FacilityCode = 12u

public val FACILITY_IORING: FacilityCode = 70u

public val FACILITY_ITF: FacilityCode = 4u

public val FACILITY_JSCRIPT: FacilityCode = 2306u

public val FACILITY_LEAP: FacilityCode = 2184u

public val FACILITY_LINGUISTIC_SERVICES: FacilityCode = 305u

public val FACILITY_MBN: FacilityCode = 84u

public val FACILITY_MEDIASERVER: FacilityCode = 13u

public val FACILITY_METADIRECTORY: FacilityCode = 35u

public val FACILITY_MOBILE: FacilityCode = 1793u

public val FACILITY_MSMQ: FacilityCode = 14u

public val FACILITY_NAP: FacilityCode = 39u

public val FACILITY_NDIS: FacilityCode = 52u

public val FACILITY_NT_BIT: FacilityCode = 268435456u

public val FACILITY_NULL: FacilityCode = 0u

public val FACILITY_OCP_UPDATE_AGENT: FacilityCode = 173u

public val FACILITY_ONLINE_ID: FacilityCode = 134u

public val FACILITY_OPC: FacilityCode = 81u

public val FACILITY_P2P: FacilityCode = 99u

public val FACILITY_P2P_INT: FacilityCode = 98u

public val FACILITY_PARSE: FacilityCode = 113u

public val FACILITY_PIDGENX: FacilityCode = 2561u

public val FACILITY_PIX: FacilityCode = 2748u

public val FACILITY_PLA: FacilityCode = 48u

public val FACILITY_POWERSHELL: FacilityCode = 84u

public val FACILITY_PRESENTATION: FacilityCode = 2177u

public val FACILITY_QUIC: FacilityCode = 65u

public val FACILITY_RAS: FacilityCode = 83u

public val FACILITY_RESTORE: FacilityCode = 256u

public val FACILITY_RPC: FacilityCode = 1u

public val FACILITY_SCARD: FacilityCode = 16u

public val FACILITY_SCRIPT: FacilityCode = 112u

public val FACILITY_SDIAG: FacilityCode = 60u

public val FACILITY_SECURITY: FacilityCode = 9u

public val FACILITY_SERVICE_FABRIC: FacilityCode = 1968u

public val FACILITY_SETUPAPI: FacilityCode = 15u

public val FACILITY_SHELL: FacilityCode = 39u

public val FACILITY_SOS: FacilityCode = 160u

public val FACILITY_SPP: FacilityCode = 256u

public val FACILITY_SQLITE: FacilityCode = 1967u

public val FACILITY_SSPI: FacilityCode = 9u

public val FACILITY_STATEREPOSITORY: FacilityCode = 103u

public val FACILITY_STATE_MANAGEMENT: FacilityCode = 34u

public val FACILITY_STORAGE: FacilityCode = 3u

public val FACILITY_SXS: FacilityCode = 23u

public val FACILITY_SYNCENGINE: FacilityCode = 2050u

public val FACILITY_TIERING: FacilityCode = 131u

public val FACILITY_TPM_SERVICES: FacilityCode = 40u

public val FACILITY_TPM_SOFTWARE: FacilityCode = 41u

public val FACILITY_TTD: FacilityCode = 1490u

public val FACILITY_UI: FacilityCode = 42u

public val FACILITY_UMI: FacilityCode = 22u

public val FACILITY_URT: FacilityCode = 19u

public val FACILITY_USERMODE_COMMONLOG: FacilityCode = 26u

public val FACILITY_USERMODE_FILTER_MANAGER: FacilityCode = 31u

public val FACILITY_USERMODE_HNS: FacilityCode = 59u

public val FACILITY_USERMODE_HYPERVISOR: FacilityCode = 53u

public val FACILITY_USERMODE_LICENSING: FacilityCode = 234u

public val FACILITY_USERMODE_SDBUS: FacilityCode = 2305u

public val FACILITY_USERMODE_SPACES: FacilityCode = 231u

public val FACILITY_USERMODE_VHD: FacilityCode = 58u

public val FACILITY_USERMODE_VIRTUALIZATION: FacilityCode = 55u

public val FACILITY_USERMODE_VOLMGR: FacilityCode = 56u

public val FACILITY_USERMODE_VOLSNAP: FacilityCode = 130u

public val FACILITY_USER_MODE_SECURITY_CORE: FacilityCode = 232u

public val FACILITY_USN: FacilityCode = 129u

public val FACILITY_UTC: FacilityCode = 1989u

public val FACILITY_VISUALCPP: FacilityCode = 109u

public val FACILITY_WEB: FacilityCode = 885u

public val FACILITY_WEBSERVICES: FacilityCode = 61u

public val FACILITY_WEB_SOCKET: FacilityCode = 886u

public val FACILITY_WEP: FacilityCode = 2049u

public val FACILITY_WER: FacilityCode = 27u

public val FACILITY_WIA: FacilityCode = 33u

public val FACILITY_WIN32: FacilityCode = 7u

public val FACILITY_WINCODEC_DWRITE_DWM: FacilityCode = 2200u

public val FACILITY_WINDOWS: FacilityCode = 8u

public val FACILITY_WINDOWSUPDATE: FacilityCode = 36u

public val FACILITY_WINDOWS_CE: FacilityCode = 24u

public val FACILITY_WINDOWS_DEFENDER: FacilityCode = 80u

public val FACILITY_WINDOWS_SETUP: FacilityCode = 48u

public val FACILITY_WINDOWS_STORE: FacilityCode = 63u

public val FACILITY_WINML: FacilityCode = 2192u

public val FACILITY_WINPE: FacilityCode = 61u

public val FACILITY_WINRM: FacilityCode = 51u

public val FACILITY_WMAAECMA: FacilityCode = 1996u

public val FACILITY_WPN: FacilityCode = 62u

public val FACILITY_WSBAPP: FacilityCode = 122u

public val FACILITY_WSB_ONLINE: FacilityCode = 133u

public val FACILITY_XAML: FacilityCode = 43u

public val FACILITY_XBOX: FacilityCode = 2339u

public val FACILITY_XPS: FacilityCode = 82u

public val FAST_ERESOURCE_PRECONDITION_VIOLATION: BugcheckError = 454u

public val FATAL_ABNORMAL_RESET_ERROR: BugcheckError = 332u

public val FATAL_UNHANDLED_HARD_ERROR: BugcheckError = 76u

public val FAT_FILE_SYSTEM: BugcheckError = 35u

public val FAULTY_HARDWARE_CORRUPTED_PAGE: BugcheckError = 299u

public val FILE_INITIALIZATION_FAILED: BugcheckError = 104u

public val FILE_SYSTEM: BugcheckError = 34u

public val FLAG_ENGINE_PRESENT: UInt = 4u

public val FLAG_ENGOPT_DISALLOW_NETWORK_PATHS: UInt = 8u

public val FLAG_OVERRIDE_ARM_MACHINE_TYPE: UInt = 16u

public val FLOPPY_INTERNAL_ERROR: BugcheckError = 55u

public val FLTMGR_FILE_SYSTEM: BugcheckError = 245u

public val FORMAT_MESSAGE_ALLOCATE_BUFFER: FormatMessageOptions = 256u

public val FORMAT_MESSAGE_ARGUMENT_ARRAY: FormatMessageOptions = 8192u

public val FORMAT_MESSAGE_FROM_HMODULE: FormatMessageOptions = 2048u

public val FORMAT_MESSAGE_FROM_STRING: FormatMessageOptions = 1024u

public val FORMAT_MESSAGE_FROM_SYSTEM: FormatMessageOptions = 4096u

public val FORMAT_MESSAGE_IGNORE_INSERTS: FormatMessageOptions = 512u

public val FP_EMULATION_ERROR: BugcheckError = 166u

public val FSRTL_EXTRA_CREATE_PARAMETER_VIOLATION: BugcheckError = 268u

public val FUNCTION_TABLE_STREAM: MinidumpStreamType = 13

public val GPIO_CONTROLLER_DRIVER_ERROR: BugcheckError = 312u

public val HAL1_INITIALIZATION_FAILED: BugcheckError = 97u

public val HAL_BLOCKED_PROCESSOR_INTERNAL_ERROR: BugcheckError = 474u

public val HAL_ILLEGAL_IOMMU_PAGE_FAULT: BugcheckError = 345u

public val HAL_INITIALIZATION_FAILED: BugcheckError = 92u

public val HAL_IOMMU_INTERNAL_ERROR: BugcheckError = 473u

public val HAL_MEMORY_ALLOCATION: BugcheckError = 172u

public val HANDLE_ERROR_ON_CRITICAL_THREAD: BugcheckError = 493u

public val HANDLE_LIVE_DUMP: BugcheckError = 492u

public val HARDWARE_INTERRUPT_STORM: BugcheckError = 242u

public val HARDWARE_PROFILE_DOCKED_STRING: BugcheckError = 1073807362u

public val HARDWARE_PROFILE_UNDOCKED_STRING: BugcheckError = 1073807361u

public val HARDWARE_PROFILE_UNKNOWN_STRING: BugcheckError = 1073807363u

public val HARDWARE_WATCHDOG_TIMEOUT: BugcheckError = 463u

public val HTTP_DRIVER_CORRUPTED: BugcheckError = 250u

public val HYPERGUARD_INITIALIZATION_FAILURE: BugcheckError = 383u

public val HYPERGUARD_VIOLATION: BugcheckError = 396u

public val HYPERVISOR_ERROR: BugcheckError = 131073u

public val HANDLE_DATA_STREAM: MinidumpStreamType = 12

public val HANDLE_OPERATION_LIST_STREAM: MinidumpStreamType = 18

public val ILLEGAL_ATS_INITIALIZATION: BugcheckError = 489u

public val ILLEGAL_IOMMU_PAGE_FAULT: BugcheckError = 344u

public val IMAGEHLP_GET_TYPE_INFO_CHILDREN: ImagehlpGetTypeInfoFlags = 2u

public val IMAGEHLP_GET_TYPE_INFO_UNCACHED: ImagehlpGetTypeInfoFlags = 1u

public val IMAGEHLP_MODULE_REGION_ADDITIONAL: UInt = 4u

public val IMAGEHLP_MODULE_REGION_ALL: UInt = 255u

public val IMAGEHLP_MODULE_REGION_DLLBASE: UInt = 1u

public val IMAGEHLP_MODULE_REGION_DLLRANGE: UInt = 2u

public val IMAGEHLP_MODULE_REGION_JIT: UInt = 8u

public val IMAGEHLP_RMAP_BIG_ENDIAN: UInt = 2u

public val IMAGEHLP_RMAP_FIXUP_ARM64X: UInt = 268435456u

public val IMAGEHLP_RMAP_FIXUP_IMAGEBASE: UInt = 2147483648u

public val IMAGEHLP_RMAP_IGNORE_MISCOMPARE: UInt = 4u

public val IMAGEHLP_RMAP_LOAD_RW_DATA_SECTIONS: UInt = 536870912u

public val IMAGEHLP_RMAP_MAPPED_FLAT: UInt = 1u

public val IMAGEHLP_RMAP_OMIT_SHARED_RW_DATA_SECTIONS: UInt = 1073741824u

public val IMAGEHLP_SYMBOL_FUNCTION: UInt = 2048u

public val IMAGEHLP_SYMBOL_INFO_CONSTANT: UInt = 256u

public val IMAGEHLP_SYMBOL_INFO_FRAMERELATIVE: UInt = 32u

public val IMAGEHLP_SYMBOL_INFO_LOCAL: UInt = 128u

public val IMAGEHLP_SYMBOL_INFO_PARAMETER: UInt = 64u

public val IMAGEHLP_SYMBOL_INFO_REGISTER: UInt = 8u

public val IMAGEHLP_SYMBOL_INFO_REGRELATIVE: UInt = 16u

public val IMAGEHLP_SYMBOL_INFO_TLSRELATIVE: UInt = 16384u

public val IMAGEHLP_SYMBOL_INFO_VALUEPRESENT: UInt = 1u

public val IMAGEHLP_SYMBOL_THUNK: UInt = 8192u

public val IMAGEHLP_SYMBOL_TYPE_INFO_MAX: ImagehlpSymbolTypeInfo = 35

public val IMAGEHLP_SYMBOL_VIRTUAL: UInt = 4096u

public val IMAGE_DEBUG_TYPE_BORLAND: ImageDebugType = 9u

public val IMAGE_DEBUG_TYPE_CODEVIEW: ImageDebugType = 2u

public val IMAGE_DEBUG_TYPE_COFF: ImageDebugType = 1u

public val IMAGE_DEBUG_TYPE_EXCEPTION: ImageDebugType = 5u

public val IMAGE_DEBUG_TYPE_FIXUP: ImageDebugType = 6u

public val IMAGE_DEBUG_TYPE_FPO: ImageDebugType = 3u

public val IMAGE_DEBUG_TYPE_MISC: ImageDebugType = 4u

public val IMAGE_DEBUG_TYPE_UNKNOWN: ImageDebugType = 0u

public val IMAGE_DIRECTORY_ENTRY_ARCHITECTURE: ImageDirectoryEntry = 7u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_BASERELOC: ImageDirectoryEntry = 5u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_BOUND_IMPORT: ImageDirectoryEntry = 11u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_COM_DESCRIPTOR: ImageDirectoryEntry = 14u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_DEBUG: ImageDirectoryEntry = 6u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_DELAY_IMPORT: ImageDirectoryEntry = 13u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_EXCEPTION: ImageDirectoryEntry = 3u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_EXPORT: ImageDirectoryEntry = 0u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_GLOBALPTR: ImageDirectoryEntry = 8u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_IAT: ImageDirectoryEntry = 12u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_IMPORT: ImageDirectoryEntry = 1u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_LOAD_CONFIG: ImageDirectoryEntry = 10u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_RESOURCE: ImageDirectoryEntry = 2u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_SECURITY: ImageDirectoryEntry = 4u.toUShort()

public val IMAGE_DIRECTORY_ENTRY_TLS: ImageDirectoryEntry = 9u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_APPCONTAINER: ImageDllCharacteristics = 4096u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_DYNAMIC_BASE: ImageDllCharacteristics = 64u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_EX_CET_COMPAT: ImageDllCharacteristics = 1u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_EX_CET_COMPAT_STRICT_MODE: ImageDllCharacteristics = 2u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_EX_CET_DYNAMIC_APIS_ALLOW_IN_PROC: ImageDllCharacteristics = 8u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_EX_CET_RESERVED_1: ImageDllCharacteristics = 16u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_EX_CET_RESERVED_2: ImageDllCharacteristics = 32u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_EX_CET_SET_CONTEXT_IP_VALIDATION_RELAXED_MODE: ImageDllCharacteristics = 4u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_FORCE_INTEGRITY: ImageDllCharacteristics = 128u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_GUARD_CF: ImageDllCharacteristics = 16384u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_HIGH_ENTROPY_VA: ImageDllCharacteristics = 32u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_NO_BIND: ImageDllCharacteristics = 2048u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_NO_ISOLATION: ImageDllCharacteristics = 512u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_NO_SEH: ImageDllCharacteristics = 1024u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_NX_COMPAT: ImageDllCharacteristics = 256u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_TERMINAL_SERVER_AWARE: ImageDllCharacteristics = 32768u.toUShort()

public val IMAGE_DLLCHARACTERISTICS_WDM_DRIVER: ImageDllCharacteristics = 8192u.toUShort()

public val IMAGE_FILE_32BIT_MACHINE: ImageFileCharacteristics = 256u.toUShort()

public val IMAGE_FILE_32BIT_MACHINE2: ImageFileCharacteristics2 = 256u

public val IMAGE_FILE_AGGRESIVE_WS_TRIM: ImageFileCharacteristics = 16u.toUShort()

public val IMAGE_FILE_AGGRESIVE_WS_TRIM2: ImageFileCharacteristics2 = 16u

public val IMAGE_FILE_BYTES_REVERSED_HI: ImageFileCharacteristics = 32768u.toUShort()

public val IMAGE_FILE_BYTES_REVERSED_HI_2: ImageFileCharacteristics2 = 32768u

public val IMAGE_FILE_BYTES_REVERSED_LO: ImageFileCharacteristics = 128u.toUShort()

public val IMAGE_FILE_BYTES_REVERSED_LO2: ImageFileCharacteristics2 = 128u

public val IMAGE_FILE_DEBUG_STRIPPED: ImageFileCharacteristics = 512u.toUShort()

public val IMAGE_FILE_DEBUG_STRIPPED2: ImageFileCharacteristics2 = 512u

public val IMAGE_FILE_DLL: ImageFileCharacteristics = 8192u.toUShort()

public val IMAGE_FILE_DLL_2: ImageFileCharacteristics2 = 8192u

public val IMAGE_FILE_EXECUTABLE_IMAGE: ImageFileCharacteristics = 2u.toUShort()

public val IMAGE_FILE_EXECUTABLE_IMAGE2: ImageFileCharacteristics2 = 2u

public val IMAGE_FILE_LARGE_ADDRESS_AWARE: ImageFileCharacteristics = 32u.toUShort()

public val IMAGE_FILE_LARGE_ADDRESS_AWARE2: ImageFileCharacteristics2 = 32u

public val IMAGE_FILE_LINE_NUMS_STRIPPED: ImageFileCharacteristics = 4u.toUShort()

public val IMAGE_FILE_LINE_NUMS_STRIPPED2: ImageFileCharacteristics2 = 4u

public val IMAGE_FILE_LOCAL_SYMS_STRIPPED: ImageFileCharacteristics = 8u.toUShort()

public val IMAGE_FILE_LOCAL_SYMS_STRIPPED2: ImageFileCharacteristics2 = 8u

public val IMAGE_FILE_NET_RUN_FROM_SWAP: ImageFileCharacteristics = 2048u.toUShort()

public val IMAGE_FILE_NET_RUN_FROM_SWAP2: ImageFileCharacteristics2 = 2048u

public val IMAGE_FILE_RELOCS_STRIPPED: ImageFileCharacteristics = 1u.toUShort()

public val IMAGE_FILE_RELOCS_STRIPPED2: ImageFileCharacteristics2 = 1u

public val IMAGE_FILE_REMOVABLE_RUN_FROM_SWAP: ImageFileCharacteristics = 1024u.toUShort()

public val IMAGE_FILE_REMOVABLE_RUN_FROM_SWAP2: ImageFileCharacteristics2 = 1024u

public val IMAGE_FILE_SYSTEM: ImageFileCharacteristics = 4096u.toUShort()

public val IMAGE_FILE_SYSTEM_2: ImageFileCharacteristics2 = 4096u

public val IMAGE_FILE_UP_SYSTEM_ONLY: ImageFileCharacteristics = 16384u.toUShort()

public val IMAGE_FILE_UP_SYSTEM_ONLY_2: ImageFileCharacteristics2 = 16384u

public val IMAGE_NT_OPTIONAL_HDR32_MAGIC: ImageOptionalHeaderMagic = 267u.toUShort()

public val IMAGE_NT_OPTIONAL_HDR64_MAGIC: ImageOptionalHeaderMagic = 523u.toUShort()

public val IMAGE_NT_OPTIONAL_HDR_MAGIC: ImageOptionalHeaderMagic = 523u.toUShort()

public val IMAGE_ROM_OPTIONAL_HDR_MAGIC: ImageOptionalHeaderMagic = 263u.toUShort()

public val IMAGE_SCN_ALIGN_1024BYTES: ImageSectionCharacteristics = 11534336u

public val IMAGE_SCN_ALIGN_128BYTES: ImageSectionCharacteristics = 8388608u

public val IMAGE_SCN_ALIGN_16BYTES: ImageSectionCharacteristics = 5242880u

public val IMAGE_SCN_ALIGN_1BYTES: ImageSectionCharacteristics = 1048576u

public val IMAGE_SCN_ALIGN_2048BYTES: ImageSectionCharacteristics = 12582912u

public val IMAGE_SCN_ALIGN_256BYTES: ImageSectionCharacteristics = 9437184u

public val IMAGE_SCN_ALIGN_2BYTES: ImageSectionCharacteristics = 2097152u

public val IMAGE_SCN_ALIGN_32BYTES: ImageSectionCharacteristics = 6291456u

public val IMAGE_SCN_ALIGN_4096BYTES: ImageSectionCharacteristics = 13631488u

public val IMAGE_SCN_ALIGN_4BYTES: ImageSectionCharacteristics = 3145728u

public val IMAGE_SCN_ALIGN_512BYTES: ImageSectionCharacteristics = 10485760u

public val IMAGE_SCN_ALIGN_64BYTES: ImageSectionCharacteristics = 7340032u

public val IMAGE_SCN_ALIGN_8192BYTES: ImageSectionCharacteristics = 14680064u

public val IMAGE_SCN_ALIGN_8BYTES: ImageSectionCharacteristics = 4194304u

public val IMAGE_SCN_ALIGN_MASK: ImageSectionCharacteristics = 15728640u

public val IMAGE_SCN_CNT_CODE: ImageSectionCharacteristics = 32u

public val IMAGE_SCN_CNT_INITIALIZED_DATA: ImageSectionCharacteristics = 64u

public val IMAGE_SCN_CNT_UNINITIALIZED_DATA: ImageSectionCharacteristics = 128u

public val IMAGE_SCN_GPREL: ImageSectionCharacteristics = 32768u

public val IMAGE_SCN_LNK_COMDAT: ImageSectionCharacteristics = 4096u

public val IMAGE_SCN_LNK_INFO: ImageSectionCharacteristics = 512u

public val IMAGE_SCN_LNK_NRELOC_OVFL: ImageSectionCharacteristics = 16777216u

public val IMAGE_SCN_LNK_OTHER: ImageSectionCharacteristics = 256u

public val IMAGE_SCN_LNK_REMOVE: ImageSectionCharacteristics = 2048u

public val IMAGE_SCN_MEM_16BIT: ImageSectionCharacteristics = 131072u

public val IMAGE_SCN_MEM_DISCARDABLE: ImageSectionCharacteristics = 33554432u

public val IMAGE_SCN_MEM_EXECUTE: ImageSectionCharacteristics = 536870912u

public val IMAGE_SCN_MEM_FARDATA: ImageSectionCharacteristics = 32768u

public val IMAGE_SCN_MEM_LOCKED: ImageSectionCharacteristics = 262144u

public val IMAGE_SCN_MEM_NOT_CACHED: ImageSectionCharacteristics = 67108864u

public val IMAGE_SCN_MEM_NOT_PAGED: ImageSectionCharacteristics = 134217728u

public val IMAGE_SCN_MEM_PRELOAD: ImageSectionCharacteristics = 524288u

public val IMAGE_SCN_MEM_PURGEABLE: ImageSectionCharacteristics = 131072u

public val IMAGE_SCN_MEM_READ: ImageSectionCharacteristics = 1073741824u

public val IMAGE_SCN_MEM_SHARED: ImageSectionCharacteristics = 268435456u

public val IMAGE_SCN_MEM_WRITE: ImageSectionCharacteristics = 2147483648u

public val IMAGE_SCN_NO_DEFER_SPEC_EXC: ImageSectionCharacteristics = 16384u

public val IMAGE_SCN_SCALE_INDEX: ImageSectionCharacteristics = 1u

public val IMAGE_SCN_TYPE_NO_PAD: ImageSectionCharacteristics = 8u

public val IMAGE_SUBSYSTEM_EFI_APPLICATION: ImageSubsystem = 10u.toUShort()

public val IMAGE_SUBSYSTEM_EFI_BOOT_SERVICE_DRIVER: ImageSubsystem = 11u.toUShort()

public val IMAGE_SUBSYSTEM_EFI_ROM: ImageSubsystem = 13u.toUShort()

public val IMAGE_SUBSYSTEM_EFI_RUNTIME_DRIVER: ImageSubsystem = 12u.toUShort()

public val IMAGE_SUBSYSTEM_NATIVE: ImageSubsystem = 1u.toUShort()

public val IMAGE_SUBSYSTEM_NATIVE_WINDOWS: ImageSubsystem = 8u.toUShort()

public val IMAGE_SUBSYSTEM_OS2_CUI: ImageSubsystem = 5u.toUShort()

public val IMAGE_SUBSYSTEM_POSIX_CUI: ImageSubsystem = 7u.toUShort()

public val IMAGE_SUBSYSTEM_UNKNOWN: ImageSubsystem = 0u.toUShort()

public val IMAGE_SUBSYSTEM_WINDOWS_BOOT_APPLICATION: ImageSubsystem = 16u.toUShort()

public val IMAGE_SUBSYSTEM_WINDOWS_CE_GUI: ImageSubsystem = 9u.toUShort()

public val IMAGE_SUBSYSTEM_WINDOWS_CUI: ImageSubsystem = 3u.toUShort()

public val IMAGE_SUBSYSTEM_WINDOWS_GUI: ImageSubsystem = 2u.toUShort()

public val IMAGE_SUBSYSTEM_XBOX: ImageSubsystem = 14u.toUShort()

public val IMAGE_SUBSYSTEM_XBOX_CODE_CATALOG: ImageSubsystem = 17u.toUShort()

public val IMPERSONATING_WORKER_THREAD: BugcheckError = 223u

public val INACCESSIBLE_BOOT_DEVICE: BugcheckError = 123u

public val INCONSISTENT_IRP: BugcheckError = 42u

public val INLINE_FRAME_CONTEXT_IGNORE: UInt = 4294967295u

public val INLINE_FRAME_CONTEXT_INIT: UInt = 0u

public val INSTALL_MORE_MEMORY: BugcheckError = 125u

public val INSTRUCTION_BUS_ERROR: BugcheckError = 47u

public val INSTRUCTION_COHERENCY_EXCEPTION: BugcheckError = 86u

public val INSUFFICIENT_SYSTEM_MAP_REGS: BugcheckError = 69u

public val INTERFACESAFE_FOR_UNTRUSTED_CALLER: UInt = 1u

public val INTERFACESAFE_FOR_UNTRUSTED_DATA: UInt = 2u

public val INTERFACE_USES_DISPEX: UInt = 4u

public val INTERFACE_USES_SECURITY_MANAGER: UInt = 8u

public val INTERNAL_POWER_ERROR: BugcheckError = 160u

public val INTERRUPT_EXCEPTION_NOT_HANDLED: BugcheckError = 61u

public val INTERRUPT_UNWIND_ATTEMPTED: BugcheckError = 60u

public val INVALID_AFFINITY_SET: BugcheckError = 3u

public val INVALID_ALTERNATE_SYSTEM_CALL_HANDLER_REGISTRATION: BugcheckError = 480u

public val INVALID_CALLBACK_STACK_ADDRESS: BugcheckError = 461u

public val INVALID_CANCEL_OF_FILE_OPEN: BugcheckError = 232u

public val INVALID_DATA_ACCESS_TRAP: BugcheckError = 4u

public val INVALID_DRIVER_HANDLE: BugcheckError = 287u

public val INVALID_EXTENDED_PROCESSOR_STATE: BugcheckError = 305u

public val INVALID_FLOATING_POINT_STATE: BugcheckError = 231u

public val INVALID_HIBERNATED_STATE: BugcheckError = 189u

public val INVALID_IO_BOOST_STATE: BugcheckError = 316u

public val INVALID_KERNEL_HANDLE: BugcheckError = 147u

public val INVALID_KERNEL_STACK_ADDRESS: BugcheckError = 462u

public val INVALID_MDL_RANGE: BugcheckError = 302u

public val INVALID_PROCESS_ATTACH_ATTEMPT: BugcheckError = 5u

public val INVALID_PROCESS_DETACH_ATTEMPT: BugcheckError = 6u

public val INVALID_PUSH_LOCK_FLAGS: BugcheckError = 338u

public val INVALID_REGION_OR_SEGMENT: BugcheckError = 153u

public val INVALID_RUNDOWN_PROTECTION_FLAGS: BugcheckError = 364u

public val INVALID_SILO_DETACH: BugcheckError = 459u

public val INVALID_SLOT_ALLOCATOR_FLAGS: BugcheckError = 365u

public val INVALID_SOFTWARE_INTERRUPT: BugcheckError = 7u

public val INVALID_THREAD_AFFINITY_STATE: BugcheckError = 488u

public val INVALID_WORK_QUEUE_ITEM: BugcheckError = 150u

public val IO1_INITIALIZATION_FAILED: BugcheckError = 105u

public val IOCTL_IPMI_INTERNAL_RECORD_SEL_EVENT: UInt = 2232320u

public val IORING: BugcheckError = 499u

public val IO_OBJECT_INVALID: BugcheckError = 328u

public val IO_THREADPOOL_DEADLOCK_LIVEDUMP: BugcheckError = 453u

public val IPI_WATCHDOG_TIMEOUT: BugcheckError = 475u

public val IPMI_IOCTL_INDEX: UInt = 1024u

public val IPMI_OS_SEL_RECORD_MASK: UInt = 65535u

public val IPMI_OS_SEL_RECORD_VERSION: UInt = 1u

public val IPMI_OS_SEL_RECORD_VERSION_1: UInt = 1u

public val IRQL_GT_ZERO_AT_SYSTEM_SERVICE: BugcheckError = 74u

public val IRQL_NOT_DISPATCH_LEVEL: BugcheckError = 8u

public val IRQL_NOT_GREATER_OR_EQUAL: BugcheckError = 9u

public val IRQL_NOT_LESS_OR_EQUAL: BugcheckError = 10u

public val IRQL_UNEXPECTED_VALUE: BugcheckError = 200u

public val INCLUDE_MODULE_CALLBACK: MinidumpCallbackType = 4

public val INCLUDE_THREAD_CALLBACK: MinidumpCallbackType = 3

public val INCLUDE_VM_REGION_CALLBACK: MinidumpCallbackType = 10

public val IO_FINISH_CALLBACK: MinidumpCallbackType = 13

public val IO_START_CALLBACK: MinidumpCallbackType = 11

public val IO_WRITE_ALL_CALLBACK: MinidumpCallbackType = 12

public val IPMI_OS_SEL_RECORD_TYPE_BUGCHECK_DATA: IpmiOsSelRecordType = 9

public val IPMI_OS_SEL_RECORD_TYPE_BUGCHECK_RECOVERY: IpmiOsSelRecordType = 8

public val IPMI_OS_SEL_RECORD_TYPE_DRIVER: IpmiOsSelRecordType = 7

public val IPMI_OS_SEL_RECORD_TYPE_MAX: IpmiOsSelRecordType = 10

public val IPMI_OS_SEL_RECORD_TYPE_OTHER: IpmiOsSelRecordType = 1

public val IPMI_OS_SEL_RECORD_TYPE_RAW: IpmiOsSelRecordType = 6

public val IPMI_OS_SEL_RECORD_TYPE_WHEA: IpmiOsSelRecordType = 0

public val IPMI_OS_SEL_RECORD_TYPE_WHEA_ERROR_NMI: IpmiOsSelRecordType = 4

public val IPMI_OS_SEL_RECORD_TYPE_WHEA_ERROR_OTHER: IpmiOsSelRecordType = 5

public val IPMI_OS_SEL_RECORD_TYPE_WHEA_ERROR_PCI: IpmiOsSelRecordType = 3

public val IPMI_OS_SEL_RECORD_TYPE_WHEA_ERROR_XPF_MCA: IpmiOsSelRecordType = 2

public val IPT_TRACE_STREAM: MinidumpStreamType = 23

public val IS_PROCESS_SNAPSHOT_CALLBACK: MinidumpCallbackType = 16

public val JAVA_SCRIPT_DATA_STREAM: MinidumpStreamType = 20

public val KASAN_ENLIGHTENMENT_VIOLATION: BugcheckError = 497u

public val KASAN_ILLEGAL_ACCESS: BugcheckError = 498u

public val KERNEL_APC_PENDING_DURING_EXIT: BugcheckError = 32u

public val KERNEL_AUTO_BOOST_INVALID_LOCK_RELEASE: BugcheckError = 354u

public val KERNEL_AUTO_BOOST_LOCK_ACQUISITION_WITH_RAISED_IRQL: BugcheckError = 402u

public val KERNEL_CFG_INIT_FAILURE: BugcheckError = 1058u

public val KERNEL_DATA_INPAGE_ERROR: BugcheckError = 122u

public val KERNEL_EXPAND_STACK_ACTIVE: BugcheckError = 263u

public val KERNEL_LOCK_ENTRY_LEAKED_ON_THREAD_TERMINATION: BugcheckError = 339u

public val KERNEL_MODE_EXCEPTION_NOT_HANDLED: BugcheckError = 142u

public val KERNEL_MODE_EXCEPTION_NOT_HANDLED_M: BugcheckError = 268435598u

public val KERNEL_MODE_HEAP_CORRUPTION: BugcheckError = 314u

public val KERNEL_PARTITION_REFERENCE_VIOLATION: BugcheckError = 398u

public val KERNEL_SECURITY_CHECK_FAILURE: BugcheckError = 313u

public val KERNEL_STACK_INPAGE_ERROR: BugcheckError = 119u

public val KERNEL_STACK_LOCKED_AT_EXIT: BugcheckError = 148u

public val KERNEL_STORAGE_SLOT_IN_USE: BugcheckError = 409u

public val KERNEL_THREAD_PRIORITY_FLOOR_VIOLATION: BugcheckError = 343u

public val KERNEL_WMI_INTERNAL: BugcheckError = 330u

public val KMODE_EXCEPTION_NOT_HANDLED: BugcheckError = 30u

public val KERNEL_MINIDUMP_STATUS_CALLBACK: MinidumpCallbackType = 8

public val LAST_CHANCE_CALLED_FROM_KMODE: BugcheckError = 21u

public val LIVE_SYSTEM_DUMP: BugcheckError = 353u

public val LM_SERVER_INTERNAL_ERROR: BugcheckError = 84u

public val LOADER_BLOCK_MISMATCH: BugcheckError = 256u

public val LOADER_ROLLBACK_DETECTED: BugcheckError = 406u

public val LOAD_DLL_DEBUG_EVENT: DebugEventCode = 6u

public val LOCKED_PAGES_TRACKER_CORRUPTION: BugcheckError = 217u

public val LPC_INITIALIZATION_FAILED: BugcheckError = 106u

public val LAST_RESERVED_STREAM: MinidumpStreamType = 65535

public val MACHINE_CHECK_EXCEPTION: BugcheckError = 156u

public val MAILSLOT_FILE_SYSTEM: BugcheckError = 82u

public val MANUALLY_INITIATED_BLACKSCREEN_HOTKEY_LIVE_DUMP: BugcheckError = 8648u

public val MANUALLY_INITIATED_CRASH: BugcheckError = 226u

public val MANUALLY_INITIATED_CRASH1: BugcheckError = 3735936685u

public val MANUALLY_INITIATED_POWER_BUTTON_HOLD: BugcheckError = 456u

public val MANUALLY_INITIATED_POWER_BUTTON_HOLD_LIVE_DUMP: BugcheckError = 4552u

public val MAXIMUM_WAIT_OBJECTS_EXCEEDED: BugcheckError = 12u

public val MAX_SYM_NAME: UInt = 2000u

public val MBR_CHECKSUM_MISMATCH: BugcheckError = 139u

public val MDL_CACHE: BugcheckError = 500u

public val MEMORY1_INITIALIZATION_FAILED: BugcheckError = 101u

public val MEMORY_IMAGE_CORRUPT: BugcheckError = 162u

public val MEMORY_MANAGEMENT: BugcheckError = 26u

public val MICROCODE_REVISION_MISMATCH: BugcheckError = 382u

public val MINIDUMP_MISC1_PROCESSOR_POWER_INFO: UInt = 4u

public val MINIDUMP_MISC1_PROCESS_ID: MinidumpMiscInfoFlags = 1u

public val MINIDUMP_MISC1_PROCESS_TIMES: MinidumpMiscInfoFlags = 2u

public val MINIDUMP_MISC3_PROCESS_EXECUTE_FLAGS: UInt = 32u

public val MINIDUMP_MISC3_PROCESS_INTEGRITY: UInt = 16u

public val MINIDUMP_MISC3_PROTECTED_PROCESS: UInt = 128u

public val MINIDUMP_MISC3_TIMEZONE: UInt = 64u

public val MINIDUMP_MISC4_BUILDSTRING: UInt = 256u

public val MINIDUMP_MISC5_PROCESS_COOKIE: UInt = 512u

public val MINIDUMP_PROCESS_VM_COUNTERS: UInt = 1u

public val MINIDUMP_PROCESS_VM_COUNTERS_EX: UInt = 4u

public val MINIDUMP_PROCESS_VM_COUNTERS_EX2: UInt = 8u

public val MINIDUMP_PROCESS_VM_COUNTERS_JOB: UInt = 16u

public val MINIDUMP_PROCESS_VM_COUNTERS_VIRTUALSIZE: UInt = 2u

public val MINIDUMP_SYSMEMINFO1_BASICPERF: UInt = 2u

public val MINIDUMP_SYSMEMINFO1_FILECACHE_TRANSITIONREPURPOSECOUNT_FLAGS: UInt = 1u

public val MINIDUMP_SYSMEMINFO1_PERF_CCTOTALDIRTYPAGES_CCDIRTYPAGETHRESHOLD: UInt = 4u

public val MINIDUMP_SYSMEMINFO1_PERF_RESIDENTAVAILABLEPAGES_SHAREDCOMMITPAGES: UInt = 8u

public val MINIDUMP_THREAD_INFO_ERROR_THREAD: MinidumpThreadInfoDumpFlags = 1u

public val MINIDUMP_THREAD_INFO_EXITED_THREAD: MinidumpThreadInfoDumpFlags = 4u

public val MINIDUMP_THREAD_INFO_INVALID_CONTEXT: MinidumpThreadInfoDumpFlags = 16u

public val MINIDUMP_THREAD_INFO_INVALID_INFO: MinidumpThreadInfoDumpFlags = 8u

public val MINIDUMP_THREAD_INFO_INVALID_TEB: MinidumpThreadInfoDumpFlags = 32u

public val MINIDUMP_THREAD_INFO_WRITING_THREAD: MinidumpThreadInfoDumpFlags = 2u

public val MINIDUMP_VERSION: UInt = 42899u

public val MISALIGNED_POINTER_PARAMETER: BugcheckError = 502u

public val MISMATCHED_HAL: BugcheckError = 121u

public val MPSDRV_QUERY_USER: BugcheckError = 1073742318u

public val MSRPC_STATE_VIOLATION: BugcheckError = 274u

public val MSSECCORE_ASSERTION_FAILURE: BugcheckError = 503u

public val MUI_NO_VALID_SYSTEM_LANGUAGE: BugcheckError = 298u

public val MULTIPLE_IRP_COMPLETE_REQUESTS: BugcheckError = 68u

public val MULTIPROCESSOR_CONFIGURATION_NOT_SUPPORTED: BugcheckError = 62u

public val MUP_FILE_SYSTEM: BugcheckError = 259u

public val MUST_SUCCEED_POOL_EMPTY: BugcheckError = 65u

public val MUTEX_ALREADY_OWNED: BugcheckError = 191u

public val MUTEX_LEVEL_NUMBER_VIOLATION: BugcheckError = 13u

public val MEMORY64LIST_STREAM: MinidumpStreamType = 9

public val MEMORY_CALLBACK: MinidumpCallbackType = 5

public val MEMORY_INFO_LIST_STREAM: MinidumpStreamType = 16

public val MEMORY_LIST_STREAM: MinidumpStreamType = 5

public val MINI_DUMP_FILTER_MEMORY: MinidumpType = 8

public val MINI_DUMP_FILTER_MODULE_PATHS: MinidumpType = 128

public val MINI_DUMP_FILTER_TRIAGE: MinidumpType = 1048576

public val MINI_DUMP_FILTER_WRITE_COMBINED_MEMORY: MinidumpType = 16777216

public val MINI_DUMP_IGNORE_INACCESSIBLE_MEMORY: MinidumpType = 131072

public val MINI_DUMP_NORMAL: MinidumpType = 0

public val MINI_DUMP_SCAN_INACCESSIBLE_PARTIAL_PAGES: MinidumpType = 8388608

public val MINI_DUMP_SCAN_MEMORY: MinidumpType = 16

public val MINI_DUMP_VALID_TYPE_FLAGS: MinidumpType = 33554431

public val MINI_DUMP_WITH_AVX_X_STATE_CONTEXT: MinidumpType = 2097152

public val MINI_DUMP_WITH_CODE_SEGS: MinidumpType = 8192

public val MINI_DUMP_WITH_DATA_SEGS: MinidumpType = 1

public val MINI_DUMP_WITH_FULL_AUXILIARY_STATE: MinidumpType = 32768

public val MINI_DUMP_WITH_FULL_MEMORY: MinidumpType = 2

public val MINI_DUMP_WITH_FULL_MEMORY_INFO: MinidumpType = 2048

public val MINI_DUMP_WITH_HANDLE_DATA: MinidumpType = 4

public val MINI_DUMP_WITH_INDIRECTLY_REFERENCED_MEMORY: MinidumpType = 64

public val MINI_DUMP_WITH_IPT_TRACE: MinidumpType = 4194304

public val MINI_DUMP_WITH_MODULE_HEADERS: MinidumpType = 524288

public val MINI_DUMP_WITH_PRIVATE_READ_WRITE_MEMORY: MinidumpType = 512

public val MINI_DUMP_WITH_PRIVATE_WRITE_COPY_MEMORY: MinidumpType = 65536

public val MINI_DUMP_WITH_PROCESS_THREAD_DATA: MinidumpType = 256

public val MINI_DUMP_WITH_THREAD_INFO: MinidumpType = 4096

public val MINI_DUMP_WITH_TOKEN_INFORMATION: MinidumpType = 262144

public val MINI_DUMP_WITH_UNLOADED_MODULES: MinidumpType = 32

public val MINI_DUMP_WITHOUT_AUXILIARY_STATE: MinidumpType = 16384

public val MINI_DUMP_WITHOUT_OPTIONAL_DATA: MinidumpType = 1024

public val MINI_EVENT_INFORMATION1: MinidumpHandleObjectInformationType = 6

public val MINI_HANDLE_OBJECT_INFORMATION_NONE: MinidumpHandleObjectInformationType = 0

public val MINI_HANDLE_OBJECT_INFORMATION_TYPE_MAX: MinidumpHandleObjectInformationType = 9

public val MINI_MUTANT_INFORMATION1: MinidumpHandleObjectInformationType = 2

public val MINI_MUTANT_INFORMATION2: MinidumpHandleObjectInformationType = 3

public val MINI_PROCESS_INFORMATION1: MinidumpHandleObjectInformationType = 4

public val MINI_PROCESS_INFORMATION2: MinidumpHandleObjectInformationType = 5

public val MINI_SECONDARY_VALID_FLAGS: MinidumpSecondaryFlags = 1

public val MINI_SECONDARY_WITHOUT_POWER_INFO: MinidumpSecondaryFlags = 1

public val MINI_SECTION_INFORMATION1: MinidumpHandleObjectInformationType = 7

public val MINI_SEMAPHORE_INFORMATION1: MinidumpHandleObjectInformationType = 8

public val MINI_THREAD_INFORMATION1: MinidumpHandleObjectInformationType = 1

public val MISC_INFO_STREAM: MinidumpStreamType = 15

public val MODULE_CALLBACK: MinidumpCallbackType = 0

public val MODULE_LIST_STREAM: MinidumpStreamType = 4

public val MODULE_REFERENCED_BY_MEMORY: ModuleWriteFlags = 16

public val MODULE_WRITE_CODE_SEGS: ModuleWriteFlags = 64

public val MODULE_WRITE_CV_RECORD: ModuleWriteFlags = 8

public val MODULE_WRITE_DATA_SEG: ModuleWriteFlags = 2

public val MODULE_WRITE_MISC_RECORD: ModuleWriteFlags = 4

public val MODULE_WRITE_MODULE: ModuleWriteFlags = 1

public val MODULE_WRITE_TLS_DATA: ModuleWriteFlags = 32

public val NDIS_INTERNAL_ERROR: BugcheckError = 79u

public val NDIS_NET_BUFFER_LIST_INFO_ILLEGALLY_TRANSFERRED: BugcheckError = 326u

public val NETIO_INVALID_POOL_CALLER: BugcheckError = 294u

public val NETWORK_BOOT_DUPLICATE_ADDRESS: BugcheckError = 188u

public val NETWORK_BOOT_INITIALIZATION_FAILED: BugcheckError = 187u

public val NMI_HARDWARE_FAILURE: BugcheckError = 128u

public val NMR_INVALID_STATE: BugcheckError = 293u

public val NO_BOOT_DEVICE: BugcheckError = 83u

public val NO_EXCEPTION_HANDLING_SUPPORT: BugcheckError = 11u

public val NO_MORE_IRP_STACK_LOCATIONS: BugcheckError = 53u

public val NO_MORE_SYSTEM_PTES: BugcheckError = 63u

public val NO_PAGES_AVAILABLE: BugcheckError = 77u

public val NO_SPIN_LOCK_AVAILABLE: BugcheckError = 29u

public val NO_SUCH_PARTITION: BugcheckError = 67u

public val NO_USER_MODE_CONTEXT: BugcheckError = 14u

public val NPFS_FILE_SYSTEM: BugcheckError = 37u

public val NTFS_FILE_SYSTEM: BugcheckError = 36u

public val NTHV_GUEST_ERROR: BugcheckError = 280u

public val NUM_SSRVOPTS: UInt = 32u

public val NUM_SYM_TYPES: SymType = 9

public val OBJECT1_INITIALIZATION_FAILED: BugcheckError = 98u

public val OBJECT_ATTRIB_ACCESS_FINAL: ObjectAttribFlags = 32768

public val OBJECT_ATTRIB_ACCESS_PRIVATE: ObjectAttribFlags = 8192

public val OBJECT_ATTRIB_ACCESS_PROTECTED: ObjectAttribFlags = 16384

public val OBJECT_ATTRIB_ACCESS_PUBLIC: ObjectAttribFlags = 4096

public val OBJECT_ATTRIB_HAS_EXTENDED_ATTRIBS: ObjectAttribFlags = 8388608

public val OBJECT_ATTRIB_IS_CLASS: ObjectAttribFlags = 16777216

public val OBJECT_ATTRIB_IS_FUNCTION: ObjectAttribFlags = 33554432

public val OBJECT_ATTRIB_IS_INHERITED: ObjectAttribFlags = 1073741824

public val OBJECT_ATTRIB_IS_INTERFACE: ObjectAttribFlags = -2147483648.toInt()

public val OBJECT_ATTRIB_IS_MACRO: ObjectAttribFlags = 268435456

public val OBJECT_ATTRIB_IS_PROPERTY: ObjectAttribFlags = 134217728

public val OBJECT_ATTRIB_IS_TYPE: ObjectAttribFlags = 536870912

public val OBJECT_ATTRIB_IS_VARIABLE: ObjectAttribFlags = 67108864

public val OBJECT_ATTRIB_NO_ATTRIB: ObjectAttribFlags = 0

public val OBJECT_ATTRIB_NO_NAME: ObjectAttribFlags = 1

public val OBJECT_ATTRIB_NO_TYPE: ObjectAttribFlags = 2

public val OBJECT_ATTRIB_NO_VALUE: ObjectAttribFlags = 4

public val OBJECT_ATTRIB_OBJECT_IS_EXPANDABLE: ObjectAttribFlags = 112

public val OBJECT_ATTRIB_SLOT_IS_CATEGORY: ObjectAttribFlags = 1024

public val OBJECT_ATTRIB_STORAGE_FIELD: ObjectAttribFlags = 262144

public val OBJECT_ATTRIB_STORAGE_GLOBAL: ObjectAttribFlags = 65536

public val OBJECT_ATTRIB_STORAGE_STATIC: ObjectAttribFlags = 131072

public val OBJECT_ATTRIB_STORAGE_VIRTUAL: ObjectAttribFlags = 524288

public val OBJECT_ATTRIB_TYPE_HAS_CODE: ObjectAttribFlags = 512

public val OBJECT_ATTRIB_TYPE_IS_CONSTANT: ObjectAttribFlags = 1048576

public val OBJECT_ATTRIB_TYPE_IS_EXPANDABLE: ObjectAttribFlags = 256

public val OBJECT_ATTRIB_TYPE_IS_OBJECT: ObjectAttribFlags = 256

public val OBJECT_ATTRIB_TYPE_IS_SYNCHRONIZED: ObjectAttribFlags = 2097152

public val OBJECT_ATTRIB_TYPE_IS_VOLATILE: ObjectAttribFlags = 4194304

public val OBJECT_ATTRIB_VALUE_HAS_CODE: ObjectAttribFlags = 128

public val OBJECT_ATTRIB_VALUE_IS_CUSTOM: ObjectAttribFlags = 64

public val OBJECT_ATTRIB_VALUE_IS_ENUM: ObjectAttribFlags = 32

public val OBJECT_ATTRIB_VALUE_IS_INVALID: ObjectAttribFlags = 8

public val OBJECT_ATTRIB_VALUE_IS_OBJECT: ObjectAttribFlags = 16

public val OBJECT_ATTRIB_VALUE_READONLY: ObjectAttribFlags = 2048

public val OBJECT_INITIALIZATION_FAILED: BugcheckError = 94u

public val OFS_FILE_SYSTEM: BugcheckError = 131u

public val OS_DATA_TAMPERING: BugcheckError = 341u

public val OUTPUT_DEBUG_STRING_EVENT: DebugEventCode = 8u

public val PAGE_FAULT_BEYOND_END_OF_ALLOCATION: BugcheckError = 205u

public val PAGE_FAULT_IN_FREED_SPECIAL_POOL: BugcheckError = 204u

public val PAGE_FAULT_IN_NONPAGED_AREA: BugcheckError = 80u

public val PAGE_FAULT_IN_NONPAGED_AREA_M: BugcheckError = 268435536u

public val PAGE_FAULT_WITH_INTERRUPTS_OFF: BugcheckError = 73u

public val PAGE_NOT_ZERO: BugcheckError = 295u

public val PANIC_STACK_SWITCH: BugcheckError = 43u

public val PASSIVE_INTERRUPT_ERROR: BugcheckError = 315u

public val PCI_BUS_DRIVER_INTERNAL: BugcheckError = 161u

public val PCI_CONFIG_SPACE_ACCESS_FAILURE: BugcheckError = 192u

public val PCI_VERIFIER_DETECTED_VIOLATION: BugcheckError = 246u

public val PDC_LOCK_WATCHDOG_LIVEDUMP: BugcheckError = 380u

public val PDC_PRIVILEGE_CHECK_LIVEDUMP: BugcheckError = 415u

public val PDC_UNEXPECTED_REVOCATION_LIVEDUMP: BugcheckError = 381u

public val PDC_WATCHDOG_TIMEOUT: BugcheckError = 335u

public val PDC_WATCHDOG_TIMEOUT_LIVEDUMP: BugcheckError = 348u

public val PFN_LIST_CORRUPT: BugcheckError = 78u

public val PFN_REFERENCE_COUNT: BugcheckError = 28u

public val PFN_SHARE_COUNT: BugcheckError = 27u

public val PF_DETECTED_CORRUPTION: BugcheckError = 401u

public val PHASE0_EXCEPTION: BugcheckError = 120u

public val PHASE0_INITIALIZATION_FAILED: BugcheckError = 49u

public val PHASE1_INITIALIZATION_FAILED: BugcheckError = 50u

public val PINBALL_FILE_SYSTEM: BugcheckError = 89u

public val PNP_DETECTED_FATAL_ERROR: BugcheckError = 202u

public val PNP_INTERNAL_ERROR: BugcheckError = 149u

public val POOL_CORRUPTION_IN_FILE_AREA: BugcheckError = 222u

public val PORT_DRIVER_INTERNAL: BugcheckError = 44u

public val POWER_FAILURE_SIMULATE: BugcheckError = 229u

public val PP0_INITIALIZATION_FAILED: BugcheckError = 143u

public val PP1_INITIALIZATION_FAILED: BugcheckError = 144u

public val PREVIOUS_FATAL_ABNORMAL_RESET_ERROR: BugcheckError = 373u

public val PROCESS1_INITIALIZATION_FAILED: BugcheckError = 107u

public val PROCESSOR_DRIVER_INTERNAL: BugcheckError = 323u

public val PROCESSOR_START_TIMEOUT: BugcheckError = 479u

public val PROCESS_HAS_LOCKED_PAGES: BugcheckError = 118u

public val PROCESS_INITIALIZATION_FAILED: BugcheckError = 96u

public val PROFILER_CONFIGURATION_ILLEGAL: BugcheckError = 379u

public val PROP_INFO_ATTRIBUTES: PropInfoFlags = 8

public val PROP_INFO_AUTOEXPAND: PropInfoFlags = 134217728

public val PROP_INFO_DEBUGPROP: PropInfoFlags = 16

public val PROP_INFO_FULLNAME: PropInfoFlags = 32

public val PROP_INFO_NAME: PropInfoFlags = 1

public val PROP_INFO_TYPE: PropInfoFlags = 2

public val PROP_INFO_VALUE: PropInfoFlags = 4

public val PROCESS_VM_COUNTERS_STREAM: MinidumpStreamType = 22

public val QUOTA_UNDERFLOW: BugcheckError = 33u

public val RAMDISK_BOOT_INITIALIZATION_FAILED: BugcheckError = 248u

public val RDR_FILE_SYSTEM: BugcheckError = 39u

public val RECOM_DRIVER: BugcheckError = 132u

public val RECURSIVE_MACHINE_CHECK: BugcheckError = 251u

public val RECURSIVE_NMI: BugcheckError = 273u

public val REFERENCE_BY_POINTER: BugcheckError = 24u

public val REFMON_INITIALIZATION_FAILED: BugcheckError = 108u

public val REFS_FILE_SYSTEM: BugcheckError = 329u

public val REF_UNKNOWN_LOGON_SESSION: BugcheckError = 71u

public val REGISTRY_CALLBACK_DRIVER_EXCEPTION: BugcheckError = 319u

public val REGISTRY_ERROR: BugcheckError = 81u

public val REGISTRY_FILTER_DRIVER_EXCEPTION: BugcheckError = 309u

public val REGISTRY_LIVE_DUMP: BugcheckError = 487u

public val RESERVE_QUEUE_OVERFLOW: BugcheckError = 255u

public val RESOURCE_NOT_OWNED: BugcheckError = 227u

public val RESOURCE_OWNER_POINTER_INVALID: BugcheckError = 306u

public val RESTORE_LAST_ERROR_NAME: Pcwstr = w("RestoreLastError")

public val RESTORE_LAST_ERROR_NAME_A: Pcstr = s("RestoreLastError")

public val RESTORE_LAST_ERROR_NAME_W: Pcwstr = w("RestoreLastError")

public val RIP_EVENT: DebugEventCode = 9u

public val READ_MEMORY_FAILURE_CALLBACK: MinidumpCallbackType = 14

public val REMOVE_MEMORY_CALLBACK: MinidumpCallbackType = 9

public val RESERVED_STREAM0: MinidumpStreamType = 1

public val RESERVED_STREAM1: MinidumpStreamType = 2

public val SAVER_ACCOUNTPROVSVCINITFAILURE: BugcheckError = 61461u

public val SAVER_APPBARDISMISSAL: BugcheckError = 61454u

public val SAVER_APPLISTUNREACHABLE: BugcheckError = 61456u

public val SAVER_AUDIODRIVERHANG: BugcheckError = 62464u

public val SAVER_AUXILIARYFULLDUMP: BugcheckError = 61460u

public val SAVER_BATTERYPULLOUT: BugcheckError = 62720u

public val SAVER_BLANKSCREEN: BugcheckError = 61442u

public val SAVER_CALLDISMISSAL: BugcheckError = 61453u

public val SAVER_CAPTURESERVICE: BugcheckError = 63488u

public val SAVER_CHROMEPROCESSCRASH: BugcheckError = 61450u

public val SAVER_DEVICEUPDATEUNSPECIFIED: BugcheckError = 62208u

public val SAVER_GRAPHICS: BugcheckError = 61448u

public val SAVER_INPUT: BugcheckError = 61443u

public val SAVER_MEDIACORETESTHANG: BugcheckError = 62976u

public val SAVER_MTBFCOMMANDHANG: BugcheckError = 61697u

public val SAVER_MTBFCOMMANDTIMEOUT: BugcheckError = 789u

public val SAVER_MTBFIOERROR: BugcheckError = 61699u

public val SAVER_MTBFPASSBUGCHECK: BugcheckError = 61698u

public val SAVER_NAVIGATIONMODEL: BugcheckError = 61446u

public val SAVER_NAVSERVERTIMEOUT: BugcheckError = 61449u

public val SAVER_NONRESPONSIVEPROCESS: BugcheckError = 404u

public val SAVER_NOTIFICATIONDISMISSAL: BugcheckError = 61451u

public val SAVER_OUTOFMEMORY: BugcheckError = 61447u

public val SAVER_RENDERMOBILEUIOOM: BugcheckError = 61953u

public val SAVER_RENDERTHREADHANG: BugcheckError = 61952u

public val SAVER_REPORTNOTIFICATIONFAILURE: BugcheckError = 61457u

public val SAVER_RESOURCEMANAGEMENT: BugcheckError = 63232u

public val SAVER_RILADAPTATIONCRASH: BugcheckError = 61455u

public val SAVER_RPCFAILURE: BugcheckError = 61459u

public val SAVER_SICKAPPLICATION: BugcheckError = 34918u

public val SAVER_SPEECHDISMISSAL: BugcheckError = 61452u

public val SAVER_STARTNOTVISIBLE: BugcheckError = 61445u

public val SAVER_UNEXPECTEDSHUTDOWN: BugcheckError = 61458u

public val SAVER_UNSPECIFIED: BugcheckError = 61440u

public val SAVER_WAITFORSHELLREADY: BugcheckError = 63744u

public val SAVER_WATCHDOG: BugcheckError = 61444u

public val SCSI_DISK_DRIVER_INTERNAL: BugcheckError = 45u

public val SCSI_VERIFIER_DETECTED_VIOLATION: BugcheckError = 241u

public val SDBUS_INTERNAL_ERROR: BugcheckError = 346u

public val SECURE_BOOT_VIOLATION: BugcheckError = 325u

public val SECURE_FAULT_UNHANDLED: BugcheckError = 397u

public val SECURE_KERNEL_ERROR: BugcheckError = 395u

public val SECURE_PCI_CONFIG_SPACE_ACCESS_VIOLATION: BugcheckError = 490u

public val SECURITY1_INITIALIZATION_FAILED: BugcheckError = 99u

public val SECURITY_INITIALIZATION_FAILED: BugcheckError = 95u

public val SECURITY_SYSTEM: BugcheckError = 41u

public val SEM_ALL_ERRORS: ThreadErrorMode = 0u

public val SEM_FAILCRITICALERRORS: ThreadErrorMode = 1u

public val SEM_NOALIGNMENTFAULTEXCEPT: ThreadErrorMode = 4u

public val SEM_NOGPFAULTERRORBOX: ThreadErrorMode = 2u

public val SEM_NOOPENFILEERRORBOX: ThreadErrorMode = 32768u

public val SERIAL_DRIVER_INTERNAL: BugcheckError = 56u

public val SESSION1_INITIALIZATION_FAILED: BugcheckError = 109u

public val SESSION_HAS_VALID_POOL_ON_EXIT: BugcheckError = 171u

public val SESSION_HAS_VALID_SPECIAL_POOL_ON_EXIT: BugcheckError = 236u

public val SESSION_HAS_VALID_VIEWS_ON_EXIT: BugcheckError = 186u

public val SETUP_FAILURE: BugcheckError = 133u

public val SET_ENV_VAR_FAILED: BugcheckError = 91u

public val SET_OF_INVALID_CONTEXT: BugcheckError = 48u

public val SHARED_RESOURCE_CONV_ERROR: BugcheckError = 31u

public val SILO_CORRUPT: BugcheckError = 394u

public val SLE_ERROR: RipInfoType = 1u

public val SLE_MINORERROR: RipInfoType = 2u

public val SLE_WARNING: RipInfoType = 3u

public val SLMFLAG_ALT_INDEX: SymLoadFlags = 2u

public val SLMFLAG_NONE: SymLoadFlags = 0u

public val SLMFLAG_NO_SYMBOLS: SymLoadFlags = 4u

public val SLMFLAG_VIRTUAL: SymLoadFlags = 1u

public val SMB_REDIRECTOR_LIVEDUMP: BugcheckError = 423u

public val SMB_SERVER_LIVEDUMP: BugcheckError = 405u

public val SOC_CRITICAL_DEVICE_REMOVED: BugcheckError = 334u

public val SOC_SUBSYSTEM_FAILURE: BugcheckError = 331u

public val SOC_SUBSYSTEM_FAILURE_LIVEDUMP: BugcheckError = 349u

public val SOFT_RESTART_FATAL_ERROR: BugcheckError = 112u

public val SPECIAL_POOL_DETECTED_MEMORY_CORRUPTION: BugcheckError = 193u

public val SPIN_LOCK_ALREADY_OWNED: BugcheckError = 15u

public val SPIN_LOCK_INIT_FAILURE: BugcheckError = 129u

public val SPIN_LOCK_NOT_OWNED: BugcheckError = 16u

public val SPLITSYM_EXTRACT_ALL: UInt = 2u

public val SPLITSYM_REMOVE_PRIVATE: UInt = 1u

public val SPLITSYM_SYMBOLPATH_IS_SRC: UInt = 4u

public val SSRVACTION_CHECKSUMSTATUS: UInt = 8u

public val SSRVACTION_EVENT: UInt = 3u

public val SSRVACTION_EVENTW: UInt = 4u

public val SSRVACTION_HTTPSTATUS: UInt = 6u

public val SSRVACTION_QUERYCANCEL: UInt = 2u

public val SSRVACTION_SIZE: UInt = 5u

public val SSRVACTION_TRACE: UInt = 1u

public val SSRVACTION_XMLOUTPUT: UInt = 7u

public val SSRVOPT_CALLBACK: UInt = 1u

public val SSRVOPT_CALLBACKW: UInt = 65536u

public val SSRVOPT_DISABLE_PING_HOST: UInt = 67108864u

public val SSRVOPT_DISABLE_TIMEOUT: UInt = 134217728u

public val SSRVOPT_DONT_UNCOMPRESS: UInt = 33554432u

public val SSRVOPT_DOWNSTREAM_STORE: UInt = 8192u

public val SSRVOPT_DWORD: SymFindIdOption = 2u

public val SSRVOPT_DWORDPTR: SymFindIdOption = 4u

public val SSRVOPT_ENABLE_COMM_MSG: UInt = 268435456u

public val SSRVOPT_FAVOR_COMPRESSED: UInt = 2097152u

public val SSRVOPT_FLAT_DEFAULT_STORE: UInt = 131072u

public val SSRVOPT_GETPATH: UInt = 64u

public val SSRVOPT_GUIDPTR: SymFindIdOption = 8u

public val SSRVOPT_MAX: UInt = 2147483648u

public val SSRVOPT_MESSAGE: UInt = 524288u

public val SSRVOPT_NOCOPY: UInt = 64u

public val SSRVOPT_OLDGUIDPTR: UInt = 16u

public val SSRVOPT_OVERWRITE: UInt = 16384u

public val SSRVOPT_PARAMTYPE: UInt = 256u

public val SSRVOPT_PARENTWIN: UInt = 128u

public val SSRVOPT_PROXY: UInt = 4096u

public val SSRVOPT_PROXYW: UInt = 262144u

public val SSRVOPT_RESETTOU: UInt = 32768u

public val SSRVOPT_RETRY_APP_HANG: UInt = 2147483648u

public val SSRVOPT_SECURE: UInt = 512u

public val SSRVOPT_SERVICE: UInt = 1048576u

public val SSRVOPT_SETCONTEXT: UInt = 2048u

public val SSRVOPT_STRING: UInt = 4194304u

public val SSRVOPT_TRACE: UInt = 1024u

public val SSRVOPT_UNATTENDED: UInt = 32u

public val SSRVOPT_URI_FILTER: UInt = 536870912u

public val SSRVOPT_URI_TIERS: UInt = 1073741824u

public val SSRVOPT_WINHTTP: UInt = 8388608u

public val SSRVOPT_WININET: UInt = 16777216u

public val SSRVURI_ALL: UInt = 255u

public val SSRVURI_COMPRESSED: UInt = 2u

public val SSRVURI_FILEPTR: UInt = 4u

public val SSRVURI_HTTP_COMPRESSED: UInt = 2u

public val SSRVURI_HTTP_FILEPTR: UInt = 4u

public val SSRVURI_HTTP_MASK: UInt = 15u

public val SSRVURI_HTTP_NORMAL: UInt = 1u

public val SSRVURI_NORMAL: UInt = 1u

public val SSRVURI_UNC_COMPRESSED: UInt = 32u

public val SSRVURI_UNC_FILEPTR: UInt = 64u

public val SSRVURI_UNC_MASK: UInt = 240u

public val SSRVURI_UNC_NORMAL: UInt = 16u

public val STORAGE_DEVICE_ABNORMALITY_DETECTED: BugcheckError = 320u

public val STORAGE_MINIPORT_ERROR: BugcheckError = 240u

public val STORE_DATA_STRUCTURE_CORRUPTION: BugcheckError = 455u

public val STREAMS_INTERNAL_ERROR: BugcheckError = 75u

public val SYMBOLIC_INITIALIZATION_FAILED: BugcheckError = 100u

public val SYMENUM_OPTIONS_DEFAULT: UInt = 1u

public val SYMENUM_OPTIONS_INLINE: UInt = 2u

public val SYMFLAG_CLR_TOKEN: SymbolInfoFlags = 262144u

public val SYMFLAG_CONSTANT: SymbolInfoFlags = 256u

public val SYMFLAG_EXPORT: SymbolInfoFlags = 512u

public val SYMFLAG_FIXUP_ARM64X: UInt = 16777216u

public val SYMFLAG_FORWARDER: SymbolInfoFlags = 1024u

public val SYMFLAG_FRAMEREL: SymbolInfoFlags = 32u

public val SYMFLAG_FUNCTION: SymbolInfoFlags = 2048u

public val SYMFLAG_FUNC_NO_RETURN: UInt = 1048576u

public val SYMFLAG_GLOBAL: UInt = 33554432u

public val SYMFLAG_ILREL: SymbolInfoFlags = 65536u

public val SYMFLAG_LOCAL: SymbolInfoFlags = 128u

public val SYMFLAG_METADATA: SymbolInfoFlags = 131072u

public val SYMFLAG_NULL: UInt = 524288u

public val SYMFLAG_PARAMETER: SymbolInfoFlags = 64u

public val SYMFLAG_PUBLIC_CODE: UInt = 4194304u

public val SYMFLAG_REGISTER: SymbolInfoFlags = 8u

public val SYMFLAG_REGREL: SymbolInfoFlags = 16u

public val SYMFLAG_REGREL_ALIASINDIR: UInt = 8388608u

public val SYMFLAG_RESET: UInt = 2147483648u

public val SYMFLAG_SLOT: SymbolInfoFlags = 32768u

public val SYMFLAG_SYNTHETIC_ZEROBASE: UInt = 2097152u

public val SYMFLAG_THUNK: SymbolInfoFlags = 8192u

public val SYMFLAG_TLSREL: SymbolInfoFlags = 16384u

public val SYMFLAG_VALUEPRESENT: SymbolInfoFlags = 1u

public val SYMFLAG_VIRTUAL: SymbolInfoFlags = 4096u

public val SYMF_CONSTANT: UInt = 256u

public val SYMF_EXPORT: UInt = 512u

public val SYMF_FORWARDER: UInt = 1024u

public val SYMF_FRAMEREL: UInt = 32u

public val SYMF_FUNCTION: UInt = 2048u

public val SYMF_LOCAL: UInt = 128u

public val SYMF_OMAP_GENERATED: UInt = 1u

public val SYMF_OMAP_MODIFIED: UInt = 2u

public val SYMF_PARAMETER: UInt = 64u

public val SYMF_REGISTER: UInt = 8u

public val SYMF_REGREL: UInt = 16u

public val SYMF_THUNK: UInt = 8192u

public val SYMF_TLSREL: UInt = 16384u

public val SYMF_VIRTUAL: UInt = 4096u

public val SYMOPT_ALLOW_ABSOLUTE_SYMBOLS: UInt = 2048u

public val SYMOPT_ALLOW_ZERO_ADDRESS: UInt = 16777216u

public val SYMOPT_AUTO_PUBLICS: UInt = 65536u

public val SYMOPT_CASE_INSENSITIVE: UInt = 1u

public val SYMOPT_DEBUG: UInt = 2147483648u

public val SYMOPT_DEFERRED_LOADS: UInt = 4u

public val SYMOPT_DISABLE_FAST_SYMBOLS: UInt = 268435456u

public val SYMOPT_DISABLE_SRVSTAR_ON_STARTUP: UInt = 1073741824u

public val SYMOPT_DISABLE_SYMSRV_AUTODETECT: UInt = 33554432u

public val SYMOPT_DISABLE_SYMSRV_TIMEOUT: UInt = 536870912u

public val SYMOPT_EXACT_SYMBOLS: UInt = 1024u

public val SYMOPT_EX_DISABLEACCESSTIMEUPDATE: ImagehlpExtendedOptions = 0

public val SYMOPT_EX_LASTVALIDDEBUGDIRECTORY: ImagehlpExtendedOptions = 1

public val SYMOPT_EX_MAX: ImagehlpExtendedOptions = 4

public val SYMOPT_EX_NEVERLOADSYMBOLS: ImagehlpExtendedOptions = 3

public val SYMOPT_EX_NOIMPLICITPATTERNSEARCH: ImagehlpExtendedOptions = 2

public val SYMOPT_FAIL_CRITICAL_ERRORS: UInt = 512u

public val SYMOPT_FAVOR_COMPRESSED: UInt = 8388608u

public val SYMOPT_FLAT_DIRECTORY: UInt = 4194304u

public val SYMOPT_IGNORE_CVREC: UInt = 128u

public val SYMOPT_IGNORE_IMAGEDIR: UInt = 2097152u

public val SYMOPT_IGNORE_NT_SYMPATH: UInt = 4096u

public val SYMOPT_INCLUDE_32BIT_MODULES: UInt = 8192u

public val SYMOPT_LOAD_ANYTHING: UInt = 64u

public val SYMOPT_LOAD_LINES: UInt = 16u

public val SYMOPT_NO_CPP: UInt = 8u

public val SYMOPT_NO_IMAGE_SEARCH: UInt = 131072u

public val SYMOPT_NO_PROMPTS: UInt = 524288u

public val SYMOPT_NO_PUBLICS: UInt = 32768u

public val SYMOPT_NO_UNQUALIFIED_LOADS: UInt = 256u

public val SYMOPT_OMAP_FIND_NEAREST: UInt = 32u

public val SYMOPT_OVERWRITE: UInt = 1048576u

public val SYMOPT_PUBLICS_ONLY: UInt = 16384u

public val SYMOPT_READONLY_CACHE: UInt = 67108864u

public val SYMOPT_SECURE: UInt = 262144u

public val SYMOPT_SYMPATH_LAST: UInt = 134217728u

public val SYMOPT_UNDNAME: UInt = 2u

public val SYMSEARCH_ALLITEMS: UInt = 8u

public val SYMSEARCH_GLOBALSONLY: UInt = 4u

public val SYMSEARCH_MASKOBJS: UInt = 1u

public val SYMSEARCH_RECURSE: UInt = 2u

public val SYMSRV_VERSION: UInt = 2u

public val SYMSTOREOPT_ALT_INDEX: UInt = 16u

public val SYMSTOREOPT_COMPRESS: SymSrvStoreFileFlags = 1u

public val SYMSTOREOPT_OVERWRITE: SymSrvStoreFileFlags = 2u

public val SYMSTOREOPT_PASS_IF_EXISTS: SymSrvStoreFileFlags = 64u

public val SYMSTOREOPT_POINTER: SymSrvStoreFileFlags = 8u

public val SYMSTOREOPT_RETURNINDEX: SymSrvStoreFileFlags = 4u

public val SYMSTOREOPT_UNICODE: UInt = 32u

public val SYM_INLINE_COMP_DIFFERENT: UInt = 5u

public val SYM_INLINE_COMP_ERROR: UInt = 0u

public val SYM_INLINE_COMP_IDENTICAL: UInt = 1u

public val SYM_INLINE_COMP_STEPIN: UInt = 2u

public val SYM_INLINE_COMP_STEPOUT: UInt = 3u

public val SYM_INLINE_COMP_STEPOVER: UInt = 4u

public val SYM_STKWALK_DEFAULT: UInt = 0u

public val SYM_STKWALK_FORCE_FRAMEPTR: UInt = 1u

public val SYM_STKWALK_ZEROEXTEND_PTRS: UInt = 2u

public val SYNTHETIC_EXCEPTION_UNHANDLED: BugcheckError = 399u

public val SYNTHETIC_WATCHDOG_TIMEOUT: BugcheckError = 458u

public val SYSTEM_EXIT_OWNED_MUTEX: BugcheckError = 57u

public val SYSTEM_IMAGE_BAD_SIGNATURE: BugcheckError = 195u

public val SYSTEM_LICENSE_VIOLATION: BugcheckError = 154u

public val SYSTEM_PTE_MISUSE: BugcheckError = 218u

public val SYSTEM_SCAN_AT_RAISED_IRQL_CAUGHT_IMPROPER_DRIVER_UNLOAD: BugcheckError = 212u

public val SYSTEM_SERVICE_EXCEPTION: BugcheckError = 59u

public val SYSTEM_THREAD_EXCEPTION_NOT_HANDLED: BugcheckError = 126u

public val SYSTEM_THREAD_EXCEPTION_NOT_HANDLED_M: BugcheckError = 268435582u

public val SYSTEM_UNWIND_PREVIOUS_USER: BugcheckError = 58u

public val SECONDARY_FLAGS_CALLBACK: MinidumpCallbackType = 15

public val SYM_COFF: SymType = 1

public val SYM_CV: SymType = 2

public val SYM_DEFERRED: SymType = 5

public val SYM_DIA: SymType = 7

public val SYM_EXPORT: SymType = 4

public val SYM_NONE: SymType = 0

public val SYM_PDB: SymType = 3

public val SYM_SYM: SymType = 6

public val SYM_VIRTUAL: SymType = 8

public val SYSTEM_INFO_STREAM: MinidumpStreamType = 7

public val SYSTEM_MEMORY_INFO_STREAM: MinidumpStreamType = 21

public val TARGET_ATTRIBUTE_PACMASK: UInt = 1u

public val TARGET_MDL_TOO_SMALL: BugcheckError = 64u

public val TCPIP_AOAC_NIC_ACTIVE_REFERENCE_LEAK: BugcheckError = 336u

public val TELEMETRY_ASSERTS_LIVEDUMP: BugcheckError = 465u

public val TERMINAL_SERVER_DRIVER_MADE_INCORRECT_MEMORY_REFERENCE: BugcheckError = 207u

public val THIRD_PARTY_FILE_SYSTEM_FAILURE: BugcheckError = 264u

public val THREAD_NOT_MUTEX_OWNER: BugcheckError = 17u

public val THREAD_STUCK_IN_DEVICE_DRIVER: BugcheckError = 234u

public val THREAD_STUCK_IN_DEVICE_DRIVER_M: BugcheckError = 268435690u

public val THREAD_TERMINATE_HELD_MUTEX: BugcheckError = 1073741962u

public val TIMER_OR_DPC_INVALID: BugcheckError = 199u

public val TI_FINDCHILDREN: ImagehlpSymbolTypeInfo = 7

public val TI_GET_ADDRESS: ImagehlpSymbolTypeInfo = 22

public val TI_GET_ADDRESSOFFSET: ImagehlpSymbolTypeInfo = 9

public val TI_GET_ARRAYINDEXTYPEID: ImagehlpSymbolTypeInfo = 6

public val TI_GET_BASETYPE: ImagehlpSymbolTypeInfo = 5

public val TI_GET_BITPOSITION: ImagehlpSymbolTypeInfo = 14

public val TI_GET_CALLING_CONVENTION: ImagehlpSymbolTypeInfo = 26

public val TI_GET_CHILDRENCOUNT: ImagehlpSymbolTypeInfo = 13

public val TI_GET_CLASSPARENTID: ImagehlpSymbolTypeInfo = 18

public val TI_GET_COUNT: ImagehlpSymbolTypeInfo = 12

public val TI_GET_DATAKIND: ImagehlpSymbolTypeInfo = 8

public val TI_GET_INDIRECTVIRTUALBASECLASS: ImagehlpSymbolTypeInfo = 32

public val TI_GET_IS_REFERENCE: ImagehlpSymbolTypeInfo = 31

public val TI_GET_LENGTH: ImagehlpSymbolTypeInfo = 2

public val TI_GET_LEXICALPARENT: ImagehlpSymbolTypeInfo = 21

public val TI_GET_NESTED: ImagehlpSymbolTypeInfo = 19

public val TI_GET_OBJECTPOINTERTYPE: ImagehlpSymbolTypeInfo = 34

public val TI_GET_OFFSET: ImagehlpSymbolTypeInfo = 10

public val TI_GET_SYMINDEX: ImagehlpSymbolTypeInfo = 20

public val TI_GET_SYMNAME: ImagehlpSymbolTypeInfo = 1

public val TI_GET_SYMTAG: ImagehlpSymbolTypeInfo = 0

public val TI_GET_THISADJUST: ImagehlpSymbolTypeInfo = 23

public val TI_GET_TYPE: ImagehlpSymbolTypeInfo = 3

public val TI_GET_TYPEID: ImagehlpSymbolTypeInfo = 4

public val TI_GET_UDTKIND: ImagehlpSymbolTypeInfo = 24

public val TI_GET_VALUE: ImagehlpSymbolTypeInfo = 11

public val TI_GET_VIRTUALBASECLASS: ImagehlpSymbolTypeInfo = 15

public val TI_GET_VIRTUALBASEDISPINDEX: ImagehlpSymbolTypeInfo = 30

public val TI_GET_VIRTUALBASEOFFSET: ImagehlpSymbolTypeInfo = 29

public val TI_GET_VIRTUALBASEPOINTEROFFSET: ImagehlpSymbolTypeInfo = 17

public val TI_GET_VIRTUALBASETABLETYPE: ImagehlpSymbolTypeInfo = 33

public val TI_GET_VIRTUALTABLESHAPEID: ImagehlpSymbolTypeInfo = 16

public val TI_GTIEX_REQS_VALID: ImagehlpSymbolTypeInfo = 28

public val TI_IS_CLOSE_EQUIV_TO: ImagehlpSymbolTypeInfo = 27

public val TI_IS_EQUIV_TO: ImagehlpSymbolTypeInfo = 25

public val TOO_MANY_RECURSIVE_FAULTS: BugcheckError = 286u

public val TRAP_CAUSE_UNKNOWN: BugcheckError = 18u

public val TTM_FATAL_ERROR: BugcheckError = 411u

public val TTM_WATCHDOG_TIMEOUT: BugcheckError = 416u

public val THREAD_CALLBACK: MinidumpCallbackType = 1

public val THREAD_EX_CALLBACK: MinidumpCallbackType = 2

public val THREAD_EX_LIST_STREAM: MinidumpStreamType = 8

public val THREAD_INFO_LIST_STREAM: MinidumpStreamType = 17

public val THREAD_LIST_STREAM: MinidumpStreamType = 3

public val THREAD_NAMES_STREAM: MinidumpStreamType = 24

public val THREAD_WRITE_BACKING_STORE: ThreadWriteFlags = 8

public val THREAD_WRITE_CONTEXT: ThreadWriteFlags = 4

public val THREAD_WRITE_INSTRUCTION_WINDOW: ThreadWriteFlags = 16

public val THREAD_WRITE_STACK: ThreadWriteFlags = 2

public val THREAD_WRITE_THREAD: ThreadWriteFlags = 1

public val THREAD_WRITE_THREAD_DATA: ThreadWriteFlags = 32

public val THREAD_WRITE_THREAD_INFO: ThreadWriteFlags = 64

public val TOKEN_STREAM: MinidumpStreamType = 19

public val UCMUCSI_FAILURE: BugcheckError = 472u

public val UCMUCSI_LIVEDUMP: BugcheckError = 468u

public val UDFS_FILE_SYSTEM: BugcheckError = 155u

public val UFX_LIVEDUMP: BugcheckError = 408u

public val UNDNAME_32_BIT_DECODE: UInt = 2048u

public val UNDNAME_COMPLETE: UInt = 0u

public val UNDNAME_NAME_ONLY: UInt = 4096u

public val UNDNAME_NO_ACCESS_SPECIFIERS: UInt = 128u

public val UNDNAME_NO_ALLOCATION_LANGUAGE: UInt = 16u

public val UNDNAME_NO_ALLOCATION_MODEL: UInt = 8u

public val UNDNAME_NO_ARGUMENTS: UInt = 8192u

public val UNDNAME_NO_CV_THISTYPE: UInt = 64u

public val UNDNAME_NO_FUNCTION_RETURNS: UInt = 4u

public val UNDNAME_NO_LEADING_UNDERSCORES: UInt = 1u

public val UNDNAME_NO_MEMBER_TYPE: UInt = 512u

public val UNDNAME_NO_MS_KEYWORDS: UInt = 2u

public val UNDNAME_NO_MS_THISTYPE: UInt = 32u

public val UNDNAME_NO_RETURN_UDT_MODEL: UInt = 1024u

public val UNDNAME_NO_SPECIAL_SYMS: UInt = 16384u

public val UNDNAME_NO_THISTYPE: UInt = 96u

public val UNDNAME_NO_THROW_SIGNATURES: UInt = 256u

public val UNEXPECTED_INITIALIZATION_CALL: BugcheckError = 51u

public val UNEXPECTED_KERNEL_MODE_TRAP: BugcheckError = 127u

public val UNEXPECTED_KERNEL_MODE_TRAP_M: BugcheckError = 268435583u

public val UNEXPECTED_STORE_EXCEPTION: BugcheckError = 340u

public val UNLOAD_DLL_DEBUG_EVENT: DebugEventCode = 7u

public val UNMOUNTABLE_BOOT_VOLUME: BugcheckError = 237u

public val UNSUPPORTED_INSTRUCTION_MODE: BugcheckError = 337u

public val UNSUPPORTED_PROCESSOR: BugcheckError = 93u

public val UNWIND_ON_INVALID_STACK: BugcheckError = 427u

public val UNW_FLAG_CHAININFO: RtlVirtualUnwindHandlerType = 4u

public val UNW_FLAG_EHANDLER: RtlVirtualUnwindHandlerType = 1u

public val UNW_FLAG_NHANDLER: RtlVirtualUnwindHandlerType = 0u

public val UNW_FLAG_UHANDLER: RtlVirtualUnwindHandlerType = 2u

public val UP_DRIVER_ON_MP_SYSTEM: BugcheckError = 146u

public val USB4_HARDWARE_VIOLATION: BugcheckError = 496u

public val USB_DRIPS_BLOCKER_SURPRISE_REMOVAL_LIVEDUMP: BugcheckError = 421u

public val USER_MODE_HEALTH_MONITOR: BugcheckError = 158u

public val USER_MODE_HEALTH_MONITOR_LIVEDUMP: BugcheckError = 457u

public val UNLOADED_MODULE_LIST_STREAM: MinidumpStreamType = 14

public val UNUSED_STREAM: MinidumpStreamType = 0

public val VER_PLATFORM_WIN32_NT: VerPlatform = 2u

public val VER_PLATFORM_WIN32_WINDOWS: VerPlatform = 1u

public val VER_PLATFORM_WIN32S: VerPlatform = 0u

public val VHD_BOOT_HOST_VOLUME_NOT_ENOUGH_SPACE: BugcheckError = 310u

public val VHD_BOOT_INITIALIZATION_FAILED: BugcheckError = 303u

public val VIDEO_DRIVER_DEBUG_REPORT_REQUEST: BugcheckError = 1073741997u

public val VIDEO_DRIVER_INIT_FAILURE: BugcheckError = 180u

public val VIDEO_DWMINIT_TIMEOUT_FALLBACK_BDD: BugcheckError = 391u

public val VIDEO_DXGKRNL_BLACK_SCREEN_LIVEDUMP: BugcheckError = 424u

public val VIDEO_DXGKRNL_FATAL_ERROR: BugcheckError = 275u

public val VIDEO_DXGKRNL_LIVEDUMP: BugcheckError = 403u

public val VIDEO_DXGKRNL_SYSMM_FATAL_ERROR: BugcheckError = 484u

public val VIDEO_ENGINE_TIMEOUT_DETECTED: BugcheckError = 321u

public val VIDEO_MEMORY_MANAGEMENT_INTERNAL: BugcheckError = 270u

public val VIDEO_MINIPORT_BLACK_SCREEN_LIVEDUMP: BugcheckError = 440u

public val VIDEO_MINIPORT_FAILED_LIVEDUMP: BugcheckError = 432u

public val VIDEO_SCHEDULER_INTERNAL_ERROR: BugcheckError = 281u

public val VIDEO_SHADOW_DRIVER_FATAL_ERROR: BugcheckError = 276u

public val VIDEO_TDR_APPLICATION_BLOCKED: BugcheckError = 322u

public val VIDEO_TDR_FAILURE: BugcheckError = 278u

public val VIDEO_TDR_TIMEOUT_DETECTED: BugcheckError = 279u

public val VMBUS_LIVEDUMP: BugcheckError = 1073742319u

public val VOLMGRX_INTERNAL_ERROR: BugcheckError = 88u

public val VOLSNAP_OVERLAPPED_TABLE_ACCESS: BugcheckError = 301u

public val VSL_INITIALIZATION_FAILED: BugcheckError = 111u

public val VM_POST_READ_CALLBACK: MinidumpCallbackType = 20

public val VM_PRE_READ_CALLBACK: MinidumpCallbackType = 19

public val VM_QUERY_CALLBACK: MinidumpCallbackType = 18

public val VM_START_CALLBACK: MinidumpCallbackType = 17

public val WCT_ASYNC_OPEN_FLAG: OpenThreadWaitChainSessionFlags = 1u

public val WCT_MAX_NODE_COUNT: UInt = 16u

public val WCT_NETWORK_IO_FLAG: UInt = 8u

public val WCT_OBJNAME_LENGTH: UInt = 128u

public val WCT_OUT_OF_PROC_COM_FLAG: WaitChainThreadOptions = 2u

public val WCT_OUT_OF_PROC_CS_FLAG: WaitChainThreadOptions = 4u

public val WCT_OUT_OF_PROC_FLAG: WaitChainThreadOptions = 1u

public val WDF_VIOLATION: BugcheckError = 269u

public val WFP_INVALID_OPERATION: BugcheckError = 467u

public val WHEA_BAD_PAGE_LIST_LOCATION: UInt = 15u

public val WHEA_BAD_PAGE_LIST_MAX_SIZE: UInt = 14u

public val WHEA_CMCI_THRESHOLD_COUNT: UInt = 10u

public val WHEA_CMCI_THRESHOLD_POLL_COUNT: UInt = 12u

public val WHEA_CMCI_THRESHOLD_TIME: UInt = 11u

public val WHEA_DEVICE_DRIVER_BUFFER_SET_MAX: UInt = 1u

public val WHEA_DEVICE_DRIVER_BUFFER_SET_MIN: UInt = 1u

public val WHEA_DEVICE_DRIVER_BUFFER_SET_V1: UInt = 1u

public val WHEA_DEVICE_DRIVER_CONFIG_MAX: UInt = 2u

public val WHEA_DEVICE_DRIVER_CONFIG_MIN: UInt = 1u

public val WHEA_DEVICE_DRIVER_CONFIG_V1: UInt = 1u

public val WHEA_DEVICE_DRIVER_CONFIG_V2: UInt = 2u

public val WHEA_DISABLE_DUMMY_WRITE: UInt = 6u

public val WHEA_DISABLE_OFFLINE: UInt = 0u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_AERBRIDGE: UInt = 8u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_AERENDPOINT: UInt = 7u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_AERROOTPORT: UInt = 6u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_GENERIC: UInt = 9u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_GENERIC_V2: UInt = 10u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_IPFCMC: UInt = 4u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_IPFCPE: UInt = 5u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_IPFMCA: UInt = 3u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_XPFCMC: UInt = 1u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_XPFMCE: UInt = 0u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_XPFNMI: UInt = 2u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_VERSION_10: UInt = 10u

public val WHEA_ERROR_SOURCE_DESCRIPTOR_VERSION_11: UInt = 11u

public val WHEA_ERROR_SOURCE_FLAG_DEFAULTSOURCE: UInt = 2147483648u

public val WHEA_ERROR_SOURCE_FLAG_FIRMWAREFIRST: UInt = 1u

public val WHEA_ERROR_SOURCE_FLAG_GHES_ASSIST: UInt = 4u

public val WHEA_ERROR_SOURCE_FLAG_GLOBAL: UInt = 2u

public val WHEA_ERROR_SOURCE_INVALID_RELATED_SOURCE: UInt = 65535u

public val WHEA_INTERNAL_ERROR: BugcheckError = 290u

public val WHEA_MAX_MC_BANKS: UInt = 32u

public val WHEA_MEM_PERSISTOFFLINE: UInt = 1u

public val WHEA_MEM_PFA_DISABLE: UInt = 2u

public val WHEA_MEM_PFA_PAGECOUNT: UInt = 3u

public val WHEA_MEM_PFA_THRESHOLD: UInt = 4u

public val WHEA_MEM_PFA_TIMEOUT: UInt = 5u

public val WHEA_NOTIFICATION_TYPE_ARMV8_SEA: UInt = 8u

public val WHEA_NOTIFICATION_TYPE_ARMV8_SEI: UInt = 9u

public val WHEA_NOTIFICATION_TYPE_CMCI: UInt = 5u

public val WHEA_NOTIFICATION_TYPE_EXTERNALINTERRUPT: UInt = 1u

public val WHEA_NOTIFICATION_TYPE_EXTERNALINTERRUPT_GSIV: UInt = 10u

public val WHEA_NOTIFICATION_TYPE_GPIO_SIGNAL: UInt = 7u

public val WHEA_NOTIFICATION_TYPE_LOCALINTERRUPT: UInt = 2u

public val WHEA_NOTIFICATION_TYPE_MCE: UInt = 6u

public val WHEA_NOTIFICATION_TYPE_NMI: UInt = 4u

public val WHEA_NOTIFICATION_TYPE_POLLED: UInt = 0u

public val WHEA_NOTIFICATION_TYPE_SCI: UInt = 3u

public val WHEA_NOTIFICATION_TYPE_SDEI: UInt = 11u

public val WHEA_NOTIFY_ALL_OFFLINES: UInt = 16u

public val WHEA_PENDING_PAGE_LIST_SZ: UInt = 13u

public val WHEA_RESTORE_CMCI_ATTEMPTS: UInt = 8u

public val WHEA_RESTORE_CMCI_ENABLED: UInt = 7u

public val WHEA_RESTORE_CMCI_ERR_LIMIT: UInt = 9u

public val WHEA_ROW_FAIL_CHECK_ENABLE: UInt = 18u

public val WHEA_ROW_FAIL_CHECK_EXTENT: UInt = 17u

public val WHEA_ROW_FAIL_CHECK_THRESHOLD: UInt = 19u
