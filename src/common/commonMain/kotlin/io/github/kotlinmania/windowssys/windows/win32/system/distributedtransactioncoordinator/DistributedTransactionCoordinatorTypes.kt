package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias APPLICATIONTYPE = Int

public typealias AUTHENTICATION_LEVEL = Int

public typealias DTCINITIATEDRECOVERYWORK = Int

public typealias DTCLUCOMPARESTATE = Int

public typealias DTCLUCOMPARESTATESCONFIRMATION = Int

public typealias DTCLUCOMPARESTATESERROR = Int

public typealias DTCLUCOMPARESTATESRESPONSE = Int

public typealias DTCLUXLN = Int

public typealias DTCLUXLNCONFIRMATION = Int

public typealias DTCLUXLNERROR = Int

public typealias DTCLUXLNRESPONSE = Int

public fun interface DTC_GET_TRANSACTION_MANAGERFn {
    public operator fun invoke(pszhost: PCSTR, psztmname: PCSTR, rid: Long, dwreserved1: UInt, wcbreserved2: UShort, pvreserved2: Long, ppvobject: Long): HRESULT
}

public typealias DTC_GET_TRANSACTION_MANAGER = DTC_GET_TRANSACTION_MANAGERFn?

public fun interface DTC_GET_TRANSACTION_MANAGER_EX_AFn {
    public operator fun invoke(i_pszhost: PCSTR, i_psztmname: PCSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT
}

public typealias DTC_GET_TRANSACTION_MANAGER_EX_A = DTC_GET_TRANSACTION_MANAGER_EX_AFn?

public fun interface DTC_GET_TRANSACTION_MANAGER_EX_WFn {
    public operator fun invoke(i_pwszhost: PCWSTR, i_pwsztmname: PCWSTR, i_riid: Long, i_grfoptions: UInt, i_pvconfigparams: Long, o_ppvobject: Long): HRESULT
}

public typealias DTC_GET_TRANSACTION_MANAGER_EX_W = DTC_GET_TRANSACTION_MANAGER_EX_WFn?

public fun interface DTC_INSTALL_CLIENTFn {
    public operator fun invoke(i_pszremotetmhostname: Long, i_dwprotocol: UInt, i_dwoverwrite: UInt): HRESULT
}

public typealias DTC_INSTALL_CLIENT = DTC_INSTALL_CLIENTFn?

public typealias DTC_STATUS_ = Int

public typealias ISOFLAG = Int

public typealias ISOLATIONLEVEL = Int

public typealias TX_MISC_CONSTANTS = Int

public typealias XACTCONST = Int

public typealias XACTHEURISTIC = Int

public typealias XACTRM = Int

public typealias XACTSTAT = Int

public typealias XACTTC = Int

public typealias XACT_DTC_CONSTANTS = Int

public fun interface XA_CLOSE_EPTFn {
    public operator fun invoke(param0: PCSTR, param1: Int, param2: Int): Int
}

public typealias XA_CLOSE_EPT = XA_CLOSE_EPTFn?

public fun interface XA_COMMIT_EPTFn {
    public operator fun invoke(param0: Long, param1: Int, param2: Int): Int
}

public typealias XA_COMMIT_EPT = XA_COMMIT_EPTFn?

public fun interface XA_COMPLETE_EPTFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Int, param3: Int): Int
}

public typealias XA_COMPLETE_EPT = XA_COMPLETE_EPTFn?

public fun interface XA_END_EPTFn {
    public operator fun invoke(param0: Long, param1: Int, param2: Int): Int
}

public typealias XA_END_EPT = XA_END_EPTFn?

public fun interface XA_FORGET_EPTFn {
    public operator fun invoke(param0: Long, param1: Int, param2: Int): Int
}

public typealias XA_FORGET_EPT = XA_FORGET_EPTFn?

public fun interface XA_OPEN_EPTFn {
    public operator fun invoke(param0: PCSTR, param1: Int, param2: Int): Int
}

public typealias XA_OPEN_EPT = XA_OPEN_EPTFn?

public fun interface XA_PREPARE_EPTFn {
    public operator fun invoke(param0: Long, param1: Int, param2: Int): Int
}

public typealias XA_PREPARE_EPT = XA_PREPARE_EPTFn?

public fun interface XA_RECOVER_EPTFn {
    public operator fun invoke(param0: Long, param1: Int, param2: Int, param3: Int): Int
}

public typealias XA_RECOVER_EPT = XA_RECOVER_EPTFn?

public fun interface XA_ROLLBACK_EPTFn {
    public operator fun invoke(param0: Long, param1: Int, param2: Int): Int
}

public typealias XA_ROLLBACK_EPT = XA_ROLLBACK_EPTFn?

public fun interface XA_START_EPTFn {
    public operator fun invoke(param0: Long, param1: Int, param2: Int): Int
}

public typealias XA_START_EPT = XA_START_EPTFn?
