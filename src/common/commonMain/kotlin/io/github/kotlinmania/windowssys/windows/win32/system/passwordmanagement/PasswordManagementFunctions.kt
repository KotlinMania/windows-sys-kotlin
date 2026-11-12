package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: ConstPtr<LmOwfPassword>, lmnewowfpassword: ConstPtr<LmOwfPassword>, ntoldowfpassword: ConstPtr<LmOwfPassword>, ntnewowfpassword: ConstPtr<LmOwfPassword>): UInt

public expect fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: ConstPtr<SamprEncryptedUserPassword>, oldntowfpasswordencryptedwithnewnt: ConstPtr<EncryptedLmOwfPassword>, lmpresent: Boolean, newpasswordencryptedwitholdlm: ConstPtr<SamprEncryptedUserPassword>, oldlmowfpasswordencryptedwithnewlmornt: ConstPtr<EncryptedLmOwfPassword>): UInt
