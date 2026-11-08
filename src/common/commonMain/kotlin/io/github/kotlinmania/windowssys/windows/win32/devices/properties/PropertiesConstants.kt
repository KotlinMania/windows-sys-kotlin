package io.github.kotlinmania.windowssys.windows.win32.devices.properties

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY

public val DEVPKEY_DevQuery_ObjectType: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x13673f42a3d649f6uL, 0xb4daae46e0c5237cuL)), pid = 2u)

public val DEVPKEY_DeviceClass_Characteristics: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 29u)

public val DEVPKEY_DeviceClass_ClassCoInstallers: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x713d1703a2e249f5uL, 0x921456472ef3da5cuL)), pid = 2u)

public val DEVPKEY_DeviceClass_ClassInstaller: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 5u)

public val DEVPKEY_DeviceClass_ClassName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 3u)

public val DEVPKEY_DeviceClass_DHPRebalanceOptOut: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xd14d3ef366cf4ba2uL, 0x9d380ddb37ab4701uL)), pid = 2u)

public val DEVPKEY_DeviceClass_DefaultService: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 11u)

public val DEVPKEY_DeviceClass_DevType: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 27u)

public val DEVPKEY_DeviceClass_Exclusive: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 28u)

public val DEVPKEY_DeviceClass_Icon: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 4u)

public val DEVPKEY_DeviceClass_IconPath: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 12u)

public val DEVPKEY_DeviceClass_LowerFilters: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 20u)

public val DEVPKEY_DeviceClass_Name: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 2u)

public val DEVPKEY_DeviceClass_NoDisplayClass: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 8u)

public val DEVPKEY_DeviceClass_NoInstallClass: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 7u)

public val DEVPKEY_DeviceClass_NoUseClass: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 10u)

public val DEVPKEY_DeviceClass_PropPageProvider: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 6u)

public val DEVPKEY_DeviceClass_Security: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 25u)

public val DEVPKEY_DeviceClass_SecuritySDS: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 26u)

public val DEVPKEY_DeviceClass_SilentInstall: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 9u)

public val DEVPKEY_DeviceClass_UpperFilters: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 19u)

public val DEVPKEY_DeviceContainer_Address: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 51u)

public val DEVPKEY_DeviceContainer_AlwaysShowDeviceAsConnected: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 101u)

public val DEVPKEY_DeviceContainer_AssociationArray: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 80u)

public val DEVPKEY_DeviceContainer_BaselineExperienceId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 78u)

public val DEVPKEY_DeviceContainer_Category: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 90u)

public val DEVPKEY_DeviceContainer_CategoryGroup_Desc: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 94u)

public val DEVPKEY_DeviceContainer_CategoryGroup_Icon: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 95u)

public val DEVPKEY_DeviceContainer_Category_Desc_Plural: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 92u)

public val DEVPKEY_DeviceContainer_Category_Desc_Singular: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 91u)

public val DEVPKEY_DeviceContainer_Category_Icon: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 93u)

public val DEVPKEY_DeviceContainer_ConfigFlags: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 105u)

public val DEVPKEY_DeviceContainer_CustomPrivilegedPackageFamilyNames: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 107u)

public val DEVPKEY_DeviceContainer_DeviceDescription1: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 81u)

public val DEVPKEY_DeviceContainer_DeviceDescription2: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 82u)

public val DEVPKEY_DeviceContainer_DeviceFunctionSubRank: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 100u)

public val DEVPKEY_DeviceContainer_DiscoveryMethod: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 52u)

public val DEVPKEY_DeviceContainer_ExperienceId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 89u)

public val DEVPKEY_DeviceContainer_FriendlyName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x656a3bb3ecc043fduL, 0x84774ae0404a96cduL)), pid = 12288u)

public val DEVPKEY_DeviceContainer_HasProblem: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 83u)

public val DEVPKEY_DeviceContainer_Icon: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 57u)

public val DEVPKEY_DeviceContainer_InstallInProgress: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 9u)

