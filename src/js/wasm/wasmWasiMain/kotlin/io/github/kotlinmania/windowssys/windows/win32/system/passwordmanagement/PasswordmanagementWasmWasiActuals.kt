@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Pcwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: ConstPtr<LmOwfPassword>, lmnewowfpassword: ConstPtr<LmOwfPassword>, ntoldowfpassword: ConstPtr<LmOwfPassword>, ntnewowfpassword: ConstPtr<LmOwfPassword>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword")

public actual fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: ConstPtr<SamprEncryptedUserPassword>, oldntowfpasswordencryptedwithnewnt: ConstPtr<EncryptedLmOwfPassword>, lmpresent: Boolean, newpasswordencryptedwitholdlm: ConstPtr<SamprEncryptedUserPassword>, oldlmowfpasswordencryptedwithnewlmornt: ConstPtr<EncryptedLmOwfPassword>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword2")
