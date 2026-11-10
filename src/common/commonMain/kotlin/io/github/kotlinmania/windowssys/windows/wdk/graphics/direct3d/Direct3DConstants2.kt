package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val DXGK_MAX_METADATA_NAME_LENGTH: UInt = 32u

public val DXGK_MAX_PAGE_TABLE_LEVEL_COUNT: UInt = 6u

public val DXGK_MIN_PAGE_TABLE_LEVEL_COUNT: UInt = 2u

public val DXGK_MIRACAST_CHUNK_TYPE_COLOR_CONVERT_COMPLETE: DxgkMiracastChunkType = 1

public val DXGK_MIRACAST_CHUNK_TYPE_ENCODE_COMPLETE: DxgkMiracastChunkType = 2

public val DXGK_MIRACAST_CHUNK_TYPE_ENCODE_DRIVER_DEFINED_1: DxgkMiracastChunkType = -2147483648.toInt()

public val DXGK_MIRACAST_CHUNK_TYPE_ENCODE_DRIVER_DEFINED_2: DxgkMiracastChunkType = -2147483647

public val DXGK_MIRACAST_CHUNK_TYPE_FRAME_DROPPED: DxgkMiracastChunkType = 4

public val DXGK_MIRACAST_CHUNK_TYPE_FRAME_START: DxgkMiracastChunkType = 3

public val DXGK_MIRACAST_CHUNK_TYPE_UNKNOWN: DxgkMiracastChunkType = 0

public val DXGK_PAGE_FAULT_ADAPTER_RESET_REQUIRED: DxgkPageFaultFlags = 4

public val DXGK_PAGE_FAULT_ENGINE_RESET_REQUIRED: DxgkPageFaultFlags = 8

public val DXGK_PAGE_FAULT_FATAL_HARDWARE_ERROR: DxgkPageFaultFlags = 16

public val DXGK_PAGE_FAULT_FENCE_INVALID: DxgkPageFaultFlags = 2

public val DXGK_PAGE_FAULT_HW_CONTEXT_VALID: DxgkPageFaultFlags = 64

public val DXGK_PAGE_FAULT_IOMMU: DxgkPageFaultFlags = 32

public val DXGK_PAGE_FAULT_PROCESS_HANDLE_VALID: DxgkPageFaultFlags = 128

public val DXGK_PAGE_FAULT_WRITE: DxgkPageFaultFlags = 1

public val DXGK_PTE_PAGE_TABLE_PAGE_4KB: DxgkPtePageSize = 0

public val DXGK_PTE_PAGE_TABLE_PAGE_64KB: DxgkPtePageSize = 1

public val DXGK_RENDER_PIPELINE_STAGE_GEOMETRY_SHADER: DxgkRenderPipelineStage = 3

public val DXGK_RENDER_PIPELINE_STAGE_INPUT_ASSEMBLER: DxgkRenderPipelineStage = 1

public val DXGK_RENDER_PIPELINE_STAGE_OUTPUT_MERGER: DxgkRenderPipelineStage = 7

public val DXGK_RENDER_PIPELINE_STAGE_PIXEL_SHADER: DxgkRenderPipelineStage = 6

public val DXGK_RENDER_PIPELINE_STAGE_RASTERIZER: DxgkRenderPipelineStage = 5

public val DXGK_RENDER_PIPELINE_STAGE_STREAM_OUTPUT: DxgkRenderPipelineStage = 4

public val DXGK_RENDER_PIPELINE_STAGE_UNKNOWN: DxgkRenderPipelineStage = 0

public val DXGK_RENDER_PIPELINE_STAGE_VERTEX_SHADER: DxgkRenderPipelineStage = 2

public val DXGK_BACKLIGHT_OPTIMIZATION_DESKTOP: DxgkBacklightOptimizationLevel = 1

public val DXGK_BACKLIGHT_OPTIMIZATION_DIMMED: DxgkBacklightOptimizationLevel = 3

public val DXGK_BACKLIGHT_OPTIMIZATION_DISABLE: DxgkBacklightOptimizationLevel = 0

public val DXGK_BACKLIGHT_OPTIMIZATION_DYNAMIC: DxgkBacklightOptimizationLevel = 2

