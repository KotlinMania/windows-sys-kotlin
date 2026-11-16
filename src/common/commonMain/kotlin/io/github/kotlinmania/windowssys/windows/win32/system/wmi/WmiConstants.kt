package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val CIM_BOOLEAN: CimtypeEnumeration = 11

public val CIM_CHAR16: CimtypeEnumeration = 103

public val CIM_DATETIME: CimtypeEnumeration = 101

public val CIM_EMPTY: CimtypeEnumeration = 0

public val CIM_FLAG_ARRAY: CimtypeEnumeration = 8192

public val CIM_ILLEGAL: CimtypeEnumeration = 4095

public val CIM_OBJECT: CimtypeEnumeration = 13

public val CIM_REAL32: CimtypeEnumeration = 4

public val CIM_REAL64: CimtypeEnumeration = 5

public val CIM_REFERENCE: CimtypeEnumeration = 102

public val CIM_SINT16: CimtypeEnumeration = 2

public val CIM_SINT32: CimtypeEnumeration = 3

public val CIM_SINT64: CimtypeEnumeration = 20

public val CIM_SINT8: CimtypeEnumeration = 16

public val CIM_STRING: CimtypeEnumeration = 8

public val CIM_UINT16: CimtypeEnumeration = 18

public val CIM_UINT32: CimtypeEnumeration = 19

public val CIM_UINT64: CimtypeEnumeration = 21

public val CIM_UINT8: CimtypeEnumeration = 17

public val MI_ARRAY: MiType = 16

public val MI_BOOLEAN: MiType = 0

public val MI_BOOLEANA: MiType = 16

public val MI_CALLBACKMODE_IGNORE: MiCallbackMode = 2

public val MI_CALLBACKMODE_INQUIRE: MiCallbackMode = 1

public val MI_CALLBACKMODE_REPORT: MiCallbackMode = 0

public val MI_CALL_VERSION: UInt = 1u

public val MI_CHAR16: MiType = 11

public val MI_CHAR16A: MiType = 27

public val MI_CHAR_TYPE: UInt = 2u

public val MI_DATETIME: MiType = 12

public val MI_DATETIMEA: MiType = 28

public val MI_DESTINATION_OPTIONS_IMPERSONATION_TYPE_DEFAULT: MiDestinationOptionsImpersonationType = 0

public val MI_DESTINATION_OPTIONS_IMPERSONATION_TYPE_DELEGATE: MiDestinationOptionsImpersonationType = 4

public val MI_DESTINATION_OPTIONS_IMPERSONATION_TYPE_IDENTIFY: MiDestinationOptionsImpersonationType = 2

public val MI_DESTINATION_OPTIONS_IMPERSONATION_TYPE_IMPERSONATE: MiDestinationOptionsImpersonationType = 3

public val MI_DESTINATION_OPTIONS_IMPERSONATION_TYPE_NONE: MiDestinationOptionsImpersonationType = 1

public val MI_ERRORCATEGORY_ACCESS_DENIED: MiErrorCategory = 18

public val MI_ERRORCATEGORY_AUTHENTICATION_ERROR: MiErrorCategory = 28

public val MI_ERRORCATEGORY_CLOS_EERROR: MiErrorCategory = 2

public val MI_ERRORCATEGORY_CONNECTION_ERROR: MiErrorCategory = 27

public val MI_ERRORCATEGORY_DEADLOCK_DETECTED: MiErrorCategory = 4

public val MI_ERRORCATEGORY_DEVICE_ERROR: MiErrorCategory = 3

public val MI_ERRORCATEGORY_FROM_STDERR: MiErrorCategory = 24

public val MI_ERRORCATEGORY_INVALID_ARGUMENT: MiErrorCategory = 5

public val MI_ERRORCATEGORY_INVALID_DATA: MiErrorCategory = 6

public val MI_ERRORCATEGORY_INVALID_OPERATION: MiErrorCategory = 7

public val MI_ERRORCATEGORY_INVALID_RESULT: MiErrorCategory = 8

public val MI_ERRORCATEGORY_INVALID_TYPE: MiErrorCategory = 9

public val MI_ERRORCATEGORY_LIMITS_EXCEEDED: MiErrorCategory = 29

public val MI_ERRORCATEGORY_METADATA_ERROR: MiErrorCategory = 10

public val MI_ERRORCATEGORY_NOT_ENABLED: MiErrorCategory = 31

public val MI_ERRORCATEGORY_NOT_IMPLEMENTED: MiErrorCategory = 11

public val MI_ERRORCATEGORY_NOT_INSTALLED: MiErrorCategory = 12

public val MI_ERRORCATEGORY_NOT_SPECIFIED: MiErrorCategory = 0

public val MI_ERRORCATEGORY_OBJECT_NOT_FOUND: MiErrorCategory = 13

public val MI_ERRORCATEGORY_OPEN_ERROR: MiErrorCategory = 1

public val MI_ERRORCATEGORY_OPERATION_STOPPED: MiErrorCategory = 14

public val MI_ERRORCATEGORY_OPERATION_TIMEOUT: MiErrorCategory = 15

public val MI_ERRORCATEGORY_PARSER_ERROR: MiErrorCategory = 17

public val MI_ERRORCATEGORY_PROTOCOL_ERROR: MiErrorCategory = 26

public val MI_ERRORCATEGORY_QUOTA_EXCEEDED: MiErrorCategory = 30

public val MI_ERRORCATEGORY_READ_ERROR: MiErrorCategory = 22

public val MI_ERRORCATEGORY_RESOURCE_BUSY: MiErrorCategory = 19

public val MI_ERRORCATEGORY_RESOURCE_EXISTS: MiErrorCategory = 20

public val MI_ERRORCATEGORY_RESOURCE_UNAVAILABLE: MiErrorCategory = 21

public val MI_ERRORCATEGORY_SECURITY_ERROR: MiErrorCategory = 25

public val MI_ERRORCATEGORY_SYNTAX_ERROR: MiErrorCategory = 16

public val MI_ERRORCATEGORY_WRITE_ERROR: MiErrorCategory = 23

public val MI_FLAG_ABSTRACT: UInt = 131072u

public val MI_FLAG_ADOPT: UInt = 2147483648u

public val MI_FLAG_ANY: UInt = 127u

public val MI_FLAG_ASSOCIATION: UInt = 16u

public val MI_FLAG_BORROW: UInt = 1073741824u

public val MI_FLAG_CLASS: UInt = 1u

public val MI_FLAG_DISABLEOVERRIDE: UInt = 256u

public val MI_FLAG_ENABLEOVERRIDE: UInt = 128u

public val MI_FLAG_EXPENSIVE: UInt = 524288u

public val MI_FLAG_EXTENDED: UInt = 4096u

public val MI_FLAG_IN: UInt = 8192u

public val MI_FLAG_INDICATION: UInt = 32u

public val MI_FLAG_KEY: UInt = 4096u

public val MI_FLAG_METHOD: UInt = 2u

public val MI_FLAG_NOT_MODIFIED: UInt = 33554432u

public val MI_FLAG_NULL: UInt = 536870912u

public val MI_FLAG_OUT: UInt = 16384u

public val MI_FLAG_PARAMETER: UInt = 8u

public val MI_FLAG_PROPERTY: UInt = 4u

public val MI_FLAG_READONLY: UInt = 2097152u

public val MI_FLAG_REFERENCE: UInt = 64u

public val MI_FLAG_REQUIRED: UInt = 32768u

public val MI_FLAG_RESTRICTED: UInt = 512u

public val MI_FLAG_STATIC: UInt = 65536u

public val MI_FLAG_STREAM: UInt = 1048576u

public val MI_FLAG_TERMINAL: UInt = 262144u

public val MI_FLAG_TOSUBCLASS: UInt = 1024u

public val MI_FLAG_TRANSLATABLE: UInt = 2048u

public val MI_FLAG_VERSION: UInt = 469762048u

public val MI_INSTANCE: MiType = 15

public val MI_INSTANCEA: MiType = 31

public val MI_LOCALE_TYPE_CLOSEST_DATA: MiLocaleType = 3

public val MI_LOCALE_TYPE_CLOSEST_UI: MiLocaleType = 2

public val MI_LOCALE_TYPE_REQUESTED_DATA: MiLocaleType = 1

public val MI_LOCALE_TYPE_REQUESTED_UI: MiLocaleType = 0

public val MI_MAX_LOCALE_SIZE: UInt = 128u

public val MI_MODULE_FLAG_BOOLEANS: UInt = 16u

public val MI_MODULE_FLAG_CPLUSPLUS: UInt = 32u

public val MI_MODULE_FLAG_DESCRIPTIONS: UInt = 2u

public val MI_MODULE_FLAG_FILTER_SUPPORT: UInt = 128u

public val MI_MODULE_FLAG_LOCALIZED: UInt = 64u

public val MI_MODULE_FLAG_MAPPING_STRINGS: UInt = 8u

public val MI_MODULE_FLAG_STANDARD_QUALIFIERS: UInt = 1u

public val MI_MODULE_FLAG_VALUES: UInt = 4u

public val MI_OPERATIONFLAGS_BASIC_RTTI: UInt = 2u

public val MI_OPERATIONFLAGS_DEFAULT_RTTI: UInt = 0u

public val MI_OPERATIONFLAGS_EXPENSIVE_PROPERTIES: UInt = 64u

public val MI_OPERATIONFLAGS_FULL_RTTI: UInt = 4u

public val MI_OPERATIONFLAGS_LOCALIZED_QUALIFIERS: UInt = 8u

public val MI_OPERATIONFLAGS_MANUAL_ACK_RESULTS: UInt = 1u

public val MI_OPERATIONFLAGS_NO_RTTI: UInt = 1024u

public val MI_OPERATIONFLAGS_POLYMORPHISM_DEEP_BASE_PROPS_ONLY: UInt = 384u

public val MI_OPERATIONFLAGS_POLYMORPHISM_SHALLOW: UInt = 128u

public val MI_OPERATIONFLAGS_REPORT_OPERATION_STARTED: UInt = 512u

public val MI_OPERATIONFLAGS_STANDARD_RTTI: UInt = 2048u

public val MI_OPERATION_CALLBACK_RESPONSE_TYPE_NO: MiOperationCallbackResponseType = 0

public val MI_OPERATION_CALLBACK_RESPONSE_TYPE_NO_TO_ALL: MiOperationCallbackResponseType = 2

public val MI_OPERATION_CALLBACK_RESPONSE_TYPE_YES: MiOperationCallbackResponseType = 1

public val MI_OPERATION_CALLBACK_RESPONSE_TYPE_YES_TO_ALL: MiOperationCallbackResponseType = 3

public val MI_PROMPTTYPE_CRITICAL: MiPromptType = 1

public val MI_PROMPTTYPE_NORMAL: MiPromptType = 0

public val MI_PROVIDER_ARCHITECTURE_32BIT: MiProviderArchitecture = 0

public val MI_PROVIDER_ARCHITECTURE_64BIT: MiProviderArchitecture = 1

public val MI_REAL32: MiType = 9

public val MI_REAL32A: MiType = 25

public val MI_REAL64: MiType = 10

public val MI_REAL64A: MiType = 26

public val MI_REASON_NONE: MiCancellationReason = 0

public val MI_REASON_SERVICESTOP: MiCancellationReason = 3

public val MI_REASON_SHUTDOWN: MiCancellationReason = 2

public val MI_REASON_TIMEOUT: MiCancellationReason = 1

