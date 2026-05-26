// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream line 10086 in Windows/Win32/Foundation/mod.rs:
//
//   pub type WIN32_ERROR = u32;
//
// Return type of `GetLastError` and the static type of every
// `APPMODEL_ERROR_*` / `ERROR_*` constant in upstream Foundation.

public typealias WIN32_ERROR = UInt

// Codex-demand `WIN32_ERROR` constants from RUST_CALLERS.md, in upstream
// line order. Upstream Foundation/mod.rs has thousands more — added
// here as downstream callers need them.

// Upstream line 1036:
//   pub const ERROR_ALREADY_EXISTS: WIN32_ERROR = 183u32;
public const val ERROR_ALREADY_EXISTS: WIN32_ERROR = 183u

// Upstream line 2220:
//   pub const ERROR_FILE_NOT_FOUND: WIN32_ERROR = 2u32;
public const val ERROR_FILE_NOT_FOUND: WIN32_ERROR = 2u

// Upstream line 2678:
//   pub const ERROR_INSUFFICIENT_BUFFER: WIN32_ERROR = 122u32;
public const val ERROR_INSUFFICIENT_BUFFER: WIN32_ERROR = 122u

// Upstream line 2870:
//   pub const ERROR_IO_PENDING: WIN32_ERROR = 997u32;
public const val ERROR_IO_PENDING: WIN32_ERROR = 997u

// Upstream line 3342:
//   pub const ERROR_NOT_FOUND: WIN32_ERROR = 1168u32;
public const val ERROR_NOT_FOUND: WIN32_ERROR = 1168u

// Upstream line 3957:
//   pub const ERROR_SUCCESS: WIN32_ERROR = 0u32;
public const val ERROR_SUCCESS: WIN32_ERROR = 0u