public val DXGK_BACKLIGHT_OPTIMIZATION_EDR: DxgkBacklightOptimizationLevel = 4

public val FLIPEX_TIMEOUT_USER: UInt = 2000u

public val GUID_DEVINTERFACE_GRAPHICSPOWER: Guid = Guid.fromU128(U128(0xea5c6870e93c4588uL, 0xbef1fec42fc9429auL))

public val HPD_AWARENESS_ALWAYS_CONNECTED: DxgkChildDeviceHpdAwareness = 1

public val HPD_AWARENESS_INTERRUPTIBLE: DxgkChildDeviceHpdAwareness = 4

public val HPD_AWARENESS_NONE: DxgkChildDeviceHpdAwareness = 2

public val HPD_AWARENESS_POLLED: DxgkChildDeviceHpdAwareness = 3

public val HPD_AWARENESS_UNINITIALIZED: DxgkChildDeviceHpdAwareness = 0

public val IOCTL_GPUP_DRIVER_ESCAPE: UInt = 2253920u

public val IOCTL_INTERNAL_GRAPHICSPOWER_REGISTER: UInt = 2304007u

public val KMTQAITYPE_ADAPTERADDRESS: Kmtqueryadapterinfotype = 6

public val KMTQAITYPE_ADAPTERADDRESS_RENDER: Kmtqueryadapterinfotype = 53

public val KMTQAITYPE_ADAPTERGUID: Kmtqueryadapterinfotype = 4

public val KMTQAITYPE_ADAPTERGUID_RENDER: Kmtqueryadapterinfotype = 52

public val KMTQAITYPE_ADAPTERPERFDATA: Kmtqueryadapterinfotype = 62

public val KMTQAITYPE_ADAPTERPERFDATA_CAPS: Kmtqueryadapterinfotype = 63

public val KMTQAITYPE_ADAPTERREGISTRYINFO: Kmtqueryadapterinfotype = 8

public val KMTQAITYPE_ADAPTERREGISTRYINFO_RENDER: Kmtqueryadapterinfotype = 54

public val KMTQAITYPE_ADAPTERTYPE: Kmtqueryadapterinfotype = 15

public val KMTQAITYPE_ADAPTERTYPE_RENDER: Kmtqueryadapterinfotype = 57

public val KMTQAITYPE_BLOCKLIST_KERNEL: Kmtqueryadapterinfotype = 50

public val KMTQAITYPE_BLOCKLIST_RUNTIME: Kmtqueryadapterinfotype = 51

public val KMTQAITYPE_CHECKDRIVERUPDATESTATUS: Kmtqueryadapterinfotype = 11

public val KMTQAITYPE_CHECKDRIVERUPDATESTATUS_RENDER: Kmtqueryadapterinfotype = 55

public val KMTQAITYPE_CPDRIVERNAME: Kmtqueryadapterinfotype = 26

public val KMTQAITYPE_CROSSADAPTERRESOURCE_SUPPORT: Kmtqueryadapterinfotype = 76

public val KMTQAITYPE_CURRENTDISPLAYMODE: Kmtqueryadapterinfotype = 9

public val KMTQAITYPE_DIRECTFLIP_SUPPORT: Kmtqueryadapterinfotype = 19

public val KMTQAITYPE_DISPLAY_CAPS: Kmtqueryadapterinfotype = 74

public val KMTQAITYPE_DISPLAY_UMDRIVERNAME: Kmtqueryadapterinfotype = 71

public val KMTQAITYPE_DLIST_DRIVER_NAME: Kmtqueryadapterinfotype = 21

public val KMTQAITYPE_DRIVERCAPS_EXT: Kmtqueryadapterinfotype = 32

public val KMTQAITYPE_DRIVERVERSION: Kmtqueryadapterinfotype = 13

public val KMTQAITYPE_DRIVERVERSION_RENDER: Kmtqueryadapterinfotype = 56

public val KMTQAITYPE_DRIVER_DESCRIPTION: Kmtqueryadapterinfotype = 65

public val KMTQAITYPE_DRIVER_DESCRIPTION_RENDER: Kmtqueryadapterinfotype = 66

public val KMTQAITYPE_FLIPQUEUEINFO: Kmtqueryadapterinfotype = 5