public val MI_REFERENCE: MiType = 14

public val MI_REFERENCEA: MiType = 30

public val MI_RESULT_ACCESS_DENIED: MiResult = 2

public val MI_RESULT_ALREADY_EXISTS: MiResult = 11

public val MI_RESULT_CLASS_HAS_CHILDREN: MiResult = 8

public val MI_RESULT_CLASS_HAS_INSTANCES: MiResult = 9

public val MI_RESULT_CONTINUATION_ON_ERROR_NOT_SUPPORTED: MiResult = 26

public val MI_RESULT_FAILED: MiResult = 1

public val MI_RESULT_FILTERED_ENUMERATION_NOT_SUPPORTED: MiResult = 25

public val MI_RESULT_INVALID_CLASS: MiResult = 5

public val MI_RESULT_INVALID_ENUMERATION_CONTEXT: MiResult = 21

public val MI_RESULT_INVALID_NAMESPACE: MiResult = 3

public val MI_RESULT_INVALID_OPERATION_TIMEOUT: MiResult = 22

public val MI_RESULT_INVALID_PARAMETER: MiResult = 4

public val MI_RESULT_INVALID_QUERY: MiResult = 15

public val MI_RESULT_INVALID_SUPERCLASS: MiResult = 10

public val MI_RESULT_METHOD_NOT_AVAILABLE: MiResult = 16

public val MI_RESULT_METHOD_NOT_FOUND: MiResult = 17

public val MI_RESULT_NAMESPACE_NOT_EMPTY: MiResult = 20

public val MI_RESULT_NOT_FOUND: MiResult = 6

public val MI_RESULT_NOT_SUPPORTED: MiResult = 7

public val MI_RESULT_NO_SUCH_PROPERTY: MiResult = 12

public val MI_RESULT_OK: MiResult = 0

public val MI_RESULT_PULL_CANNOT_BE_ABANDONED: MiResult = 24

public val MI_RESULT_PULL_HAS_BEEN_ABANDONED: MiResult = 23

public val MI_RESULT_QUERY_LANGUAGE_NOT_SUPPORTED: MiResult = 14

public val MI_RESULT_SERVER_IS_SHUTTING_DOWN: MiResult = 28

public val MI_RESULT_SERVER_LIMITS_EXCEEDED: MiResult = 27

public val MI_RESULT_TYPE_MISMATCH: MiResult = 13

public val MI_SERIALIZER_FLAGS_CLASS_DEEP: UInt = 1u

public val MI_SERIALIZER_FLAGS_INSTANCE_WITH_CLASS: UInt = 1u

public val MI_SINT16: MiType = 4

public val MI_SINT16A: MiType = 20

public val MI_SINT32: MiType = 6

public val MI_SINT32A: MiType = 22

public val MI_SINT64: MiType = 8

public val MI_SINT64A: MiType = 24

public val MI_SINT8: MiType = 2

public val MI_SINT8A: MiType = 18

public val MI_STRING: MiType = 13

public val MI_STRINGA: MiType = 29

public val MI_SUBSCRIBE_BOOKMARK_NEWEST: Pcwstr = w("MI_SUBSCRIBE_BOOKMARK_NEWEST")

public val MI_SUBSCRIBE_BOOKMARK_OLDEST: Pcwstr = w("MI_SUBSCRIBE_BOOKMARK_OLDEST")

public val MI_SUBSCRIPTION_DELIVERY_TYPE_PULL: MiSubscriptionDeliveryType = 1

public val MI_SUBSCRIPTION_DELIVERY_TYPE_PUSH: MiSubscriptionDeliveryType = 2

public val MI_UINT16: MiType = 3

public val MI_UINT16A: MiType = 19

public val MI_UINT32: MiType = 5

public val MI_UINT32A: MiType = 21

public val MI_UINT64: MiType = 7

public val MI_UINT64A: MiType = 23

public val MI_UINT8: MiType = 1

public val MI_UINT8A: MiType = 17

public val MI_WRITEMESSAGE_CHANNEL_DEBUG: UInt = 2u

public val MI_WRITEMESSAGE_CHANNEL_VERBOSE: UInt = 1u

public val MI_WRITEMESSAGE_CHANNEL_WARNING: UInt = 0u

public val WBEMESS_E_AUTHZ_NOT_PRIVILEGED: Wbemstatus = -2147213309

public val WBEMESS_E_REGISTRATION_TOO_BROAD: Wbemstatus = -2147213311

public val WBEMESS_E_REGISTRATION_TOO_PRECISE: Wbemstatus = -2147213310

public val WBEMMOF_E_ALIASES_IN_EMBEDDED: Wbemstatus = -2147205089

public val WBEMMOF_E_CIMTYPE_QUALIFIER: Wbemstatus = -2147205094

public val WBEMMOF_E_DUPLICATE_PROPERTY: Wbemstatus = -2147205093

public val WBEMMOF_E_DUPLICATE_QUALIFIER: Wbemstatus = -2147205087

public val WBEMMOF_E_ERROR_CREATING_TEMP_FILE: Wbemstatus = -2147205073

public val WBEMMOF_E_ERROR_INVALID_INCLUDE_FILE: Wbemstatus = -2147205072

public val WBEMMOF_E_EXPECTED_ALIAS_NAME: Wbemstatus = -2147205098

public val WBEMMOF_E_EXPECTED_BRACE_OR_BAD_TYPE: Wbemstatus = -2147205079

public val WBEMMOF_E_EXPECTED_CLASS_NAME: Wbemstatus = -2147205100

public val WBEMMOF_E_EXPECTED_CLOSE_BRACE: Wbemstatus = -2147205116

public val WBEMMOF_E_EXPECTED_CLOSE_BRACKET: Wbemstatus = -2147205115

public val WBEMMOF_E_EXPECTED_CLOSE_PAREN: Wbemstatus = -2147205114

public val WBEMMOF_E_EXPECTED_DOLLAR: Wbemstatus = -2147205095

public val WBEMMOF_E_EXPECTED_FLAVOR_TYPE: Wbemstatus = -2147205086

public val WBEMMOF_E_EXPECTED_OPEN_BRACE: Wbemstatus = -2147205117

public val WBEMMOF_E_EXPECTED_OPEN_PAREN: Wbemstatus = -2147205111

public val WBEMMOF_E_EXPECTED_PROPERTY_NAME: Wbemstatus = -2147205108

public val WBEMMOF_E_EXPECTED_QUALIFIER_NAME: Wbemstatus = -2147205119

public val WBEMMOF_E_EXPECTED_SEMI: Wbemstatus = -2147205118

public val WBEMMOF_E_EXPECTED_TYPE_IDENTIFIER: Wbemstatus = -2147205112

public val WBEMMOF_E_ILLEGAL_CONSTANT_VALUE: Wbemstatus = -2147205113

public val WBEMMOF_E_INCOMPATIBLE_FLAVOR_TYPES: Wbemstatus = -2147205085

public val WBEMMOF_E_INCOMPATIBLE_FLAVOR_TYPES2: Wbemstatus = -2147205083

public val WBEMMOF_E_INVALID_AMENDMENT_SYNTAX: Wbemstatus = -2147205104

public val WBEMMOF_E_INVALID_CLASS_DECLARATION: Wbemstatus = -2147205097

public val WBEMMOF_E_INVALID_DELETECLASS_SYNTAX: Wbemstatus = -2147205071

public val WBEMMOF_E_INVALID_DELETEINSTANCE_SYNTAX: Wbemstatus = -2147205076

public val WBEMMOF_E_INVALID_DUPLICATE_AMENDMENT: Wbemstatus = -2147205103

public val WBEMMOF_E_INVALID_FILE: Wbemstatus = -2147205090

public val WBEMMOF_E_INVALID_FLAGS_SYNTAX: Wbemstatus = -2147205080

public val WBEMMOF_E_INVALID_INSTANCE_DECLARATION: Wbemstatus = -2147205096

public val WBEMMOF_E_INVALID_NAMESPACE_SPECIFICATION: Wbemstatus = -2147205092

public val WBEMMOF_E_INVALID_NAMESPACE_SYNTAX: Wbemstatus = -2147205101

public val WBEMMOF_E_INVALID_PRAGMA: Wbemstatus = -2147205102

public val WBEMMOF_E_INVALID_QUALIFIER_SYNTAX: Wbemstatus = -2147205075

public val WBEMMOF_E_MULTIPLE_ALIASES: Wbemstatus = -2147205084

public val WBEMMOF_E_MUST_BE_IN_OR_OUT: Wbemstatus = -2147205081

public val WBEMMOF_E_NO_ARRAYS_RETURNED: Wbemstatus = -2147205082

public val WBEMMOF_E_NULL_ARRAY_ELEM: Wbemstatus = -2147205088

public val WBEMMOF_E_OUT_OF_RANGE: Wbemstatus = -2147205091

public val WBEMMOF_E_QUALIFIER_USED_OUTSIDE_SCOPE: Wbemstatus = -2147205074

public val WBEMMOF_E_TYPEDEF_NOT_SUPPORTED: Wbemstatus = -2147205107

public val WBEMMOF_E_TYPE_MISMATCH: Wbemstatus = -2147205099

public val WBEMMOF_E_UNEXPECTED_ALIAS: Wbemstatus = -2147205106

public val WBEMMOF_E_UNEXPECTED_ARRAY_INIT: Wbemstatus = -2147205105

public val WBEMMOF_E_UNRECOGNIZED_TOKEN: Wbemstatus = -2147205110

public val WBEMMOF_E_UNRECOGNIZED_TYPE: Wbemstatus = -2147205109

public val WBEMMOF_E_UNSUPPORTED_CIMV22_DATA_TYPE: Wbemstatus = -2147205077

public val WBEMMOF_E_UNSUPPORTED_CIMV22_QUAL_VALUE: Wbemstatus = -2147205078

public val WBEMPATH_COMPRESSED: WbemGetTextFlags = 1

public val WBEMPATH_CREATE_ACCEPT_ABSOLUTE: WbemPathCreateFlag = 2

public val WBEMPATH_CREATE_ACCEPT_ALL: WbemPathCreateFlag = 4

public val WBEMPATH_CREATE_ACCEPT_RELATIVE: WbemPathCreateFlag = 1

public val WBEMPATH_GET_NAMESPACE_ONLY: WbemGetTextFlags = 16

public val WBEMPATH_GET_ORIGINAL: WbemGetTextFlags = 32

public val WBEMPATH_GET_RELATIVE_ONLY: WbemGetTextFlags = 2

public val WBEMPATH_GET_SERVER_AND_NAMESPACE_ONLY: WbemGetTextFlags = 8

public val WBEMPATH_GET_SERVER_TOO: WbemGetTextFlags = 4

public val WBEMPATH_INFO_ANON_LOCAL_MACHINE: WbemPathStatusFlag = 1

public val WBEMPATH_INFO_CIM_COMPLIANT: WbemPathStatusFlag = 2048

public val WBEMPATH_INFO_CONTAINS_SINGLETON: WbemPathStatusFlag = 256

public val WBEMPATH_INFO_HAS_IMPLIED_KEY: WbemPathStatusFlag = 128

public val WBEMPATH_INFO_HAS_MACHINE_NAME: WbemPathStatusFlag = 2

public val WBEMPATH_INFO_HAS_SUBSCOPES: WbemPathStatusFlag = 16

public val WBEMPATH_INFO_HAS_V2_REF_PATHS: WbemPathStatusFlag = 64

