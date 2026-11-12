package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

public typealias CertSelectStructFlags = UInt

public typealias CertViewpropertiesStructFlags = UInt

public typealias CryptuiViewcertificateFlags = UInt

public typealias CryptuiWizDigitalAdditionalCertChoice = UInt

public typealias CryptuiWizDigitalSign = UInt

public typealias CryptuiWizDigitalSignPvkOption = UInt

public typealias CryptuiWizDigitalSignSigType = UInt

public typealias CryptuiWizDigitalSignSubject = UInt

public typealias CryptuiWizExportFormat = UInt

public typealias CryptuiWizExportSubject = UInt

public typealias CryptuiWizFlags = UInt

public typealias CryptuiWizImportSubjectOption = UInt

public typealias CtlModifyRequestOperation = UInt

public fun interface PfncfilterprocFn {
    public operator fun invoke(pcertcontext: ConstPtr<CertContext>, pfinitialselectedcert: MutPtr<Bool>, pvcallbackdata: MutPtr<CVoid>): Bool
}

public typealias Pfncfilterproc = PfncfilterprocFn?

public fun interface PfncmfilterprocFn {
    public operator fun invoke(pcertcontext: ConstPtr<CertContext>, param1: Lparam, param2: UInt, param3: UInt): Bool
}

public typealias Pfncmfilterproc = PfncmfilterprocFn?

public fun interface PfncmhookprocFn {
    public operator fun invoke(hwnddialog: Hwnd, message: UInt, wparam: Wparam, lparam: Lparam): UInt
}

public typealias Pfncmhookproc = PfncmhookprocFn?

public fun interface PfntrusthelperFn {
    public operator fun invoke(pcertcontext: ConstPtr<CertContext>, lcustdata: Lparam, fleafcertificate: Bool, pbtrustblob: MutPtr<UByte>): Hresult
}

public typealias Pfntrusthelper = PfntrusthelperFn?
