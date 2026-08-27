// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.HRESULT

// Additional constants from upstream Windows/Win32/Foundation/mod.rs
// that are not in the focused per-symbol files.

public const val APP_LOCAL_DEVICE_ID_SIZE: UInt = 32u
public const val MAX_PATH: UInt = 260u
public const val NOERROR: UInt = 0u
public const val NO_ERROR: WIN32_ERROR = 0u
public const val NTDDI_MAXVER: UInt = 2560u

// OBJECT_ATTRIBUTE_FLAGS constants
public const val OBJ_CASE_INSENSITIVE: OBJECT_ATTRIBUTE_FLAGS = 64u
public const val OBJ_DONT_REPARSE: OBJECT_ATTRIBUTE_FLAGS = 4096u
public const val OBJ_EXCLUSIVE: OBJECT_ATTRIBUTE_FLAGS = 32u
public const val OBJ_FORCE_ACCESS_CHECK: OBJECT_ATTRIBUTE_FLAGS = 1024u
public const val OBJ_IGNORE_IMPERSONATED_DEVICEMAP: OBJECT_ATTRIBUTE_FLAGS = 2048u
public const val OBJ_INHERIT: OBJECT_ATTRIBUTE_FLAGS = 2u
public const val OBJ_KERNEL_HANDLE: OBJECT_ATTRIBUTE_FLAGS = 512u
public const val OBJ_OPENIF: OBJECT_ATTRIBUTE_FLAGS = 128u
public const val OBJ_OPENLINK: OBJECT_ATTRIBUTE_FLAGS = 256u
public const val OBJ_PERMANENT: OBJECT_ATTRIBUTE_FLAGS = 16u
public const val OBJ_VALID_ATTRIBUTES: OBJECT_ATTRIBUTE_FLAGS = 8178u

// VARIANT_BOOL constants
public const val VARIANT_FALSE: VARIANT_BOOL = 0
public const val VARIANT_TRUE: VARIANT_BOOL = -1

// HRESULT common constants
public const val S_OK: HRESULT = 0
public const val S_FALSE: HRESULT = 1

// WAIT_EVENT additional constant
public const val WAIT_IO_COMPLETION: WAIT_EVENT = 192u

// HANDLE_FLAGS constants (already in Handle.kt but duplicated here for
// completeness per upstream declaration order at line 5121-5122)
// These are already defined in Handle.kt — no redeclaration needed.

// ROUTEBASE constants
public const val ROUTEBASE: UInt = 900u
public const val ROUTEBASEEND: UInt = 957u

// FRS error constants (selected commonly used ones)
public const val FRS_ERR_AUTHENTICATION: Int = 8008
public const val FRS_ERR_CHILD_TO_PARENT_COMM: Int = 8011
public const val FRS_ERR_INSUFFICIENT_PRIV: Int = 8007
public const val FRS_ERR_INTERNAL: Int = 8005
public const val FRS_ERR_INTERNAL_API: Int = 8004
public const val FRS_ERR_INVALID_API_SEQUENCE: Int = 8001
public const val FRS_ERR_INVALID_SERVICE_PARAMETER: Int = 8017
public const val FRS_ERR_PARENT_AUTHENTICATION: Int = 8010
public const val FRS_ERR_PARENT_INSUFFICIENT_PRIV: Int = 8009
public const val FRS_ERR_PARENT_TO_CHILD_COMM: Int = 8012
public const val FRS_ERR_SERVICE_COMM: Int = 8006
public const val FRS_ERR_STARTING_SERVICE: Int = 8002
public const val FRS_ERR_STOPPING_SERVICE: Int = 8003
public const val FRS_ERR_SYSVOL_DEMOTE: Int = 8016
public const val FRS_ERR_SYSVOL_IS_BUSY: Int = 8015
public const val FRS_ERR_SYSVOL_POPULATE: Int = 8013