public val WBEMPATH_INFO_IS_CLASS_REF: WbemPathStatusFlag = 4

public val WBEMPATH_INFO_IS_COMPOUND: WbemPathStatusFlag = 32

public val WBEMPATH_INFO_IS_INST_REF: WbemPathStatusFlag = 8

public val WBEMPATH_INFO_IS_PARENT: WbemPathStatusFlag = 8192

public val WBEMPATH_INFO_IS_SINGLETON: WbemPathStatusFlag = 4096

public val WBEMPATH_INFO_NATIVE_PATH: WbemPathStatusFlag = 32768

public val WBEMPATH_INFO_PATH_HAD_SERVER: WbemPathStatusFlag = 131072

public val WBEMPATH_INFO_SERVER_NAMESPACE_ONLY: WbemPathStatusFlag = 16384

public val WBEMPATH_INFO_V1_COMPLIANT: WbemPathStatusFlag = 512

public val WBEMPATH_INFO_V2_COMPLIANT: WbemPathStatusFlag = 1024

public val WBEMPATH_INFO_WMI_PATH: WbemPathStatusFlag = 65536

public val WBEMPATH_QUOTEDTEXT: WbemGetKeyFlags = 2

public val WBEMPATH_TEXT: WbemGetKeyFlags = 1

public val WBEMPATH_TREAT_SINGLE_IDENT_AS_NS: WbemPathCreateFlag = 8

public val WBEMSTATUS_FORMAT_NEWLINE: WbemstatusFormat = 0

public val WBEMSTATUS_FORMAT_NO_NEWLINE: WbemstatusFormat = 1

public val WBEMS_DISPID_COMPLETED: UInt = 2u

public val WBEMS_DISPID_CONNECTION_READY: UInt = 5u

public val WBEMS_DISPID_DERIVATION: UInt = 23u

public val WBEMS_DISPID_OBJECT_PUT: UInt = 4u

public val WBEMS_DISPID_OBJECT_READY: UInt = 1u

public val WBEMS_DISPID_PROGRESS: UInt = 3u

public val WBEM_AUTHENTICATION_METHOD_MASK: WbemLoginType = 15

public val WBEM_COMPARISON_INCLUDE_ALL: WbemComparisonFlag = 0

public val WBEM_ENABLE: WbemSecurityFlags = 1

public val WBEM_E_ACCESS_DENIED: Wbemstatus = -2147217405

public val WBEM_E_AGGREGATING_BY_OBJECT: Wbemstatus = -2147217315

public val WBEM_E_ALREADY_EXISTS: Wbemstatus = -2147217383

public val WBEM_E_AMBIGUOUS_OPERATION: Wbemstatus = -2147217301

public val WBEM_E_AMENDED_OBJECT: Wbemstatus = -2147217306

public val WBEM_E_BACKUP_RESTORE_WINMGMT_RUNNING: Wbemstatus = -2147217312

public val WBEM_E_BUFFER_TOO_SMALL: Wbemstatus = -2147217348

public val WBEM_E_CALL_CANCELLED: Wbemstatus = -2147217358

public val WBEM_E_CANNOT_BE_ABSTRACT: Wbemstatus = -2147217307

public val WBEM_E_CANNOT_BE_KEY: Wbemstatus = -2147217377

public val WBEM_E_CANNOT_BE_SINGLETON: Wbemstatus = -2147217364

public val WBEM_E_CANNOT_CHANGE_INDEX_INHERITANCE: Wbemstatus = -2147217328

public val WBEM_E_CANNOT_CHANGE_KEY_INHERITANCE: Wbemstatus = -2147217335

public val WBEM_E_CIRCULAR_REFERENCE: Wbemstatus = -2147217337

public val WBEM_E_CLASS_HAS_CHILDREN: Wbemstatus = -2147217371

public val WBEM_E_CLASS_HAS_INSTANCES: Wbemstatus = -2147217370

public val WBEM_E_CLASS_NAME_TOO_WIDE: Wbemstatus = -2147217292

public val WBEM_E_CLIENT_TOO_SLOW: Wbemstatus = -2147217305

public val WBEM_E_CONNECTION_FAILED: Wbemstatus = -2147217295

public val WBEM_E_CRITICAL_ERROR: Wbemstatus = -2147217398

public val WBEM_E_DATABASE_VER_MISMATCH: Wbemstatus = -2147217288

public val WBEM_E_ENCRYPTED_CONNECTION_REQUIRED: Wbemstatus = -2147217273

public val WBEM_E_FAILED: Wbemstatus = -2147217407

public val WBEM_E_FATAL_TRANSPORT_ERROR: Wbemstatus = -2147217274

public val WBEM_E_HANDLE_OUT_OF_DATE: Wbemstatus = -2147217296

public val WBEM_E_ILLEGAL_NULL: Wbemstatus = -2147217368

public val WBEM_E_ILLEGAL_OPERATION: Wbemstatus = -2147217378

public val WBEM_E_INCOMPLETE_CLASS: Wbemstatus = -2147217376

public val WBEM_E_INITIALIZATION_FAILURE: Wbemstatus = -2147217388

public val WBEM_E_INVALID_ASSOCIATION: Wbemstatus = -2147217302

public val WBEM_E_INVALID_CIM_TYPE: Wbemstatus = -2147217363

public val WBEM_E_INVALID_CLASS: Wbemstatus = -2147217392

public val WBEM_E_INVALID_CONTEXT: Wbemstatus = -2147217401

public val WBEM_E_INVALID_DUPLICATE_PARAMETER: Wbemstatus = -2147217341

public val WBEM_E_INVALID_FLAVOR: Wbemstatus = -2147217338

public val WBEM_E_INVALID_HANDLE_REQUEST: Wbemstatus = -2147217294

public val WBEM_E_INVALID_LOCALE: Wbemstatus = -2147217280

public val WBEM_E_INVALID_METHOD: Wbemstatus = -2147217362

public val WBEM_E_INVALID_METHOD_PARAMETERS: Wbemstatus = -2147217361

public val WBEM_E_INVALID_NAMESPACE: Wbemstatus = -2147217394

public val WBEM_E_INVALID_OBJECT: Wbemstatus = -2147217393

public val WBEM_E_INVALID_OBJECT_PATH: Wbemstatus = -2147217350

public val WBEM_E_INVALID_OPERATION: Wbemstatus = -2147217386

public val WBEM_E_INVALID_OPERATOR: Wbemstatus = -2147217309

public val WBEM_E_INVALID_PARAMETER: Wbemstatus = -2147217400

public val WBEM_E_INVALID_PARAMETER_ID: Wbemstatus = -2147217353

public val WBEM_E_INVALID_PROPERTY: Wbemstatus = -2147217359

public val WBEM_E_INVALID_PROPERTY_TYPE: Wbemstatus = -2147217366

public val WBEM_E_INVALID_PROVIDER_REGISTRATION: Wbemstatus = -2147217390

public val WBEM_E_INVALID_QUALIFIER: Wbemstatus = -2147217342

public val WBEM_E_INVALID_QUALIFIER_TYPE: Wbemstatus = -2147217367

public val WBEM_E_INVALID_QUERY: Wbemstatus = -2147217385

public val WBEM_E_INVALID_QUERY_TYPE: Wbemstatus = -2147217384

public val WBEM_E_INVALID_STREAM: Wbemstatus = -2147217397

public val WBEM_E_INVALID_SUPERCLASS: Wbemstatus = -2147217395

public val WBEM_E_INVALID_SYNTAX: Wbemstatus = -2147217375

public val WBEM_E_LOCAL_CREDENTIALS: Wbemstatus = -2147217308

public val WBEM_E_MARSHAL_INVALID_SIGNATURE: Wbemstatus = -2147217343

public val WBEM_E_MARSHAL_VERSION_MISMATCH: Wbemstatus = -2147217344

public val WBEM_E_METHOD_DISABLED: Wbemstatus = -2147217322

public val WBEM_E_METHOD_NAME_TOO_WIDE: Wbemstatus = -2147217291

public val WBEM_E_METHOD_NOT_IMPLEMENTED: Wbemstatus = -2147217323

public val WBEM_E_MISSING_AGGREGATION_LIST: Wbemstatus = -2147217317

public val WBEM_E_MISSING_GROUP_WITHIN: Wbemstatus = -2147217318

public val WBEM_E_MISSING_PARAMETER_ID: Wbemstatus = -2147217354

public val WBEM_E_NONCONSECUTIVE_PARAMETER_IDS: Wbemstatus = -2147217352

public val WBEM_E_NONDECORATED_OBJECT: Wbemstatus = -2147217374

public val WBEM_E_NOT_AVAILABLE: Wbemstatus = -2147217399

public val WBEM_E_NOT_EVENT_CLASS: Wbemstatus = -2147217319

public val WBEM_E_NOT_FOUND: Wbemstatus = -2147217406

public val WBEM_E_NOT_SUPPORTED: Wbemstatus = -2147217396

public val WBEM_E_NO_KEY: Wbemstatus = -2147217271

public val WBEM_E_NO_SCHEMA: Wbemstatus = -2147217277

public val WBEM_E_NULL_SECURITY_DESCRIPTOR: Wbemstatus = -2147217304

public val WBEM_E_OUT_OF_DISK_SPACE: Wbemstatus = -2147217349

public val WBEM_E_OUT_OF_MEMORY: Wbemstatus = -2147217402

public val WBEM_E_OVERRIDE_NOT_ALLOWED: Wbemstatus = -2147217382

public val WBEM_E_PARAMETER_ID_ON_RETVAL: Wbemstatus = -2147217351

public val WBEM_E_PRIVILEGE_NOT_HELD: Wbemstatus = -2147217310

public val WBEM_E_PROPAGATED_METHOD: Wbemstatus = -2147217356

public val WBEM_E_PROPAGATED_PROPERTY: Wbemstatus = -2147217380

public val WBEM_E_PROPAGATED_QUALIFIER: Wbemstatus = -2147217381

public val WBEM_E_PROPERTY_NAME_TOO_WIDE: Wbemstatus = -2147217293

public val WBEM_E_PROPERTY_NOT_AN_OBJECT: Wbemstatus = -2147217316

public val WBEM_E_PROVIDER_ALREADY_REGISTERED: Wbemstatus = -2147217276

public val WBEM_E_PROVIDER_DISABLED: Wbemstatus = -2147217270

public val WBEM_E_PROVIDER_FAILURE: Wbemstatus = -2147217404

public val WBEM_E_PROVIDER_LOAD_FAILURE: Wbemstatus = -2147217389

public val WBEM_E_PROVIDER_NOT_CAPABLE: Wbemstatus = -2147217372

public val WBEM_E_PROVIDER_NOT_FOUND: Wbemstatus = -2147217391

public val WBEM_E_PROVIDER_NOT_REGISTERED: Wbemstatus = -2147217275

public val WBEM_E_PROVIDER_SUSPENDED: Wbemstatus = -2147217279

public val WBEM_E_PROVIDER_TIMED_OUT: Wbemstatus = -2147217272

public val WBEM_E_QUALIFIER_NAME_TOO_WIDE: Wbemstatus = -2147217290

public val WBEM_E_QUERY_NOT_IMPLEMENTED: Wbemstatus = -2147217369

public val WBEM_E_QUEUE_OVERFLOW: Wbemstatus = -2147217311

public val WBEM_E_QUOTA_VIOLATION: Wbemstatus = -2147217300