public val KMTQAITYPE_GETSEGMENTGROUPSIZE: Kmtqueryadapterinfotype = 42

public val KMTQAITYPE_GETSEGMENTSIZE: Kmtqueryadapterinfotype = 3

public val KMTQAITYPE_GET_DEVICE_VIDPN_OWNERSHIP_INFO: Kmtqueryadapterinfotype = 47

public val KMTQAITYPE_HWDRM_SUPPORT: Kmtqueryadapterinfotype = 44

public val KMTQAITYPE_HYBRID_DLIST_DLL_SUPPORT: Kmtqueryadapterinfotype = 73

public val KMTQAITYPE_INDEPENDENTFLIP_SECONDARY_SUPPORT: Kmtqueryadapterinfotype = 39

public val KMTQAITYPE_INDEPENDENTFLIP_SUPPORT: Kmtqueryadapterinfotype = 28

public val KMTQAITYPE_KMD_DRIVER_VERSION: Kmtqueryadapterinfotype = 49

public val KMTQAITYPE_MIRACASTCOMPANIONDRIVERNAME: Kmtqueryadapterinfotype = 29

public val KMTQAITYPE_MODELIST: Kmtqueryadapterinfotype = 10

public val KMTQAITYPE_MPO3DDI_SUPPORT: Kmtqueryadapterinfotype = 43

public val KMTQAITYPE_MPOKERNELCAPS_SUPPORT: Kmtqueryadapterinfotype = 45

public val KMTQAITYPE_MULTIPLANEOVERLAY_HUD_SUPPORT: Kmtqueryadapterinfotype = 23

public val KMTQAITYPE_MULTIPLANEOVERLAY_SECONDARY_SUPPORT: Kmtqueryadapterinfotype = 38

public val KMTQAITYPE_MULTIPLANEOVERLAY_STRETCH_SUPPORT: Kmtqueryadapterinfotype = 46

public val KMTQAITYPE_MULTIPLANEOVERLAY_SUPPORT: Kmtqueryadapterinfotype = 20

public val KMTQAITYPE_NODEMETADATA: Kmtqueryadapterinfotype = 25

public val KMTQAITYPE_NODEPERFDATA: Kmtqueryadapterinfotype = 61

public val KMTQAITYPE_OUTPUTDUPLCONTEXTSCOUNT: Kmtqueryadapterinfotype = 16

public val KMTQAITYPE_PANELFITTER_SUPPORT: Kmtqueryadapterinfotype = 40

public val KMTQAITYPE_PARAVIRTUALIZATION_RENDER: Kmtqueryadapterinfotype = 68

public val KMTQAITYPE_PHYSICALADAPTERCOUNT: Kmtqueryadapterinfotype = 30

public val KMTQAITYPE_PHYSICALADAPTERDEVICEIDS: Kmtqueryadapterinfotype = 31

public val KMTQAITYPE_PHYSICALADAPTERPNPKEY: Kmtqueryadapterinfotype = 41

public val KMTQAITYPE_QUERYREGISTRY: Kmtqueryadapterinfotype = 48

public val KMTQAITYPE_QUERY_ADAPTER_UNIQUE_GUID: Kmtqueryadapterinfotype = 60

public val KMTQAITYPE_QUERY_GPUMMU_CAPS: Kmtqueryadapterinfotype = 34

public val KMTQAITYPE_QUERY_HW_PROTECTION_TEARDOWN_COUNT: Kmtqueryadapterinfotype = 36

public val KMTQAITYPE_QUERY_ISBADDRIVERFORHWPROTECTIONDISABLED: Kmtqueryadapterinfotype = 37

public val KMTQAITYPE_QUERY_MIRACAST_DRIVER_TYPE: Kmtqueryadapterinfotype = 33

public val KMTQAITYPE_QUERY_MULTIPLANEOVERLAY_DECODE_SUPPORT: Kmtqueryadapterinfotype = 35

public val KMTQAITYPE_SCANOUT_CAPS: Kmtqueryadapterinfotype = 67

public val KMTQAITYPE_SERVICENAME: Kmtqueryadapterinfotype = 69

public val KMTQAITYPE_SETWORKINGSETINFO: Kmtqueryadapterinfotype = 7