public val DEVPKEY_DeviceContainer_IsAuthenticated: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 54u)

public val DEVPKEY_DeviceContainer_IsConnected: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 55u)

public val DEVPKEY_DeviceContainer_IsDefaultDevice: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 86u)

public val DEVPKEY_DeviceContainer_IsDeviceUniquelyIdentifiable: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 79u)

public val DEVPKEY_DeviceContainer_IsEncrypted: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 53u)

public val DEVPKEY_DeviceContainer_IsLocalMachine: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 70u)

public val DEVPKEY_DeviceContainer_IsMetadataSearchInProgress: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 72u)

public val DEVPKEY_DeviceContainer_IsNetworkDevice: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 85u)

public val DEVPKEY_DeviceContainer_IsNotInterestingForDisplay: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 74u)

public val DEVPKEY_DeviceContainer_IsPaired: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 56u)

public val DEVPKEY_DeviceContainer_IsRebootRequired: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 108u)

public val DEVPKEY_DeviceContainer_IsSharedDevice: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 84u)

public val DEVPKEY_DeviceContainer_IsShowInDisconnectedState: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 68u)

public val DEVPKEY_DeviceContainer_Last_Connected: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 67u)

public val DEVPKEY_DeviceContainer_Last_Seen: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 66u)

public val DEVPKEY_DeviceContainer_LaunchDeviceStageFromExplorer: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 77u)

public val DEVPKEY_DeviceContainer_LaunchDeviceStageOnDeviceConnect: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 76u)

public val DEVPKEY_DeviceContainer_Manufacturer: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x656a3bb3ecc043fduL, 0x84774ae0404a96cduL)), pid = 8192u)

public val DEVPKEY_DeviceContainer_MetadataCabinet: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 87u)

public val DEVPKEY_DeviceContainer_MetadataChecksum: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 73u)

public val DEVPKEY_DeviceContainer_MetadataPath: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 71u)

public val DEVPKEY_DeviceContainer_ModelName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x656a3bb3ecc043fduL, 0x84774ae0404a96cduL)), pid = 8194u)

public val DEVPKEY_DeviceContainer_ModelNumber: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x656a3bb3ecc043fduL, 0x84774ae0404a96cduL)), pid = 8195u)

public val DEVPKEY_DeviceContainer_PrimaryCategory: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 97u)

public val DEVPKEY_DeviceContainer_PrivilegedPackageFamilyNames: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 106u)

public val DEVPKEY_DeviceContainer_RequiresPairingElevation: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 88u)

public val DEVPKEY_DeviceContainer_RequiresUninstallElevation: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 99u)

public val DEVPKEY_DeviceContainer_UnpairUninstall: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 98u)

public val DEVPKEY_DeviceContainer_Version: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 65u)

public val DEVPKEY_DeviceInterfaceClass_DefaultInterface: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x14c83a990b3f44b7uL, 0xbe4ca178d3990564uL)), pid = 2u)

public val DEVPKEY_DeviceInterfaceClass_Name: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x14c83a990b3f44b7uL, 0xbe4ca178d3990564uL)), pid = 3u)

public val DEVPKEY_DeviceInterface_Autoplay_Silent: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x434dd28f9e75450auL, 0x9ab9ff61e618bad0uL)), pid = 2u)

public val DEVPKEY_DeviceInterface_ClassGuid: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 4u)

public val DEVPKEY_DeviceInterface_Enabled: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 3u)

public val DEVPKEY_DeviceInterface_FriendlyName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 2u)

public val DEVPKEY_DeviceInterface_ReferenceString: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 5u)

public val DEVPKEY_DeviceInterface_Restricted: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 6u)

public val DEVPKEY_DeviceInterface_SchematicName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 9u)

public val DEVPKEY_DeviceInterface_UnrestrictedAppCapabilities: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 8u)

public val DEVPKEY_Device_AdditionalSoftwareRequested: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 19u)

public val DEVPKEY_Device_Address: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 30u)

public val DEVPKEY_Device_AssignedToGuest: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 24u)