public val WBEM_E_READ_ONLY: Wbemstatus = -2147217373

public val WBEM_E_REFRESHER_BUSY: Wbemstatus = -2147217321

public val WBEM_E_RERUN_COMMAND: Wbemstatus = -2147217289

public val WBEM_E_RESERVED_001: Wbemstatus = -2147217299

public val WBEM_E_RESERVED_002: Wbemstatus = -2147217298

public val WBEM_E_RESOURCE_CONTENTION: WbemExtraReturnCodes = -2147209214

public val WBEM_E_RETRY_LATER: WbemExtraReturnCodes = -2147209215

public val WBEM_E_SERVER_TOO_BUSY: Wbemstatus = -2147217339

public val WBEM_E_SHUTTING_DOWN: Wbemstatus = -2147217357

public val WBEM_E_SYNCHRONIZATION_REQUIRED: Wbemstatus = -2147217278

public val WBEM_E_SYSTEM_PROPERTY: Wbemstatus = -2147217360

public val WBEM_E_TIMED_OUT: Wbemstatus = -2147217303

public val WBEM_E_TOO_MANY_PROPERTIES: Wbemstatus = -2147217327

public val WBEM_E_TOO_MUCH_DATA: Wbemstatus = -2147217340

public val WBEM_E_TRANSPORT_FAILURE: Wbemstatus = -2147217387

public val WBEM_E_TYPE_MISMATCH: Wbemstatus = -2147217403

public val WBEM_E_UNEXPECTED: Wbemstatus = -2147217379

public val WBEM_E_UNINTERPRETABLE_PROVIDER_QUERY: Wbemstatus = -2147217313

public val WBEM_E_UNKNOWN_OBJECT_TYPE: Wbemstatus = -2147217346

public val WBEM_E_UNKNOWN_PACKET_TYPE: Wbemstatus = -2147217345

public val WBEM_E_UNPARSABLE_QUERY: Wbemstatus = -2147217320

public val WBEM_E_UNSUPPORTED_CLASS_UPDATE: Wbemstatus = -2147217336

public val WBEM_E_UNSUPPORTED_LOCALE: Wbemstatus = -2147217297

public val WBEM_E_UNSUPPORTED_PARAMETER: Wbemstatus = -2147217355

public val WBEM_E_UNSUPPORTED_PUT_EXTENSION: Wbemstatus = -2147217347

public val WBEM_E_UPDATE_OVERRIDE_NOT_ALLOWED: Wbemstatus = -2147217325

public val WBEM_E_UPDATE_PROPAGATED_METHOD: Wbemstatus = -2147217324

public val WBEM_E_UPDATE_TYPE_MISMATCH: Wbemstatus = -2147217326

public val WBEM_E_VALUE_OUT_OF_RANGE: Wbemstatus = -2147217365

public val WBEM_E_VETO_DELETE: Wbemstatus = -2147217287

public val WBEM_E_VETO_PUT: Wbemstatus = -2147217286

public val WBEM_FLAG_ADVISORY: WbemChangeFlagType = 65536

public val WBEM_FLAG_ALLOW_READ: WbemLockingFlagType = 1

public val WBEM_FLAG_ALWAYS: WbemConditionFlagType = 0

public val WBEM_FLAG_AUTORECOVER: WbemCompilerOptions = 2

public val WBEM_FLAG_BACKUP_RESTORE_DEFAULT: WbemBackupRestoreFlags = 0

public val WBEM_FLAG_BACKUP_RESTORE_FORCE_SHUTDOWN: WbemBackupRestoreFlags = 1

public val WBEM_FLAG_BATCH_IF_NEEDED: WbemBatchType = 0

public val WBEM_FLAG_BIDIRECTIONAL: WbemGenericFlagType = 0

public val WBEM_FLAG_CHECK_ONLY: WbemCompilerOptions = 1

public val WBEM_FLAG_CLASS_LOCAL_AND_OVERRIDES: WbemConditionFlagType = 512

public val WBEM_FLAG_CLASS_OVERRIDES_ONLY: WbemConditionFlagType = 256

public val WBEM_FLAG_CONNECT_PROVIDERS: WbemConnectOptions = 256

public val WBEM_FLAG_CONNECT_REPOSITORY_ONLY: WbemConnectOptions = 64

public val WBEM_FLAG_CONNECT_USE_MAX_WAIT: WbemConnectOptions = 128

public val WBEM_FLAG_CONSOLE_PRINT: WbemCompilerOptions = 8

public val WBEM_FLAG_CREATE_ONLY: WbemChangeFlagType = 2

public val WBEM_FLAG_CREATE_OR_UPDATE: WbemChangeFlagType = 0

public val WBEM_FLAG_DEEP: WbemQueryFlagType = 0

public val WBEM_FLAG_DIRECT_READ: WbemGenericFlagType = 512

public val WBEM_FLAG_DONT_ADD_TO_LIST: WbemCompilerOptions = 16

public val WBEM_FLAG_DONT_SEND_STATUS: WbemGenericFlagType = 0

public val WBEM_FLAG_ENSURE_LOCATABLE: WbemGenericFlagType = 256

public val WBEM_FLAG_EXCLUDE_OBJECT_QUALIFIERS: WbemLimitationFlagType = 16

public val WBEM_FLAG_EXCLUDE_PROPERTY_QUALIFIERS: WbemLimitationFlagType = 32

public val WBEM_FLAG_FORWARD_ONLY: WbemGenericFlagType = 32

public val WBEM_FLAG_IGNORE_CASE: WbemComparisonFlag = 16

public val WBEM_FLAG_IGNORE_CLASS: WbemComparisonFlag = 8

public val WBEM_FLAG_IGNORE_DEFAULT_VALUES: WbemComparisonFlag = 4

public val WBEM_FLAG_IGNORE_FLAVOR: WbemComparisonFlag = 32

public val WBEM_FLAG_IGNORE_OBJECT_SOURCE: WbemComparisonFlag = 2

public val WBEM_FLAG_IGNORE_QUALIFIERS: WbemComparisonFlag = 1

public val WBEM_FLAG_INPROC_LOGIN: WbemLoginType = 0

public val WBEM_FLAG_KEYS_ONLY: WbemConditionFlagType = 4

public val WBEM_FLAG_LOCAL_LOGIN: WbemLoginType = 1

public val WBEM_FLAG_LOCAL_ONLY: WbemConditionFlagType = 16

public val WBEM_FLAG_LONG_NAME: WbemInformationFlagType = 2

public val WBEM_FLAG_MUST_BATCH: WbemBatchType = 1

public val WBEM_FLAG_MUST_NOT_BATCH: WbemBatchType = 2

public val WBEM_FLAG_NONSYSTEM_ONLY: WbemConditionFlagType = 64

public val WBEM_FLAG_NO_ERROR_OBJECT: WbemGenericFlagType = 64

public val WBEM_FLAG_NO_FLAVORS: WbemTextFlagType = 1

public val WBEM_FLAG_ONLY_IF_FALSE: WbemConditionFlagType = 2

public val WBEM_FLAG_ONLY_IF_IDENTICAL: WbemConditionFlagType = 3

public val WBEM_FLAG_ONLY_IF_TRUE: WbemConditionFlagType = 1

public val WBEM_FLAG_OWNER_UPDATE: WbemProviderFlags = 65536

public val WBEM_FLAG_PROPAGATED_ONLY: WbemConditionFlagType = 32

public val WBEM_FLAG_PROTOTYPE: WbemQueryFlagType = 2

public val WBEM_FLAG_REFRESH_AUTO_RECONNECT: WbemRefresherFlags = 0

public val WBEM_FLAG_REFRESH_NO_AUTO_RECONNECT: WbemRefresherFlags = 1

public val WBEM_FLAG_REFS_ONLY: WbemConditionFlagType = 8

public val WBEM_FLAG_REMOTE_LOGIN: WbemLoginType = 2

public val WBEM_FLAG_RETURN_ERROR_OBJECT: WbemGenericFlagType = 0

public val WBEM_FLAG_RETURN_IMMEDIATELY: WbemGenericFlagType = 16

public val WBEM_FLAG_RETURN_WBEM_COMPLETE: WbemGenericFlagType = 0

public val WBEM_FLAG_SEND_ONLY_SELECTED: WbemGenericFlagType = 0

public val WBEM_FLAG_SEND_STATUS: WbemGenericFlagType = 128

public val WBEM_FLAG_SHALLOW: WbemQueryFlagType = 1

public val WBEM_FLAG_SHORT_NAME: WbemInformationFlagType = 1

public val WBEM_FLAG_SPLIT_FILES: WbemCompilerOptions = 32

public val WBEM_FLAG_STORE_FILE: WbemCompilerOptions = 256

public val WBEM_FLAG_STRONG_VALIDATION: WbemGenericFlagType = 1048576

public val WBEM_FLAG_SYSTEM_ONLY: WbemConditionFlagType = 48

public val WBEM_FLAG_UNSECAPP_CHECK_ACCESS: WbemUnsecappFlagType = 1

public val WBEM_FLAG_UNSECAPP_DEFAULT_CHECK_ACCESS: WbemUnsecappFlagType = 0

public val WBEM_FLAG_UNSECAPP_DONT_CHECK_ACCESS: WbemUnsecappFlagType = 2

public val WBEM_FLAG_UPDATE_COMPATIBLE: WbemChangeFlagType = 0

public val WBEM_FLAG_UPDATE_FORCE_MODE: WbemChangeFlagType = 64

public val WBEM_FLAG_UPDATE_ONLY: WbemChangeFlagType = 1

public val WBEM_FLAG_UPDATE_SAFE_MODE: WbemChangeFlagType = 32

public val WBEM_FLAG_USE_AMENDED_QUALIFIERS: WbemGenericFlagType = 131072

public val WBEM_FLAG_USE_MULTIPLE_CHALLENGES: WbemLoginType = 16

public val WBEM_FLAG_WMI_CHECK: WbemCompilerOptions = 4

public val WBEM_FLAVOR_AMENDED: WbemFlavorType = 128

public val WBEM_FLAVOR_DONT_PROPAGATE: WbemFlavorType = 0

public val WBEM_FLAVOR_FLAG_PROPAGATE_TO_DERIVED_CLASS: WbemFlavorType = 2

public val WBEM_FLAVOR_FLAG_PROPAGATE_TO_INSTANCE: WbemFlavorType = 1

public val WBEM_FLAVOR_MASK_AMENDED: WbemFlavorType = 128

public val WBEM_FLAVOR_MASK_ORIGIN: WbemFlavorType = 96

public val WBEM_FLAVOR_MASK_PERMISSIONS: WbemFlavorType = 16

public val WBEM_FLAVOR_MASK_PROPAGATION: WbemFlavorType = 15

public val WBEM_FLAVOR_NOT_AMENDED: WbemFlavorType = 0

public val WBEM_FLAVOR_NOT_OVERRIDABLE: WbemFlavorType = 16

public val WBEM_FLAVOR_ORIGIN_LOCAL: WbemFlavorType = 0

public val WBEM_FLAVOR_ORIGIN_PROPAGATED: WbemFlavorType = 32

public val WBEM_FLAVOR_ORIGIN_SYSTEM: WbemFlavorType = 64

public val WBEM_FLAVOR_OVERRIDABLE: WbemFlavorType = 0

public val WBEM_FULL_WRITE_REP: WbemSecurityFlags = 4

public val WBEM_GENUS_CLASS: WbemGenusType = 1

