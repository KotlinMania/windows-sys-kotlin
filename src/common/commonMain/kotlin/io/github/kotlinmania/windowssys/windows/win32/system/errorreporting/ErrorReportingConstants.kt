package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val APPCRASH_EVENT: Pcwstr = w("APPCRASH")

public val E_STORE_INVALID: ReportStoreTypes = 4

public val E_STORE_MACHINE_ARCHIVE: ReportStoreTypes = 2

public val E_STORE_MACHINE_QUEUE: ReportStoreTypes = 3

public val E_STORE_USER_ARCHIVE: ReportStoreTypes = 0

public val E_STORE_USER_QUEUE: ReportStoreTypes = 1

public val PACKAGED_APPCRASH_EVENT: Pcwstr = w("MoAppCrash")

public val WER_DUMP_AUXILIARY: UInt = 2u

public val WER_DUMP_MASK_START: UInt = 1u

public val WER_DUMP_NOHEAP_ONQUEUE: UInt = 1u

public val WER_FAULT_REPORTING_ALWAYS_SHOW_UI: WerFaultReporting = 16u

public val WER_FAULT_REPORTING_CRITICAL: UInt = 512u

public val WER_FAULT_REPORTING_DISABLE_SNAPSHOT_CRASH: UInt = 128u

public val WER_FAULT_REPORTING_DISABLE_SNAPSHOT_HANG: UInt = 256u

public val WER_FAULT_REPORTING_DURABLE: UInt = 1024u

public val WER_FAULT_REPORTING_FLAG_DISABLE_THREAD_SUSPENSION: WerFaultReporting = 4u

public val WER_FAULT_REPORTING_FLAG_NOHEAP: WerFaultReporting = 1u

public val WER_FAULT_REPORTING_FLAG_NO_HEAP_ON_QUEUE: UInt = 64u

public val WER_FAULT_REPORTING_FLAG_QUEUE: WerFaultReporting = 2u

public val WER_FAULT_REPORTING_FLAG_QUEUE_UPLOAD: WerFaultReporting = 8u

public val WER_FAULT_REPORTING_NO_UI: UInt = 32u

public val WER_FILE_ANONYMOUS_DATA: WerFile = 2u

public val WER_FILE_COMPRESSED: UInt = 4u

public val WER_FILE_DELETE_WHEN_DONE: WerFile = 1u

public val WER_MAX_APPLICATION_NAME_LENGTH: UInt = 128u

public val WER_MAX_BUCKET_ID_STRING_LENGTH: UInt = 260u

public val WER_MAX_DESCRIPTION_LENGTH: UInt = 512u

public val WER_MAX_EVENT_NAME_LENGTH: UInt = 64u

public val WER_MAX_FRIENDLY_EVENT_NAME_LENGTH: UInt = 128u

public val WER_MAX_LOCAL_DUMP_SUBPATH_LENGTH: UInt = 64u

public val WER_MAX_PARAM_COUNT: UInt = 10u

public val WER_MAX_PARAM_LENGTH: UInt = 260u

public val WER_MAX_PREFERRED_MODULES: UInt = 128u

public val WER_MAX_PREFERRED_MODULES_BUFFER: UInt = 256u

public val WER_MAX_REGISTERED_DUMPCOLLECTION: UInt = 4u

public val WER_MAX_REGISTERED_ENTRIES: UInt = 512u

public val WER_MAX_REGISTERED_METADATA: UInt = 8u

public val WER_MAX_REGISTERED_RUNTIME_EXCEPTION_MODULES: UInt = 16u

public val WER_MAX_SIGNATURE_NAME_LENGTH: UInt = 128u

public val WER_MAX_TOTAL_PARAM_LENGTH: UInt = 1720u

public val WER_METADATA_KEY_MAX_LENGTH: UInt = 64u

public val WER_METADATA_VALUE_MAX_LENGTH: UInt = 128u

public val WER_P0: UInt = 0u

public val WER_P1: UInt = 1u

public val WER_P2: UInt = 2u

public val WER_P3: UInt = 3u

public val WER_P4: UInt = 4u

public val WER_P5: UInt = 5u

public val WER_P6: UInt = 6u

public val WER_P7: UInt = 7u

public val WER_P8: UInt = 8u

public val WER_P9: UInt = 9u

public val WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCH: Pcstr = s("OutOfProcessExceptionEventDebuggerLaunchCallback")

public val WER_RUNTIME_EXCEPTION_EVENT_FUNCTION: Pcstr = s("OutOfProcessExceptionEventCallback")

public val WER_RUNTIME_EXCEPTION_EVENT_SIGNATURE_FUNCTION: Pcstr = s("OutOfProcessExceptionEventSignatureCallback")

public val WER_SUBMIT_ADD_REGISTERED_DATA: WerSubmitFlags = 16u

public val WER_SUBMIT_ARCHIVE_PARAMETERS_ONLY: WerSubmitFlags = 4096u

public val WER_SUBMIT_BYPASS_DATA_THROTTLING: WerSubmitFlags = 2048u

public val WER_SUBMIT_BYPASS_NETWORK_COST_THROTTLING: UInt = 32768u

public val WER_SUBMIT_BYPASS_POWER_THROTTLING: UInt = 16384u

public val WER_SUBMIT_HONOR_RECOVERY: WerSubmitFlags = 1u

public val WER_SUBMIT_HONOR_RESTART: WerSubmitFlags = 2u

public val WER_SUBMIT_NO_ARCHIVE: WerSubmitFlags = 256u

public val WER_SUBMIT_NO_CLOSE_UI: WerSubmitFlags = 64u

public val WER_SUBMIT_NO_QUEUE: WerSubmitFlags = 128u

