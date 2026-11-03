package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val APPCRASH_EVENT: PCWSTR = w("APPCRASH")

public val E_STORE_INVALID: REPORT_STORE_TYPES = 4

public val E_STORE_MACHINE_ARCHIVE: REPORT_STORE_TYPES = 2

public val E_STORE_MACHINE_QUEUE: REPORT_STORE_TYPES = 3

public val E_STORE_USER_ARCHIVE: REPORT_STORE_TYPES = 0

public val E_STORE_USER_QUEUE: REPORT_STORE_TYPES = 1

public val PACKAGED_APPCRASH_EVENT: PCWSTR = w("MoAppCrash")

public val WER_DUMP_AUXILIARY: UInt = 2u

public val WER_DUMP_MASK_START: UInt = 1u

public val WER_DUMP_NOHEAP_ONQUEUE: UInt = 1u

public val WER_FAULT_REPORTING_ALWAYS_SHOW_UI: WER_FAULT_REPORTING = 16u

public val WER_FAULT_REPORTING_CRITICAL: UInt = 512u

public val WER_FAULT_REPORTING_DISABLE_SNAPSHOT_CRASH: UInt = 128u

public val WER_FAULT_REPORTING_DISABLE_SNAPSHOT_HANG: UInt = 256u

public val WER_FAULT_REPORTING_DURABLE: UInt = 1024u

public val WER_FAULT_REPORTING_FLAG_DISABLE_THREAD_SUSPENSION: WER_FAULT_REPORTING = 4u

public val WER_FAULT_REPORTING_FLAG_NOHEAP: WER_FAULT_REPORTING = 1u

public val WER_FAULT_REPORTING_FLAG_NO_HEAP_ON_QUEUE: UInt = 64u

public val WER_FAULT_REPORTING_FLAG_QUEUE: WER_FAULT_REPORTING = 2u

public val WER_FAULT_REPORTING_FLAG_QUEUE_UPLOAD: WER_FAULT_REPORTING = 8u

public val WER_FAULT_REPORTING_NO_UI: UInt = 32u

public val WER_FILE_ANONYMOUS_DATA: WER_FILE = 2u

public val WER_FILE_COMPRESSED: UInt = 4u

public val WER_FILE_DELETE_WHEN_DONE: WER_FILE = 1u

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

public val WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCH: PCSTR = s("OutOfProcessExceptionEventDebuggerLaunchCallback")

public val WER_RUNTIME_EXCEPTION_EVENT_FUNCTION: PCSTR = s("OutOfProcessExceptionEventCallback")

public val WER_RUNTIME_EXCEPTION_EVENT_SIGNATURE_FUNCTION: PCSTR = s("OutOfProcessExceptionEventSignatureCallback")

public val WER_SUBMIT_ADD_REGISTERED_DATA: WER_SUBMIT_FLAGS = 16u

public val WER_SUBMIT_ARCHIVE_PARAMETERS_ONLY: WER_SUBMIT_FLAGS = 4096u

public val WER_SUBMIT_BYPASS_DATA_THROTTLING: WER_SUBMIT_FLAGS = 2048u

public val WER_SUBMIT_BYPASS_NETWORK_COST_THROTTLING: UInt = 32768u

public val WER_SUBMIT_BYPASS_POWER_THROTTLING: UInt = 16384u

public val WER_SUBMIT_HONOR_RECOVERY: WER_SUBMIT_FLAGS = 1u

public val WER_SUBMIT_HONOR_RESTART: WER_SUBMIT_FLAGS = 2u

public val WER_SUBMIT_NO_ARCHIVE: WER_SUBMIT_FLAGS = 256u

public val WER_SUBMIT_NO_CLOSE_UI: WER_SUBMIT_FLAGS = 64u

public val WER_SUBMIT_NO_QUEUE: WER_SUBMIT_FLAGS = 128u

public val WER_SUBMIT_OUTOFPROCESS: WER_SUBMIT_FLAGS = 32u

public val WER_SUBMIT_OUTOFPROCESS_ASYNC: WER_SUBMIT_FLAGS = 1024u

public val WER_SUBMIT_QUEUE: WER_SUBMIT_FLAGS = 4u

public val WER_SUBMIT_REPORT_MACHINE_ID: WER_SUBMIT_FLAGS = 8192u

public val WER_SUBMIT_SHOW_DEBUG: WER_SUBMIT_FLAGS = 8u

public val WER_SUBMIT_START_MINIMIZED: WER_SUBMIT_FLAGS = 512u

public val WerConsentAlwaysPrompt: WER_CONSENT = 4