public val WBEM_GENUS_INSTANCE: WbemGenusType = 2

public val WBEM_INFINITE: Int = -1

public val WBEM_MASK_CLASS_CONDITION: WbemConditionFlagType = 768

public val WBEM_MASK_CONDITION_ORIGIN: WbemConditionFlagType = 112

public val WBEM_MASK_PRIMARY_CONDITION: WbemConditionFlagType = 3

public val WBEM_MASK_RESERVED_FLAGS: WbemGenericFlagType = 126976

public val WBEM_MASK_UPDATE_MODE: WbemChangeFlagType = 96

public val WBEM_MAX_IDENTIFIER: WbemLimits = 4096

public val WBEM_MAX_OBJECT_NESTING: WbemLimits = 64

public val WBEM_MAX_PATH: WbemLimits = 8192

public val WBEM_MAX_QUERY: WbemLimits = 16384

public val WBEM_MAX_USER_PROPERTIES: WbemLimits = 1024

public val WBEM_METHOD_EXECUTE: WbemSecurityFlags = 2

public val WBEM_NO_ERROR: Wbemstatus = 0

public val WBEM_NO_WAIT: Int = 0

public val WBEM_PARTIAL_WRITE_REP: WbemSecurityFlags = 8

public val WBEM_REMOTE_ACCESS: WbemSecurityFlags = 32

public val WBEM_REQUIREMENTS_RECHECK_SUBSCRIPTIONS: WbemProviderRequirementsType = 2

public val WBEM_REQUIREMENTS_START_POSTFILTER: WbemProviderRequirementsType = 0

public val WBEM_REQUIREMENTS_STOP_POSTFILTER: WbemProviderRequirementsType = 1

public val WBEM_RETURN_IMMEDIATELY: WbemGenericFlagType = 16

public val WBEM_RETURN_WHEN_COMPLETE: WbemGenericFlagType = 0

public val WBEM_RIGHT_PUBLISH: WbemSecurityFlags = 128

public val WBEM_RIGHT_SUBSCRIBE: WbemSecurityFlags = 64

public val WBEM_SHUTDOWN_OS: WbemShutdownFlags = 3

public val WBEM_SHUTDOWN_UNLOAD_COMPONENT: WbemShutdownFlags = 1

public val WBEM_SHUTDOWN_WMI: WbemShutdownFlags = 2

public val WBEM_STATUS_COMPLETE: WbemStatusType = 0

public val WBEM_STATUS_LOGGING_INFORMATION: WbemStatusType = 256

public val WBEM_STATUS_LOGGING_INFORMATION_ESS: WbemStatusType = 4096

public val WBEM_STATUS_LOGGING_INFORMATION_HOST: WbemStatusType = 1024

public val WBEM_STATUS_LOGGING_INFORMATION_PROVIDER: WbemStatusType = 512

public val WBEM_STATUS_LOGGING_INFORMATION_REPOSITORY: WbemStatusType = 2048

public val WBEM_STATUS_PROGRESS: WbemStatusType = 2

public val WBEM_STATUS_REQUIREMENTS: WbemStatusType = 1

public val WBEM_S_ACCESS_DENIED: Wbemstatus = 262153

public val WBEM_S_ALREADY_EXISTS: Wbemstatus = 262145

public val WBEM_S_DIFFERENT: Wbemstatus = 262147

public val WBEM_S_DUPLICATE_OBJECTS: Wbemstatus = 262152

public val WBEM_S_FALSE: Wbemstatus = 1

public val WBEM_S_INDIRECTLY_UPDATED: WbemExtraReturnCodes = 274434

public val WBEM_S_INITIALIZED: WbemExtraReturnCodes = 0

public val WBEM_S_LIMITED_SERVICE: WbemExtraReturnCodes = 274433

public val WBEM_S_NO_ERROR: Wbemstatus = 0

public val WBEM_S_NO_MORE_DATA: Wbemstatus = 262149

public val WBEM_S_OPERATION_CANCELLED: Wbemstatus = 262150

public val WBEM_S_PARTIAL_RESULTS: Wbemstatus = 262160

public val WBEM_S_PENDING: Wbemstatus = 262151

public val WBEM_S_RESET_TO_DEFAULT: Wbemstatus = 262146

public val WBEM_S_SAME: Wbemstatus = 0

public val WBEM_S_SOURCE_NOT_AVAILABLE: Wbemstatus = 262167

public val WBEM_S_SUBJECT_TO_SDS: WbemExtraReturnCodes = 274435

public val WBEM_S_TIMEDOUT: Wbemstatus = 262148

public val WBEM_WRITE_PROVIDER: WbemSecurityFlags = 16

public val WMIQ_ANALYSIS_ASSOC_QUERY: WmiqAnalysisType = 2

public val WMIQ_ANALYSIS_PROP_ANALYSIS_MATRIX: WmiqAnalysisType = 3

public val WMIQ_ANALYSIS_QUERY_TEXT: WmiqAnalysisType = 4

public val WMIQ_ANALYSIS_RESERVED: WmiqAnalysisType = 134217728

public val WMIQ_ANALYSIS_RPN_SEQUENCE: WmiqAnalysisType = 1

public val WMIQ_ASSOCQ_ASSOCCLASS: WmiqAssocqFlags = 8

public val WMIQ_ASSOCQ_ASSOCIATORS: WmiqAssocqFlags = 1

public val WMIQ_ASSOCQ_CLASSDEFSONLY: WmiqAssocqFlags = 256

public val WMIQ_ASSOCQ_CLASSREFSONLY: WmiqAssocqFlags = 2048

public val WMIQ_ASSOCQ_KEYSONLY: WmiqAssocqFlags = 512

public val WMIQ_ASSOCQ_REFERENCES: WmiqAssocqFlags = 2

public val WMIQ_ASSOCQ_REQUIREDASSOCQUALIFIER: WmiqAssocqFlags = 128

public val WMIQ_ASSOCQ_REQUIREDQUALIFIER: WmiqAssocqFlags = 64

public val WMIQ_ASSOCQ_RESULTCLASS: WmiqAssocqFlags = 4

public val WMIQ_ASSOCQ_RESULTROLE: WmiqAssocqFlags = 32

public val WMIQ_ASSOCQ_ROLE: WmiqAssocqFlags = 16

public val WMIQ_ASSOCQ_SCHEMAONLY: WmiqAssocqFlags = 1024

public val WMIQ_LF10_COMPEX_SUBEXPRESSIONS: WmiqLanguageFeatures = 10

public val WMIQ_LF11_ALIASING: WmiqLanguageFeatures = 11

public val WMIQ_LF12_GROUP_BY_HAVING: WmiqLanguageFeatures = 12

public val WMIQ_LF13_WMI_WITHIN: WmiqLanguageFeatures = 13

public val WMIQ_LF14_SQL_WRITE_OPERATIONS: WmiqLanguageFeatures = 14

public val WMIQ_LF15_GO: WmiqLanguageFeatures = 15

public val WMIQ_LF16_SINGLE_LEVEL_TRANSACTIONS: WmiqLanguageFeatures = 16

public val WMIQ_LF17_QUALIFIED_NAMES: WmiqLanguageFeatures = 17

public val WMIQ_LF18_ASSOCIATONS: WmiqLanguageFeatures = 18

public val WMIQ_LF19_SYSTEM_PROPERTIES: WmiqLanguageFeatures = 19

public val WMIQ_LF1_BASIC_SELECT: WmiqLanguageFeatures = 1

public val WMIQ_LF20_EXTENDED_SYSTEM_PROPERTIES: WmiqLanguageFeatures = 20

public val WMIQ_LF21_SQL89_JOINS: WmiqLanguageFeatures = 21

public val WMIQ_LF22_SQL92_JOINS: WmiqLanguageFeatures = 22

public val WMIQ_LF23_SUBSELECTS: WmiqLanguageFeatures = 23

public val WMIQ_LF24_UMI_EXTENSIONS: WmiqLanguageFeatures = 24

public val WMIQ_LF25_DATEPART: WmiqLanguageFeatures = 25

public val WMIQ_LF26_LIKE: WmiqLanguageFeatures = 26

public val WMIQ_LF27_CIM_TEMPORAL_CONSTRUCTS: WmiqLanguageFeatures = 27

public val WMIQ_LF28_STANDARD_AGGREGATES: WmiqLanguageFeatures = 28

public val WMIQ_LF29_MULTI_LEVEL_ORDER_BY: WmiqLanguageFeatures = 29

public val WMIQ_LF2_CLASS_NAME_IN_QUERY: WmiqLanguageFeatures = 2

public val WMIQ_LF30_WMI_PRAGMAS: WmiqLanguageFeatures = 30

public val WMIQ_LF31_QUALIFIER_TESTS: WmiqLanguageFeatures = 31

public val WMIQ_LF32_SP_EXECUTE: WmiqLanguageFeatures = 32

public val WMIQ_LF33_ARRAY_ACCESS: WmiqLanguageFeatures = 33

public val WMIQ_LF34_UNION: WmiqLanguageFeatures = 34

public val WMIQ_LF35_COMPLEX_SELECT_TARGET: WmiqLanguageFeatures = 35

public val WMIQ_LF36_REFERENCE_TESTS: WmiqLanguageFeatures = 36

public val WMIQ_LF37_SELECT_INTO: WmiqLanguageFeatures = 37

public val WMIQ_LF38_BASIC_DATETIME_TESTS: WmiqLanguageFeatures = 38

public val WMIQ_LF39_COUNT_COLUMN: WmiqLanguageFeatures = 39

public val WMIQ_LF3_STRING_CASE_FUNCTIONS: WmiqLanguageFeatures = 3

public val WMIQ_LF40_BETWEEN: WmiqLanguageFeatures = 40

public val WMIQ_LF4_PROP_TO_PROP_TESTS: WmiqLanguageFeatures = 4

public val WMIQ_LF5_COUNT_STAR: WmiqLanguageFeatures = 5

public val WMIQ_LF6_ORDER_BY: WmiqLanguageFeatures = 6

public val WMIQ_LF7_DISTINCT: WmiqLanguageFeatures = 7

public val WMIQ_LF8_ISA: WmiqLanguageFeatures = 8

public val WMIQ_LF9_THIS: WmiqLanguageFeatures = 9

public val WMIQ_LF_LAST: WmiqLanguageFeatures = 40

public val WMIQ_RPNF_ARRAY_ACCESS_USED: WmiqRpnfFeature = 8192

public val WMIQ_RPNF_COUNT_STAR: WmiqRpnfFeature = 64

public val WMIQ_RPNF_EQUALITY_TESTS_ONLY: WmiqRpnfFeature = 32

public val WMIQ_RPNF_FEATURE_SELECT_STAR: WmiqRpnfFeature = 16

public val WMIQ_RPNF_GROUP_BY_HAVING: WmiqRpnfFeature = 4096

public val WMIQ_RPNF_ISA_USED: WmiqRpnfFeature = 2048

public val WMIQ_RPNF_ORDER_BY: WmiqRpnfFeature = 1024

public val WMIQ_RPNF_PROJECTION: WmiqRpnfFeature = 8

public val WMIQ_RPNF_PROP_TO_PROP_TESTS: WmiqRpnfFeature = 512

public val WMIQ_RPNF_QUALIFIED_NAMES_USED: WmiqRpnfFeature = 128

public val WMIQ_RPNF_QUERY_IS_CONJUNCTIVE: WmiqRpnfFeature = 2