public val WER_SUBMIT_OUTOFPROCESS: WerSubmitFlags = 32u

public val WER_SUBMIT_OUTOFPROCESS_ASYNC: WerSubmitFlags = 1024u

public val WER_SUBMIT_QUEUE: WerSubmitFlags = 4u

public val WER_SUBMIT_REPORT_MACHINE_ID: WerSubmitFlags = 8192u

public val WER_SUBMIT_SHOW_DEBUG: WerSubmitFlags = 8u

public val WER_SUBMIT_START_MINIMIZED: WerSubmitFlags = 512u

public val WER_CONSENT_ALWAYS_PROMPT: WerConsent = 4

public val WER_CONSENT_APPROVED: WerConsent = 2

public val WER_CONSENT_DENIED: WerConsent = 3

public val WER_CONSENT_MAX: WerConsent = 5

public val WER_CONSENT_NOT_ASKED: WerConsent = 1

public val WER_CUSTOM_ACTION: WerSubmitResult = 9

public val WER_DISABLED: WerSubmitResult = 5

public val WER_DISABLED_QUEUE: WerSubmitResult = 7

public val WER_DUMP_TYPE_HEAP_DUMP: WerDumpType = 3

public val WER_DUMP_TYPE_MAX: WerDumpType = 5

public val WER_DUMP_TYPE_MICRO_DUMP: WerDumpType = 1

public val WER_DUMP_TYPE_MINI_DUMP: WerDumpType = 2

public val WER_DUMP_TYPE_NONE: WerDumpType = 0

public val WER_DUMP_TYPE_TRIAGE_DUMP: WerDumpType = 4

public val WER_FILE_TYPE_AUXILIARY_DUMP: WerFileType = 8

public val WER_FILE_TYPE_CUSTOM_DUMP: WerFileType = 7

public val WER_FILE_TYPE_ETL_TRACE: WerFileType = 9

public val WER_FILE_TYPE_HEAPDUMP: WerFileType = 3

public val WER_FILE_TYPE_MAX: WerFileType = 10

public val WER_FILE_TYPE_MICRODUMP: WerFileType = 1

public val WER_FILE_TYPE_MINIDUMP: WerFileType = 2

public val WER_FILE_TYPE_OTHER: WerFileType = 5

public val WER_FILE_TYPE_TRIAGEDUMP: WerFileType = 6

public val WER_FILE_TYPE_USER_DOCUMENT: WerFileType = 4

public val WER_REG_FILE_TYPE_MAX: WerRegisterFileType = 3

public val WER_REG_FILE_TYPE_OTHER: WerRegisterFileType = 2

public val WER_REG_FILE_TYPE_USER_DOCUMENT: WerRegisterFileType = 1

public val WER_REPORT_APPLICATION_CRASH: WerReportType = 2

public val WER_REPORT_APPLICATION_HANG: WerReportType = 3

public val WER_REPORT_ASYNC: WerSubmitResult = 8

public val WER_REPORT_CANCELLED: WerSubmitResult = 6

public val WER_REPORT_CRITICAL: WerReportType = 1

public val WER_REPORT_DEBUG: WerSubmitResult = 3

public val WER_REPORT_FAILED: WerSubmitResult = 4

public val WER_REPORT_INVALID: WerReportType = 5

public val WER_REPORT_KERNEL: WerReportType = 4

public val WER_REPORT_NON_CRITICAL: WerReportType = 0

public val WER_REPORT_QUEUED: WerSubmitResult = 1

public val WER_REPORT_UPLOADED: WerSubmitResult = 2

public val WER_REPORT_UPLOADED_CAB: WerSubmitResult = 11

public val WER_STORAGE_LOCATION_NOT_FOUND: WerSubmitResult = 12

public val WER_SUBMIT_RESULT_MAX: WerSubmitResult = 13

public val WER_THROTTLED: WerSubmitResult = 10

public val WER_UI_ADDITIONAL_DATA_DLG_HEADER: WerReportUi = 1

public val WER_UI_CLOSE_DLG_BODY: WerReportUi = 9

public val WER_UI_CLOSE_DLG_BUTTON_TEXT: WerReportUi = 10

public val WER_UI_CLOSE_DLG_HEADER: WerReportUi = 8

public val WER_UI_CLOSE_TEXT: WerReportUi = 7

public val WER_UI_CONSENT_DLG_BODY: WerReportUi = 4

public val WER_UI_CONSENT_DLG_HEADER: WerReportUi = 3

public val WER_UI_ICON_FILE_PATH: WerReportUi = 2

public val WER_UI_MAX: WerReportUi = 11

public val WER_UI_OFFLINE_SOLUTION_CHECK_TEXT: WerReportUi = 6

public val WER_UI_ONLINE_SOLUTION_CHECK_TEXT: WerReportUi = 5

public val FRRV_ERR: EFaultRepRetVal = 3

public val FRRV_ERR_ANOTHER_INSTANCE: EFaultRepRetVal = 8

public val FRRV_ERR_DOUBLE_FAULT: EFaultRepRetVal = 10

public val FRRV_ERR_NO_DW: EFaultRepRetVal = 4

public val FRRV_ERR_NO_MEMORY: EFaultRepRetVal = 9

public val FRRV_ERR_TIMEOUT: EFaultRepRetVal = 5

public val FRRV_LAUNCH_DEBUGGER: EFaultRepRetVal = 6

public val FRRV_OK: EFaultRepRetVal = 0

public val FRRV_OK_HEADLESS: EFaultRepRetVal = 7

public val FRRV_OK_MANIFEST: EFaultRepRetVal = 1

public val FRRV_OK_QUEUED: EFaultRepRetVal = 2
