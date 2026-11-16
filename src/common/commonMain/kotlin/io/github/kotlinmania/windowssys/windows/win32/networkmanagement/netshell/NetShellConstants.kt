package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val CMD_FLAG_HIDDEN: NsCmdFlags = 32

public val CMD_FLAG_INTERACTIVE: NsCmdFlags = 2

public val CMD_FLAG_LIMIT_MASK: NsCmdFlags = 65535

public val CMD_FLAG_LOCAL: NsCmdFlags = 8

public val CMD_FLAG_ONLINE: NsCmdFlags = 16

public val CMD_FLAG_PRIORITY: NsCmdFlags = -2147483648.toInt()

public val CMD_FLAG_PRIVATE: NsCmdFlags = 1

public val DEFAULT_CONTEXT_PRIORITY: UInt = 100u

public val ERROR_CMD_NOT_FOUND: UInt = 15004u

public val ERROR_CONTEXT_ALREADY_REGISTERED: UInt = 15019u

public val ERROR_CONTINUE_IN_PARENT_CONTEXT: UInt = 15016u

public val ERROR_DLL_LOAD_FAILED: UInt = 15006u

public val ERROR_ENTRY_PT_NOT_FOUND: UInt = 15005u

public val ERROR_HELPER_ALREADY_REGISTERED: UInt = 15018u

public val ERROR_INIT_DISPLAY: UInt = 15007u

public val ERROR_INVALID_OPTION_TAG: UInt = 15009u

public val ERROR_INVALID_OPTION_VALUE: UInt = 15014u

public val ERROR_INVALID_SYNTAX: UInt = 15001u

public val ERROR_MISSING_OPTION: UInt = 15011u

public val ERROR_NO_CHANGE: UInt = 15003u

public val ERROR_NO_ENTRIES: UInt = 15000u

public val ERROR_NO_TAG: UInt = 15010u

public val ERROR_OKAY: UInt = 15015u

public val ERROR_PARSING_FAILURE: UInt = 15020u

public val ERROR_PROTOCOL_NOT_IN_TRANSPORT: UInt = 15002u

public val ERROR_SHOW_USAGE: UInt = 15013u

public val ERROR_SUPPRESS_OUTPUT: UInt = 15017u

public val ERROR_TAG_ALREADY_PRESENT: UInt = 15008u

public val ERROR_TRANSPORT_NOT_PRESENT: UInt = 15012u

public val GET_RESOURCE_STRING_FN_NAME: Pcstr = s("GetResourceString")

public val MAX_NAME_LEN: UInt = 48u

public val NETSH_ARG_DELIMITER: Pcwstr = w("=")

public val NETSH_CMD_DELIMITER: Pcwstr = w(" ")

public val NETSH_COMMIT: NsModeChange = 0

public val NETSH_COMMIT_STATE: NsModeChange = 3

public val NETSH_ERROR_BASE: UInt = 15000u

public val NETSH_ERROR_END: UInt = 15019u

public val NETSH_FLUSH: NsModeChange = 2

public val NETSH_MAX_CMD_TOKEN_LENGTH: UInt = 128u

public val NETSH_MAX_TOKEN_LENGTH: UInt = 64u

public val NETSH_SAVE: NsModeChange = 4

public val NETSH_UNCOMMIT: NsModeChange = 1

public val NETSH_VERSION_50: UInt = 20480u

public val NS_EVENT_FROM_N: NsEvents = 4

public val NS_EVENT_FROM_START: NsEvents = 8

public val NS_EVENT_LAST_N: NsEvents = 1

public val NS_EVENT_LAST_SECS: NsEvents = 2

public val NS_EVENT_LOOP: NsEvents = 65536

public val NS_GET_EVENT_IDS_FN_NAME: Pcstr = s("GetEventIds")

public val NS_REQ_ALLOW_MULTIPLE: NsReqs = 2

public val NS_REQ_ONE_OR_MORE: NsReqs = 3

public val NS_REQ_PRESENT: NsReqs = 1

public val NS_REQ_ZERO: NsReqs = 0