public val WMIQ_RPNF_QUERY_IS_DISJUNCTIVE: WmiqRpnfFeature = 4

public val WMIQ_RPNF_SYSPROP_CLASS_USED: WmiqRpnfFeature = 256

public val WMIQ_RPNF_WHERE_CLAUSE_PRESENT: WmiqRpnfFeature = 1

public val WMIQ_RPN_CONST: WmiqRpnTokenFlags = 8

public val WMIQ_RPN_CONST2: WmiqRpnTokenFlags = 4

public val WMIQ_RPN_FROM_CLASS_LIST: WmiqRpnTokenFlags = 4

public val WMIQ_RPN_FROM_MULTIPLE: WmiqRpnTokenFlags = 8

public val WMIQ_RPN_FROM_PATH: WmiqRpnTokenFlags = 2

public val WMIQ_RPN_FROM_UNARY: WmiqRpnTokenFlags = 1

public val WMIQ_RPN_GET_EXPR_SHAPE: WmiqRpnTokenFlags = 2

public val WMIQ_RPN_GET_LEFT_FUNCTION: WmiqRpnTokenFlags = 3

public val WMIQ_RPN_GET_RELOP: WmiqRpnTokenFlags = 5

public val WMIQ_RPN_GET_RIGHT_FUNCTION: WmiqRpnTokenFlags = 4

public val WMIQ_RPN_GET_TOKEN_TYPE: WmiqRpnTokenFlags = 1

public val WMIQ_RPN_LEFT_FUNCTION: WmiqRpnTokenFlags = 32

public val WMIQ_RPN_LEFT_PROPERTY_NAME: WmiqRpnTokenFlags = 1

public val WMIQ_RPN_NEXT_TOKEN: WmiqRpnTokenFlags = 1

public val WMIQ_RPN_OP_EQ: WmiqRpnTokenFlags = 1

public val WMIQ_RPN_OP_GE: WmiqRpnTokenFlags = 3

public val WMIQ_RPN_OP_GT: WmiqRpnTokenFlags = 6

public val WMIQ_RPN_OP_ISA: WmiqRpnTokenFlags = 8

public val WMIQ_RPN_OP_ISNOTA: WmiqRpnTokenFlags = 9

public val WMIQ_RPN_OP_ISNOTNULL: WmiqRpnTokenFlags = 11

public val WMIQ_RPN_OP_ISNULL: WmiqRpnTokenFlags = 10

public val WMIQ_RPN_OP_LE: WmiqRpnTokenFlags = 4

public val WMIQ_RPN_OP_LIKE: WmiqRpnTokenFlags = 7

public val WMIQ_RPN_OP_LT: WmiqRpnTokenFlags = 5

public val WMIQ_RPN_OP_NE: WmiqRpnTokenFlags = 2

public val WMIQ_RPN_OP_UNDEFINED: WmiqRpnTokenFlags = 0

public val WMIQ_RPN_RELOP: WmiqRpnTokenFlags = 16

public val WMIQ_RPN_RIGHT_FUNCTION: WmiqRpnTokenFlags = 64

public val WMIQ_RPN_RIGHT_PROPERTY_NAME: WmiqRpnTokenFlags = 2

public val WMIQ_RPN_TOKEN_AND: WmiqRpnTokenFlags = 2

public val WMIQ_RPN_TOKEN_EXPRESSION: WmiqRpnTokenFlags = 1

public val WMIQ_RPN_TOKEN_NOT: WmiqRpnTokenFlags = 4

public val WMIQ_RPN_TOKEN_OR: WmiqRpnTokenFlags = 3

public val WMI_OBJ_TEXT_CIM_DTD_2_0: WmiObjText = 1

public val WMI_OBJ_TEXT_LAST: WmiObjText = 13

public val WMI_OBJ_TEXT_WMI_DTD_2_0: WmiObjText = 2

public val WMI_OBJ_TEXT_WMI_EXT1: WmiObjText = 3

public val WMI_OBJ_TEXT_WMI_EXT10: WmiObjText = 12

public val WMI_OBJ_TEXT_WMI_EXT2: WmiObjText = 4

public val WMI_OBJ_TEXT_WMI_EXT3: WmiObjText = 5

public val WMI_OBJ_TEXT_WMI_EXT4: WmiObjText = 6

public val WMI_OBJ_TEXT_WMI_EXT5: WmiObjText = 7

public val WMI_OBJ_TEXT_WMI_EXT6: WmiObjText = 8

public val WMI_OBJ_TEXT_WMI_EXT7: WmiObjText = 9

public val WMI_OBJ_TEXT_WMI_EXT8: WmiObjText = 10

public val WMI_OBJ_TEXT_WMI_EXT9: WmiObjText = 11

public val WBEM_AUTHENTICATION_LEVEL_CALL: WbemAuthenticationLevelEnum = 3

public val WBEM_AUTHENTICATION_LEVEL_CONNECT: WbemAuthenticationLevelEnum = 2

public val WBEM_AUTHENTICATION_LEVEL_DEFAULT: WbemAuthenticationLevelEnum = 0

public val WBEM_AUTHENTICATION_LEVEL_NONE: WbemAuthenticationLevelEnum = 1

public val WBEM_AUTHENTICATION_LEVEL_PKT: WbemAuthenticationLevelEnum = 4

public val WBEM_AUTHENTICATION_LEVEL_PKT_INTEGRITY: WbemAuthenticationLevelEnum = 5

public val WBEM_AUTHENTICATION_LEVEL_PKT_PRIVACY: WbemAuthenticationLevelEnum = 6

public val WBEM_CHANGE_FLAG_ADVISORY: WbemChangeFlagEnum = 65536

public val WBEM_CHANGE_FLAG_CREATE_ONLY: WbemChangeFlagEnum = 2

public val WBEM_CHANGE_FLAG_CREATE_OR_UPDATE: WbemChangeFlagEnum = 0

public val WBEM_CHANGE_FLAG_STRONG_VALIDATION: WbemChangeFlagEnum = 128

public val WBEM_CHANGE_FLAG_UPDATE_COMPATIBLE: WbemChangeFlagEnum = 0

public val WBEM_CHANGE_FLAG_UPDATE_FORCE_MODE: WbemChangeFlagEnum = 64

public val WBEM_CHANGE_FLAG_UPDATE_ONLY: WbemChangeFlagEnum = 1

public val WBEM_CHANGE_FLAG_UPDATE_SAFE_MODE: WbemChangeFlagEnum = 32

public val WBEM_CIMTYPE_BOOLEAN: WbemCimtypeEnum = 11

public val WBEM_CIMTYPE_CHAR16: WbemCimtypeEnum = 103

public val WBEM_CIMTYPE_DATETIME: WbemCimtypeEnum = 101

public val WBEM_CIMTYPE_OBJECT: WbemCimtypeEnum = 13

public val WBEM_CIMTYPE_REAL32: WbemCimtypeEnum = 4

public val WBEM_CIMTYPE_REAL64: WbemCimtypeEnum = 5

public val WBEM_CIMTYPE_REFERENCE: WbemCimtypeEnum = 102

public val WBEM_CIMTYPE_SINT16: WbemCimtypeEnum = 2

public val WBEM_CIMTYPE_SINT32: WbemCimtypeEnum = 3

public val WBEM_CIMTYPE_SINT64: WbemCimtypeEnum = 20

public val WBEM_CIMTYPE_SINT8: WbemCimtypeEnum = 16

public val WBEM_CIMTYPE_STRING: WbemCimtypeEnum = 8

public val WBEM_CIMTYPE_UINT16: WbemCimtypeEnum = 18

public val WBEM_CIMTYPE_UINT32: WbemCimtypeEnum = 19

public val WBEM_CIMTYPE_UINT64: WbemCimtypeEnum = 21

public val WBEM_CIMTYPE_UINT8: WbemCimtypeEnum = 17

public val WBEM_COMPARISON_FLAG_IGNORE_CASE: WbemComparisonFlagEnum = 16

public val WBEM_COMPARISON_FLAG_IGNORE_CLASS: WbemComparisonFlagEnum = 8

public val WBEM_COMPARISON_FLAG_IGNORE_DEFAULT_VALUES: WbemComparisonFlagEnum = 4

public val WBEM_COMPARISON_FLAG_IGNORE_FLAVOR: WbemComparisonFlagEnum = 32

public val WBEM_COMPARISON_FLAG_IGNORE_OBJECT_SOURCE: WbemComparisonFlagEnum = 2

public val WBEM_COMPARISON_FLAG_IGNORE_QUALIFIERS: WbemComparisonFlagEnum = 1

public val WBEM_COMPARISON_FLAG_INCLUDE_ALL: WbemComparisonFlagEnum = 0

public val WBEM_CONNECT_FLAG_USE_MAX_WAIT: WbemConnectOptionsEnum = 128

public val WBEM_ERR_ACCESS_DENIED: WbemErrorEnum = -2147217405

public val WBEM_ERR_AGGREGATING_BY_OBJECT: WbemErrorEnum = -2147217315

public val WBEM_ERR_ALREADY_EXISTS: WbemErrorEnum = -2147217383

public val WBEM_ERR_AMBIGUOUS_OPERATION: WbemErrorEnum = -2147217301

public val WBEM_ERR_AMENDED_OBJECT: WbemErrorEnum = -2147217306

public val WBEM_ERR_BACKUP_RESTORE_WINMGMT_RUNNING: WbemErrorEnum = -2147217312

public val WBEM_ERR_BUFFER_TOO_SMALL: WbemErrorEnum = -2147217348

public val WBEM_ERR_CALL_CANCELLED: WbemErrorEnum = -2147217358

public val WBEM_ERR_CANNOT_BE_ABSTRACT: WbemErrorEnum = -2147217307

public val WBEM_ERR_CANNOT_BE_KEY: WbemErrorEnum = -2147217377

public val WBEM_ERR_CANNOT_BE_SINGLETON: WbemErrorEnum = -2147217364

public val WBEM_ERR_CANNOT_CHANGE_INDEX_INHERITANCE: WbemErrorEnum = -2147217328

public val WBEM_ERR_CANNOT_CHANGE_KEY_INHERITANCE: WbemErrorEnum = -2147217335

public val WBEM_ERR_CIRCULAR_REFERENCE: WbemErrorEnum = -2147217337

public val WBEM_ERR_CLASS_HAS_CHILDREN: WbemErrorEnum = -2147217371

public val WBEM_ERR_CLASS_HAS_INSTANCES: WbemErrorEnum = -2147217370

public val WBEM_ERR_CLASS_NAME_TOO_WIDE: WbemErrorEnum = -2147217292

public val WBEM_ERR_CLIENT_TOO_SLOW: WbemErrorEnum = -2147217305

public val WBEM_ERR_CONNECTION_FAILED: WbemErrorEnum = -2147217295

public val WBEM_ERR_CRITICAL_ERROR: WbemErrorEnum = -2147217398

public val WBEM_ERR_DATABASE_VER_MISMATCH: WbemErrorEnum = -2147217288

public val WBEM_ERR_ENCRYPTED_CONNECTION_REQUIRED: WbemErrorEnum = -2147217273

public val WBEM_ERR_FAILED: WbemErrorEnum = -2147217407

public val WBEM_ERR_FATAL_TRANSPORT_ERROR: WbemErrorEnum = -2147217274

public val WBEM_ERR_FORCED_ROLLBACK: WbemErrorEnum = -2147217298

