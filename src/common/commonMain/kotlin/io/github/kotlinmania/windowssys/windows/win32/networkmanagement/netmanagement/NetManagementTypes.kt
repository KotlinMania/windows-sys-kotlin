package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

public typealias AF_OP = UInt

public typealias BIND_FLAGS1 = Int

public typealias COMPONENT_CHARACTERISTICS = Int

public typealias DEFAULT_PAGES = Int

public typealias DSREG_JOIN_TYPE = Int

public typealias ENUM_BINDING_PATHS_FLAGS = Int

public typealias FORCE_LEVEL_FLAGS = UInt

public typealias MSA_INFO_LEVEL = Int

public typealias MSA_INFO_STATE = Int

public typealias NCPNP_RECONFIG_LAYER = Int

public typealias NCRP_FLAGS = Int

public typealias NETSETUP_JOIN_STATUS = Int

public typealias NETSETUP_NAME_TYPE = Int

public typealias NETSETUP_PROVISION = UInt

public typealias NETWORK_INSTALL_TIME = Int

public typealias NETWORK_UPGRADE_TYPE = Int

public typealias NET_COMPUTER_NAME_TYPE = Int

public typealias NET_JOIN_DOMAIN_JOIN_OPTIONS = UInt

public typealias NET_REMOTE_COMPUTER_SUPPORTS_OPTIONS = UInt

public typealias NET_REQUEST_PROVISION_OPTIONS = UInt

public typealias NET_SERVER_TYPE = UInt

public typealias NET_USER_ENUM_FILTER_FLAGS = UInt

public typealias NET_VALIDATE_PASSWORD_TYPE = Int

public typealias OBO_TOKEN_TYPE = Int

public typealias RASCON_UIINFO_FLAGS = Int

public typealias SERVER_INFO_HIDDEN = Int

public typealias SERVER_INFO_SECURITY = UInt

public typealias SUPPORTS_BINDING_INTERFACE_FLAGS = Int

public typealias TRANSPORT_TYPE = Int

public typealias USER_ACCOUNT_FLAGS = UInt

public typealias USER_MODALS_ROLES = UInt

public typealias USER_PRIV = UInt

public typealias USE_INFO_ASG_TYPE = UInt

public fun interface WORKERFUNCTIONFn {
    public operator fun invoke(param0: Long)
}

public typealias WORKERFUNCTION = WORKERFUNCTIONFn?