public val KMTQAITYPE_TRACKEDWORKLOAD_SUPPORT: Kmtqueryadapterinfotype = 72

public val KMTQAITYPE_UMDRIVERNAME: Kmtqueryadapterinfotype = 1

public val KMTQAITYPE_UMDRIVERPRIVATE: Kmtqueryadapterinfotype = 0

public val KMTQAITYPE_UMD_DRIVER_VERSION: Kmtqueryadapterinfotype = 18

public val KMTQAITYPE_UMOPENGLINFO: Kmtqueryadapterinfotype = 2

public val KMTQAITYPE_VGPUINTERFACEID: Kmtqueryadapterinfotype = 79

public val KMTQAITYPE_VIRTUALADDRESSINFO: Kmtqueryadapterinfotype = 12

public val KMTQAITYPE_WDDM_1_2_CAPS: Kmtqueryadapterinfotype = 17

public val KMTQAITYPE_WDDM_1_2_CAPS_RENDER: Kmtqueryadapterinfotype = 58

public val KMTQAITYPE_WDDM_1_3_CAPS: Kmtqueryadapterinfotype = 22

public val KMTQAITYPE_WDDM_1_3_CAPS_RENDER: Kmtqueryadapterinfotype = 59

public val KMTQAITYPE_WDDM_2_0_CAPS: Kmtqueryadapterinfotype = 24

public val KMTQAITYPE_WDDM_2_7_CAPS: Kmtqueryadapterinfotype = 70

public val KMTQAITYPE_WDDM_2_9_CAPS: Kmtqueryadapterinfotype = 75

public val KMTQAITYPE_WDDM_3_0_CAPS: Kmtqueryadapterinfotype = 77

public val KMTQAITYPE_WDDM_3_1_CAPS: Kmtqueryadapterinfotype = 80

public val KMTQAITYPE_WSAUMDIMAGENAME: Kmtqueryadapterinfotype = 78

public val KMTQAITYPE_XBOX: Kmtqueryadapterinfotype = 27

public val KMTQUITYPE_GPUVERSION: Kmtqueryadapterinfotype = 64

public val KMTUMDVERSION_DX10: Kmtumdversion = 1

public val KMTUMDVERSION_DX11: Kmtumdversion = 2

public val KMTUMDVERSION_DX12: Kmtumdversion = 3

public val KMTUMDVERSION_DX12_WSA32: Kmtumdversion = 4

public val KMTUMDVERSION_DX12_WSA64: Kmtumdversion = 5

public val KMTUMDVERSION_DX9: Kmtumdversion = 0

public val KMT_DISPLAY_UMDVERSION_1: KmtDisplayUmdVersion = 0

public val KMT_DRIVERVERSION_WDDM_1_0: D3dkmtDriverversion = 1000

public val KMT_DRIVERVERSION_WDDM_1_1: D3dkmtDriverversion = 1105

public val KMT_DRIVERVERSION_WDDM_1_1_PRERELEASE: D3dkmtDriverversion = 1102

public val KMT_DRIVERVERSION_WDDM_1_2: D3dkmtDriverversion = 1200

public val KMT_DRIVERVERSION_WDDM_1_3: D3dkmtDriverversion = 1300

public val KMT_DRIVERVERSION_WDDM_2_0: D3dkmtDriverversion = 2000

public val KMT_DRIVERVERSION_WDDM_2_1: D3dkmtDriverversion = 2100

public val KMT_DRIVERVERSION_WDDM_2_2: D3dkmtDriverversion = 2200

public val KMT_DRIVERVERSION_WDDM_2_3: D3dkmtDriverversion = 2300

public val KMT_DRIVERVERSION_WDDM_2_4: D3dkmtDriverversion = 2400

public val KMT_DRIVERVERSION_WDDM_2_5: D3dkmtDriverversion = 2500

public val KMT_DRIVERVERSION_WDDM_2_6: D3dkmtDriverversion = 2600

public val KMT_DRIVERVERSION_WDDM_2_7: D3dkmtDriverversion = 2700

public val KMT_DRIVERVERSION_WDDM_2_8: D3dkmtDriverversion = 2800

