@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr

public actual fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: COpaquePointer?, lmnewowfpassword: COpaquePointer?, ntoldowfpassword: COpaquePointer?, ntnewowfpassword: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: COpaquePointer?, oldntowfpasswordencryptedwithnewnt: COpaquePointer?, lmpresent: Boolean, newpasswordencryptedwitholdlm: COpaquePointer?, oldlmowfpasswordencryptedwithnewlmornt: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
