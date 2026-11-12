package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

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
    public operator fun invoke(pcertcontext: ConstPtr, pfinitialselectedcert: MutPtr, pvcallbackdata: MutPtr): Bool
}

public typealias Pfncfilterproc = PfncfilterprocFn?

public fun interface PfncmfilterprocFn {
    public operator fun invoke(pcertcontext: ConstPtr, param1: Lparam, param2: UInt, param3: UInt): Bool
}

public typealias Pfncmfilterproc = PfncmfilterprocFn?

public fun interface PfncmhookprocFn {
    public operator fun invoke(hwnddialog: Hwnd, message: UInt, wparam: Wparam, lparam: Lparam): UInt
}

public typealias Pfncmhookproc = PfncmhookprocFn?

public fun interface PfntrusthelperFn {
    public operator fun invoke(pcertcontext: ConstPtr, lcustdata: Lparam, fleafcertificate: Bool, pbtrustblob: MutPtr): Hresult
}

public typealias Pfntrusthelper = PfntrusthelperFn?