public val KMT_DRIVERVERSION_WDDM_2_9: D3dkmtDriverversion = 2900

public val KMT_DRIVERVERSION_WDDM_3_0: D3dkmtDriverversion = 3000

public val KMT_DRIVERVERSION_WDDM_3_1: D3dkmtDriverversion = 3100

public val MAX_ENUM_ADAPTERS: UInt = 16u

public val MIRACAST_START_PENDING: D3dkmtMiracastDisplayDeviceState = 1

public val MIRACAST_STARTED: D3dkmtMiracastDisplayDeviceState = 2

public val MIRACAST_STOP_PENDING: D3dkmtMiracastDisplayDeviceState = 3

public val MIRACAST_STOPPED: D3dkmtMiracastDisplayDeviceState = 0

public val NUM_KMTUMDVERSIONS: Kmtumdversion = 6

public val NUM_KMT_DISPLAY_UMDVERSIONS: KmtDisplayUmdVersion = 1

public val OUTPUTDUPL_CONTEXT_DEBUG_STATUS_ACTIVE: OutputduplContextDebugStatus = 1

public val OUTPUTDUPL_CONTEXT_DEBUG_STATUS_INACTIVE: OutputduplContextDebugStatus = 0

public val OUTPUTDUPL_CONTEXT_DEBUG_STATUS_PENDING_DESTROY: OutputduplContextDebugStatus = 2

public val OUTPUTDUPL_CREATE_MAX_KEYEDMUTXES: UInt = 3u

public val RTPATCHFLAG_HASINFO: Int = 2

public val RTPATCHFLAG_HASSEGS: Int = 1

public val SHARED_ALLOCATION_WRITE: UInt = 1u

public val NT_D3DDEVCAPS_HWINDEXBUFFER: Int = 67108864

public val NT_D3DDEVCAPS_HWVERTEXBUFFER: Int = 33554432

public val NT_D3DDEVCAPS_SUBVOLUMELOCK: Int = 134217728

public val NT_D3DFVF_FOG: Int = 8192

public val NT_D3DGDI2_MAGIC: UInt = 4294967295u

public val NT_D3DGDI2_TYPE_DEFERRED_AGP_AWARE: UInt = 24u

public val NT_D3DGDI2_TYPE_DEFER_AGP_FREES: UInt = 32u

public val NT_D3DGDI2_TYPE_DXVERSION: UInt = 4u

public val NT_D3DGDI2_TYPE_FREE_DEFERRED_AGP: UInt = 25u

public val NT_D3DGDI2_TYPE_GETADAPTERGROUP: UInt = 19u

public val NT_D3DGDI2_TYPE_GETD3DCAPS8: UInt = 1u

public val NT_D3DGDI2_TYPE_GETD3DCAPS9: UInt = 16u

public val NT_D3DGDI2_TYPE_GETD3DQUERY: UInt = 34u

public val NT_D3DGDI2_TYPE_GETD3DQUERYCOUNT: UInt = 33u

public val NT_D3DGDI2_TYPE_GETDDIVERSION: UInt = 35u

public val NT_D3DGDI2_TYPE_GETEXTENDEDMODE: UInt = 18u

public val NT_D3DGDI2_TYPE_GETEXTENDEDMODECOUNT: UInt = 17u

public val NT_D3DGDI2_TYPE_GETFORMAT: UInt = 3u

public val NT_D3DGDI2_TYPE_GETFORMATCOUNT: UInt = 2u

public val NT_D3DGDI2_TYPE_GETMULTISAMPLEQUALITYLEVELS: UInt = 22u

public val NT_D3DPMISCCAPS_FOGINFVF: Int = 8192

public val NT_D3DPS_COLOROUT_MAX_V2_0: UInt = 4u

public val NT_D3DPS_COLOROUT_MAX_V2_1: UInt = 4u

public val NT_D3DPS_COLOROUT_MAX_V3_0: UInt = 4u

public val NT_D3DPS_CONSTBOOLREG_MAX_SW_DX9: UInt = 2048u

public val NT_D3DPS_CONSTBOOLREG_MAX_V2_1: UInt = 16u

public val NT_D3DPS_CONSTBOOLREG_MAX_V3_0: UInt = 16u

