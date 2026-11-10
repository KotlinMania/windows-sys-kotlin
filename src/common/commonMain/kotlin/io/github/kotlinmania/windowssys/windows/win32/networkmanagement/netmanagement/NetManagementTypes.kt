package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias AfOp = UInt

public typealias BindFlags1 = Int

public typealias ComponentCharacteristics = Int

public typealias DefaultPages = Int

public typealias DsregJoinType = Int

public typealias EnumBindingPathsFlags = Int

public typealias ForceLevelFlags = UInt

public typealias MsaInfoLevel = Int

public typealias MsaInfoState = Int

public typealias NcpnpReconfigLayer = Int

public typealias NcrpFlags = Int

public typealias NetsetupJoinStatus = Int

public typealias NetsetupNameType = Int

public typealias NetsetupProvision = UInt

public typealias NetworkInstallTime = Int

public typealias NetworkUpgradeType = Int

public typealias NetComputerNameType = Int

public typealias NetJoinDomainJoinOptions = UInt

public typealias NetRemoteComputerSupportsOptions = UInt

public typealias NetRequestProvisionOptions = UInt

public typealias NetServerType = UInt

public typealias NetUserEnumFilterFlags = UInt

public typealias NetValidatePasswordType = Int

public typealias OboTokenType = Int

public typealias RasconUiinfoFlags = Int

public typealias ServerInfoHidden = Int

public typealias ServerInfoSecurity = UInt

public typealias SupportsBindingInterfaceFlags = Int

public typealias TransportType = Int

public typealias UserAccountFlags = UInt

public typealias UserModalsRoles = UInt

public typealias UserPriv = UInt

public typealias UseInfoAsgType = UInt

public fun interface WorkerfunctionFn {
    public operator fun invoke(param0: COpaquePointer?)
}

public typealias Workerfunction = WorkerfunctionFn?