public val WerConsentApproved: WER_CONSENT = 2

public val WerConsentDenied: WER_CONSENT = 3

public val WerConsentMax: WER_CONSENT = 5

public val WerConsentNotAsked: WER_CONSENT = 1

public val WerCustomAction: WER_SUBMIT_RESULT = 9

public val WerDisabled: WER_SUBMIT_RESULT = 5

public val WerDisabledQueue: WER_SUBMIT_RESULT = 7

public val WerDumpTypeHeapDump: WER_DUMP_TYPE = 3

public val WerDumpTypeMax: WER_DUMP_TYPE = 5

public val WerDumpTypeMicroDump: WER_DUMP_TYPE = 1

public val WerDumpTypeMiniDump: WER_DUMP_TYPE = 2

public val WerDumpTypeNone: WER_DUMP_TYPE = 0

public val WerDumpTypeTriageDump: WER_DUMP_TYPE = 4

public val WerFileTypeAuxiliaryDump: WER_FILE_TYPE = 8

public val WerFileTypeCustomDump: WER_FILE_TYPE = 7

public val WerFileTypeEtlTrace: WER_FILE_TYPE = 9

public val WerFileTypeHeapdump: WER_FILE_TYPE = 3

public val WerFileTypeMax: WER_FILE_TYPE = 10

public val WerFileTypeMicrodump: WER_FILE_TYPE = 1

public val WerFileTypeMinidump: WER_FILE_TYPE = 2

public val WerFileTypeOther: WER_FILE_TYPE = 5

public val WerFileTypeTriagedump: WER_FILE_TYPE = 6

public val WerFileTypeUserDocument: WER_FILE_TYPE = 4

public val WerRegFileTypeMax: WER_REGISTER_FILE_TYPE = 3

public val WerRegFileTypeOther: WER_REGISTER_FILE_TYPE = 2

public val WerRegFileTypeUserDocument: WER_REGISTER_FILE_TYPE = 1

public val WerReportApplicationCrash: WER_REPORT_TYPE = 2

public val WerReportApplicationHang: WER_REPORT_TYPE = 3

public val WerReportAsync: WER_SUBMIT_RESULT = 8

public val WerReportCancelled: WER_SUBMIT_RESULT = 6

public val WerReportCritical: WER_REPORT_TYPE = 1

public val WerReportDebug: WER_SUBMIT_RESULT = 3

public val WerReportFailed: WER_SUBMIT_RESULT = 4

public val WerReportInvalid: WER_REPORT_TYPE = 5

public val WerReportKernel: WER_REPORT_TYPE = 4

public val WerReportNonCritical: WER_REPORT_TYPE = 0

public val WerReportQueued: WER_SUBMIT_RESULT = 1

public val WerReportUploaded: WER_SUBMIT_RESULT = 2

public val WerReportUploadedCab: WER_SUBMIT_RESULT = 11

public val WerStorageLocationNotFound: WER_SUBMIT_RESULT = 12

public val WerSubmitResultMax: WER_SUBMIT_RESULT = 13

public val WerThrottled: WER_SUBMIT_RESULT = 10

public val WerUIAdditionalDataDlgHeader: WER_REPORT_UI = 1

public val WerUICloseDlgBody: WER_REPORT_UI = 9

public val WerUICloseDlgButtonText: WER_REPORT_UI = 10

public val WerUICloseDlgHeader: WER_REPORT_UI = 8

public val WerUICloseText: WER_REPORT_UI = 7

public val WerUIConsentDlgBody: WER_REPORT_UI = 4

public val WerUIConsentDlgHeader: WER_REPORT_UI = 3

public val WerUIIconFilePath: WER_REPORT_UI = 2

public val WerUIMax: WER_REPORT_UI = 11

public val WerUIOfflineSolutionCheckText: WER_REPORT_UI = 6

public val WerUIOnlineSolutionCheckText: WER_REPORT_UI = 5

public val frrvErr: EFaultRepRetVal = 3

public val frrvErrAnotherInstance: EFaultRepRetVal = 8

public val frrvErrDoubleFault: EFaultRepRetVal = 10

public val frrvErrNoDW: EFaultRepRetVal = 4

public val frrvErrNoMemory: EFaultRepRetVal = 9

public val frrvErrTimeout: EFaultRepRetVal = 5

public val frrvLaunchDebugger: EFaultRepRetVal = 6

public val frrvOk: EFaultRepRetVal = 0

public val frrvOkHeadless: EFaultRepRetVal = 7

public val frrvOkManifest: EFaultRepRetVal = 1

public val frrvOkQueued: EFaultRepRetVal = 2
