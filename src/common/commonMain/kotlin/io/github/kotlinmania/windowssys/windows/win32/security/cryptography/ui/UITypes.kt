package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public typealias CERT_SELECT_STRUCT_FLAGS = UInt

public typealias CERT_VIEWPROPERTIES_STRUCT_FLAGS = UInt

public typealias CRYPTUI_VIEWCERTIFICATE_FLAGS = UInt

public typealias CRYPTUI_WIZ_DIGITAL_ADDITIONAL_CERT_CHOICE = UInt

public typealias CRYPTUI_WIZ_DIGITAL_SIGN = UInt

public typealias CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION = UInt

public typealias CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE = UInt

public typealias CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT = UInt

public typealias CRYPTUI_WIZ_EXPORT_FORMAT = UInt

public typealias CRYPTUI_WIZ_EXPORT_SUBJECT = UInt

public typealias CRYPTUI_WIZ_FLAGS = UInt

public typealias CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION = UInt

public typealias CTL_MODIFY_REQUEST_OPERATION = UInt

public fun interface PFNCFILTERPROCFn {
    public operator fun invoke(pcertcontext: Long, pfinitialselectedcert: Long, pvcallbackdata: Long): BOOL
}

public typealias PFNCFILTERPROC = PFNCFILTERPROCFn?

public fun interface PFNCMFILTERPROCFn {
    public operator fun invoke(pcertcontext: Long, param1: LPARAM, param2: UInt, param3: UInt): BOOL
}

public typealias PFNCMFILTERPROC = PFNCMFILTERPROCFn?

public fun interface PFNCMHOOKPROCFn {
    public operator fun invoke(hwnddialog: HWND, message: UInt, wparam: WPARAM, lparam: LPARAM): UInt
}

public typealias PFNCMHOOKPROC = PFNCMHOOKPROCFn?

public fun interface PFNTRUSTHELPERFn {
    public operator fun invoke(pcertcontext: Long, lcustdata: LPARAM, fleafcertificate: BOOL, pbtrustblob: Long): HRESULT
}

public typealias PFNTRUSTHELPER = PFNTRUSTHELPERFn?
