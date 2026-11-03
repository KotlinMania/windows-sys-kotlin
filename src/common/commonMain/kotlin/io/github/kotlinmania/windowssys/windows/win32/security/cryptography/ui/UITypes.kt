package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

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
    public operator fun invoke(pcertcontext: Long, param1: Foundation.LPARAM, param2: UInt, param3: UInt): BOOL
}

public typealias PFNCMFILTERPROC = PFNCMFILTERPROCFn?

public fun interface PFNCMHOOKPROCFn {
    public operator fun invoke(hwnddialog: Foundation.HWND, message: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): UInt
}

public typealias PFNCMHOOKPROC = PFNCMHOOKPROCFn?

public fun interface PFNTRUSTHELPERFn {
    public operator fun invoke(pcertcontext: Long, lcustdata: Foundation.LPARAM, fleafcertificate: BOOL, pbtrustblob: Long): HRESULT
}

public typealias PFNTRUSTHELPER = PFNTRUSTHELPERFn?
