package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

public data class UseInfo3(
    public var ui3Ui2: UseInfo2 = UseInfo2(),
    public var ui3Flags: UInt = 0u,
)

public data class UseInfo4(
    public var ui4Ui3: UseInfo3 = UseInfo3(),
    public var ui4AuthIdentityLength: UInt = 0u,
    public var ui4AuthIdentity: COpaquePointer? = null,
)

public data class UseInfo5(
    public var ui4Ui3: UseInfo3 = UseInfo3(),
    public var ui4AuthIdentityLength: UInt = 0u,
    public var ui4AuthIdentity: COpaquePointer? = null,
    public var ui5SecurityDescriptorLength: UInt = 0u,
    public var ui5SecurityDescriptor: COpaquePointer? = null,
    public var ui5UseOptionsLength: UInt = 0u,
    public var ui5UseOptions: COpaquePointer? = null,
)

public data class UseOptionDeferredConnectionParameters(
    public var tag: UInt = 0u,
    public var length: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class UseOptionGeneric(
    public var tag: UInt = 0u,
    public var length: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class UseOptionProperties(
    public var tag: UInt = 0u,
    public var pInfo: COpaquePointer? = null,
    public var length: Int = 0,
)

public data class UseOptionTransportParameters(
    public var tag: UInt = 0u,
    public var length: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class WkstaInfo100(
    public var wki100PlatformId: UInt = 0u,
    public var wki100Computername: Pwstr = null,
    public var wki100Langroup: Pwstr = null,
    public var wki100VerMajor: UInt = 0u,
    public var wki100VerMinor: UInt = 0u,
)

public data class WkstaInfo101(
    public var wki101PlatformId: UInt = 0u,
    public var wki101Computername: Pwstr = null,
    public var wki101Langroup: Pwstr = null,
    public var wki101VerMajor: UInt = 0u,
    public var wki101VerMinor: UInt = 0u,
    public var wki101Lanroot: Pwstr = null,
)

public data class WkstaInfo1010(
    public var wki1010CharWait: UInt = 0u,
)

public data class WkstaInfo1011(
    public var wki1011CollectionTime: UInt = 0u,
)

public data class WkstaInfo1012(
    public var wki1012MaximumCollectionCount: UInt = 0u,
)

public data class WkstaInfo1013(
    public var wki1013KeepConn: UInt = 0u,
)

public data class WkstaInfo1018(
    public var wki1018SessTimeout: UInt = 0u,
)

public data class WkstaInfo102(
    public var wki102PlatformId: UInt = 0u,
    public var wki102Computername: Pwstr = null,
    public var wki102Langroup: Pwstr = null,
    public var wki102VerMajor: UInt = 0u,
    public var wki102VerMinor: UInt = 0u,
    public var wki102Lanroot: Pwstr = null,
    public var wki102LoggedOnUsers: UInt = 0u,
)

public data class WkstaInfo1023(
    public var wki1023SizCharBuf: UInt = 0u,
)

public data class WkstaInfo1027(
    public var wki1027ErrlogSz: UInt = 0u,
)

public data class WkstaInfo1028(
    public var wki1028PrintBufTime: UInt = 0u,
)

public data class WkstaInfo1032(
    public var wki1032WrkHeuristics: UInt = 0u,
)

public data class WkstaInfo1033(
    public var wki1033MaxThreads: UInt = 0u,
)

public data class WkstaInfo1041(
    public var wki1041LockQuota: UInt = 0u,
)

public data class WkstaInfo1042(
    public var wki1042LockIncrement: UInt = 0u,
)

public data class WkstaInfo1043(
    public var wki1043LockMaximum: UInt = 0u,
)

public data class WkstaInfo1044(
    public var wki1044PipeIncrement: UInt = 0u,
)

public data class WkstaInfo1045(
    public var wki1045PipeMaximum: UInt = 0u,
)

public data class WkstaInfo1046(
    public var wki1046DormantFileLimit: UInt = 0u,
)

public data class WkstaInfo1047(
    public var wki1047CacheFileTimeout: UInt = 0u,
)

public data class WkstaInfo1048(
    public var wki1048UseOpportunisticLocking: Bool = 0,
)

public data class WkstaInfo1049(
    public var wki1049UseUnlockBehind: Bool = 0,
)

public data class WkstaInfo1050(
    public var wki1050UseCloseBehind: Bool = 0,
)

public data class WkstaInfo1051(
    public var wki1051BufNamedPipes: Bool = 0,
)

public data class WkstaInfo1052(
    public var wki1052UseLockReadUnlock: Bool = 0,
)

public data class WkstaInfo1053(
    public var wki1053UtilizeNtCaching: Bool = 0,
)

public data class WkstaInfo1054(
    public var wki1054UseRawRead: Bool = 0,
)

public data class WkstaInfo1055(
    public var wki1055UseRawWrite: Bool = 0,
)

public data class WkstaInfo1056(
    public var wki1056UseWriteRawData: Bool = 0,
)

public data class WkstaInfo1057(
    public var wki1057UseEncryption: Bool = 0,
)

public data class WkstaInfo1058(
    public var wki1058BufFilesDenyWrite: Bool = 0,
)

public data class WkstaInfo1059(
    public var wki1059BufReadOnlyFiles: Bool = 0,
)

public data class WkstaInfo1060(
    public var wki1060ForceCoreCreateMode: Bool = 0,
)

public data class WkstaInfo1061(
    public var wki1061Use512ByteMaxTransfer: Bool = 0,
)

public data class WkstaInfo1062(
    public var wki1062ReadAheadThroughput: UInt = 0u,
)

public class WkstaInfo302(
    public var wki302CharWait: UInt = 0u,
    public var wki302CollectionTime: UInt = 0u,
    public var wki302MaximumCollectionCount: UInt = 0u,
    public var wki302KeepConn: UInt = 0u,
    public var wki302KeepSearch: UInt = 0u,
    public var wki302MaxCmds: UInt = 0u,
    public var wki302NumWorkBuf: UInt = 0u,
    public var wki302SizWorkBuf: UInt = 0u,
    public var wki302MaxWrkCache: UInt = 0u,
    public var wki302SessTimeout: UInt = 0u,
    public var wki302SizError: UInt = 0u,
    public var wki302NumAlerts: UInt = 0u,
    public var wki302NumServices: UInt = 0u,
    public var wki302ErrlogSz: UInt = 0u,
    public var wki302PrintBufTime: UInt = 0u,
    public var wki302NumCharBuf: UInt = 0u,
    public var wki302SizCharBuf: UInt = 0u,
    public var wki302WrkHeuristics: Pwstr = null,
    public var wki302Mailslots: UInt = 0u,
    public var wki302NumDgramBuf: UInt = 0u,
)

public class WkstaInfo402(
    public var wki402CharWait: UInt = 0u,
    public var wki402CollectionTime: UInt = 0u,
    public var wki402MaximumCollectionCount: UInt = 0u,
    public var wki402KeepConn: UInt = 0u,
    public var wki402KeepSearch: UInt = 0u,
    public var wki402MaxCmds: UInt = 0u,
    public var wki402NumWorkBuf: UInt = 0u,
    public var wki402SizWorkBuf: UInt = 0u,
    public var wki402MaxWrkCache: UInt = 0u,
    public var wki402SessTimeout: UInt = 0u,
    public var wki402SizError: UInt = 0u,
    public var wki402NumAlerts: UInt = 0u,
    public var wki402NumServices: UInt = 0u,
    public var wki402ErrlogSz: UInt = 0u,
    public var wki402PrintBufTime: UInt = 0u,
    public var wki402NumCharBuf: UInt = 0u,
    public var wki402SizCharBuf: UInt = 0u,
    public var wki402WrkHeuristics: Pwstr = null,
    public var wki402Mailslots: UInt = 0u,
    public var wki402NumDgramBuf: UInt = 0u,
    public var wki402MaxThreads: UInt = 0u,
)

public class WkstaInfo502(
    public var wki502CharWait: UInt = 0u,
    public var wki502CollectionTime: UInt = 0u,
    public var wki502MaximumCollectionCount: UInt = 0u,
    public var wki502KeepConn: UInt = 0u,
    public var wki502MaxCmds: UInt = 0u,
    public var wki502SessTimeout: UInt = 0u,
    public var wki502SizCharBuf: UInt = 0u,
    public var wki502MaxThreads: UInt = 0u,
    public var wki502LockQuota: UInt = 0u,
    public var wki502LockIncrement: UInt = 0u,
    public var wki502LockMaximum: UInt = 0u,
    public var wki502PipeIncrement: UInt = 0u,
    public var wki502PipeMaximum: UInt = 0u,
    public var wki502CacheFileTimeout: UInt = 0u,
    public var wki502DormantFileLimit: UInt = 0u,
    public var wki502ReadAheadThroughput: UInt = 0u,
    public var wki502NumMailslotBuffers: UInt = 0u,
    public var wki502NumSrvAnnounceBuffers: UInt = 0u,
    public var wki502MaxIllegalDatagramEvents: UInt = 0u,
    public var wki502IllegalDatagramEventResetFrequency: UInt = 0u,
    public var wki502LogElectionPackets: Bool = 0,
    public var wki502UseOpportunisticLocking: Bool = 0,
    public var wki502UseUnlockBehind: Bool = 0,
    public var wki502UseCloseBehind: Bool = 0,
    public var wki502BufNamedPipes: Bool = 0,
    public var wki502UseLockReadUnlock: Bool = 0,
    public var wki502UtilizeNtCaching: Bool = 0,
    public var wki502UseRawRead: Bool = 0,
    public var wki502UseRawWrite: Bool = 0,
    public var wki502UseWriteRawData: Bool = 0,
    public var wki502UseEncryption: Bool = 0,
    public var wki502BufFilesDenyWrite: Bool = 0,
    public var wki502BufReadOnlyFiles: Bool = 0,
    public var wki502ForceCoreCreateMode: Bool = 0,
    public var wki502Use512ByteMaxTransfer: Bool = 0,
)

public data class WkstaTransportInfo0(
    public var wkti0QualityOfService: UInt = 0u,
    public var wkti0NumberOfVcs: UInt = 0u,
    public var wkti0TransportName: Pwstr = null,
    public var wkti0TransportAddress: Pwstr = null,
    public var wkti0WanIsh: Bool = 0,
)

public data class WkstaUserInfo0(
    public var wkui0Username: Pwstr = null,
)

public data class WkstaUserInfo1(
    public var wkui1Username: Pwstr = null,
    public var wkui1LogonDomain: Pwstr = null,
    public var wkui1OthDomains: Pwstr = null,
    public var wkui1LogonServer: Pwstr = null,
)

public data class WkstaUserInfo1101(
    public var wkui1101OthDomains: Pwstr = null,
)