public val NT_D3DPS_CONSTINTREG_MAX_SW_DX9: UInt = 2048u

public val NT_D3DPS_CONSTINTREG_MAX_V2_1: UInt = 16u

public val NT_D3DPS_CONSTINTREG_MAX_V3_0: UInt = 16u

public val NT_D3DPS_CONSTREG_MAX_DX8: UInt = 8u

public val NT_D3DPS_CONSTREG_MAX_SW_DX9: UInt = 8192u

public val NT_D3DPS_CONSTREG_MAX_V1_1: UInt = 8u

public val NT_D3DPS_CONSTREG_MAX_V1_2: UInt = 8u

public val NT_D3DPS_CONSTREG_MAX_V1_3: UInt = 8u

public val NT_D3DPS_CONSTREG_MAX_V1_4: UInt = 8u

public val NT_D3DPS_CONSTREG_MAX_V2_0: UInt = 32u

public val NT_D3DPS_CONSTREG_MAX_V2_1: UInt = 32u

public val NT_D3DPS_CONSTREG_MAX_V3_0: UInt = 224u

public val NT_D3DPS_INPUTREG_MAX_DX8: UInt = 8u

public val NT_D3DPS_INPUTREG_MAX_V1_1: UInt = 2u

public val NT_D3DPS_INPUTREG_MAX_V1_2: UInt = 2u

public val NT_D3DPS_INPUTREG_MAX_V1_3: UInt = 2u

public val NT_D3DPS_INPUTREG_MAX_V1_4: UInt = 2u

public val NT_D3DPS_INPUTREG_MAX_V2_0: UInt = 2u

public val NT_D3DPS_INPUTREG_MAX_V2_1: UInt = 2u

public val NT_D3DPS_INPUTREG_MAX_V3_0: UInt = 12u

public val NT_D3DPS_MAXLOOPINITVALUE_V2_1: UInt = 255u

public val NT_D3DPS_MAXLOOPINITVALUE_V3_0: UInt = 255u

public val NT_D3DPS_MAXLOOPITERATIONCOUNT_V2_1: UInt = 255u

public val NT_D3DPS_MAXLOOPITERATIONCOUNT_V3_0: UInt = 255u

public val NT_D3DPS_MAXLOOPSTEP_V2_1: UInt = 128u

public val NT_D3DPS_MAXLOOPSTEP_V3_0: UInt = 128u

public val NT_D3DPS_PREDICATE_MAX_V2_1: UInt = 1u

public val NT_D3DPS_PREDICATE_MAX_V3_0: UInt = 1u

public val NT_D3DPS_TEMPREG_MAX_DX8: UInt = 8u

public val NT_D3DPS_TEMPREG_MAX_V1_1: UInt = 2u

public val NT_D3DPS_TEMPREG_MAX_V1_2: UInt = 2u

public val NT_D3DPS_TEMPREG_MAX_V1_3: UInt = 2u

public val NT_D3DPS_TEMPREG_MAX_V1_4: UInt = 6u

public val NT_D3DPS_TEMPREG_MAX_V2_0: UInt = 12u

public val NT_D3DPS_TEMPREG_MAX_V2_1: UInt = 32u

public val NT_D3DPS_TEMPREG_MAX_V3_0: UInt = 32u

public val NT_D3DPS_TEXTUREREG_MAX_DX8: UInt = 8u

public val NT_D3DPS_TEXTUREREG_MAX_V1_1: UInt = 4u

public val NT_D3DPS_TEXTUREREG_MAX_V1_2: UInt = 4u

public val NT_D3DPS_TEXTUREREG_MAX_V1_3: UInt = 4u

public val NT_D3DPS_TEXTUREREG_MAX_V1_4: UInt = 6u

public val NT_D3DPS_TEXTUREREG_MAX_V2_0: UInt = 8u

public val NT_D3DPS_TEXTUREREG_MAX_V2_1: UInt = 8u

public val NT_D3DPS_TEXTUREREG_MAX_V3_0: UInt = 0u

public val NT_D3DRS_DELETERTPATCH: UInt = 169u

public val NT_D3DVS_ADDRREG_MAX_V1_1: UInt = 1u

public val NT_D3DVS_ADDRREG_MAX_V2_0: UInt = 1u