public val DEVPKEY_Device_BaseContainerId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 38u)

public val DEVPKEY_Device_BiosDeviceName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 10u)

public val DEVPKEY_Device_BusNumber: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 23u)

public val DEVPKEY_Device_BusRelations: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 7u)

public val DEVPKEY_Device_BusReportedDeviceDesc: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 4u)

public val DEVPKEY_Device_BusTypeGuid: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 21u)

public val DEVPKEY_Device_Capabilities: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 17u)

public val DEVPKEY_Device_Characteristics: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 29u)

public val DEVPKEY_Device_Children: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 9u)

public val DEVPKEY_Device_Class: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 9u)

public val DEVPKEY_Device_ClassGuid: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 10u)

public val DEVPKEY_Device_CompanionApps: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x6a742654d0b24420uL, 0xa523e068352ac1dfuL)), pid = 2u)

public val DEVPKEY_Device_CompatibleIds: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 4u)

public val DEVPKEY_Device_ConfigFlags: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 12u)

public val DEVPKEY_Device_ConfigurationId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 7u)

public val DEVPKEY_Device_ContainerId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x8c7ed2063f8a4827uL, 0xb3abae9e1faefc6cuL)), pid = 2u)

public val DEVPKEY_Device_CreatorProcessId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 25u)

public val DEVPKEY_Device_DHP_Rebalance_Policy: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 2u)

public val DEVPKEY_Device_DebuggerSafe: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 12u)

public val DEVPKEY_Device_DependencyDependents: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 21u)

public val DEVPKEY_Device_DependencyProviders: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 20u)

public val DEVPKEY_Device_DevNodeStatus: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 2u)

public val DEVPKEY_Device_DevType: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 27u)

public val DEVPKEY_Device_DeviceDesc: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 2u)

public val DEVPKEY_Device_Driver: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 11u)

public val DEVPKEY_Device_DriverCoInstallers: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 11u)

public val DEVPKEY_Device_DriverDate: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 2u)

public val DEVPKEY_Device_DriverDesc: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 4u)

public val DEVPKEY_Device_DriverInfPath: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 5u)

public val DEVPKEY_Device_DriverInfSection: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 6u)

public val DEVPKEY_Device_DriverInfSectionExt: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 7u)

public val DEVPKEY_Device_DriverLogoLevel: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 15u)

public val DEVPKEY_Device_DriverProblemDesc: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 11u)

public val DEVPKEY_Device_DriverPropPageProvider: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 10u)

public val DEVPKEY_Device_DriverProvider: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 9u)

public val DEVPKEY_Device_DriverRank: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 14u)

public val DEVPKEY_Device_DriverVersion: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 3u)

public val DEVPKEY_Device_EjectionRelations: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 4u)

public val DEVPKEY_Device_EnumeratorName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 24u)

public val DEVPKEY_Device_Exclusive: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 28u)

public val DEVPKEY_Device_ExtendedAddress: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 23u)

public val DEVPKEY_Device_ExtendedConfigurationIds: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 15u)

public val DEVPKEY_Device_FirmwareDate: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 17u)

public val DEVPKEY_Device_FirmwareRevision: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 19u)

public val DEVPKEY_Device_FirmwareVendor: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 26u)

public val DEVPKEY_Device_FirmwareVersion: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 18u)

public val DEVPKEY_Device_FirstInstallDate: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 101u)

public val DEVPKEY_Device_FriendlyName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 14u)

public val DEVPKEY_Device_FriendlyNameAttributes: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 3u)

public val DEVPKEY_Device_GenericDriverInstalled: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 18u)

public val DEVPKEY_Device_HardwareIds: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 3u)

public val DEVPKEY_Device_HasProblem: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 6u)

public val DEVPKEY_Device_InLocalMachineContainer: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x8c7ed2063f8a4827uL, 0xb3abae9e1faefc6cuL)), pid = 4u)

public val DEVPKEY_Device_InstallDate: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 100u)

public val DEVPKEY_Device_InstallState: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 36u)