public val WBEM_ERR_HANDLE_OUT_OF_DATE: WbemErrorEnum = -2147217296

public val WBEM_ERR_ILLEGAL_NULL: WbemErrorEnum = -2147217368

public val WBEM_ERR_ILLEGAL_OPERATION: WbemErrorEnum = -2147217378

public val WBEM_ERR_INCOMPLETE_CLASS: WbemErrorEnum = -2147217376

public val WBEM_ERR_INITIALIZATION_FAILURE: WbemErrorEnum = -2147217388

public val WBEM_ERR_INVALID_ASSOCIATION: WbemErrorEnum = -2147217302

public val WBEM_ERR_INVALID_CIM_TYPE: WbemErrorEnum = -2147217363

public val WBEM_ERR_INVALID_CLASS: WbemErrorEnum = -2147217392

public val WBEM_ERR_INVALID_CONTEXT: WbemErrorEnum = -2147217401

public val WBEM_ERR_INVALID_DUPLICATE_PARAMETER: WbemErrorEnum = -2147217341

public val WBEM_ERR_INVALID_FLAVOR: WbemErrorEnum = -2147217338

public val WBEM_ERR_INVALID_HANDLE_REQUEST: WbemErrorEnum = -2147217294

public val WBEM_ERR_INVALID_LOCALE: WbemErrorEnum = -2147217280

public val WBEM_ERR_INVALID_METHOD: WbemErrorEnum = -2147217362

public val WBEM_ERR_INVALID_METHOD_PARAMETERS: WbemErrorEnum = -2147217361

public val WBEM_ERR_INVALID_NAMESPACE: WbemErrorEnum = -2147217394

public val WBEM_ERR_INVALID_OBJECT: WbemErrorEnum = -2147217393

public val WBEM_ERR_INVALID_OBJECT_PATH: WbemErrorEnum = -2147217350

public val WBEM_ERR_INVALID_OPERATION: WbemErrorEnum = -2147217386

public val WBEM_ERR_INVALID_OPERATOR: WbemErrorEnum = -2147217309

public val WBEM_ERR_INVALID_PARAMETER: WbemErrorEnum = -2147217400

public val WBEM_ERR_INVALID_PARAMETER_ID: WbemErrorEnum = -2147217353

public val WBEM_ERR_INVALID_PROPERTY: WbemErrorEnum = -2147217359

public val WBEM_ERR_INVALID_PROPERTY_TYPE: WbemErrorEnum = -2147217366

public val WBEM_ERR_INVALID_PROVIDER_REGISTRATION: WbemErrorEnum = -2147217390

public val WBEM_ERR_INVALID_QUALIFIER: WbemErrorEnum = -2147217342

public val WBEM_ERR_INVALID_QUALIFIER_TYPE: WbemErrorEnum = -2147217367

public val WBEM_ERR_INVALID_QUERY: WbemErrorEnum = -2147217385

public val WBEM_ERR_INVALID_QUERY_TYPE: WbemErrorEnum = -2147217384

public val WBEM_ERR_INVALID_STREAM: WbemErrorEnum = -2147217397

public val WBEM_ERR_INVALID_SUPERCLASS: WbemErrorEnum = -2147217395

public val WBEM_ERR_INVALID_SYNTAX: WbemErrorEnum = -2147217375

public val WBEM_ERR_LOCAL_CREDENTIALS: WbemErrorEnum = -2147217308

public val WBEM_ERR_MARSHAL_INVALID_SIGNATURE: WbemErrorEnum = -2147217343

public val WBEM_ERR_MARSHAL_VERSION_MISMATCH: WbemErrorEnum = -2147217344

public val WBEM_ERR_METHOD_DISABLED: WbemErrorEnum = -2147217322

public val WBEM_ERR_METHOD_NAME_TOO_WIDE: WbemErrorEnum = -2147217291

public val WBEM_ERR_METHOD_NOT_IMPLEMENTED: WbemErrorEnum = -2147217323

public val WBEM_ERR_MISSING_AGGREGATION_LIST: WbemErrorEnum = -2147217317

public val WBEM_ERR_MISSING_GROUP_WITHIN: WbemErrorEnum = -2147217318

public val WBEM_ERR_MISSING_PARAMETER: WbemErrorEnum = -2147217354

public val WBEM_ERR_NO_SCHEMA: WbemErrorEnum = -2147217277

public val WBEM_ERR_NON_CONSECUTIVE_PARAMETER_IDS: WbemErrorEnum = -2147217352

public val WBEM_ERR_NONDECORATED_OBJECT: WbemErrorEnum = -2147217374

public val WBEM_ERR_NOT_AVAILABLE: WbemErrorEnum = -2147217399

public val WBEM_ERR_NOT_EVENT_CLASS: WbemErrorEnum = -2147217319

public val WBEM_ERR_NOT_FOUND: WbemErrorEnum = -2147217406

public val WBEM_ERR_NOT_SUPPORTED: WbemErrorEnum = -2147217396

public val WBEM_ERR_NULL_SECURITY_DESCRIPTOR: WbemErrorEnum = -2147217304

public val WBEM_ERR_OUT_OF_DISK_SPACE: WbemErrorEnum = -2147217349

public val WBEM_ERR_OUT_OF_MEMORY: WbemErrorEnum = -2147217402

public val WBEM_ERR_OVERRIDE_NOT_ALLOWED: WbemErrorEnum = -2147217382

public val WBEM_ERR_PARAMETER_ID_ON_RETVAL: WbemErrorEnum = -2147217351

public val WBEM_ERR_PRIVILEGE_NOT_HELD: WbemErrorEnum = -2147217310

public val WBEM_ERR_PROPAGATED_METHOD: WbemErrorEnum = -2147217356

public val WBEM_ERR_PROPAGATED_PROPERTY: WbemErrorEnum = -2147217380

public val WBEM_ERR_PROPAGATED_QUALIFIER: WbemErrorEnum = -2147217381

public val WBEM_ERR_PROPERTY_NAME_TOO_WIDE: WbemErrorEnum = -2147217293

public val WBEM_ERR_PROPERTY_NOT_AN_OBJECT: WbemErrorEnum = -2147217316

public val WBEM_ERR_PROVIDER_ALREADY_REGISTERED: WbemErrorEnum = -2147217276

public val WBEM_ERR_PROVIDER_FAILURE: WbemErrorEnum = -2147217404

public val WBEM_ERR_PROVIDER_LOAD_FAILURE: WbemErrorEnum = -2147217389

public val WBEM_ERR_PROVIDER_NOT_CAPABLE: WbemErrorEnum = -2147217372

public val WBEM_ERR_PROVIDER_NOT_FOUND: WbemErrorEnum = -2147217391

public val WBEM_ERR_PROVIDER_NOT_REGISTERED: WbemErrorEnum = -2147217275

public val WBEM_ERR_PROVIDER_SUSPENDED: WbemErrorEnum = -2147217279

public val WBEM_ERR_QUALIFIER_NAME_TOO_WIDE: WbemErrorEnum = -2147217290

public val WBEM_ERR_QUERY_NOT_IMPLEMENTED: WbemErrorEnum = -2147217369

public val WBEM_ERR_QUEUE_OVERFLOW: WbemErrorEnum = -2147217311

public val WBEM_ERR_QUOTA_VIOLATION: WbemErrorEnum = -2147217300

public val WBEM_ERR_READ_ONLY: WbemErrorEnum = -2147217373

public val WBEM_ERR_REFRESHER_BUSY: WbemErrorEnum = -2147217321

public val WBEM_ERR_REGISTRATION_TOO_BROAD: WbemErrorEnum = -2147213311

public val WBEM_ERR_REGISTRATION_TOO_PRECISE: WbemErrorEnum = -2147213310

public val WBEM_ERR_RERUN_COMMAND: WbemErrorEnum = -2147217289

public val WBEM_ERR_RESET_TO_DEFAULT: WbemErrorEnum = -2147209214

public val WBEM_ERR_SERVER_TOO_BUSY: WbemErrorEnum = -2147217339

public val WBEM_ERR_SHUTTING_DOWN: WbemErrorEnum = -2147217357

public val WBEM_ERR_SYNCHRONIZATION_REQUIRED: WbemErrorEnum = -2147217278

public val WBEM_ERR_SYSTEM_PROPERTY: WbemErrorEnum = -2147217360

public val WBEM_ERR_TIMEDOUT: WbemErrorEnum = -2147209215

public val WBEM_ERR_TIMEOUT: WbemErrorEnum = -2147217303

public val WBEM_ERR_TOO_MANY_PROPERTIES: WbemErrorEnum = -2147217327

public val WBEM_ERR_TOO_MUCH_DATA: WbemErrorEnum = -2147217340

public val WBEM_ERR_TRANSACTION_CONFLICT: WbemErrorEnum = -2147217299

public val WBEM_ERR_TRANSPORT_FAILURE: WbemErrorEnum = -2147217387

public val WBEM_ERR_TYPE_MISMATCH: WbemErrorEnum = -2147217403

public val WBEM_ERR_UNEXPECTED: WbemErrorEnum = -2147217379

public val WBEM_ERR_UNINTERPRETABLE_PROVIDER_QUERY: WbemErrorEnum = -2147217313

public val WBEM_ERR_UNKNOWN_OBJECT_TYPE: WbemErrorEnum = -2147217346

public val WBEM_ERR_UNKNOWN_PACKET_TYPE: WbemErrorEnum = -2147217345

public val WBEM_ERR_UNPARSABLE_QUERY: WbemErrorEnum = -2147217320

public val WBEM_ERR_UNSUPPORTED_CLASS_UPDATE: WbemErrorEnum = -2147217336

public val WBEM_ERR_UNSUPPORTED_LOCALE: WbemErrorEnum = -2147217297

public val WBEM_ERR_UNSUPPORTED_PARAMETER: WbemErrorEnum = -2147217355

public val WBEM_ERR_UNSUPPORTED_PUT_EXTENSION: WbemErrorEnum = -2147217347

public val WBEM_ERR_UPDATE_OVERRIDE_NOT_ALLOWED: WbemErrorEnum = -2147217325

public val WBEM_ERR_UPDATE_PROPAGATED_METHOD: WbemErrorEnum = -2147217324

public val WBEM_ERR_UPDATE_TYPE_MISMATCH: WbemErrorEnum = -2147217326

public val WBEM_ERR_VALUE_OUT_OF_RANGE: WbemErrorEnum = -2147217365

public val WBEM_ERR_VETO_DELETE: WbemErrorEnum = -2147217286

public val WBEM_ERR_VETO_PUT: WbemErrorEnum = -2147217287

public val WBEM_FLAG_BIDIRECTIONAL1: WbemFlagEnum = 0

public val WBEM_FLAG_DIRECT_READ1: WbemFlagEnum = 512

public val WBEM_FLAG_DONT_SEND_STATUS1: WbemFlagEnum = 0

public val WBEM_FLAG_ENSURE_LOCATABLE1: WbemFlagEnum = 256

public val WBEM_FLAG_FORWARD_ONLY1: WbemFlagEnum = 32

public val WBEM_FLAG_GET_DEFAULT: WbemFlagEnum = 0

public val WBEM_FLAG_NO_ERROR_OBJECT1: WbemFlagEnum = 64

public val WBEM_FLAG_RETURN_ERROR_OBJECT1: WbemFlagEnum = 0

public val WBEM_FLAG_RETURN_IMMEDIATELY1: WbemFlagEnum = 16