public val NT_D3DVS_ADDRREG_MAX_V2_1: UInt = 1u

public val NT_D3DVS_ADDRREG_MAX_V3_0: UInt = 1u

public val NT_D3DVS_ATTROUTREG_MAX_V1_1: UInt = 2u

public val NT_D3DVS_ATTROUTREG_MAX_V2_0: UInt = 2u

public val NT_D3DVS_ATTROUTREG_MAX_V2_1: UInt = 2u

public val NT_D3DVS_CONSTBOOLREG_MAX_SW_DX9: UInt = 2048u

public val NT_D3DVS_CONSTBOOLREG_MAX_V2_0: UInt = 16u

public val NT_D3DVS_CONSTBOOLREG_MAX_V2_1: UInt = 16u

public val NT_D3DVS_CONSTBOOLREG_MAX_V3_0: UInt = 16u

public val NT_D3DVS_CONSTINTREG_MAX_SW_DX9: UInt = 2048u

public val NT_D3DVS_CONSTINTREG_MAX_V2_0: UInt = 16u

public val NT_D3DVS_CONSTINTREG_MAX_V2_1: UInt = 16u

public val NT_D3DVS_CONSTINTREG_MAX_V3_0: UInt = 16u

public val NT_D3DVS_CONSTREG_MAX_V1_1: UInt = 96u

public val NT_D3DVS_CONSTREG_MAX_V2_0: UInt = 8192u

public val NT_D3DVS_CONSTREG_MAX_V2_1: UInt = 8192u

public val NT_D3DVS_CONSTREG_MAX_V3_0: UInt = 8192u

public val NT_D3DVS_INPUTREG_MAX_V1_1: UInt = 16u

public val NT_D3DVS_INPUTREG_MAX_V2_0: UInt = 16u

public val NT_D3DVS_INPUTREG_MAX_V2_1: UInt = 16u

public val NT_D3DVS_INPUTREG_MAX_V3_0: UInt = 16u

public val NT_D3DVS_LABEL_MAX_V3_0: UInt = 2048u

public val NT_D3DVS_MAXINSTRUCTIONCOUNT_V1_1: UInt = 128u

public val NT_D3DVS_MAXLOOPINITVALUE_V2_0: UInt = 255u

public val NT_D3DVS_MAXLOOPINITVALUE_V2_1: UInt = 255u

public val NT_D3DVS_MAXLOOPINITVALUE_V3_0: UInt = 255u

public val NT_D3DVS_MAXLOOPITERATIONCOUNT_V2_0: UInt = 255u

public val NT_D3DVS_MAXLOOPITERATIONCOUNT_V2_1: UInt = 255u

public val NT_D3DVS_MAXLOOPITERATIONCOUNT_V3_0: UInt = 255u

public val NT_D3DVS_MAXLOOPSTEP_V2_0: UInt = 128u

public val NT_D3DVS_MAXLOOPSTEP_V2_1: UInt = 128u

public val NT_D3DVS_MAXLOOPSTEP_V3_0: UInt = 128u

public val NT_D3DVS_OUTPUTREG_MAX_SW_DX9: UInt = 16u

public val NT_D3DVS_OUTPUTREG_MAX_V3_0: UInt = 12u

public val NT_D3DVS_PREDICATE_MAX_V2_1: UInt = 1u

public val NT_D3DVS_PREDICATE_MAX_V3_0: UInt = 1u

public val NT_D3DVS_TCRDOUTREG_MAX_V1_1: UInt = 8u

public val NT_D3DVS_TCRDOUTREG_MAX_V2_0: UInt = 8u

public val NT_D3DVS_TCRDOUTREG_MAX_V2_1: UInt = 8u

public val NT_D3DVS_TEMPREG_MAX_V1_1: UInt = 12u

public val NT_D3DVS_TEMPREG_MAX_V2_0: UInt = 12u

public val NT_D3DVS_TEMPREG_MAX_V2_1: UInt = 32u

public val NT_D3DVS_TEMPREG_MAX_V3_0: UInt = 32u

public val NT_RTPATCHFLAG_HASINFO: Int = 2

public val NT_RTPATCHFLAG_HASSEGS: Int = 1
