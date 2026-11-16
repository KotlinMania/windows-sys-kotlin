package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias Applicationtype = Int

public typealias AuthenticationLevel = Int

public typealias Dtcinitiatedrecoverywork = Int

public typealias Dtclucomparestate = Int

public typealias Dtclucomparestatesconfirmation = Int

public typealias Dtclucomparestateserror = Int

public typealias Dtclucomparestatesresponse = Int

public typealias Dtcluxln = Int

public typealias Dtcluxlnconfirmation = Int

public typealias Dtcluxlnerror = Int

public typealias Dtcluxlnresponse = Int

public fun interface DtcGetTransactionManagerFn {
    public operator fun invoke(pszhost: Pcstr, psztmname: Pcstr, rid: ConstPtr, dwreserved1: UInt, wcbreserved2: UShort, pvreserved2: MutPtr, ppvobject: MutPtr): Hresult
}

public typealias DtcGetTransactionManager = DtcGetTransactionManagerFn?

public fun interface DtcGetTransactionManagerExAFn {
    public operator fun invoke(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult
}

public typealias DtcGetTransactionManagerExA = DtcGetTransactionManagerExAFn?

public fun interface DtcGetTransactionManagerExWFn {
    public operator fun invoke(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult
}

public typealias DtcGetTransactionManagerExW = DtcGetTransactionManagerExWFn?

public fun interface DtcInstallClientFn {
    public operator fun invoke(iPszremotetmhostname: MutPtr, iDwprotocol: UInt, iDwoverwrite: UInt): Hresult
}

public typealias DtcInstallClient = DtcInstallClientFn?

public typealias DtcStatus = Int

public typealias Isoflag = Int

public typealias Isolationlevel = Int

public typealias TxMiscConstants = Int

public typealias Xactconst = Int

public typealias Xactheuristic = Int

public typealias Xactrm = Int

public typealias Xactstat = Int

public typealias Xacttc = Int

public typealias XactDtcConstants = Int

public fun interface XaCloseEptFn {
    public operator fun invoke(param0: Pcstr, param1: Int, param2: Int): Int
}

public typealias XaCloseEpt = XaCloseEptFn?

public fun interface XaCommitEptFn {
    public operator fun invoke(param0: MutPtr, param1: Int, param2: Int): Int
}

public typealias XaCommitEpt = XaCommitEptFn?

public fun interface XaCompleteEptFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: Int, param3: Int): Int
}

public typealias XaCompleteEpt = XaCompleteEptFn?

public fun interface XaEndEptFn {
    public operator fun invoke(param0: MutPtr, param1: Int, param2: Int): Int
}

public typealias XaEndEpt = XaEndEptFn?

public fun interface XaForgetEptFn {
    public operator fun invoke(param0: MutPtr, param1: Int, param2: Int): Int
}

public typealias XaForgetEpt = XaForgetEptFn?

public fun interface XaOpenEptFn {
    public operator fun invoke(param0: Pcstr, param1: Int, param2: Int): Int
}

public typealias XaOpenEpt = XaOpenEptFn?

public fun interface XaPrepareEptFn {
    public operator fun invoke(param0: MutPtr, param1: Int, param2: Int): Int
}

public typealias XaPrepareEpt = XaPrepareEptFn?

public fun interface XaRecoverEptFn {
    public operator fun invoke(param0: MutPtr, param1: Int, param2: Int, param3: Int): Int
}

public typealias XaRecoverEpt = XaRecoverEptFn?

public fun interface XaRollbackEptFn {
    public operator fun invoke(param0: MutPtr, param1: Int, param2: Int): Int
}

public typealias XaRollbackEpt = XaRollbackEptFn?

public fun interface XaStartEptFn {
    public operator fun invoke(param0: MutPtr, param1: Int, param2: Int): Int
}

public typealias XaStartEpt = XaStartEptFn?