public val DEVPKEY_Device_InstanceId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 256u)

public val DEVPKEY_Device_IsAssociateableByUserAction: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 7u)

public val DEVPKEY_Device_IsPresent: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 5u)

public val DEVPKEY_Device_IsRebootRequired: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 16u)

public val DEVPKEY_Device_LastArrivalDate: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 102u)

public val DEVPKEY_Device_LastRemovalDate: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 103u)

public val DEVPKEY_Device_Legacy: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x804971008c7348b9uL, 0xaad9ce387e19c56euL)), pid = 3u)

public val DEVPKEY_Device_LegacyBusType: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 22u)

public val DEVPKEY_Device_LocationInfo: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 15u)

public val DEVPKEY_Device_LocationPaths: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 37u)

public val DEVPKEY_Device_LowerFilters: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 20u)

public val DEVPKEY_Device_Manufacturer: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 13u)

public val DEVPKEY_Device_ManufacturerAttributes: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 4u)

public val DEVPKEY_Device_MatchingDeviceId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 8u)

public val DEVPKEY_Device_Model: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 39u)

public val DEVPKEY_Device_ModelId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 2u)

public val DEVPKEY_Device_NoConnectSound: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 17u)

public val DEVPKEY_Device_Numa_Node: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 3u)

public val DEVPKEY_Device_Numa_Proximity_Domain: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 1u)

public val DEVPKEY_Device_PDOName: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 16u)

public val DEVPKEY_Device_Parent: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 8u)

public val DEVPKEY_Device_PhysicalDeviceLocation: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 9u)

public val DEVPKEY_Device_PostInstallInProgress: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 13u)

public val DEVPKEY_Device_PowerData: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 32u)

public val DEVPKEY_Device_PowerRelations: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 6u)

public val DEVPKEY_Device_PresenceNotForDevice: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 5u)

public val DEVPKEY_Device_PrimaryCompanionApp: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x6a742654d0b24420uL, 0xa523e068352ac1dfuL)), pid = 3u)

public val DEVPKEY_Device_ProblemCode: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 3u)

public val DEVPKEY_Device_ProblemStatus: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 12u)

public val DEVPKEY_Device_RemovalPolicy: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 33u)

public val DEVPKEY_Device_RemovalPolicyDefault: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 34u)

public val DEVPKEY_Device_RemovalPolicyOverride: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 35u)

public val DEVPKEY_Device_RemovalRelations: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 5u)

public val DEVPKEY_Device_Reported: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x804971008c7348b9uL, 0xaad9ce387e19c56euL)), pid = 2u)

public val DEVPKEY_Device_ReportedDeviceIdsHash: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 8u)

public val DEVPKEY_Device_ResourcePickerExceptions: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 13u)

public val DEVPKEY_Device_ResourcePickerTags: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 12u)

public val DEVPKEY_Device_SafeRemovalRequired: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xafd9764086a34210uL, 0xb67c289c41aabe55uL)), pid = 2u)

public val DEVPKEY_Device_SafeRemovalRequiredOverride: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xafd9764086a34210uL, 0xb67c289c41aabe55uL)), pid = 3u)

public val DEVPKEY_Device_Security: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 25u)

public val DEVPKEY_Device_SecuritySDS: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 26u)

public val DEVPKEY_Device_Service: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 6u)

public val DEVPKEY_Device_SessionId: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 6u)

public val DEVPKEY_Device_ShowInUninstallUI: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 8u)

public val DEVPKEY_Device_Siblings: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 10u)

public val DEVPKEY_Device_SignalStrength: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 6u)

public val DEVPKEY_Device_SoftRestartSupported: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 22u)

public val DEVPKEY_Device_Stack: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 14u)

public val DEVPKEY_Device_TransportRelations: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 11u)

public val DEVPKEY_Device_UINumber: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 18u)

public val DEVPKEY_Device_UINumberDescFormat: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 31u)

public val DEVPKEY_Device_UpperFilters: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 19u)

