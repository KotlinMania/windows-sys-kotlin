package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR

public typealias FCIERROR = Int

public typealias FDICREATE_CPU_TYPE = Int

public typealias FDIDECRYPTTYPE = Int

public typealias FDIERROR = Int

public typealias FDINOTIFICATIONTYPE = Int

public fun interface PFNALLOCFn {
    public operator fun invoke(cb: UInt): Long
}

public typealias PFNALLOC = PFNALLOCFn?

public fun interface PFNCLOSEFn {
    public operator fun invoke(hf: Long): Int
}

public typealias PFNCLOSE = PFNCLOSEFn?

public fun interface PFNFCIALLOCFn {
    public operator fun invoke(cb: UInt): Long
}

public typealias PFNFCIALLOC = PFNFCIALLOCFn?

public fun interface PFNFCICLOSEFn {
    public operator fun invoke(hf: Long, err: Long, pv: Long): Int
}

public typealias PFNFCICLOSE = PFNFCICLOSEFn?

public fun interface PFNFCIDELETEFn {
    public operator fun invoke(pszfile: PCSTR, err: Long, pv: Long): Int
}

public typealias PFNFCIDELETE = PFNFCIDELETEFn?

public fun interface PFNFCIFILEPLACEDFn {
    public operator fun invoke(pccab: Long, pszfile: PCSTR, cbfile: Int, fcontinuation: BOOL, pv: Long): Int
}

public typealias PFNFCIFILEPLACED = PFNFCIFILEPLACEDFn?

public fun interface PFNFCIFREEFn {
    public operator fun invoke(memory: Long)
}

public typealias PFNFCIFREE = PFNFCIFREEFn?

public fun interface PFNFCIGETNEXTCABINETFn {
    public operator fun invoke(pccab: Long, cbprevcab: UInt, pv: Long): BOOL
}

public typealias PFNFCIGETNEXTCABINET = PFNFCIGETNEXTCABINETFn?

public fun interface PFNFCIGETOPENINFOFn {
    public operator fun invoke(pszname: PCSTR, pdate: Long, ptime: Long, pattribs: Long, err: Long, pv: Long): Long
}

public typealias PFNFCIGETOPENINFO = PFNFCIGETOPENINFOFn?

public fun interface PFNFCIGETTEMPFILEFn {
    public operator fun invoke(psztempname: PSTR, cbtempname: Int, pv: Long): BOOL
}

public typealias PFNFCIGETTEMPFILE = PFNFCIGETTEMPFILEFn?

public fun interface PFNFCIOPENFn {
    public operator fun invoke(pszfile: PCSTR, oflag: Int, pmode: Int, err: Long, pv: Long): Long
}

public typealias PFNFCIOPEN = PFNFCIOPENFn?

public fun interface PFNFCIREADFn {
    public operator fun invoke(hf: Long, memory: Long, cb: UInt, err: Long, pv: Long): UInt
}

public typealias PFNFCIREAD = PFNFCIREADFn?

public fun interface PFNFCISEEKFn {
    public operator fun invoke(hf: Long, dist: Int, seektype: Int, err: Long, pv: Long): Int
}

public typealias PFNFCISEEK = PFNFCISEEKFn?

public fun interface PFNFCISTATUSFn {
    public operator fun invoke(typestatus: UInt, cb1: UInt, cb2: UInt, pv: Long): Int
}

public typealias PFNFCISTATUS = PFNFCISTATUSFn?

public fun interface PFNFCIWRITEFn {
    public operator fun invoke(hf: Long, memory: Long, cb: UInt, err: Long, pv: Long): UInt
}

public typealias PFNFCIWRITE = PFNFCIWRITEFn?

public fun interface PFNFDIDECRYPTFn {
    public operator fun invoke(pfdid: Long): Int
}

public typealias PFNFDIDECRYPT = PFNFDIDECRYPTFn?

public fun interface PFNFDINOTIFYFn {
    public operator fun invoke(fdint: FDINOTIFICATIONTYPE, pfdin: Long): Long
}

public typealias PFNFDINOTIFY = PFNFDINOTIFYFn?

public fun interface PFNFREEFn {
    public operator fun invoke(pv: Long)
}

public typealias PFNFREE = PFNFREEFn?

public fun interface PFNOPENFn {
    public operator fun invoke(pszfile: PCSTR, oflag: Int, pmode: Int): Long
}

public typealias PFNOPEN = PFNOPENFn?

public fun interface PFNREADFn {
    public operator fun invoke(hf: Long, pv: Long, cb: UInt): UInt
}

public typealias PFNREAD = PFNREADFn?

public fun interface PFNSEEKFn {
    public operator fun invoke(hf: Long, dist: Int, seektype: Int): Int
}

public typealias PFNSEEK = PFNSEEKFn?

public fun interface PFNWRITEFn {
    public operator fun invoke(hf: Long, pv: Long, cb: UInt): UInt
}

public typealias PFNWRITE = PFNWRITEFn?
