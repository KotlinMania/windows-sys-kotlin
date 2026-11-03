// port-lint: source Windows/Win32/System/Pipes/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.pipes

public const val NMPWAIT_USE_DEFAULT_WAIT: UInt = 0u
public const val NMPWAIT_NOWAIT: UInt = 1u
public const val NMPWAIT_WAIT_FOREVER: UInt = 4294967295u

public const val PIPE_WAIT: NAMED_PIPE_MODE = 0u
public const val PIPE_NOWAIT: NAMED_PIPE_MODE = 1u
public const val PIPE_READMODE_BYTE: NAMED_PIPE_MODE = 0u
public const val PIPE_READMODE_MESSAGE: NAMED_PIPE_MODE = 2u
public const val PIPE_CLIENT_END: NAMED_PIPE_MODE = 0u
public const val PIPE_SERVER_END: NAMED_PIPE_MODE = 1u
public const val PIPE_TYPE_BYTE: NAMED_PIPE_MODE = 0u
public const val PIPE_TYPE_MESSAGE: NAMED_PIPE_MODE = 4u
public const val PIPE_ACCEPT_REMOTE_CLIENTS: NAMED_PIPE_MODE = 0u
public const val PIPE_REJECT_REMOTE_CLIENTS: NAMED_PIPE_MODE = 8u
public const val PIPE_UNLIMITED_INSTANCES: UInt = 255u
