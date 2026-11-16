package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.core.Hresult

public val AT_BOOLEAN: AttributeType = 1

public val AT_GUID: AttributeType = 11

public val AT_INT16: AttributeType = 4

public val AT_INT32: AttributeType = 6

public val AT_INT64: AttributeType = 8

public val AT_INT8: AttributeType = 2

public val AT_INVALID: AttributeType = 0

public val AT_LIFE_TIME: AttributeType = 12

public val AT_OCTET_STRING: AttributeType = 14

public val AT_SOCKADDR: AttributeType = 13

public val AT_STRING: AttributeType = 10

public val AT_UINT16: AttributeType = 5

public val AT_UINT32: AttributeType = 7

public val AT_UINT64: AttributeType = 9

public val AT_UINT8: AttributeType = 3

public val DF_IMPERSONATION: UInt = 2147483648u

public val DF_TRACELESS: UInt = 1073741824u

public val DS_CONFIRMED: DiagnosisStatus = 1

public val DS_DEFERRED: DiagnosisStatus = 4

public val DS_INDETERMINATE: DiagnosisStatus = 3

public val DS_NOT_IMPLEMENTED: DiagnosisStatus = 0

public val DS_PASSTHROUGH: DiagnosisStatus = 5

public val DS_REJECTED: DiagnosisStatus = 2

public val NDF_ADD_CAPTURE_TRACE: UInt = 1u

public val NDF_APPLY_INCLUSION_LIST_FILTER: UInt = 2u

public val NDF_ERROR_START: UInt = 63744u

public val NDF_E_BAD_PARAM: Hresult = 0x8008F905u.toInt()

public val NDF_E_CANCELLED: Hresult = 0x8008F902u.toInt()

public val NDF_E_DISABLED: Hresult = 0x8008F904u.toInt()

public val NDF_E_LENGTH_EXCEEDED: Hresult = 0x8008F900u.toInt()

public val NDF_E_NOHELPERCLASS: Hresult = 0x8008F901u.toInt()

public val NDF_E_PROBLEM_PRESENT: Hresult = 0x8008F908u.toInt()

public val NDF_E_UNKNOWN: Hresult = 0x8008F907u.toInt()

public val NDF_E_VALIDATION: Hresult = 0x8008F906u.toInt()

public val NDF_INBOUND_FLAG_EDGETRAVERSAL: UInt = 1u

public val NDF_INBOUND_FLAG_HEALTHCHECK: UInt = 2u

public val PT_DOWN_STREAM_HEALTH: ProblemType = 4

public val PT_HIGHER_UTILIZATION: ProblemType = 16

public val PT_HIGH_UTILIZATION: ProblemType = 8

public val PT_INVALID: ProblemType = 0

public val PT_LOWER_HEALTH: ProblemType = 2

public val PT_LOW_HEALTH: ProblemType = 1

public val PT_UP_STREAM_UTILIZATION: ProblemType = 32

public val RCF_ISCONFIRMED: UInt = 2u

public val RCF_ISLEAF: UInt = 1u

public val RCF_ISTHIRDPARTY: UInt = 4u

public val RF_CONTACT_ADMIN: UInt = 131072u

public val RF_INFORMATION_ONLY: UInt = 33554432u

public val RF_REPRO: UInt = 2097152u

public val RF_RESERVED: UInt = 1073741824u

public val RF_RESERVED_CA: UInt = 2147483648u

public val RF_RESERVED_LNI: UInt = 65536u

public val RF_SHOW_EVENTS: UInt = 8388608u

public val RF_UI_ONLY: UInt = 16777216u

public val RF_USER_ACTION: UInt = 268435456u

public val RF_USER_CONFIRMATION: UInt = 134217728u

public val RF_VALIDATE_HELPTOPIC: UInt = 4194304u

public val RF_WORKAROUND: UInt = 536870912u

public val RR_NORISK: RepairRisk = 2

public val RR_NOROLLBACK: RepairRisk = 0

public val RR_ROLLBACK: RepairRisk = 1

public val RS_APPLICATION: RepairScope = 2

public val RS_DEFERRED: RepairStatus = 3

public val RS_NOT_IMPLEMENTED: RepairStatus = 0

public val RS_PROCESS: RepairScope = 3

public val RS_REPAIRED: RepairStatus = 1

public val RS_SYSTEM: RepairScope = 0

public val RS_UNREPAIRED: RepairStatus = 2

public val RS_USER: RepairScope = 1

public val RS_USER_ACTION: RepairStatus = 4

public val UIT_DUI: UiInfoType = 4

public val UIT_HELP_PANE: UiInfoType = 3

public val UIT_INVALID: UiInfoType = 0

public val UIT_NONE: UiInfoType = 1

public val UIT_SHELL_COMMAND: UiInfoType = 2