public val WBEM_FLAG_RETURN_WHEN_COMPLETE: WbemFlagEnum = 0

public val WBEM_FLAG_SEND_ONLY_SELECTED1: WbemFlagEnum = 0

public val WBEM_FLAG_SEND_STATUS1: WbemFlagEnum = 128

public val WBEM_FLAG_SPAWN_INSTANCE: WbemFlagEnum = 1

public val WBEM_FLAG_USE_AMENDED_QUALIFIERS1: WbemFlagEnum = 131072

public val WBEM_FLAG_USE_CURRENT_TIME: WbemFlagEnum = 1

public val WBEM_IMPERSONATION_LEVEL_ANONYMOUS: WbemImpersonationLevelEnum = 1

public val WBEM_IMPERSONATION_LEVEL_DELEGATE: WbemImpersonationLevelEnum = 4

public val WBEM_IMPERSONATION_LEVEL_IDENTIFY: WbemImpersonationLevelEnum = 2

public val WBEM_IMPERSONATION_LEVEL_IMPERSONATE: WbemImpersonationLevelEnum = 3

public val WBEM_NO_ERR: WbemErrorEnum = 0

public val WBEM_OBJECT_TEXT_FORMAT_CIMDTD20: WbemObjectTextFormatEnum = 1

public val WBEM_OBJECT_TEXT_FORMAT_WMIDTD20: WbemObjectTextFormatEnum = 2

public val WBEM_PRIVILEGE_AUDIT: WbemPrivilegeEnum = 20

public val WBEM_PRIVILEGE_BACKUP: WbemPrivilegeEnum = 16

public val WBEM_PRIVILEGE_CHANGE_NOTIFY: WbemPrivilegeEnum = 22

public val WBEM_PRIVILEGE_CREATE_PAGEFILE: WbemPrivilegeEnum = 14

public val WBEM_PRIVILEGE_CREATE_PERMANENT: WbemPrivilegeEnum = 15

public val WBEM_PRIVILEGE_CREATE_TOKEN: WbemPrivilegeEnum = 1

public val WBEM_PRIVILEGE_DEBUG: WbemPrivilegeEnum = 19

public val WBEM_PRIVILEGE_ENABLE_DELEGATION: WbemPrivilegeEnum = 26

public val WBEM_PRIVILEGE_INCREASE_BASE_PRIORITY: WbemPrivilegeEnum = 13

public val WBEM_PRIVILEGE_INCREASE_QUOTA: WbemPrivilegeEnum = 4

public val WBEM_PRIVILEGE_LOAD_DRIVER: WbemPrivilegeEnum = 9

public val WBEM_PRIVILEGE_LOCK_MEMORY: WbemPrivilegeEnum = 3

public val WBEM_PRIVILEGE_MACHINE_ACCOUNT: WbemPrivilegeEnum = 5

public val WBEM_PRIVILEGE_MANAGE_VOLUME: WbemPrivilegeEnum = 27

public val WBEM_PRIVILEGE_PRIMARY_TOKEN: WbemPrivilegeEnum = 2

public val WBEM_PRIVILEGE_PROFILE_SINGLE_PROCESS: WbemPrivilegeEnum = 12

public val WBEM_PRIVILEGE_REMOTE_SHUTDOWN: WbemPrivilegeEnum = 23

public val WBEM_PRIVILEGE_RESTORE: WbemPrivilegeEnum = 17

public val WBEM_PRIVILEGE_SECURITY: WbemPrivilegeEnum = 7

public val WBEM_PRIVILEGE_SHUTDOWN: WbemPrivilegeEnum = 18

public val WBEM_PRIVILEGE_SYNC_AGENT: WbemPrivilegeEnum = 25

public val WBEM_PRIVILEGE_SYSTEM_ENVIRONMENT: WbemPrivilegeEnum = 21

public val WBEM_PRIVILEGE_SYSTEM_PROFILE: WbemPrivilegeEnum = 10

public val WBEM_PRIVILEGE_SYSTEMTIME: WbemPrivilegeEnum = 11

public val WBEM_PRIVILEGE_TAKE_OWNERSHIP: WbemPrivilegeEnum = 8

public val WBEM_PRIVILEGE_TCB: WbemPrivilegeEnum = 6

public val WBEM_PRIVILEGE_UNDOCK: WbemPrivilegeEnum = 24

public val WBEM_QUERY_FLAG_DEEP: WbemQueryFlagEnum = 0

public val WBEM_QUERY_FLAG_PROTOTYPE: WbemQueryFlagEnum = 2

public val WBEM_QUERY_FLAG_SHALLOW: WbemQueryFlagEnum = 1

public val WBEM_TEXT_FLAG_NO_FLAVORS: WbemTextFlagEnum = 1

public val WBEM_TIMEOUT_INFINITE: WbemTimeout = -1

public val MOF_COMPILER: Guid = Guid.fromU128(U128(0x6daf97572e3711d2uL, 0xaec900c04fb68820uL))

public val S_WBEM_DATE_TIME: Guid = Guid.fromU128(U128(0x47dfbe54cf7611d3uL, 0xb38f00105a1f473auL))

public val S_WBEM_EVENT_SOURCE: Guid = Guid.fromU128(U128(0x4b83d5821ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_LAST_ERROR: Guid = Guid.fromU128(U128(0xc2feeeaccfcd11d1uL, 0x8b0500600806d9b6uL))

public val S_WBEM_LOCATOR: Guid = Guid.fromU128(U128(0x76a64158cb4111d1uL, 0x8b0200600806d9b6uL))

public val S_WBEM_METHOD: Guid = Guid.fromU128(U128(0x4b83d5b21ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_METHOD_SET: Guid = Guid.fromU128(U128(0x4b83d5a21ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_NAMED_VALUE: Guid = Guid.fromU128(U128(0x4b83d6021ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_NAMED_VALUE_SET: Guid = Guid.fromU128(U128(0x9aed384ece8b11d1uL, 0x8b0500600806d9b6uL))

public val S_WBEM_OBJECT: Guid = Guid.fromU128(U128(0x4b83d6221ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_OBJECT_EX: Guid = Guid.fromU128(U128(0xd6bdafb29435491fuL, 0xbb876aa0f0bc31a2uL))

public val S_WBEM_OBJECT_PATH: Guid = Guid.fromU128(U128(0x5791bc26ce9c11d1uL, 0x97bf0000f81e849cuL))

public val S_WBEM_OBJECT_SET: Guid = Guid.fromU128(U128(0x4b83d6121ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_PRIVILEGE: Guid = Guid.fromU128(U128(0x26ee67bc580411d2uL, 0x8b4a00600806d9b6uL))

public val S_WBEM_PRIVILEGE_SET: Guid = Guid.fromU128(U128(0x26ee67be580411d2uL, 0x8b4a00600806d9b6uL))

public val S_WBEM_PROPERTY: Guid = Guid.fromU128(U128(0x4b83d5d21ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_PROPERTY_SET: Guid = Guid.fromU128(U128(0x4b83d5c21ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_QUALIFIER: Guid = Guid.fromU128(U128(0x4b83d5f21ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_QUALIFIER_SET: Guid = Guid.fromU128(U128(0x4b83d5e21ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_REFRESHABLE_ITEM: Guid = Guid.fromU128(U128(0x8c6854bcde4b11d3uL, 0xb39000105a1f473auL))

public val S_WBEM_REFRESHER: Guid = Guid.fromU128(U128(0xd269bf5cd9c111d3uL, 0xb38f00105a1f473auL))

public val S_WBEM_SECURITY: Guid = Guid.fromU128(U128(0xb54d66e9228711d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_SERVICES: Guid = Guid.fromU128(U128(0x4b83d6321ae11d2uL, 0x8b3300600806d9b6uL))

public val S_WBEM_SERVICES_EX: Guid = Guid.fromU128(U128(0x62e522dc8cf340a8uL, 0x8b2e37d595651e40uL))

public val S_WBEM_SINK: Guid = Guid.fromU128(U128(0x75718c9af02911d1uL, 0xa1ac00c04fb6c223uL))

public val UNSECURED_APARTMENT: Guid = Guid.fromU128(U128(0x49bd2028152311d1uL, 0xad7900c04fd8fdffuL))

public val WMI_EXTENSION: Guid = Guid.fromU128(U128(0xf0975afe5c7f11d2uL, 0x8b7400104b2afb41uL))

public val WBEM_ADMINISTRATIVE_LOCATOR: Guid = Guid.fromU128(U128(0xcb8555cc912811d1uL, 0xad9b00c04fd8fdffuL))

public val WBEM_AUTHENTICATED_LOCATOR: Guid = Guid.fromU128(U128(0xcd184336912811d1uL, 0xad9b00c04fd8fdffuL))

public val WBEM_BACKUP_RESTORE: Guid = Guid.fromU128(U128(0xc49e32c6bc8b11d2uL, 0x85d400105a1f8304uL))

public val WBEM_CLASS_OBJECT: Guid = Guid.fromU128(U128(0x9a653086174f11d2uL, 0xb5f900104b703efduL))

public val WBEM_CONTEXT: Guid = Guid.fromU128(U128(0x674b6698ee9211d0uL, 0xad7100c04fd8fdffuL))

public val WBEM_DCOM_TRANSPORT: Guid = Guid.fromU128(U128(0xf7ce2e138c9011d1uL, 0x9e7b00c04fc324a8uL))

public val WBEM_DECOUPLED_BASIC_EVENT_PROVIDER: Guid = Guid.fromU128(U128(0xf5f7573728434f22uL, 0x933dc76a97cda62fuL))

public val WBEM_DECOUPLED_REGISTRAR: Guid = Guid.fromU128(U128(0x4cfc79320f9d4befuL, 0x9c328ea2a6b56fcbuL))

public val WBEM_DEF_PATH: Guid = Guid.fromU128(U128(0xcf4cc405e2c54ddduL, 0xb3ce5e7582d8c9fauL))

public val WBEM_LEVEL1LOGIN: Guid = Guid.fromU128(U128(0x8bc3f05ed86b11d0uL, 0xa07500c04fb68820uL))

public val WBEM_LOCAL_ADDR_RES: Guid = Guid.fromU128(U128(0xa10448018f7e11d1uL, 0x9e7c00c04fc324a8uL))

public val WBEM_LOCATOR: Guid = Guid.fromU128(U128(0x4590f8111d3a11d0uL, 0x891f00aa004b2e24uL))

public val WBEM_OBJECT_TEXT_SRC: Guid = Guid.fromU128(U128(0x8d1c559d84f04bb3uL, 0xa7d556a7435a9ba6uL))

public val WBEM_QUERY: Guid = Guid.fromU128(U128(0xeac8a02421e24523uL, 0xad73a71a0aa2f56auL))

public val WBEM_REFRESHER: Guid = Guid.fromU128(U128(0xc71566f2561e11d1uL, 0xad8700c04fd8fdffuL))

public val WBEM_STATUS_CODE_TEXT: Guid = Guid.fromU128(U128(0xeb87e1bd323311d2uL, 0xaec900c04fb68820uL))

public val WBEM_UNAUTHENTICATED_LOCATOR: Guid = Guid.fromU128(U128(0x443e7b79de3111d2uL, 0xb34000104bcc4b4auL))

public val WBEM_UNINITIALIZED_CLASS_OBJECT: Guid = Guid.fromU128(U128(0x7a0227f6710811d1uL, 0xad9000c04fd8fdffuL))