public val DEVPKEY_DrvPkg_BrandingIcon: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 7u)

public val DEVPKEY_DrvPkg_DetailedDescription: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 4u)

public val DEVPKEY_DrvPkg_DocumentationLink: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 5u)

public val DEVPKEY_DrvPkg_Icon: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 6u)

public val DEVPKEY_DrvPkg_Model: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 2u)

public val DEVPKEY_DrvPkg_VendorWebSite: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 3u)

public val DEVPKEY_NAME: DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(U128(0xb725f13047ef101auL, 0xa5f102608c9eebacuL)), pid = 10u)

public val DEVPROPID_FIRST_USABLE: UInt = 2u

public val DEVPROP_FALSE: DEVPROP_BOOLEAN = 0u

public val DEVPROP_MASK_TYPE: UInt = 4095u

public val DEVPROP_MASK_TYPEMOD: UInt = 61440u

public val DEVPROP_STORE_SYSTEM: DEVPROPSTORE = 0

public val DEVPROP_STORE_USER: DEVPROPSTORE = 1

public val DEVPROP_TRUE: DEVPROP_BOOLEAN = 255u

public val DEVPROP_TYPEMOD_ARRAY: DEVPROPTYPE = 4096u

public val DEVPROP_TYPEMOD_LIST: DEVPROPTYPE = 8192u

public val DEVPROP_TYPE_BINARY: DEVPROPTYPE = 4099u

public val DEVPROP_TYPE_BOOLEAN: DEVPROPTYPE = 17u

public val DEVPROP_TYPE_BYTE: DEVPROPTYPE = 3u

public val DEVPROP_TYPE_CURRENCY: DEVPROPTYPE = 14u

public val DEVPROP_TYPE_DATE: DEVPROPTYPE = 15u

public val DEVPROP_TYPE_DECIMAL: DEVPROPTYPE = 12u

public val DEVPROP_TYPE_DEVPROPKEY: DEVPROPTYPE = 21u

public val DEVPROP_TYPE_DEVPROPTYPE: DEVPROPTYPE = 22u

public val DEVPROP_TYPE_DOUBLE: DEVPROPTYPE = 11u

public val DEVPROP_TYPE_EMPTY: DEVPROPTYPE = 0u

public val DEVPROP_TYPE_ERROR: DEVPROPTYPE = 23u

public val DEVPROP_TYPE_FILETIME: DEVPROPTYPE = 16u

public val DEVPROP_TYPE_FLOAT: DEVPROPTYPE = 10u

public val DEVPROP_TYPE_GUID: DEVPROPTYPE = 13u

public val DEVPROP_TYPE_INT16: DEVPROPTYPE = 4u

public val DEVPROP_TYPE_INT32: DEVPROPTYPE = 6u

public val DEVPROP_TYPE_INT64: DEVPROPTYPE = 8u

public val DEVPROP_TYPE_NTSTATUS: DEVPROPTYPE = 24u

public val DEVPROP_TYPE_NULL: DEVPROPTYPE = 1u

public val DEVPROP_TYPE_SBYTE: DEVPROPTYPE = 2u

public val DEVPROP_TYPE_SECURITY_DESCRIPTOR: DEVPROPTYPE = 19u

public val DEVPROP_TYPE_SECURITY_DESCRIPTOR_STRING: DEVPROPTYPE = 20u

public val DEVPROP_TYPE_STRING: DEVPROPTYPE = 18u

public val DEVPROP_TYPE_STRING_INDIRECT: DEVPROPTYPE = 25u

public val DEVPROP_TYPE_STRING_LIST: DEVPROPTYPE = 8210u

public val DEVPROP_TYPE_UINT16: DEVPROPTYPE = 5u

public val DEVPROP_TYPE_UINT32: DEVPROPTYPE = 7u

public val DEVPROP_TYPE_UINT64: DEVPROPTYPE = 9u

public val MAX_DEVPROP_TYPE: UInt = 25u

public val MAX_DEVPROP_TYPEMOD: UInt = 8192u
