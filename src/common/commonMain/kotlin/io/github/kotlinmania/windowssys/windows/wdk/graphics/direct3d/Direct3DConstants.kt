package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val D3DCLEAR_COMPUTERECTS: Int = 8

public val D3DDDIFMT_A1: D3dddiformat = 118u

public val D3DDDIFMT_A16B16G16R16: D3dddiformat = 36u

public val D3DDDIFMT_A16B16G16R16F: D3dddiformat = 113u

public val D3DDDIFMT_A1R5G5B5: D3dddiformat = 25u

public val D3DDDIFMT_A2B10G10R10: D3dddiformat = 31u

public val D3DDDIFMT_A2B10G10R10_XR_BIAS: D3dddiformat = 119u

public val D3DDDIFMT_A2R10G10B10: D3dddiformat = 35u

public val D3DDDIFMT_A2W10V10U10: D3dddiformat = 67u

public val D3DDDIFMT_A32B32G32R32F: D3dddiformat = 116u

public val D3DDDIFMT_A4L4: D3dddiformat = 52u

public val D3DDDIFMT_A4R4G4B4: D3dddiformat = 26u

public val D3DDDIFMT_A8: D3dddiformat = 28u

public val D3DDDIFMT_A8B8G8R8: D3dddiformat = 32u

public val D3DDDIFMT_A8L8: D3dddiformat = 51u

public val D3DDDIFMT_A8P8: D3dddiformat = 40u

public val D3DDDIFMT_A8R3G3B2: D3dddiformat = 29u

public val D3DDDIFMT_A8R8G8B8: D3dddiformat = 21u

public val D3DDDIFMT_BINARYBUFFER: D3dddiformat = 199u

public val D3DDDIFMT_BITSTREAMDATA: D3dddiformat = 156u

public val D3DDDIFMT_CX_V8U8: D3dddiformat = 117u

public val D3DDDIFMT_D15S1: D3dddiformat = 73u

public val D3DDDIFMT_D16: D3dddiformat = 80u

public val D3DDDIFMT_D16_LOCKABLE: D3dddiformat = 70u

public val D3DDDIFMT_D24FS8: D3dddiformat = 83u

public val D3DDDIFMT_D24S8: D3dddiformat = 75u

public val D3DDDIFMT_D24X4S4: D3dddiformat = 79u

public val D3DDDIFMT_D24X8: D3dddiformat = 77u

public val D3DDDIFMT_D32: D3dddiformat = 71u

public val D3DDDIFMT_D32F_LOCKABLE: D3dddiformat = 82u

public val D3DDDIFMT_D32_LOCKABLE: D3dddiformat = 84u

public val D3DDDIFMT_DEBLOCKINGDATA: D3dddiformat = 153u

public val D3DDDIFMT_DXT1: D3dddiformat = 827611204u

public val D3DDDIFMT_DXT2: D3dddiformat = 844388420u

public val D3DDDIFMT_DXT3: D3dddiformat = 861165636u

public val D3DDDIFMT_DXT4: D3dddiformat = 877942852u

public val D3DDDIFMT_DXT5: D3dddiformat = 894720068u

public val D3DDDIFMT_DXVACOMPBUFFER_BASE: D3dddiformat = 150u

public val D3DDDIFMT_DXVACOMPBUFFER_MAX: D3dddiformat = 181u

public val D3DDDIFMT_DXVA_RESERVED10: D3dddiformat = 160u

public val D3DDDIFMT_DXVA_RESERVED11: D3dddiformat = 161u

public val D3DDDIFMT_DXVA_RESERVED12: D3dddiformat = 162u

public val D3DDDIFMT_DXVA_RESERVED13: D3dddiformat = 163u

public val D3DDDIFMT_DXVA_RESERVED14: D3dddiformat = 164u

public val D3DDDIFMT_DXVA_RESERVED15: D3dddiformat = 165u

public val D3DDDIFMT_DXVA_RESERVED16: D3dddiformat = 166u

public val D3DDDIFMT_DXVA_RESERVED17: D3dddiformat = 167u

public val D3DDDIFMT_DXVA_RESERVED18: D3dddiformat = 168u

public val D3DDDIFMT_DXVA_RESERVED19: D3dddiformat = 169u

public val D3DDDIFMT_DXVA_RESERVED20: D3dddiformat = 170u

public val D3DDDIFMT_DXVA_RESERVED21: D3dddiformat = 171u

public val D3DDDIFMT_DXVA_RESERVED22: D3dddiformat = 172u

public val D3DDDIFMT_DXVA_RESERVED23: D3dddiformat = 173u

public val D3DDDIFMT_DXVA_RESERVED24: D3dddiformat = 174u

public val D3DDDIFMT_DXVA_RESERVED25: D3dddiformat = 175u

public val D3DDDIFMT_DXVA_RESERVED26: D3dddiformat = 176u

public val D3DDDIFMT_DXVA_RESERVED27: D3dddiformat = 177u

public val D3DDDIFMT_DXVA_RESERVED28: D3dddiformat = 178u

public val D3DDDIFMT_DXVA_RESERVED29: D3dddiformat = 179u

public val D3DDDIFMT_DXVA_RESERVED30: D3dddiformat = 180u

public val D3DDDIFMT_DXVA_RESERVED31: D3dddiformat = 181u

public val D3DDDIFMT_DXVA_RESERVED9: D3dddiformat = 159u

public val D3DDDIFMT_FILMGRAINBUFFER: D3dddiformat = 158u

public val D3DDDIFMT_G16R16: D3dddiformat = 34u

public val D3DDDIFMT_G16R16F: D3dddiformat = 112u

public val D3DDDIFMT_G32R32F: D3dddiformat = 115u

public val D3DDDIFMT_G8R8: D3dddiformat = 91u

public val D3DDDIFMT_G8R8_G8B8: D3dddiformat = 1111970375u

public val D3DDDIFMT_INDEX16: D3dddiformat = 101u

public val D3DDDIFMT_INDEX32: D3dddiformat = 102u

public val D3DDDIFMT_INVERSEQUANTIZATIONDATA: D3dddiformat = 154u

public val D3DDDIFMT_L16: D3dddiformat = 81u

public val D3DDDIFMT_L6V5U5: D3dddiformat = 61u

public val D3DDDIFMT_L8: D3dddiformat = 50u

public val D3DDDIFMT_MACROBLOCKDATA: D3dddiformat = 151u

public val D3DDDIFMT_MOTIONVECTORBUFFER: D3dddiformat = 157u

public val D3DDDIFMT_MULTI2_ARGB8: D3dddiformat = 827606349u

public val D3DDDIFMT_P8: D3dddiformat = 41u

public val D3DDDIFMT_PICTUREPARAMSDATA: D3dddiformat = 150u

public val D3DDDIFMT_Q16W16V16U16: D3dddiformat = 110u

public val D3DDDIFMT_Q8W8V8U8: D3dddiformat = 63u

public val D3DDDIFMT_R16F: D3dddiformat = 111u

public val D3DDDIFMT_R32F: D3dddiformat = 114u

public val D3DDDIFMT_R3G3B2: D3dddiformat = 27u

public val D3DDDIFMT_R5G6B5: D3dddiformat = 23u

public val D3DDDIFMT_R8: D3dddiformat = 92u

public val D3DDDIFMT_R8G8B8: D3dddiformat = 20u

public val D3DDDIFMT_R8G8_B8G8: D3dddiformat = 1195525970u

public val D3DDDIFMT_RESIDUALDIFFERENCEDATA: D3dddiformat = 152u

public val D3DDDIFMT_S1D15: D3dddiformat = 72u

public val D3DDDIFMT_S8D24: D3dddiformat = 74u

public val D3DDDIFMT_S8_LOCKABLE: D3dddiformat = 85u

public val D3DDDIFMT_SLICECONTROLDATA: D3dddiformat = 155u

public val D3DDDIFMT_UNKNOWN: D3dddiformat = 0u

public val D3DDDIFMT_UYVY: D3dddiformat = 1498831189u

public val D3DDDIFMT_V16U16: D3dddiformat = 64u

public val D3DDDIFMT_V8U8: D3dddiformat = 60u

public val D3DDDIFMT_VERTEXDATA: D3dddiformat = 100u

public val D3DDDIFMT_W11V11U10: D3dddiformat = 65u

public val D3DDDIFMT_X1R5G5B5: D3dddiformat = 24u

public val D3DDDIFMT_X4R4G4B4: D3dddiformat = 30u

public val D3DDDIFMT_X4S4D24: D3dddiformat = 78u

public val D3DDDIFMT_X8B8G8R8: D3dddiformat = 33u

public val D3DDDIFMT_X8D24: D3dddiformat = 76u

public val D3DDDIFMT_X8L8V8U8: D3dddiformat = 62u

public val D3DDDIFMT_X8R8G8B8: D3dddiformat = 22u

public val D3DDDIFMT_YUY2: D3dddiformat = 844715353u

public val D3DDDIGPUVIRTUALADDRESS_RESERVE_NO_ACCESS: D3dddigpuvirtualaddressReservationType = 0

public val D3DDDIGPUVIRTUALADDRESS_RESERVE_NO_COMMIT: D3dddigpuvirtualaddressReservationType = 2

public val D3DDDIGPUVIRTUALADDRESS_RESERVE_ZERO: D3dddigpuvirtualaddressReservationType = 1

public val D3DDDIMULTISAMPLE_10_SAMPLES: D3dddimultisampleType = 10

public val D3DDDIMULTISAMPLE_11_SAMPLES: D3dddimultisampleType = 11

public val D3DDDIMULTISAMPLE_12_SAMPLES: D3dddimultisampleType = 12

public val D3DDDIMULTISAMPLE_13_SAMPLES: D3dddimultisampleType = 13

public val D3DDDIMULTISAMPLE_14_SAMPLES: D3dddimultisampleType = 14

public val D3DDDIMULTISAMPLE_15_SAMPLES: D3dddimultisampleType = 15

public val D3DDDIMULTISAMPLE_16_SAMPLES: D3dddimultisampleType = 16

public val D3DDDIMULTISAMPLE_2_SAMPLES: D3dddimultisampleType = 2

public val D3DDDIMULTISAMPLE_3_SAMPLES: D3dddimultisampleType = 3

public val D3DDDIMULTISAMPLE_4_SAMPLES: D3dddimultisampleType = 4

public val D3DDDIMULTISAMPLE_5_SAMPLES: D3dddimultisampleType = 5

public val D3DDDIMULTISAMPLE_6_SAMPLES: D3dddimultisampleType = 6

public val D3DDDIMULTISAMPLE_7_SAMPLES: D3dddimultisampleType = 7

public val D3DDDIMULTISAMPLE_8_SAMPLES: D3dddimultisampleType = 8

public val D3DDDIMULTISAMPLE_9_SAMPLES: D3dddimultisampleType = 9

public val D3DDDIMULTISAMPLE_NONE: D3dddimultisampleType = 0

public val D3DDDIMULTISAMPLE_NONMASKABLE: D3dddimultisampleType = 1

public val D3DDDIPOOL_LOCALVIDMEM: D3dddiPool = 3

public val D3DDDIPOOL_NONLOCALVIDMEM: D3dddiPool = 4

public val D3DDDIPOOL_STAGINGMEM: D3dddiPool = 5

public val D3DDDIPOOL_SYSTEMMEM: D3dddiPool = 1

public val D3DDDIPOOL_VIDEOMEMORY: D3dddiPool = 2

public val D3DDDI_ALLOCATIONPRIORITY_HIGH: UInt = 2684354560u

public val D3DDDI_ALLOCATIONPRIORITY_LOW: UInt = 1342177280u

public val D3DDDI_ALLOCATIONPRIORITY_MAXIMUM: UInt = 3355443200u

public val D3DDDI_ALLOCATIONPRIORITY_MINIMUM: UInt = 671088640u

public val D3DDDI_ALLOCATIONPRIORITY_NORMAL: UInt = 2013265920u

public val D3DDDI_COLOR_SPACE_CUSTOM: D3dddiColorSpaceType = -1

public val D3DDDI_COLOR_SPACE_RESERVED: D3dddiColorSpaceType = 4

public val D3DDDI_COLOR_SPACE_RGB_FULL_G10_NONE_P709: D3dddiColorSpaceType = 1

public val D3DDDI_COLOR_SPACE_RGB_FULL_G2084_NONE_P2020: D3dddiColorSpaceType = 12

public val D3DDDI_COLOR_SPACE_RGB_FULL_G22_NONE_P2020: D3dddiColorSpaceType = 17

public val D3DDDI_COLOR_SPACE_RGB_FULL_G22_NONE_P709: D3dddiColorSpaceType = 0

public val D3DDDI_COLOR_SPACE_RGB_STUDIO_G2084_NONE_P2020: D3dddiColorSpaceType = 14

public val D3DDDI_COLOR_SPACE_RGB_STUDIO_G22_NONE_P2020: D3dddiColorSpaceType = 3

public val D3DDDI_COLOR_SPACE_RGB_STUDIO_G22_NONE_P709: D3dddiColorSpaceType = 2

public val D3DDDI_COLOR_SPACE_RGB_STUDIO_G24_NONE_P2020: D3dddiColorSpaceType = 21

public val D3DDDI_COLOR_SPACE_RGB_STUDIO_G24_NONE_P709: D3dddiColorSpaceType = 20

public val D3DDDI_COLOR_SPACE_YCBCR_FULL_G22_LEFT_P2020: D3dddiColorSpaceType = 11

public val D3DDDI_COLOR_SPACE_YCBCR_FULL_G22_LEFT_P601: D3dddiColorSpaceType = 7

public val D3DDDI_COLOR_SPACE_YCBCR_FULL_G22_LEFT_P709: D3dddiColorSpaceType = 9

public val D3DDDI_COLOR_SPACE_YCBCR_FULL_G22_NONE_P709_X601: D3dddiColorSpaceType = 5

public val D3DDDI_COLOR_SPACE_YCBCR_FULL_GHLG_TOPLEFT_P2020: D3dddiColorSpaceType = 19

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G2084_LEFT_P2020: D3dddiColorSpaceType = 13

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G2084_TOPLEFT_P2020: D3dddiColorSpaceType = 16

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G22_LEFT_P2020: D3dddiColorSpaceType = 10

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G22_LEFT_P601: D3dddiColorSpaceType = 6

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G22_LEFT_P709: D3dddiColorSpaceType = 8

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G22_TOPLEFT_P2020: D3dddiColorSpaceType = 15

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G24_LEFT_P2020: D3dddiColorSpaceType = 23

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G24_LEFT_P709: D3dddiColorSpaceType = 22

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_G24_TOPLEFT_P2020: D3dddiColorSpaceType = 24

public val D3DDDI_COLOR_SPACE_YCBCR_STUDIO_GHLG_TOPLEFT_P2020: D3dddiColorSpaceType = 18

public val D3DDDI_CPU_NOTIFICATION: D3dddiSynchronizationobjectType = 4

public val D3DDDI_DOORBELLSTATUS_CONNECTED: D3dddiDoorbellstatus = 0

public val D3DDDI_DOORBELLSTATUS_CONNECTED_NOTIFY_KMD: D3dddiDoorbellstatus = 1

public val D3DDDI_DOORBELLSTATUS_DISCONNECTED_ABORT: D3dddiDoorbellstatus = 3

public val D3DDDI_DOORBELLSTATUS_DISCONNECTED_RETRY: D3dddiDoorbellstatus = 2

public val D3DDDI_DOORBELL_PRIVATEDATA_MAX_BYTES_WDDM3_1: UInt = 16u

public val D3DDDI_DRIVERESCAPETYPE_CPUEVENTUSAGE: D3dddiDriverescapetype = 2

public val D3DDDI_DRIVERESCAPETYPE_MAX: D3dddiDriverescapetype = 3

public val D3DDDI_DRIVERESCAPETYPE_TRANSLATEALLOCATIONHANDLE: D3dddiDriverescapetype = 0

public val D3DDDI_DRIVERESCAPETYPE_TRANSLATERESOURCEHANDLE: D3dddiDriverescapetype = 1

public val D3DDDI_FENCE: D3dddiSynchronizationobjectType = 3

public val D3DDDI_FLIPINTERVAL_FOUR: D3dddiFlipintervalType = 4

public val D3DDDI_FLIPINTERVAL_IMMEDIATE: D3dddiFlipintervalType = 0

public val D3DDDI_FLIPINTERVAL_IMMEDIATE_ALLOW_TEARING: D3dddiFlipintervalType = 5

public val D3DDDI_FLIPINTERVAL_ONE: D3dddiFlipintervalType = 1

public val D3DDDI_FLIPINTERVAL_THREE: D3dddiFlipintervalType = 3

public val D3DDDI_FLIPINTERVAL_TWO: D3dddiFlipintervalType = 2

public val D3DDDI_GAMMARAMP_DEFAULT: D3dddiGammarampType = 1

public val D3DDDI_GAMMARAMP_DXGI_1: D3dddiGammarampType = 3

public val D3DDDI_GAMMARAMP_MATRIX_3X4: D3dddiGammarampType = 4

public val D3DDDI_GAMMARAMP_MATRIX_V2: D3dddiGammarampType = 5

public val D3DDDI_GAMMARAMP_RGB256X3X16: D3dddiGammarampType = 2

public val D3DDDI_GAMMARAMP_UNINITIALIZED: D3dddiGammarampType = 0

public val D3DDDI_HDR_METADATA_TYPE_HDR10: D3dddiHdrMetadataType = 1

public val D3DDDI_HDR_METADATA_TYPE_HDR10PLUS: D3dddiHdrMetadataType = 2

public val D3DDDI_HDR_METADATA_TYPE_NONE: D3dddiHdrMetadataType = 0

public val D3DDDI_MAX_BROADCAST_CONTEXT: UInt = 64u

public val D3DDDI_MAX_MPO_PRESENT_DIRTY_RECTS: UInt = 4095u

public val D3DDDI_MAX_OBJECT_SIGNALED: UInt = 32u

public val D3DDDI_MAX_OBJECT_WAITED_ON: UInt = 32u

public val D3DDDI_MAX_WRITTEN_PRIMARIES: UInt = 16u

public val D3DDDI_MONITORED_FENCE: D3dddiSynchronizationobjectType = 5

public val D3DDDI_OFFER_PRIORITY_AUTO: D3dddiOfferPriority = 4

public val D3DDDI_OFFER_PRIORITY_HIGH: D3dddiOfferPriority = 3

public val D3DDDI_OFFER_PRIORITY_LOW: D3dddiOfferPriority = 1

public val D3DDDI_OFFER_PRIORITY_NONE: D3dddiOfferPriority = 0

public val D3DDDI_OFFER_PRIORITY_NORMAL: D3dddiOfferPriority = 2

public val D3DDDI_OUTPUT_WIRE_COLOR_SPACE_G2084_P2020: D3dddiOutputWireColorSpaceType = 12

public val D3DDDI_OUTPUT_WIRE_COLOR_SPACE_G2084_P2020_DVLL: D3dddiOutputWireColorSpaceType = 33

public val D3DDDI_OUTPUT_WIRE_COLOR_SPACE_G2084_P2020_HDR10PLUS: D3dddiOutputWireColorSpaceType = 32

public val D3DDDI_OUTPUT_WIRE_COLOR_SPACE_G22_P2020: D3dddiOutputWireColorSpaceType = 31

public val D3DDDI_OUTPUT_WIRE_COLOR_SPACE_G22_P709: D3dddiOutputWireColorSpaceType = 0

public val D3DDDI_OUTPUT_WIRE_COLOR_SPACE_G22_P709_WCG: D3dddiOutputWireColorSpaceType = 30

public val D3DDDI_OUTPUT_WIRE_COLOR_SPACE_RESERVED: D3dddiOutputWireColorSpaceType = 4

public val D3DDDI_PAGINGQUEUE_PRIORITY_ABOVE_NORMAL: D3dddiPagingqueuePriority = 1

public val D3DDDI_PAGINGQUEUE_PRIORITY_BELOW_NORMAL: D3dddiPagingqueuePriority = -1

public val D3DDDI_PAGINGQUEUE_PRIORITY_NORMAL: D3dddiPagingqueuePriority = 0

public val D3DDDI_PERIODIC_MONITORED_FENCE: D3dddiSynchronizationobjectType = 6

public val D3DDDI_QUERYREGISTRY_ADAPTERKEY: D3dddiQueryregistryType = 1

public val D3DDDI_QUERYREGISTRY_DRIVERIMAGEPATH: D3dddiQueryregistryType = 3

public val D3DDDI_QUERYREGISTRY_DRIVERSTOREPATH: D3dddiQueryregistryType = 2

public val D3DDDI_QUERYREGISTRY_MAX: D3dddiQueryregistryType = 4

public val D3DDDI_QUERYREGISTRY_SERVICEKEY: D3dddiQueryregistryType = 0

public val D3DDDI_QUERYREGISTRY_STATUS_BUFFER_OVERFLOW: D3dddiQueryregistryStatus = 1

public val D3DDDI_QUERYREGISTRY_STATUS_FAIL: D3dddiQueryregistryStatus = 2

public val D3DDDI_QUERYREGISTRY_STATUS_MAX: D3dddiQueryregistryStatus = 3

public val D3DDDI_QUERYREGISTRY_STATUS_SUCCESS: D3dddiQueryregistryStatus = 0

public val D3DDDI_RECLAIM_RESULT_DISCARDED: D3dddiReclaimResult = 1

public val D3DDDI_RECLAIM_RESULT_NOT_COMMITTED: D3dddiReclaimResult = 2

public val D3DDDI_RECLAIM_RESULT_OK: D3dddiReclaimResult = 0

public val D3DDDI_ROTATION_180: D3dddiRotation = 3

public val D3DDDI_ROTATION_270: D3dddiRotation = 4

public val D3DDDI_ROTATION_90: D3dddiRotation = 2

public val D3DDDI_ROTATION_IDENTITY: D3dddiRotation = 1

public val D3DDDI_SCANLINEORDERING_INTERLACED: D3dddiScanlineordering = 2

public val D3DDDI_SCANLINEORDERING_PROGRESSIVE: D3dddiScanlineordering = 1

public val D3DDDI_SCANLINEORDERING_UNKNOWN: D3dddiScanlineordering = 0

public val D3DDDI_SEMAPHORE: D3dddiSynchronizationobjectType = 2

public val D3DDDI_SYNCHRONIZATION_MUTEX: D3dddiSynchronizationobjectType = 1

public val D3DDDI_SYNCHRONIZATION_TYPE_LIMIT: D3dddiSynchronizationobjectType = 7

public val D3DDDI_SYNC_OBJECT_SIGNAL: UInt = 2u

public val D3DDDI_SYNC_OBJECT_WAIT: UInt = 1u

public val D3DDDI_UPDATEGPUVIRTUALADDRESS_COPY: D3dddiUpdategpuvirtualaddressOperationType = 2

public val D3DDDI_UPDATEGPUVIRTUALADDRESS_MAP: D3dddiUpdategpuvirtualaddressOperationType = 0

public val D3DDDI_UPDATEGPUVIRTUALADDRESS_MAP_PROTECT: D3dddiUpdategpuvirtualaddressOperationType = 3

public val D3DDDI_UPDATEGPUVIRTUALADDRESS_UNMAP: D3dddiUpdategpuvirtualaddressOperationType = 1

public val D3DDDI_VSSLO_INTERLACED_LOWERFIELDFIRST: D3dddiVideoSignalScanlineOrdering = 3

public val D3DDDI_VSSLO_INTERLACED_UPPERFIELDFIRST: D3dddiVideoSignalScanlineOrdering = 2

public val D3DDDI_VSSLO_OTHER: D3dddiVideoSignalScanlineOrdering = 255

public val D3DDDI_VSSLO_PROGRESSIVE: D3dddiVideoSignalScanlineOrdering = 1

public val D3DDDI_VSSLO_UNINITIALIZED: D3dddiVideoSignalScanlineOrdering = 0

public val D3DDEVCAPS_HWINDEXBUFFER: Int = 67108864

public val D3DDEVCAPS_HWVERTEXBUFFER: Int = 33554432

public val D3DDEVCAPS_SUBVOLUMELOCK: Int = 134217728

public val D3DDEVINFOID_VCACHE: UInt = 4u

public val D3DDP2OP_ADDDIRTYBOX: D3dhalDp2operation = 67

public val D3DDP2OP_ADDDIRTYRECT: D3dhalDp2operation = 66

public val D3DDP2OP_BLT: D3dhalDp2operation = 81

public val D3DDP2OP_BUFFERBLT: D3dhalDp2operation = 64

public val D3DDP2OP_CLEAR: D3dhalDp2operation = 42

public val D3DDP2OP_CLIPPEDTRIANGLEFAN: D3dhalDp2operation = 58

public val D3DDP2OP_COLORFILL: D3dhalDp2operation = 82

public val D3DDP2OP_COMPOSERECTS: D3dhalDp2operation = 98

public val D3DDP2OP_CREATELIGHT: D3dhalDp2operation = 35

public val D3DDP2OP_CREATEPIXELSHADER: D3dhalDp2operation = 54

public val D3DDP2OP_CREATEQUERY: D3dhalDp2operation = 84

public val D3DDP2OP_CREATEVERTEXSHADER: D3dhalDp2operation = 45

public val D3DDP2OP_CREATEVERTEXSHADERDECL: D3dhalDp2operation = 71

public val D3DDP2OP_CREATEVERTEXSHADERFUNC: D3dhalDp2operation = 74

public val D3DDP2OP_DELETEPIXELSHADER: D3dhalDp2operation = 55

public val D3DDP2OP_DELETEQUERY: D3dhalDp2operation = 90

public val D3DDP2OP_DELETEVERTEXSHADER: D3dhalDp2operation = 46

public val D3DDP2OP_DELETEVERTEXSHADERDECL: D3dhalDp2operation = 72

public val D3DDP2OP_DELETEVERTEXSHADERFUNC: D3dhalDp2operation = 75

public val D3DDP2OP_DRAWINDEXEDPRIMITIVE: D3dhalDp2operation = 53

public val D3DDP2OP_DRAWINDEXEDPRIMITIVE2: D3dhalDp2operation = 60

public val D3DDP2OP_DRAWPRIMITIVE: D3dhalDp2operation = 52

public val D3DDP2OP_DRAWPRIMITIVE2: D3dhalDp2operation = 59

public val D3DDP2OP_DRAWRECTPATCH: D3dhalDp2operation = 61

public val D3DDP2OP_DRAWTRIPATCH: D3dhalDp2operation = 62

public val D3DDP2OP_GENERATEMIPSUBLEVELS: D3dhalDp2operation = 89

public val D3DDP2OP_INDEXEDLINELIST: D3dhalDp2operation = 2

public val D3DDP2OP_INDEXEDLINELIST2: D3dhalDp2operation = 27

public val D3DDP2OP_INDEXEDLINESTRIP: D3dhalDp2operation = 17

public val D3DDP2OP_INDEXEDTRIANGLEFAN: D3dhalDp2operation = 22

public val D3DDP2OP_INDEXEDTRIANGLELIST: D3dhalDp2operation = 3

public val D3DDP2OP_INDEXEDTRIANGLELIST2: D3dhalDp2operation = 26

public val D3DDP2OP_INDEXEDTRIANGLESTRIP: D3dhalDp2operation = 20

public val D3DDP2OP_ISSUEQUERY: D3dhalDp2operation = 91

public val D3DDP2OP_LINELIST: D3dhalDp2operation = 15

public val D3DDP2OP_LINELIST_IMM: D3dhalDp2operation = 24

public val D3DDP2OP_LINESTRIP: D3dhalDp2operation = 16

public val D3DDP2OP_MULTIPLYTRANSFORM: D3dhalDp2operation = 65

public val D3DDP2OP_POINTS: D3dhalDp2operation = 1

public val D3DDP2OP_RENDERSTATE: D3dhalDp2operation = 8

public val D3DDP2OP_RESPONSECONTINUE: D3dhalDp2operation = 87

public val D3DDP2OP_RESPONSEQUERY: D3dhalDp2operation = 88

public val D3DDP2OP_SETCLIPPLANE: D3dhalDp2operation = 44

public val D3DDP2OP_SETCONVOLUTIONKERNELMONO: D3dhalDp2operation = 97

public val D3DDP2OP_SETDEPTHSTENCIL: D3dhalDp2operation = 86

public val D3DDP2OP_SETINDICES: D3dhalDp2operation = 51

public val D3DDP2OP_SETLIGHT: D3dhalDp2operation = 34

public val D3DDP2OP_SETMATERIAL: D3dhalDp2operation = 33

public val D3DDP2OP_SETPALETTE: D3dhalDp2operation = 30

public val D3DDP2OP_SETPIXELSHADER: D3dhalDp2operation = 56

public val D3DDP2OP_SETPIXELSHADERCONST: D3dhalDp2operation = 57

public val D3DDP2OP_SETPIXELSHADERCONSTB: D3dhalDp2operation = 94

public val D3DDP2OP_SETPIXELSHADERCONSTI: D3dhalDp2operation = 93

public val D3DDP2OP_SETPRIORITY: D3dhalDp2operation = 40

public val D3DDP2OP_SETRENDERTARGET: D3dhalDp2operation = 41

public val D3DDP2OP_SETRENDERTARGET2: D3dhalDp2operation = 85

public val D3DDP2OP_SETSCISSORRECT: D3dhalDp2operation = 79

public val D3DDP2OP_SETSTREAMSOURCE: D3dhalDp2operation = 49

public val D3DDP2OP_SETSTREAMSOURCE2: D3dhalDp2operation = 80

public val D3DDP2OP_SETSTREAMSOURCEFREQ: D3dhalDp2operation = 95

public val D3DDP2OP_SETSTREAMSOURCEUM: D3dhalDp2operation = 50

public val D3DDP2OP_SETTEXLOD: D3dhalDp2operation = 43

public val D3DDP2OP_SETTRANSFORM: D3dhalDp2operation = 36

public val D3DDP2OP_SETVERTEXSHADER: D3dhalDp2operation = 47

public val D3DDP2OP_SETVERTEXSHADERCONST: D3dhalDp2operation = 48

public val D3DDP2OP_SETVERTEXSHADERCONSTB: D3dhalDp2operation = 83

public val D3DDP2OP_SETVERTEXSHADERCONSTI: D3dhalDp2operation = 77

public val D3DDP2OP_SETVERTEXSHADERDECL: D3dhalDp2operation = 73

public val D3DDP2OP_SETVERTEXSHADERFUNC: D3dhalDp2operation = 76

public val D3DDP2OP_STATESET: D3dhalDp2operation = 39

public val D3DDP2OP_SURFACEBLT: D3dhalDp2operation = 96

public val D3DDP2OP_TEXBLT: D3dhalDp2operation = 38

public val D3DDP2OP_TEXTURESTAGESTATE: D3dhalDp2operation = 25

public val D3DDP2OP_TRIANGLEFAN: D3dhalDp2operation = 21

public val D3DDP2OP_TRIANGLEFAN_IMM: D3dhalDp2operation = 23

public val D3DDP2OP_TRIANGLELIST: D3dhalDp2operation = 18

public val D3DDP2OP_TRIANGLESTRIP: D3dhalDp2operation = 19

public val D3DDP2OP_UPDATEPALETTE: D3dhalDp2operation = 31

public val D3DDP2OP_VIEWPORTINFO: D3dhalDp2operation = 28

public val D3DDP2OP_VOLUMEBLT: D3dhalDp2operation = 63

public val D3DDP2OP_WINFO: D3dhalDp2operation = 29

public val D3DDP2OP_ZRANGE: D3dhalDp2operation = 32

public val D3DFVF_FOG: Int = 8192

public val D3DGDI2_MAGIC: UInt = 4294967295u

public val D3DGDI2_TYPE_DEFERRED_AGP_AWARE: UInt = 24u

public val D3DGDI2_TYPE_DEFER_AGP_FREES: UInt = 32u

public val D3DGDI2_TYPE_DXVERSION: UInt = 4u

public val D3DGDI2_TYPE_FREE_DEFERRED_AGP: UInt = 25u

public val D3DGDI2_TYPE_GETADAPTERGROUP: UInt = 19u

public val D3DGDI2_TYPE_GETD3DCAPS8: UInt = 1u

public val D3DGDI2_TYPE_GETD3DCAPS9: UInt = 16u

public val D3DGDI2_TYPE_GETD3DQUERY: UInt = 34u

public val D3DGDI2_TYPE_GETD3DQUERYCOUNT: UInt = 33u

public val D3DGDI2_TYPE_GETDDIVERSION: UInt = 35u

public val D3DGDI2_TYPE_GETEXTENDEDMODE: UInt = 18u

public val D3DGDI2_TYPE_GETEXTENDEDMODECOUNT: UInt = 17u

public val D3DGDI2_TYPE_GETFORMAT: UInt = 3u

public val D3DGDI2_TYPE_GETFORMATCOUNT: UInt = 2u

public val D3DGDI2_TYPE_GETMULTISAMPLEQUALITYLEVELS: UInt = 22u

public val D3DGPU_NULL: UInt = 0u

public val D3DHAL2_CB32_CLEAR: Int = 2

public val D3DHAL2_CB32_DRAWONEINDEXEDPRIMITIVE: Int = 8

public val D3DHAL2_CB32_DRAWONEPRIMITIVE: Int = 4

public val D3DHAL2_CB32_DRAWPRIMITIVES: Int = 16

public val D3DHAL2_CB32_SETRENDERTARGET: Int = 1

public val D3DHAL3_CB32_CLEAR2: Int = 1

public val D3DHAL3_CB32_DRAWPRIMITIVES2: Int = 8

public val D3DHAL3_CB32_RESERVED: Int = 2

public val D3DHAL3_CB32_VALIDATETEXTURESTAGESTATE: Int = 4

public val D3DHALDP2_EXECUTEBUFFER: Int = 2

public val D3DHALDP2_REQCOMMANDBUFSIZE: Int = 32

public val D3DHALDP2_REQVERTEXBUFSIZE: Int = 16

public val D3DHALDP2_SWAPCOMMANDBUFFER: Int = 8

public val D3DHALDP2_SWAPVERTEXBUFFER: Int = 4

public val D3DHALDP2_USERMEMVERTICES: Int = 1

public val D3DHALDP2_VIDMEMCOMMANDBUF: Int = 128

public val D3DHALDP2_VIDMEMVERTEXBUF: Int = 64

public val D3DHALSTATE_GET_LIGHT: Int = 2

public val D3DHALSTATE_GET_RENDER: Int = 4

public val D3DHALSTATE_GET_TRANSFORM: Int = 1

public val D3DHAL_COL_WEIGHTS: UInt = 2u

public val D3DHAL_CONTEXT_BAD: Long = 512L

public val D3DHAL_EXECUTE_ABORT: Int = 528

public val D3DHAL_EXECUTE_NORMAL: Int = 0

public val D3DHAL_EXECUTE_OVERRIDE: Int = 1

public val D3DHAL_EXECUTE_UNHANDLED: Int = 529

public val D3DHAL_MAX_RSTATES: UInt = 256u

public val D3DHAL_MAX_RSTATES_DX6: UInt = 256u

public val D3DHAL_MAX_RSTATES_DX7: UInt = 256u

public val D3DHAL_MAX_RSTATES_DX8: UInt = 256u

public val D3DHAL_MAX_RSTATES_DX9: UInt = 256u

public val D3DHAL_MAX_TEXTURESTATES: UInt = 13u

public val D3DHAL_NUMCLIPVERTICES: UInt = 20u

public val D3DHAL_OUTOFCONTEXTS: Long = 513L

public val D3DHAL_ROW_WEIGHTS: UInt = 1u

public val D3DHAL_SAMPLER_MAXSAMP: UInt = 16u

public val D3DHAL_SAMPLER_MAXVERTEXSAMP: UInt = 4u

public val D3DHAL_SCENE_CAPTURE_END: Int = 1

public val D3DHAL_SCENE_CAPTURE_START: Int = 0

public val D3DHAL_SETLIGHT_DATA: UInt = 2u

public val D3DHAL_SETLIGHT_DISABLE: UInt = 1u

public val D3DHAL_SETLIGHT_ENABLE: UInt = 0u

public val D3DHAL_STATESETBEGIN: UInt = 0u

public val D3DHAL_STATESETCAPTURE: UInt = 4u

public val D3DHAL_STATESETCREATE: UInt = 5u

public val D3DHAL_STATESETDELETE: UInt = 2u

public val D3DHAL_STATESETEND: UInt = 1u

public val D3DHAL_STATESETEXECUTE: UInt = 3u

public val D3DHAL_TEXTURESTATEBUF_SIZE: UInt = 14u

public val D3DHAL_TSS_MAXSTAGES: UInt = 8u

public val D3DHAL_TSS_RENDERSTATEBASE: UInt = 256u

public val D3DHAL_TSS_STATESPERSTAGE: UInt = 64u

public val D3DINFINITEINSTRUCTIONS: UInt = 4294967295u

public val D3DKMDT_BITS_PER_COMPONENT_06: UInt = 1u

public val D3DKMDT_BITS_PER_COMPONENT_08: UInt = 2u

public val D3DKMDT_BITS_PER_COMPONENT_10: UInt = 4u

public val D3DKMDT_BITS_PER_COMPONENT_12: UInt = 8u

public val D3DKMDT_BITS_PER_COMPONENT_14: UInt = 16u

public val D3DKMDT_BITS_PER_COMPONENT_16: UInt = 32u

public val D3DKMDT_CB_INTENSITY: D3dkmdtColorBasis = 1

public val D3DKMDT_CB_SCRGB: D3dkmdtColorBasis = 3

public val D3DKMDT_CB_SRGB: D3dkmdtColorBasis = 2

public val D3DKMDT_CB_UNINITIALIZED: D3dkmdtColorBasis = 0

public val D3DKMDT_CB_YCBCR: D3dkmdtColorBasis = 4

public val D3DKMDT_CB_YPBPR: D3dkmdtColorBasis = 5

public val D3DKMDT_COLORSPACE_TRANSFORM_STAGE_CONTROL_BYPASS: D3dkmdtColorspaceTransformStageControl = 2

public val D3DKMDT_COLORSPACE_TRANSFORM_STAGE_CONTROL_ENABLE: D3dkmdtColorspaceTransformStageControl = 1

public val D3DKMDT_COLORSPACE_TRANSFORM_STAGE_CONTROL_NO_CHANGE: D3dkmdtColorspaceTransformStageControl = 0

public val D3DKMDT_COMPUTE_PREEMPTION_DISPATCH_BOUNDARY: D3dkmdtComputePreemptionGranularity = 200

public val D3DKMDT_COMPUTE_PREEMPTION_DMA_BUFFER_BOUNDARY: D3dkmdtComputePreemptionGranularity = 100

public val D3DKMDT_COMPUTE_PREEMPTION_NONE: D3dkmdtComputePreemptionGranularity = 0

public val D3DKMDT_COMPUTE_PREEMPTION_SHADER_BOUNDARY: D3dkmdtComputePreemptionGranularity = 500

public val D3DKMDT_COMPUTE_PREEMPTION_THREAD_BOUNDARY: D3dkmdtComputePreemptionGranularity = 400

public val D3DKMDT_COMPUTE_PREEMPTION_THREAD_GROUP_BOUNDARY: D3dkmdtComputePreemptionGranularity = 300

public val D3DKMDT_EPT_NOPIVOT: D3dkmdtEnumcofuncmodalityPivotType = 5

public val D3DKMDT_EPT_ROTATION: D3dkmdtEnumcofuncmodalityPivotType = 4

public val D3DKMDT_EPT_SCALING: D3dkmdtEnumcofuncmodalityPivotType = 3

public val D3DKMDT_EPT_UNINITIALIZED: D3dkmdtEnumcofuncmodalityPivotType = 0

public val D3DKMDT_EPT_VIDPNSOURCE: D3dkmdtEnumcofuncmodalityPivotType = 1

public val D3DKMDT_EPT_VIDPNTARGET: D3dkmdtEnumcofuncmodalityPivotType = 2

public val D3DKMDT_GDISURFACE_EXISTINGSYSMEM: D3dkmdtGdisurfacetype = 5

public val D3DKMDT_GDISURFACE_INVALID: D3dkmdtGdisurfacetype = 0

public val D3DKMDT_GDISURFACE_LOOKUPTABLE: D3dkmdtGdisurfacetype = 4

public val D3DKMDT_GDISURFACE_STAGING: D3dkmdtGdisurfacetype = 3

public val D3DKMDT_GDISURFACE_STAGING_CPUVISIBLE: D3dkmdtGdisurfacetype = 2

public val D3DKMDT_GDISURFACE_TEXTURE: D3dkmdtGdisurfacetype = 1

public val D3DKMDT_GDISURFACE_TEXTURE_CPUVISIBLE: D3dkmdtGdisurfacetype = 6

public val D3DKMDT_GDISURFACE_TEXTURE_CPUVISIBLE_CROSSADAPTER: D3dkmdtGdisurfacetype = 8

public val D3DKMDT_GDISURFACE_TEXTURE_CROSSADAPTER: D3dkmdtGdisurfacetype = 7

public val D3DKMDT_GRAPHICS_PREEMPTION_DMA_BUFFER_BOUNDARY: D3dkmdtGraphicsPreemptionGranularity = 100

public val D3DKMDT_GRAPHICS_PREEMPTION_NONE: D3dkmdtGraphicsPreemptionGranularity = 0

public val D3DKMDT_GRAPHICS_PREEMPTION_PIXEL_BOUNDARY: D3dkmdtGraphicsPreemptionGranularity = 400

public val D3DKMDT_GRAPHICS_PREEMPTION_PRIMITIVE_BOUNDARY: D3dkmdtGraphicsPreemptionGranularity = 200

public val D3DKMDT_GRAPHICS_PREEMPTION_SHADER_BOUNDARY: D3dkmdtGraphicsPreemptionGranularity = 500

public val D3DKMDT_GRAPHICS_PREEMPTION_TRIANGLE_BOUNDARY: D3dkmdtGraphicsPreemptionGranularity = 300

public val D3DKMDT_GTF_COMPLIANT: D3dkmdtGtfcompliance = 1

public val D3DKMDT_GTF_NOTCOMPLIANT: D3dkmdtGtfcompliance = 2

public val D3DKMDT_GTF_UNINITIALIZED: D3dkmdtGtfcompliance = 0

public val D3DKMDT_MACROVISION_OEMCOPYPROTECTION_SIZE: UInt = 256u

public val D3DKMDT_MAX_OVERLAYS_BITCOUNT: UInt = 2u

public val D3DKMDT_MAX_VIDPN_SOURCES_BITCOUNT: UInt = 4u

public val D3DKMDT_MCC_ENFORCE: D3dkmdtMonitorConnectivityChecks = 2

public val D3DKMDT_MCC_IGNORE: D3dkmdtMonitorConnectivityChecks = 1

public val D3DKMDT_MCC_UNINITIALIZED: D3dkmdtMonitorConnectivityChecks = 0

public val D3DKMDT_MCO_DEFAULTMONITORPROFILE: D3dkmdtMonitorCapabilitiesOrigin = 1

public val D3DKMDT_MCO_DRIVER: D3dkmdtMonitorCapabilitiesOrigin = 5

public val D3DKMDT_MCO_MONITORDESCRIPTOR: D3dkmdtMonitorCapabilitiesOrigin = 2

public val D3DKMDT_MCO_MONITORDESCRIPTOR_REGISTRYOVERRIDE: D3dkmdtMonitorCapabilitiesOrigin = 3

public val D3DKMDT_MCO_SPECIFICCAP_REGISTRYOVERRIDE: D3dkmdtMonitorCapabilitiesOrigin = 4

public val D3DKMDT_MCO_UNINITIALIZED: D3dkmdtMonitorCapabilitiesOrigin = 0

public val D3DKMDT_MDT_OTHER: D3dkmdtMonitorDescriptorType = 255

public val D3DKMDT_MDT_UNINITIALIZED: D3dkmdtMonitorDescriptorType = 0

public val D3DKMDT_MDT_VESA_EDID_V1_BASEBLOCK: D3dkmdtMonitorDescriptorType = 1

public val D3DKMDT_MDT_VESA_EDID_V1_BLOCKMAP: D3dkmdtMonitorDescriptorType = 2

public val D3DKMDT_MFRC_ACTIVESIZE: D3dkmdtMonitorFrequencyRangeConstraint = 1

public val D3DKMDT_MFRC_MAXPIXELRATE: D3dkmdtMonitorFrequencyRangeConstraint = 2

public val D3DKMDT_MFRC_UNINITIALIZED: D3dkmdtMonitorFrequencyRangeConstraint = 0

public val D3DKMDT_MOA_INTERRUPTIBLE: D3dkmdtMonitorOrientationAwareness = 3

public val D3DKMDT_MOA_NONE: D3dkmdtMonitorOrientationAwareness = 1

public val D3DKMDT_MOA_POLLED: D3dkmdtMonitorOrientationAwareness = 2

public val D3DKMDT_MOA_UNINITIALIZED: D3dkmdtMonitorOrientationAwareness = 0

public val D3DKMDT_MO_0DEG: D3dkmdtMonitorOrientation = 1

public val D3DKMDT_MO_180DEG: D3dkmdtMonitorOrientation = 3

public val D3DKMDT_MO_270DEG: D3dkmdtMonitorOrientation = 4

public val D3DKMDT_MO_90DEG: D3dkmdtMonitorOrientation = 2

public val D3DKMDT_MO_UNINITIALIZED: D3dkmdtMonitorOrientation = 0

public val D3DKMDT_MPR_ALLCAPS: D3dkmdtModePruningReason = 1

public val D3DKMDT_MPR_CLONE_PATH_PRUNED: D3dkmdtModePruningReason = 9

public val D3DKMDT_MPR_DEFAULT_PROFILE_MONITOR_SOURCE_MODE: D3dkmdtModePruningReason = 6

public val D3DKMDT_MPR_DESCRIPTOR_MONITOR_FREQUENCY_RANGE: D3dkmdtModePruningReason = 3

public val D3DKMDT_MPR_DESCRIPTOR_MONITOR_SOURCE_MODE: D3dkmdtModePruningReason = 2

public val D3DKMDT_MPR_DESCRIPTOR_OVERRIDE_MONITOR_FREQUENCY_RANGE: D3dkmdtModePruningReason = 5

public val D3DKMDT_MPR_DESCRIPTOR_OVERRIDE_MONITOR_SOURCE_MODE: D3dkmdtModePruningReason = 4

public val D3DKMDT_MPR_DRIVER_RECOMMENDED_MONITOR_SOURCE_MODE: D3dkmdtModePruningReason = 7

public val D3DKMDT_MPR_MAXVALID: D3dkmdtModePruningReason = 10

public val D3DKMDT_MPR_MONITOR_FREQUENCY_RANGE_OVERRIDE: D3dkmdtModePruningReason = 8

public val D3DKMDT_MPR_UNINITIALIZED: D3dkmdtModePruningReason = 0

public val D3DKMDT_MP_NOTPREFERRED: D3dkmdtModePreference = 2

public val D3DKMDT_MP_PREFERRED: D3dkmdtModePreference = 1

public val D3DKMDT_MP_UNINITIALIZED: D3dkmdtModePreference = 0

public val D3DKMDT_MTT_DEFAULTMONITORPROFILE: D3dkmdtMonitorTimingType = 5

public val D3DKMDT_MTT_DETAILED: D3dkmdtMonitorTimingType = 4

public val D3DKMDT_MTT_DRIVER: D3dkmdtMonitorTimingType = 6

public val D3DKMDT_MTT_ESTABLISHED: D3dkmdtMonitorTimingType = 1

public val D3DKMDT_MTT_EXTRASTANDARD: D3dkmdtMonitorTimingType = 3

public val D3DKMDT_MTT_STANDARD: D3dkmdtMonitorTimingType = 2

public val D3DKMDT_MTT_UNINITIALIZED: D3dkmdtMonitorTimingType = 0

public val D3DKMDT_PVAM_DIRECT: D3dkmdtPixelValueAccessMode = 1

public val D3DKMDT_PVAM_PRESETPALETTE: D3dkmdtPixelValueAccessMode = 2

public val D3DKMDT_PVAM_SETTABLEPALETTE: D3dkmdtPixelValueAccessMode = 3

public val D3DKMDT_PVAM_UNINITIALIZED: D3dkmdtPixelValueAccessMode = 0

public val D3DKMDT_RMT_GRAPHICS: D3dkmdtVidpnSourceModeType = 1

public val D3DKMDT_RMT_GRAPHICS_STEREO: D3dkmdtVidpnSourceModeType = 3

public val D3DKMDT_RMT_GRAPHICS_STEREO_ADVANCED_SCAN: D3dkmdtVidpnSourceModeType = 4

public val D3DKMDT_RMT_TEXT: D3dkmdtVidpnSourceModeType = 2

public val D3DKMDT_RMT_UNINITIALIZED: D3dkmdtVidpnSourceModeType = 0

public val D3DKMDT_STANDARDALLOCATION_GDISURFACE: D3dkmdtStandardallocationType = 4

public val D3DKMDT_STANDARDALLOCATION_SHADOWSURFACE: D3dkmdtStandardallocationType = 2

public val D3DKMDT_STANDARDALLOCATION_SHAREDPRIMARYSURFACE: D3dkmdtStandardallocationType = 1

public val D3DKMDT_STANDARDALLOCATION_STAGINGSURFACE: D3dkmdtStandardallocationType = 3

public val D3DKMDT_STANDARDALLOCATION_VGPU: D3dkmdtStandardallocationType = 5

public val D3DKMDT_TRF_UNINITIALIZED: D3dkmdtTextRenderingFormat = 0

public val D3DKMDT_VOT_BNC: D3dkmdtVideoOutputTechnology = 3

public val D3DKMDT_VOT_COMPONENT_VIDEO: D3dkmdtVideoOutputTechnology = 3

public val D3DKMDT_VOT_COMPOSITE_VIDEO: D3dkmdtVideoOutputTechnology = 2

public val D3DKMDT_VOT_DISPLAYPORT_EMBEDDED: D3dkmdtVideoOutputTechnology = 11

public val D3DKMDT_VOT_DISPLAYPORT_EXTERNAL: D3dkmdtVideoOutputTechnology = 10

public val D3DKMDT_VOT_DVI: D3dkmdtVideoOutputTechnology = 4

public val D3DKMDT_VOT_D_JPN: D3dkmdtVideoOutputTechnology = 8

public val D3DKMDT_VOT_HD15: D3dkmdtVideoOutputTechnology = 0

public val D3DKMDT_VOT_HDMI: D3dkmdtVideoOutputTechnology = 5

public val D3DKMDT_VOT_INDIRECT_WIRED: D3dkmdtVideoOutputTechnology = 16

public val D3DKMDT_VOT_INTERNAL: D3dkmdtVideoOutputTechnology = -2147483648.toInt()

public val D3DKMDT_VOT_LVDS: D3dkmdtVideoOutputTechnology = 6

public val D3DKMDT_VOT_MIRACAST: D3dkmdtVideoOutputTechnology = 15

public val D3DKMDT_VOT_OTHER: D3dkmdtVideoOutputTechnology = -1

public val D3DKMDT_VOT_RCA_3COMPONENT: D3dkmdtVideoOutputTechnology = 3

public val D3DKMDT_VOT_RF: D3dkmdtVideoOutputTechnology = 2

public val D3DKMDT_VOT_SDI: D3dkmdtVideoOutputTechnology = 9

public val D3DKMDT_VOT_SDTVDONGLE: D3dkmdtVideoOutputTechnology = 14

public val D3DKMDT_VOT_SVIDEO: D3dkmdtVideoOutputTechnology = 1

public val D3DKMDT_VOT_SVIDEO_4PIN: D3dkmdtVideoOutputTechnology = 1

public val D3DKMDT_VOT_SVIDEO_7PIN: D3dkmdtVideoOutputTechnology = 1

public val D3DKMDT_VOT_UDI_EMBEDDED: D3dkmdtVideoOutputTechnology = 13

public val D3DKMDT_VOT_UDI_EXTERNAL: D3dkmdtVideoOutputTechnology = 12

public val D3DKMDT_VOT_UNINITIALIZED: D3dkmdtVideoOutputTechnology = -2

public val D3DKMDT_VPPC_GRAPHICS: D3dkmdtVidpnPresentPathContent = 1

public val D3DKMDT_VPPC_NOTSPECIFIED: D3dkmdtVidpnPresentPathContent = 255

public val D3DKMDT_VPPC_UNINITIALIZED: D3dkmdtVidpnPresentPathContent = 0

public val D3DKMDT_VPPC_VIDEO: D3dkmdtVidpnPresentPathContent = 2

public val D3DKMDT_VPPI_DENARY: D3dkmdtVidpnPresentPathImportance = 10

public val D3DKMDT_VPPI_NONARY: D3dkmdtVidpnPresentPathImportance = 9

public val D3DKMDT_VPPI_OCTONARY: D3dkmdtVidpnPresentPathImportance = 8

public val D3DKMDT_VPPI_PRIMARY: D3dkmdtVidpnPresentPathImportance = 1

public val D3DKMDT_VPPI_QUATERNARY: D3dkmdtVidpnPresentPathImportance = 4

public val D3DKMDT_VPPI_QUINARY: D3dkmdtVidpnPresentPathImportance = 5

public val D3DKMDT_VPPI_SECONDARY: D3dkmdtVidpnPresentPathImportance = 2

public val D3DKMDT_VPPI_SENARY: D3dkmdtVidpnPresentPathImportance = 6

public val D3DKMDT_VPPI_SEPTENARY: D3dkmdtVidpnPresentPathImportance = 7

public val D3DKMDT_VPPI_TERTIARY: D3dkmdtVidpnPresentPathImportance = 3

public val D3DKMDT_VPPI_UNINITIALIZED: D3dkmdtVidpnPresentPathImportance = 0

public val D3DKMDT_VPPMT_MACROVISION_APSTRIGGER: D3dkmdtVidpnPresentPathCopyprotectionType = 2

public val D3DKMDT_VPPMT_MACROVISION_FULLSUPPORT: D3dkmdtVidpnPresentPathCopyprotectionType = 3

public val D3DKMDT_VPPMT_NOPROTECTION: D3dkmdtVidpnPresentPathCopyprotectionType = 1

public val D3DKMDT_VPPMT_UNINITIALIZED: D3dkmdtVidpnPresentPathCopyprotectionType = 0

public val D3DKMDT_VPPR_IDENTITY: D3dkmdtVidpnPresentPathRotation = 1

public val D3DKMDT_VPPR_IDENTITY_OFFSET180: D3dkmdtVidpnPresentPathRotation = 9

public val D3DKMDT_VPPR_IDENTITY_OFFSET270: D3dkmdtVidpnPresentPathRotation = 13

public val D3DKMDT_VPPR_IDENTITY_OFFSET90: D3dkmdtVidpnPresentPathRotation = 5

public val D3DKMDT_VPPR_NOTSPECIFIED: D3dkmdtVidpnPresentPathRotation = 255

public val D3DKMDT_VPPR_ROTATE180: D3dkmdtVidpnPresentPathRotation = 3

public val D3DKMDT_VPPR_ROTATE180_OFFSET180: D3dkmdtVidpnPresentPathRotation = 11

public val D3DKMDT_VPPR_ROTATE180_OFFSET270: D3dkmdtVidpnPresentPathRotation = 15

public val D3DKMDT_VPPR_ROTATE180_OFFSET90: D3dkmdtVidpnPresentPathRotation = 7

public val D3DKMDT_VPPR_ROTATE270: D3dkmdtVidpnPresentPathRotation = 4

public val D3DKMDT_VPPR_ROTATE270_OFFSET180: D3dkmdtVidpnPresentPathRotation = 12

public val D3DKMDT_VPPR_ROTATE270_OFFSET270: D3dkmdtVidpnPresentPathRotation = 16

public val D3DKMDT_VPPR_ROTATE270_OFFSET90: D3dkmdtVidpnPresentPathRotation = 8

public val D3DKMDT_VPPR_ROTATE90: D3dkmdtVidpnPresentPathRotation = 2

public val D3DKMDT_VPPR_ROTATE90_OFFSET180: D3dkmdtVidpnPresentPathRotation = 10

public val D3DKMDT_VPPR_ROTATE90_OFFSET270: D3dkmdtVidpnPresentPathRotation = 14

public val D3DKMDT_VPPR_ROTATE90_OFFSET90: D3dkmdtVidpnPresentPathRotation = 6

public val D3DKMDT_VPPR_UNINITIALIZED: D3dkmdtVidpnPresentPathRotation = 0

public val D3DKMDT_VPPR_UNPINNED: D3dkmdtVidpnPresentPathRotation = 254

public val D3DKMDT_VPPS_ASPECTRATIOCENTEREDMAX: D3dkmdtVidpnPresentPathScaling = 4

public val D3DKMDT_VPPS_CENTERED: D3dkmdtVidpnPresentPathScaling = 2

public val D3DKMDT_VPPS_CUSTOM: D3dkmdtVidpnPresentPathScaling = 5

public val D3DKMDT_VPPS_IDENTITY: D3dkmdtVidpnPresentPathScaling = 1

public val D3DKMDT_VPPS_NOTSPECIFIED: D3dkmdtVidpnPresentPathScaling = 255

public val D3DKMDT_VPPS_RESERVED1: D3dkmdtVidpnPresentPathScaling = 253

public val D3DKMDT_VPPS_STRETCHED: D3dkmdtVidpnPresentPathScaling = 3

public val D3DKMDT_VPPS_UNINITIALIZED: D3dkmdtVidpnPresentPathScaling = 0

public val D3DKMDT_VPPS_UNPINNED: D3dkmdtVidpnPresentPathScaling = 254

public val D3DKMDT_VSS_APPLE: D3dkmdtVideoSignalStandard = 5

public val D3DKMDT_VSS_EIA_861: D3dkmdtVideoSignalStandard = 25

public val D3DKMDT_VSS_EIA_861A: D3dkmdtVideoSignalStandard = 26

public val D3DKMDT_VSS_EIA_861B: D3dkmdtVideoSignalStandard = 27

public val D3DKMDT_VSS_IBM: D3dkmdtVideoSignalStandard = 4

public val D3DKMDT_VSS_NTSC_443: D3dkmdtVideoSignalStandard = 8

public val D3DKMDT_VSS_NTSC_J: D3dkmdtVideoSignalStandard = 7

public val D3DKMDT_VSS_NTSC_M: D3dkmdtVideoSignalStandard = 6

public val D3DKMDT_VSS_OTHER: D3dkmdtVideoSignalStandard = 255

public val D3DKMDT_VSS_PAL_B: D3dkmdtVideoSignalStandard = 9

public val D3DKMDT_VSS_PAL_B1: D3dkmdtVideoSignalStandard = 10

public val D3DKMDT_VSS_PAL_D: D3dkmdtVideoSignalStandard = 14

public val D3DKMDT_VSS_PAL_G: D3dkmdtVideoSignalStandard = 11

public val D3DKMDT_VSS_PAL_H: D3dkmdtVideoSignalStandard = 12

public val D3DKMDT_VSS_PAL_I: D3dkmdtVideoSignalStandard = 13

public val D3DKMDT_VSS_PAL_K: D3dkmdtVideoSignalStandard = 28

public val D3DKMDT_VSS_PAL_K1: D3dkmdtVideoSignalStandard = 29

public val D3DKMDT_VSS_PAL_L: D3dkmdtVideoSignalStandard = 30

public val D3DKMDT_VSS_PAL_M: D3dkmdtVideoSignalStandard = 31

public val D3DKMDT_VSS_PAL_N: D3dkmdtVideoSignalStandard = 15

public val D3DKMDT_VSS_PAL_NC: D3dkmdtVideoSignalStandard = 16

public val D3DKMDT_VSS_SECAM_B: D3dkmdtVideoSignalStandard = 17

public val D3DKMDT_VSS_SECAM_D: D3dkmdtVideoSignalStandard = 18

public val D3DKMDT_VSS_SECAM_G: D3dkmdtVideoSignalStandard = 19

public val D3DKMDT_VSS_SECAM_H: D3dkmdtVideoSignalStandard = 20

public val D3DKMDT_VSS_SECAM_K: D3dkmdtVideoSignalStandard = 21

public val D3DKMDT_VSS_SECAM_K1: D3dkmdtVideoSignalStandard = 22

public val D3DKMDT_VSS_SECAM_L: D3dkmdtVideoSignalStandard = 23

public val D3DKMDT_VSS_SECAM_L1: D3dkmdtVideoSignalStandard = 24

public val D3DKMDT_VSS_UNINITIALIZED: D3dkmdtVideoSignalStandard = 0

public val D3DKMDT_VSS_VESA_CVT: D3dkmdtVideoSignalStandard = 3

public val D3DKMDT_VSS_VESA_DMT: D3dkmdtVideoSignalStandard = 1

public val D3DKMDT_VSS_VESA_GTF: D3dkmdtVideoSignalStandard = 2

public val D3DKMT_ACTIVATE_SPECIFIC_DIAG_TYPE_EXTRA_CCD_DATABASE_INFO: D3dkmtActivateSpecificDiagType = 0

public val D3DKMT_ACTIVATE_SPECIFIC_DIAG_TYPE_MODES_PRUNED: D3dkmtActivateSpecificDiagType = 15

public val D3DKMT_ADAPTER_VERIFIER_OPTION_VIDMM_FLAGS: D3dkmtAdapterVerifierOptionType = 1000

public val D3DKMT_ADAPTER_VERIFIER_OPTION_VIDMM_TRIM_INTERVAL: D3dkmtAdapterVerifierOptionType = 1001

public val D3DKMT_ALLOCATIONRESIDENCYSTATUS_NOTRESIDENT: D3dkmtAllocationresidencystatus = 3

public val D3DKMT_ALLOCATIONRESIDENCYSTATUS_RESIDENTINGPUMEMORY: D3dkmtAllocationresidencystatus = 1

public val D3DKMT_ALLOCATIONRESIDENCYSTATUS_RESIDENTINSHAREDMEMORY: D3dkmtAllocationresidencystatus = 2

public val D3DKMT_AUXILIARYPRESENTINFO_TYPE_FLIPMANAGER: D3dkmtAuxiliarypresentinfoType = 0

public val D3DKMT_ALLOCATION_PRIORITY_CLASS_HIGH: D3dkmtQuerystatisticsAllocationPriorityClass = 3

public val D3DKMT_ALLOCATION_PRIORITY_CLASS_LOW: D3dkmtQuerystatisticsAllocationPriorityClass = 1

public val D3DKMT_ALLOCATION_PRIORITY_CLASS_MAXIMUM: D3dkmtQuerystatisticsAllocationPriorityClass = 4

public val D3DKMT_ALLOCATION_PRIORITY_CLASS_MINIMUM: D3dkmtQuerystatisticsAllocationPriorityClass = 0

public val D3DKMT_ALLOCATION_PRIORITY_CLASS_NORMAL: D3dkmtQuerystatisticsAllocationPriorityClass = 2

public val D3DKMT_BRIGHTNESS_INFO_BEGIN_MANUAL_MODE: D3dkmtBrightnessInfoType = 8

public val D3DKMT_BRIGHTNESS_INFO_END_MANUAL_MODE: D3dkmtBrightnessInfoType = 9

public val D3DKMT_BRIGHTNESS_INFO_GET: D3dkmtBrightnessInfoType = 2

public val D3DKMT_BRIGHTNESS_INFO_GET_CAPS: D3dkmtBrightnessInfoType = 4

public val D3DKMT_BRIGHTNESS_INFO_GET_NIT_RANGES: D3dkmtBrightnessInfoType = 11

public val D3DKMT_BRIGHTNESS_INFO_GET_POSSIBLE_LEVELS: D3dkmtBrightnessInfoType = 1

public val D3DKMT_BRIGHTNESS_INFO_GET_REDUCTION: D3dkmtBrightnessInfoType = 7

public val D3DKMT_BRIGHTNESS_INFO_SET: D3dkmtBrightnessInfoType = 3

public val D3DKMT_BRIGHTNESS_INFO_SET_OPTIMIZATION: D3dkmtBrightnessInfoType = 6

public val D3DKMT_BRIGHTNESS_INFO_SET_STATE: D3dkmtBrightnessInfoType = 5

public val D3DKMT_BRIGHTNESS_INFO_TOGGLE_LOGGING: D3dkmtBrightnessInfoType = 10

public val D3DKMT_CANCEL_PRESENTS_OPERATION_CANCEL_FROM: D3dkmtCancelPresentsOperation = 0

public val D3DKMT_CANCEL_PRESENTS_OPERATION_REPROGRAM_INTERRUPT: D3dkmtCancelPresentsOperation = 1

public val D3DKMT_CLIENTHINT_11ON12: D3dkmtClienthint = 14

public val D3DKMT_CLIENTHINT_9ON12: D3dkmtClienthint = 13

public val D3DKMT_CLIENTHINT_CDD: D3dkmtClienthint = 2

public val D3DKMT_CLIENTHINT_CLON12: D3dkmtClienthint = 17

public val D3DKMT_CLIENTHINT_CUDA: D3dkmtClienthint = 5

public val D3DKMT_CLIENTHINT_DML_PYTORCH: D3dkmtClienthint = 20

public val D3DKMT_CLIENTHINT_DML_TENSORFLOW: D3dkmtClienthint = 18

public val D3DKMT_CLIENTHINT_DX10: D3dkmtClienthint = 10

public val D3DKMT_CLIENTHINT_DX11: D3dkmtClienthint = 11

public val D3DKMT_CLIENTHINT_DX12: D3dkmtClienthint = 12

public val D3DKMT_CLIENTHINT_DX7: D3dkmtClienthint = 7

public val D3DKMT_CLIENTHINT_DX8: D3dkmtClienthint = 8

public val D3DKMT_CLIENTHINT_DX9: D3dkmtClienthint = 9

public val D3DKMT_CLIENTHINT_GLON12: D3dkmtClienthint = 16

public val D3DKMT_CLIENTHINT_MAX: D3dkmtClienthint = 21

public val D3DKMT_CLIENTHINT_MFT_ENCODE: D3dkmtClienthint = 15

public val D3DKMT_CLIENTHINT_ONEAPI_LEVEL0: D3dkmtClienthint = 19

public val D3DKMT_CLIENTHINT_OPENCL: D3dkmtClienthint = 3

public val D3DKMT_CLIENTHINT_OPENGL: D3dkmtClienthint = 1

public val D3DKMT_CLIENTHINT_RESERVED: D3dkmtClienthint = 6

public val D3DKMT_CLIENTHINT_UNKNOWN: D3dkmtClienthint = 0

public val D3DKMT_CLIENTHINT_VULKAN: D3dkmtClienthint = 4

public val D3DKMT_CROSSADAPTERRESOURCE_SUPPORT_TIER_COPY: D3dkmtCrossadapterresourceSupportTier = 1

public val D3DKMT_CROSSADAPTERRESOURCE_SUPPORT_TIER_NONE: D3dkmtCrossadapterresourceSupportTier = 0

public val D3DKMT_CROSSADAPTERRESOURCE_SUPPORT_TIER_SCANOUT: D3dkmtCrossadapterresourceSupportTier = 3

public val D3DKMT_CROSSADAPTERRESOURCE_SUPPORT_TIER_TEXTURE: D3dkmtCrossadapterresourceSupportTier = 2

public val D3DKMT_CROSS_ADAPTER_RESOURCE_HEIGHT_ALIGNMENT: UInt = 4u

public val D3DKMT_CROSS_ADAPTER_RESOURCE_PITCH_ALIGNMENT: UInt = 128u

public val D3DKMT_CLIENT_PAGING_BUFFER: D3dkmtQuerystatisticsDmaPacketType = 1

public val D3DKMT_CLIENT_RENDER_BUFFER: D3dkmtQuerystatisticsDmaPacketType = 0

public val D3DKMT_DEFRAG_ESCAPE_DEFRAG_DOWNWARD: D3dkmtDefragEscapeOperation = 2

public val D3DKMT_DEFRAG_ESCAPE_DEFRAG_PASS: D3dkmtDefragEscapeOperation = 3

public val D3DKMT_DEFRAG_ESCAPE_DEFRAG_UPWARD: D3dkmtDefragEscapeOperation = 1

public val D3DKMT_DEFRAG_ESCAPE_GET_FRAGMENTATION_STATS: D3dkmtDefragEscapeOperation = 0

public val D3DKMT_DEFRAG_ESCAPE_VERIFY_TRANSFER: D3dkmtDefragEscapeOperation = 4

public val D3DKMT_DEVICEESCAPE_RESTOREGAMMA: D3dkmtDeviceescapeType = 1

public val D3DKMT_DEVICEESCAPE_VIDPNFROMALLOCATION: D3dkmtDeviceescapeType = 0

public val D3DKMT_DEVICEEXECUTION_ACTIVE: D3dkmtDeviceexecutionState = 1

public val D3DKMT_DEVICEEXECUTION_ERROR_DMAFAULT: D3dkmtDeviceexecutionState = 6

public val D3DKMT_DEVICEEXECUTION_ERROR_DMAPAGEFAULT: D3dkmtDeviceexecutionState = 7

public val D3DKMT_DEVICEEXECUTION_ERROR_OUTOFMEMORY: D3dkmtDeviceexecutionState = 5

public val D3DKMT_DEVICEEXECUTION_HUNG: D3dkmtDeviceexecutionState = 3

public val D3DKMT_DEVICEEXECUTION_RESET: D3dkmtDeviceexecutionState = 2

public val D3DKMT_DEVICEEXECUTION_STOPPED: D3dkmtDeviceexecutionState = 4

public val D3DKMT_DEVICESTATE_EXECUTION: D3dkmtDevicestateType = 1

public val D3DKMT_DEVICESTATE_PAGE_FAULT: D3dkmtDevicestateType = 5

public val D3DKMT_DEVICESTATE_PRESENT: D3dkmtDevicestateType = 2

public val D3DKMT_DEVICESTATE_PRESENT_DWM: D3dkmtDevicestateType = 4

public val D3DKMT_DEVICESTATE_PRESENT_QUEUE: D3dkmtDevicestateType = 6

public val D3DKMT_DEVICESTATE_RESET: D3dkmtDevicestateType = 3

public val D3DKMT_DEVICE_ERROR_REASON_DRIVER_ERROR: D3dkmtDeviceErrorReason = -2147483642

public val D3DKMT_DEVICE_ERROR_REASON_GENERIC: D3dkmtDeviceErrorReason = -2147483648.toInt()

public val D3DKMT_DMMESCAPETYPE_ACTIVEVIDPN_COFUNCPATHMODALITY_INFO: D3dkmtDmmescapetype = 11

public val D3DKMT_DMMESCAPETYPE_ACTIVEVIDPN_SOURCEMODESET_INFO: D3dkmtDmmescapetype = 10

public val D3DKMT_DMMESCAPETYPE_GET_ACTIVEVIDPN_INFO: D3dkmtDmmescapetype = 4

public val D3DKMT_DMMESCAPETYPE_GET_LASTCLIENTCOMMITTEDVIDPN_INFO: D3dkmtDmmescapetype = 12

public val D3DKMT_DMMESCAPETYPE_GET_MONITORS_INFO: D3dkmtDmmescapetype = 5

public val D3DKMT_DMMESCAPETYPE_GET_SUMMARY_INFO: D3dkmtDmmescapetype = 1

public val D3DKMT_DMMESCAPETYPE_GET_VERSION_INFO: D3dkmtDmmescapetype = 13

public val D3DKMT_DMMESCAPETYPE_GET_VIDEO_PRESENT_SOURCES_INFO: D3dkmtDmmescapetype = 2

public val D3DKMT_DMMESCAPETYPE_GET_VIDEO_PRESENT_TARGETS_INFO: D3dkmtDmmescapetype = 3

public val D3DKMT_DMMESCAPETYPE_RECENTLY_COMMITTED_VIDPNS_INFO: D3dkmtDmmescapetype = 6

public val D3DKMT_DMMESCAPETYPE_RECENTLY_RECOMMENDED_VIDPNS_INFO: D3dkmtDmmescapetype = 8

public val D3DKMT_DMMESCAPETYPE_RECENT_MODECHANGE_REQUESTS_INFO: D3dkmtDmmescapetype = 7

public val D3DKMT_DMMESCAPETYPE_RECENT_MONITOR_PRESENCE_EVENTS_INFO: D3dkmtDmmescapetype = 9

public val D3DKMT_DMMESCAPETYPE_UNINITIALIZED: D3dkmtDmmescapetype = 0

public val D3DKMT_DMMESCAPETYPE_VIDPN_MGR_DIAGNOSTICS: D3dkmtDmmescapetype = 14

public val D3DKMT_DEFERRED_COMMAND_BUFFER: D3dkmtQuerystatisticsQueuePacketType = 1

public val D3DKMT_DEVICE_COMMAND_BUFFER: D3dkmtQuerystatisticsQueuePacketType = 6

public val D3DKMT_DMA_PACKET_TYPE_MAX: D3dkmtQuerystatisticsDmaPacketType = 4

public val D3DKMT_ESCAPE_ACTIVATE_SPECIFIC_DIAG: D3dkmtEscapetype = 14

public val D3DKMT_ESCAPE_ADAPTER_VERIFIER_OPTION: D3dkmtEscapetype = 29

public val D3DKMT_ESCAPE_BDD_FALLBACK: D3dkmtEscapetype = 13

public val D3DKMT_ESCAPE_BDD_PNP: D3dkmtEscapetype = 12

public val D3DKMT_ESCAPE_BRIGHTNESS: D3dkmtEscapetype = 17

public val D3DKMT_ESCAPE_CCD_DATABASE: D3dkmtEscapetype = 38

public val D3DKMT_ESCAPE_DEBUG_SNAPSHOT: D3dkmtEscapetype = 6

public val D3DKMT_ESCAPE_DEVICE: D3dkmtEscapetype = 4

public val D3DKMT_ESCAPE_DIAGNOSTICS: D3dkmtEscapetype = 9

public val D3DKMT_ESCAPE_DMM: D3dkmtEscapetype = 5

public val D3DKMT_ESCAPE_DOD_SET_DIRTYRECT_MODE: D3dkmtEscapetype = 31

public val D3DKMT_ESCAPE_DRIVERPRIVATE: D3dkmtEscapetype = 0

public val D3DKMT_ESCAPE_DRT_TEST: D3dkmtEscapetype = 8

public val D3DKMT_ESCAPE_EDID_CACHE: D3dkmtEscapetype = 18

public val D3DKMT_ESCAPE_FORCE_BDDFALLBACK_HEADLESS: D3dkmtEscapetype = 24

public val D3DKMT_ESCAPE_GET_DISPLAY_CONFIGURATIONS: D3dkmtEscapetype = 36

public val D3DKMT_ESCAPE_GET_EXTERNAL_DIAGNOSTICS: D3dkmtEscapetype = 34

public val D3DKMT_ESCAPE_HISTORY_BUFFER_STATUS: D3dkmtEscapetype = 21

public val D3DKMT_ESCAPE_IDD_REQUEST: D3dkmtEscapetype = 30

public val D3DKMT_ESCAPE_LOG_CODEPOINT_PACKET: D3dkmtEscapetype = 32

public val D3DKMT_ESCAPE_LOG_USERMODE_DAIG_PACKET: D3dkmtEscapetype = 33

public val D3DKMT_ESCAPE_MIRACAST_ADAPTER_DIAG_INFO: D3dkmtEscapetype = 23

public val D3DKMT_ESCAPE_MIRACAST_DISPLAY_REQUEST: D3dkmtEscapetype = 20

public val D3DKMT_ESCAPE_MODES_PRUNED_OUT: D3dkmtEscapetype = 15

public val D3DKMT_ESCAPE_OUTPUTDUPL_DIAGNOSTICS: D3dkmtEscapetype = 11

public val D3DKMT_ESCAPE_OUTPUTDUPL_SNAPSHOT: D3dkmtEscapetype = 10

public val D3DKMT_ESCAPE_PFN_CONTROL_DEFAULT: D3dkmtEscapePfnControlCommand = 0

public val D3DKMT_ESCAPE_PFN_CONTROL_FORCE_CPU: D3dkmtEscapePfnControlCommand = 1

public val D3DKMT_ESCAPE_PFN_CONTROL_FORCE_GPU: D3dkmtEscapePfnControlCommand = 2

public val D3DKMT_ESCAPE_PROCESS_VERIFIER_OPTION: D3dkmtEscapetype = 28

public val D3DKMT_ESCAPE_QUERY_DMA_REMAPPING_STATUS: D3dkmtEscapetype = 39

public val D3DKMT_ESCAPE_QUERY_IOMMU_STATUS: D3dkmtEscapetype = 37

public val D3DKMT_ESCAPE_REQUEST_MACHINE_CRASH: D3dkmtEscapetype = 25

public val D3DKMT_ESCAPE_SOFTGPU_ENABLE_DISABLE_HMD: D3dkmtEscapetype = 27

public val D3DKMT_ESCAPE_TDRDBGCTRL: D3dkmtEscapetype = 2

public val D3DKMT_ESCAPE_VIDMM: D3dkmtEscapetype = 1

public val D3DKMT_ESCAPE_VIDSCH: D3dkmtEscapetype = 3

public val D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE_TYPE_SET_BASE_DESKTOP_DURATION: D3dkmtEscapeVirtualRefreshRateType = 0

public val D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE_TYPE_SET_PROCESS_BOOST_ELIGIBLE: D3dkmtEscapeVirtualRefreshRateType = 2

public val D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE_TYPE_SET_VSYNC_MULTIPLIER: D3dkmtEscapeVirtualRefreshRateType = 1

public val D3DKMT_ESCAPE_WHQL_INFO: D3dkmtEscapetype = 16

public val D3DKMT_ESCAPE_WIN32K_BDD_FALLBACK: D3dkmtEscapetype = 1029

public val D3DKMT_ESCAPE_WIN32K_COLOR_PROFILE_INFO: D3dkmtEscapetype = 1036

public val D3DKMT_ESCAPE_WIN32K_DDA_TEST_CTL: D3dkmtEscapetype = 1030

public val D3DKMT_ESCAPE_WIN32K_DISPBROKER_TEST: D3dkmtEscapetype = 1035

public val D3DKMT_ESCAPE_WIN32K_DPI_INFO: D3dkmtEscapetype = 1026

public val D3DKMT_ESCAPE_WIN32K_HIP_DEVICE_INFO: D3dkmtEscapetype = 1024

public val D3DKMT_ESCAPE_WIN32K_PRESENTER_VIEW_INFO: D3dkmtEscapetype = 1027

public val D3DKMT_ESCAPE_WIN32K_QUERY_CD_ROTATION_BLOCK: D3dkmtEscapetype = 1025

public val D3DKMT_ESCAPE_WIN32K_SET_DIMMED_STATE: D3dkmtEscapetype = 1037

public val D3DKMT_ESCAPE_WIN32K_SPECIALIZED_DISPLAY_TEST: D3dkmtEscapetype = 1038

public val D3DKMT_ESCAPE_WIN32K_START: D3dkmtEscapetype = 1024

public val D3DKMT_ESCAPE_WIN32K_SYSTEM_DPI: D3dkmtEscapetype = 1028

public val D3DKMT_ESCAPE_WIN32K_USER_DETECTED_BLACK_SCREEN: D3dkmtEscapetype = 1031

public val D3DKMT_FLIPMODEL_INDEPENDENT_FLIP_STAGE_FLIP_COMPLETE: D3dkmtFlipmodelIndependentFlipStage = 1

public val D3DKMT_FLIPMODEL_INDEPENDENT_FLIP_STAGE_FLIP_SUBMITTED: D3dkmtFlipmodelIndependentFlipStage = 0

public val D3DKMT_GDI_STYLE_HANDLE_DECORATION: UInt = 2u

public val D3DKMT_GETPRESENTHISTORY_MAXTOKENS: UInt = 2048u

public val D3DKMT_GET_PTE_MAX: UInt = 64u

public val D3DKMT_GET_QUEUEDLIMIT_PRESENT: D3dkmtQueuedlimitType = 2

public val D3DKMT_GPU_PREFERENCE_STATE_HIGH_PERFORMANCE: D3dkmtGpuPreferenceQueryState = 1

public val D3DKMT_GPU_PREFERENCE_STATE_MINIMUM_POWER: D3dkmtGpuPreferenceQueryState = 2

public val D3DKMT_GPU_PREFERENCE_STATE_NOT_FOUND: D3dkmtGpuPreferenceQueryState = 4

public val D3DKMT_GPU_PREFERENCE_STATE_UNINITIALIZED: D3dkmtGpuPreferenceQueryState = 0

public val D3DKMT_GPU_PREFERENCE_STATE_UNSPECIFIED: D3dkmtGpuPreferenceQueryState = 3

public val D3DKMT_GPU_PREFERENCE_STATE_USER_SPECIFIED_GPU: D3dkmtGpuPreferenceQueryState = 5

public val D3DKMT_GPU_PREFERENCE_TYPE_DX_DATABASE: D3dkmtGpuPreferenceQueryType = 1

public val D3DKMT_GPU_PREFERENCE_TYPE_IHV_DLIST: D3dkmtGpuPreferenceQueryType = 0

public val D3DKMT_GPU_PREFERENCE_TYPE_USER_PREFERENCE: D3dkmtGpuPreferenceQueryType = 2

public val D3DKMT_MAX_BUNDLE_OBJECTS_PER_HANDLE: UInt = 16u

public val D3DKMT_MAX_DMM_ESCAPE_DATASIZE: Int = 102400

public val D3DKMT_MAX_MULTIPLANE_OVERLAY_ALLOCATIONS_PER_PLANE: UInt = 256u

public val D3DKMT_MAX_MULTIPLANE_OVERLAY_PLANES: UInt = 8u

public val D3DKMT_MAX_OBJECTS_PER_HANDLE: UInt = 3u

public val D3DKMT_MAX_PRESENT_HISTORY_RECTS: UInt = 16u

public val D3DKMT_MAX_PRESENT_HISTORY_SCATTERBLTS: UInt = 12u

public val D3DKMT_MAX_SEGMENT_COUNT: UInt = 32u

public val D3DKMT_MAX_WAITFORVERTICALBLANK_OBJECTS: UInt = 8u

public val D3DKMT_MEMORY_SEGMENT_GROUP_LOCAL: D3dkmtMemorySegmentGroup = 0

public val D3DKMT_MEMORY_SEGMENT_GROUP_NON_LOCAL: D3dkmtMemorySegmentGroup = 1

public val D3DKMT_MIRACAST_DEVICE_STATUS_CANCELLED: D3dkmtMiracastDeviceStatus = -2147483637

public val D3DKMT_MIRACAST_DEVICE_STATUS_DEVICE_ERROR: D3dkmtMiracastDeviceStatus = -2147483645

public val D3DKMT_MIRACAST_DEVICE_STATUS_DEVICE_NOT_FOUND: D3dkmtMiracastDeviceStatus = -2147483642

public val D3DKMT_MIRACAST_DEVICE_STATUS_DEVICE_NOT_STARTED: D3dkmtMiracastDeviceStatus = -2147483641

public val D3DKMT_MIRACAST_DEVICE_STATUS_GPU_RESOURCE_IN_USE: D3dkmtMiracastDeviceStatus = -2147483646

public val D3DKMT_MIRACAST_DEVICE_STATUS_INSUFFICIENT_BANDWIDTH: D3dkmtMiracastDeviceStatus = -2147483639

public val D3DKMT_MIRACAST_DEVICE_STATUS_INSUFFICIENT_MEMORY: D3dkmtMiracastDeviceStatus = -2147483638

public val D3DKMT_MIRACAST_DEVICE_STATUS_INVALID_PARAMETER: D3dkmtMiracastDeviceStatus = -2147483640

public val D3DKMT_MIRACAST_DEVICE_STATUS_PENDING: D3dkmtMiracastDeviceStatus = 2

public val D3DKMT_MIRACAST_DEVICE_STATUS_REMOTE_SESSION: D3dkmtMiracastDeviceStatus = -2147483643

public val D3DKMT_MIRACAST_DEVICE_STATUS_SUCCESS: D3dkmtMiracastDeviceStatus = 0

public val D3DKMT_MIRACAST_DEVICE_STATUS_SUCCESS_NO_MONITOR: D3dkmtMiracastDeviceStatus = 1

public val D3DKMT_MIRACAST_DEVICE_STATUS_UNKOWN_ERROR: D3dkmtMiracastDeviceStatus = -2147483647

public val D3DKMT_MIRACAST_DEVICE_STATUS_UNKOWN_PAIRING: D3dkmtMiracastDeviceStatus = -2147483644

public val D3DKMT_MIRACAST_DRIVER_IHV: D3dkmtMiracastDriverType = 1

public val D3DKMT_MIRACAST_DRIVER_MS: D3dkmtMiracastDriverType = 2

public val D3DKMT_MIRACAST_DRIVER_NOT_SUPPORTED: D3dkmtMiracastDriverType = 0

public val D3DKMT_MULIIPLANE_OVERLAY_VIDEO_FRAME_FORMAT_PROGRESSIVE: D3dkmtMultiplaneOverlayVideoFrameFormat = 0

public val D3DKMT_MULTIPLANE_OVERLAY_BLEND_ALPHABLEND: D3dkmtMultiplaneOverlayBlend = 1

public val D3DKMT_MULTIPLANE_OVERLAY_BLEND_OPAQUE: D3dkmtMultiplaneOverlayBlend = 0

public val D3DKMT_MULTIPLANE_OVERLAY_FLAG_HORIZONTAL_FLIP: D3dkmtMultiplaneOverlayFlags = 2

public val D3DKMT_MULTIPLANE_OVERLAY_FLAG_STATIC_CHECK: D3dkmtMultiplaneOverlayFlags = 4

public val D3DKMT_MULTIPLANE_OVERLAY_FLAG_VERTICAL_FLIP: D3dkmtMultiplaneOverlayFlags = 1

public val D3DKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT_HORIZONTAL: D3dkmtMultiplaneOverlayStereoFormat = 1

public val D3DKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT_VERTICAL: D3dkmtMultiplaneOverlayStereoFormat = 2

public val D3DKMT_MULTIPLANE_OVERLAY_VIDEO_FRAME_FORMAT_INTERLACED_BOTTOM_FIELD_FIRST: D3dkmtMultiplaneOverlayVideoFrameFormat = 2

public val D3DKMT_MULTIPLANE_OVERLAY_VIDEO_FRAME_FORMAT_INTERLACED_TOP_FIELD_FIRST: D3dkmtMultiplaneOverlayVideoFrameFormat = 1

public val D3DKMT_MULTIPLANE_OVERLAY_Y_CB_CR_FLAG_BT709: D3dkmtMultiplaneOverlayYcbCrFlags = 2

public val D3DKMT_MULTIPLANE_OVERLAY_Y_CB_CR_FLAG_NOMINAL_RANGE: D3dkmtMultiplaneOverlayYcbCrFlags = 1

public val D3DKMT_MULTIPLANE_OVERLAY_Y_CB_CR_FLAG_XV_YCC: D3dkmtMultiplaneOverlayYcbCrFlags = 4

public val D3DKMT_MAX_ALLOCATION_PRIORITY_CLASS: D3dkmtQuerystatisticsAllocationPriorityClass = 5

public val D3DKMT_MM_IO_FLIP_COMMAND_BUFFER: D3dkmtQuerystatisticsQueuePacketType = 3

public val D3DKMT_OFFER_PRIORITY_AUTO: D3dkmtOfferPriority = 4

public val D3DKMT_OFFER_PRIORITY_HIGH: D3dkmtOfferPriority = 3

public val D3DKMT_OFFER_PRIORITY_LOW: D3dkmtOfferPriority = 1

public val D3DKMT_OFFER_PRIORITY_NORMAL: D3dkmtOfferPriority = 2

public val D3DKMT_OUTDUPL_POINTER_SHAPE_TYPE_COLOR: D3dkmtOutduplPointerShapeType = 2

public val D3DKMT_OUTDUPL_POINTER_SHAPE_TYPE_MASKED_COLOR: D3dkmtOutduplPointerShapeType = 4

public val D3DKMT_OUTDUPL_POINTER_SHAPE_TYPE_MONOCHROME: D3dkmtOutduplPointerShapeType = 1

public val D3DKMT_OUTPUTDUPL_METADATATYPE_DIRTY_RECTS: D3dkmtOutputduplMetadatatype = 0

public val D3DKMT_OUTPUTDUPL_METADATATYPE_MOVE_RECTS: D3dkmtOutputduplMetadatatype = 1

public val D3DKMT_PM_FLIPMANAGER: D3dkmtPresentModel = 9

public val D3DKMT_PM_REDIRECTED_BLT: D3dkmtPresentModel = 3

public val D3DKMT_PM_REDIRECTED_COMPOSITION: D3dkmtPresentModel = 7

public val D3DKMT_PM_REDIRECTED_FLIP: D3dkmtPresentModel = 2

public val D3DKMT_PM_REDIRECTED_GDI: D3dkmtPresentModel = 1

public val D3DKMT_PM_REDIRECTED_GDI_SYSMEM: D3dkmtPresentModel = 6

public val D3DKMT_PM_REDIRECTED_VISTABLT: D3dkmtPresentModel = 4

public val D3DKMT_PM_SCREENCAPTUREFENCE: D3dkmtPresentModel = 5

public val D3DKMT_PM_SURFACECOMPLETE: D3dkmtPresentModel = 8

public val D3DKMT_PM_UNINITIALIZED: D3dkmtPresentModel = 0

public val D3DKMT_PNP_KEY_HARDWARE: D3dkmtPnpKeyType = 1

public val D3DKMT_PNP_KEY_SOFTWARE: D3dkmtPnpKeyType = 2

public val D3DKMT_PROCESS_VERIFIER_OPTION_VIDMM_FLAGS: D3dkmtProcessVerifierOptionType = 1000

public val D3DKMT_PROCESS_VERIFIER_OPTION_VIDMM_RESTRICT_BUDGET: D3dkmtProcessVerifierOptionType = 1001

public val D3DKMT_PROTECTED_SESSION_STATUS_INVALID: D3dkmtProtectedSessionStatus = 1

public val D3DKMT_PROTECTED_SESSION_STATUS_OK: D3dkmtProtectedSessionStatus = 0

public val D3DKMT_PREEMPTION_ATTEMPT: D3dkmtQueryresultPreemptionAttemptResult = 0

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_ALREADY_PREEMPTING: D3dkmtQueryresultPreemptionAttemptResult = 13

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_ALREADY_RUNNING: D3dkmtQueryresultPreemptionAttemptResult = 15

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_FENCE_COMMAND: D3dkmtQueryresultPreemptionAttemptResult = 7

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_GLOBAL_BLOCK: D3dkmtQueryresultPreemptionAttemptResult = 14

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_LESS_PRIORITY: D3dkmtQueryresultPreemptionAttemptResult = 10

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_NEXT_FENCE: D3dkmtQueryresultPreemptionAttemptResult = 4

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_NO_COMMAND: D3dkmtQueryresultPreemptionAttemptResult = 2

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_NOT_ENABLED: D3dkmtQueryresultPreemptionAttemptResult = 3

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_NOT_MAKING_PROGRESS: D3dkmtQueryresultPreemptionAttemptResult = 9

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_PAGING_COMMAND: D3dkmtQueryresultPreemptionAttemptResult = 5

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_REMAINING_PREEMPTION_QUANTUM: D3dkmtQueryresultPreemptionAttemptResult = 12

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_REMAINING_QUANTUM: D3dkmtQueryresultPreemptionAttemptResult = 11

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_RENDER_PENDING_FLIP: D3dkmtQueryresultPreemptionAttemptResult = 8

public val D3DKMT_PREEMPTION_ATTEMPT_MISS_SPLITTED_COMMAND: D3dkmtQueryresultPreemptionAttemptResult = 6

public val D3DKMT_PREEMPTION_ATTEMPT_STATISTICS_MAX: D3dkmtQueryresultPreemptionAttemptResult = 16

public val D3DKMT_PREEMPTION_ATTEMPT_SUCCESS: D3dkmtQueryresultPreemptionAttemptResult = 1

public val D3DKMT_QUERYRESULT_PREEMPTION_ATTEMPT_RESULT_MAX: UInt = 16u

public val D3DKMT_QUERYSTATISTICS_ADAPTER: D3dkmtQuerystatisticsType = 0

public val D3DKMT_QUERYSTATISTICS_ADAPTER2: D3dkmtQuerystatisticsType = 11

public val D3DKMT_QUERYSTATISTICS_ALLOCATION_PRIORITY_CLASS_MAX: UInt = 5u

public val D3DKMT_QUERYSTATISTICS_DMA_PACKET_TYPE_MAX: UInt = 4u

public val D3DKMT_QUERYSTATISTICS_NODE: D3dkmtQuerystatisticsType = 5

public val D3DKMT_QUERYSTATISTICS_NODE2: D3dkmtQuerystatisticsType = 18

public val D3DKMT_QUERYSTATISTICS_PHYSICAL_ADAPTER: D3dkmtQuerystatisticsType = 10

public val D3DKMT_QUERYSTATISTICS_PROCESS: D3dkmtQuerystatisticsType = 1

public val D3DKMT_QUERYSTATISTICS_PROCESS_ADAPTER: D3dkmtQuerystatisticsType = 2

public val D3DKMT_QUERYSTATISTICS_PROCESS_ADAPTER2: D3dkmtQuerystatisticsType = 13

public val D3DKMT_QUERYSTATISTICS_PROCESS_INTERFERENCE_BUCKET_COUNT: UInt = 9u

public val D3DKMT_QUERYSTATISTICS_PROCESS_NODE: D3dkmtQuerystatisticsType = 6

public val D3DKMT_QUERYSTATISTICS_PROCESS_NODE2: D3dkmtQuerystatisticsType = 19

public val D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT: D3dkmtQuerystatisticsType = 4

public val D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT2: D3dkmtQuerystatisticsType = 14

public val D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_GROUP: D3dkmtQuerystatisticsType = 9

public val D3DKMT_QUERYSTATISTICS_PROCESS_SEGMENT_GROUP2: D3dkmtQuerystatisticsType = 15

public val D3DKMT_QUERYSTATISTICS_PROCESS_VIDPNSOURCE: D3dkmtQuerystatisticsType = 8

public val D3DKMT_QUERYSTATISTICS_QUEUE_PACKET_TYPE_MAX: UInt = 8u

public val D3DKMT_QUERYSTATISTICS_SEGMENT: D3dkmtQuerystatisticsType = 3

public val D3DKMT_QUERYSTATISTICS_SEGMENT2: D3dkmtQuerystatisticsType = 12

public val D3DKMT_QUERYSTATISTICS_SEGMENT_GROUP_USAGE: D3dkmtQuerystatisticsType = 17

public val D3DKMT_QUERYSTATISTICS_SEGMENT_PREFERENCE_MAX: UInt = 5u

public val D3DKMT_QUERYSTATISTICS_SEGMENT_TYPE_APERTURE: D3dkmtQuerystatisticsSegmentType = 0

public val D3DKMT_QUERYSTATISTICS_SEGMENT_TYPE_MEMORY: D3dkmtQuerystatisticsSegmentType = 1

public val D3DKMT_QUERYSTATISTICS_SEGMENT_TYPE_SYSMEM: D3dkmtQuerystatisticsSegmentType = 2

public val D3DKMT_QUERYSTATISTICS_SEGMENT_USAGE: D3dkmtQuerystatisticsType = 16

public val D3DKMT_QUERYSTATISTICS_VIDPNSOURCE: D3dkmtQuerystatisticsType = 7

public val D3DKMT_QUEUE_PACKET_TYPE_MAX: D3dkmtQuerystatisticsQueuePacketType = 8

public val D3DKMT_RENDER_COMMAND_BUFFER: D3dkmtQuerystatisticsQueuePacketType = 0

public val D3DKMT_SCHEDULINGPRIORITYCLASS_ABOVE_NORMAL: D3dkmtSchedulingpriorityclass = 3

public val D3DKMT_SCHEDULINGPRIORITYCLASS_BELOW_NORMAL: D3dkmtSchedulingpriorityclass = 1

public val D3DKMT_SCHEDULINGPRIORITYCLASS_HIGH: D3dkmtSchedulingpriorityclass = 4

public val D3DKMT_SCHEDULINGPRIORITYCLASS_IDLE: D3dkmtSchedulingpriorityclass = 0

public val D3DKMT_SCHEDULINGPRIORITYCLASS_NORMAL: D3dkmtSchedulingpriorityclass = 2

public val D3DKMT_SCHEDULINGPRIORITYCLASS_REALTIME: D3dkmtSchedulingpriorityclass = 5

public val D3DKMT_SETCONTEXTSCHEDULINGPRIORITY_ABSOLUTE: UInt = 1073741824u

public val D3DKMT_SET_QUEUEDLIMIT_PRESENT: D3dkmtQueuedlimitType = 1

public val D3DKMT_STANDARDALLOCATIONTYPE_EXISTINGHEAP: D3dkmtStandardallocationtype = 1

public val D3DKMT_STANDARDALLOCATIONTYPE_INTERNALBACKINGSTORE: D3dkmtStandardallocationtype = 2

public val D3DKMT_STANDARDALLOCATIONTYPE_MAX: D3dkmtStandardallocationtype = 3

public val D3DKMT_SUBKEY_DX9: Pcwstr = w("DX9")

public val D3DKMT_SUBKEY_OPENGL: Pcwstr = w("OpenGL")

public val D3DKMT_SIGNAL_COMMAND_BUFFER: D3dkmtQuerystatisticsQueuePacketType = 5

public val D3DKMT_SOFTWARE_COMMAND_BUFFER: D3dkmtQuerystatisticsQueuePacketType = 7

public val D3DKMT_SYSTEM_COMMAND_BUFFER: D3dkmtQuerystatisticsQueuePacketType = 2

public val D3DKMT_SYSTEM_PAGING_BUFFER: D3dkmtQuerystatisticsDmaPacketType = 2

public val D3DKMT_SYSTEM_PREEMPTION_BUFFER: D3dkmtQuerystatisticsDmaPacketType = 3

public val D3DKMT_TDRDBGCTRLTYPE_DISABLEBREAK: D3dkmtTdrdbgctrltype = 1

public val D3DKMT_TDRDBGCTRLTYPE_ENABLEBREAK: D3dkmtTdrdbgctrltype = 2

public val D3DKMT_TDRDBGCTRLTYPE_ENGINETDR: D3dkmtTdrdbgctrltype = 8

public val D3DKMT_TDRDBGCTRLTYPE_FORCEDODTDR: D3dkmtTdrdbgctrltype = 6

public val D3DKMT_TDRDBGCTRLTYPE_FORCEDODVSYNCTDR: D3dkmtTdrdbgctrltype = 7

public val D3DKMT_TDRDBGCTRLTYPE_FORCETDR: D3dkmtTdrdbgctrltype = 0

public val D3DKMT_TDRDBGCTRLTYPE_GPUTDR: D3dkmtTdrdbgctrltype = 5

public val D3DKMT_TDRDBGCTRLTYPE_UNCONDITIONAL: D3dkmtTdrdbgctrltype = 3

public val D3DKMT_TDRDBGCTRLTYPE_VSYNCTDR: D3dkmtTdrdbgctrltype = 4

public val D3DKMT_VAD_ESCAPE_GETNUMVADS: D3dkmtVadEscapeCommand = 0

public val D3DKMT_VAD_ESCAPE_GETVAD: D3dkmtVadEscapeCommand = 1

public val D3DKMT_VAD_ESCAPE_GETVADRANGE: D3dkmtVadEscapeCommand = 2

public val D3DKMT_VAD_ESCAPE_GET_GPUMMU_CAPS: D3dkmtVadEscapeCommand = 4

public val D3DKMT_VAD_ESCAPE_GET_PTE: D3dkmtVadEscapeCommand = 3

public val D3DKMT_VAD_ESCAPE_GET_SEGMENT_CAPS: D3dkmtVadEscapeCommand = 5

public val D3DKMT_VERIFIER_OPTION_QUERY: D3dkmtVerifierOptionMode = 0

public val D3DKMT_VERIFIER_OPTION_SET: D3dkmtVerifierOptionMode = 1

public val D3DKMT_VIDMMESCAPETYPE_APERTURE_CORRUPTION_CHECK: D3dkmtVidmmescapetype = 3

public val D3DKMT_VIDMMESCAPETYPE_DEFRAG: D3dkmtVidmmescapetype = 15

public val D3DKMT_VIDMMESCAPETYPE_DELAYEXECUTION: D3dkmtVidmmescapetype = 16

public val D3DKMT_VIDMMESCAPETYPE_EVICT: D3dkmtVidmmescapetype = 5

public val D3DKMT_VIDMMESCAPETYPE_EVICT_BY_CRITERIA: D3dkmtVidmmescapetype = 13

public val D3DKMT_VIDMMESCAPETYPE_EVICT_BY_NT_HANDLE: D3dkmtVidmmescapetype = 6

public val D3DKMT_VIDMMESCAPETYPE_GET_BUDGET: D3dkmtVidmmescapetype = 11

public val D3DKMT_VIDMMESCAPETYPE_GET_VAD_INFO: D3dkmtVidmmescapetype = 7

public val D3DKMT_VIDMMESCAPETYPE_RESUME_PROCESS: D3dkmtVidmmescapetype = 10

public val D3DKMT_VIDMMESCAPETYPE_RUN_COHERENCY_TEST: D3dkmtVidmmescapetype = 1

public val D3DKMT_VIDMMESCAPETYPE_RUN_UNMAP_TO_DUMMY_PAGE_TEST: D3dkmtVidmmescapetype = 2

public val D3DKMT_VIDMMESCAPETYPE_SETFAULT: D3dkmtVidmmescapetype = 0

public val D3DKMT_VIDMMESCAPETYPE_SET_BUDGET: D3dkmtVidmmescapetype = 8

public val D3DKMT_VIDMMESCAPETYPE_SET_EVICTION_CONFIG: D3dkmtVidmmescapetype = 18

public val D3DKMT_VIDMMESCAPETYPE_SET_TRIM_INTERVALS: D3dkmtVidmmescapetype = 12

public val D3DKMT_VIDMMESCAPETYPE_SUSPEND_CPU_ACCESS_TEST: D3dkmtVidmmescapetype = 4

public val D3DKMT_VIDMMESCAPETYPE_SUSPEND_PROCESS: D3dkmtVidmmescapetype = 9

public val D3DKMT_VIDMMESCAPETYPE_VALIDATE_INTEGRITY: D3dkmtVidmmescapetype = 17

public val D3DKMT_VIDMMESCAPETYPE_WAKE: D3dkmtVidmmescapetype = 14

public val D3DKMT_VIDPNSOURCEOWNER_EMULATED: D3dkmtVidpnsourceownerType = 4

public val D3DKMT_VIDPNSOURCEOWNER_EXCLUSIVE: D3dkmtVidpnsourceownerType = 2

public val D3DKMT_VIDPNSOURCEOWNER_EXCLUSIVEGDI: D3dkmtVidpnsourceownerType = 3

public val D3DKMT_VIDPNSOURCEOWNER_SHARED: D3dkmtVidpnsourceownerType = 1

public val D3DKMT_VIDPNSOURCEOWNER_UNOWNED: D3dkmtVidpnsourceownerType = 0

public val D3DKMT_VIDSCHESCAPETYPE_CONFIGURE_TDR_LIMIT: D3dkmtVidschescapetype = 5

public val D3DKMT_VIDSCHESCAPETYPE_ENABLECONTEXTDELAY: D3dkmtVidschescapetype = 4

public val D3DKMT_VIDSCHESCAPETYPE_PFN_CONTROL: D3dkmtVidschescapetype = 7

public val D3DKMT_VIDSCHESCAPETYPE_PREEMPTIONCONTROL: D3dkmtVidschescapetype = 0

public val D3DKMT_VIDSCHESCAPETYPE_SUSPENDRESUME: D3dkmtVidschescapetype = 3

public val D3DKMT_VIDSCHESCAPETYPE_SUSPENDSCHEDULER: D3dkmtVidschescapetype = 1

public val D3DKMT_VIDSCHESCAPETYPE_TDRCONTROL: D3dkmtVidschescapetype = 2

public val D3DKMT_VIDSCHESCAPETYPE_VGPU_RESET: D3dkmtVidschescapetype = 6

public val D3DKMT_VIDSCHESCAPETYPE_VIRTUAL_REFRESH_RATE: D3dkmtVidschescapetype = 8

public val D3DKMT_WAIT_COMMAND_BUFFER: D3dkmtQuerystatisticsQueuePacketType = 4

public val D3DNTCLEAR_COMPUTERECTS: Int = 8

public val D3DNTDP2OP_ADDDIRTYBOX: D3dnthalDp2operation = 67

public val D3DNTDP2OP_ADDDIRTYRECT: D3dnthalDp2operation = 66

public val D3DNTDP2OP_BLT: D3dnthalDp2operation = 81

public val D3DNTDP2OP_BUFFERBLT: D3dnthalDp2operation = 64

public val D3DNTDP2OP_CLEAR: D3dnthalDp2operation = 42

public val D3DNTDP2OP_CLIPPEDTRIANGLEFAN: D3dnthalDp2operation = 58

public val D3DNTDP2OP_COLORFILL: D3dnthalDp2operation = 82

public val D3DNTDP2OP_COMPOSERECTS: D3dnthalDp2operation = 98

public val D3DNTDP2OP_CREATELIGHT: D3dnthalDp2operation = 35

public val D3DNTDP2OP_CREATEPIXELSHADER: D3dnthalDp2operation = 54

public val D3DNTDP2OP_CREATEQUERY: D3dnthalDp2operation = 84

public val D3DNTDP2OP_CREATEVERTEXSHADER: D3dnthalDp2operation = 45

public val D3DNTDP2OP_CREATEVERTEXSHADERDECL: D3dnthalDp2operation = 71

public val D3DNTDP2OP_CREATEVERTEXSHADERFUNC: D3dnthalDp2operation = 74

public val D3DNTDP2OP_DELETEPIXELSHADER: D3dnthalDp2operation = 55

public val D3DNTDP2OP_DELETEQUERY: D3dnthalDp2operation = 90

public val D3DNTDP2OP_DELETEVERTEXSHADER: D3dnthalDp2operation = 46

public val D3DNTDP2OP_DELETEVERTEXSHADERDECL: D3dnthalDp2operation = 72

public val D3DNTDP2OP_DELETEVERTEXSHADERFUNC: D3dnthalDp2operation = 75

public val D3DNTDP2OP_DRAWINDEXEDPRIMITIVE: D3dnthalDp2operation = 53

public val D3DNTDP2OP_DRAWINDEXEDPRIMITIVE2: D3dnthalDp2operation = 60

public val D3DNTDP2OP_DRAWPRIMITIVE: D3dnthalDp2operation = 52

public val D3DNTDP2OP_DRAWPRIMITIVE2: D3dnthalDp2operation = 59

public val D3DNTDP2OP_DRAWRECTPATCH: D3dnthalDp2operation = 61

public val D3DNTDP2OP_DRAWTRIPATCH: D3dnthalDp2operation = 62

public val D3DNTDP2OP_GENERATEMIPSUBLEVELS: D3dnthalDp2operation = 89

public val D3DNTDP2OP_INDEXEDLINELIST: D3dnthalDp2operation = 2

public val D3DNTDP2OP_INDEXEDLINELIST2: D3dnthalDp2operation = 27

public val D3DNTDP2OP_INDEXEDLINESTRIP: D3dnthalDp2operation = 17

public val D3DNTDP2OP_INDEXEDTRIANGLEFAN: D3dnthalDp2operation = 22

public val D3DNTDP2OP_INDEXEDTRIANGLELIST: D3dnthalDp2operation = 3

public val D3DNTDP2OP_INDEXEDTRIANGLELIST2: D3dnthalDp2operation = 26

public val D3DNTDP2OP_INDEXEDTRIANGLESTRIP: D3dnthalDp2operation = 20

public val D3DNTDP2OP_ISSUEQUERY: D3dnthalDp2operation = 91

public val D3DNTDP2OP_LINELIST: D3dnthalDp2operation = 15

public val D3DNTDP2OP_LINELIST_IMM: D3dnthalDp2operation = 24

public val D3DNTDP2OP_LINESTRIP: D3dnthalDp2operation = 16

public val D3DNTDP2OP_MULTIPLYTRANSFORM: D3dnthalDp2operation = 65

public val D3DNTDP2OP_POINTS: D3dnthalDp2operation = 1

public val D3DNTDP2OP_RENDERSTATE: D3dnthalDp2operation = 8

public val D3DNTDP2OP_RESPONSECONTINUE: D3dnthalDp2operation = 87

public val D3DNTDP2OP_RESPONSEQUERY: D3dnthalDp2operation = 88

public val D3DNTDP2OP_SETCLIPPLANE: D3dnthalDp2operation = 44

public val D3DNTDP2OP_SETCONVOLUTIONKERNELMONO: D3dnthalDp2operation = 97

public val D3DNTDP2OP_SETDEPTHSTENCIL: D3dnthalDp2operation = 86

public val D3DNTDP2OP_SETINDICES: D3dnthalDp2operation = 51

public val D3DNTDP2OP_SETLIGHT: D3dnthalDp2operation = 34

public val D3DNTDP2OP_SETMATERIAL: D3dnthalDp2operation = 33

public val D3DNTDP2OP_SETPALETTE: D3dnthalDp2operation = 30

public val D3DNTDP2OP_SETPIXELSHADER: D3dnthalDp2operation = 56

public val D3DNTDP2OP_SETPIXELSHADERCONST: D3dnthalDp2operation = 57

public val D3DNTDP2OP_SETPIXELSHADERCONSTB: D3dnthalDp2operation = 94

public val D3DNTDP2OP_SETPIXELSHADERCONSTI: D3dnthalDp2operation = 93

public val D3DNTDP2OP_SETPRIORITY: D3dnthalDp2operation = 40

public val D3DNTDP2OP_SETRENDERTARGET: D3dnthalDp2operation = 41

public val D3DNTDP2OP_SETRENDERTARGET2: D3dnthalDp2operation = 85

public val D3DNTDP2OP_SETSCISSORRECT: D3dnthalDp2operation = 79

public val D3DNTDP2OP_SETSTREAMSOURCE: D3dnthalDp2operation = 49

public val D3DNTDP2OP_SETSTREAMSOURCE2: D3dnthalDp2operation = 80

public val D3DNTDP2OP_SETSTREAMSOURCEFREQ: D3dnthalDp2operation = 95

public val D3DNTDP2OP_SETSTREAMSOURCEUM: D3dnthalDp2operation = 50

public val D3DNTDP2OP_SETTEXLOD: D3dnthalDp2operation = 43

public val D3DNTDP2OP_SETTRANSFORM: D3dnthalDp2operation = 36

public val D3DNTDP2OP_SETVERTEXSHADER: D3dnthalDp2operation = 47

public val D3DNTDP2OP_SETVERTEXSHADERCONST: D3dnthalDp2operation = 48

public val D3DNTDP2OP_SETVERTEXSHADERCONSTB: D3dnthalDp2operation = 83

public val D3DNTDP2OP_SETVERTEXSHADERCONSTI: D3dnthalDp2operation = 77

public val D3DNTDP2OP_SETVERTEXSHADERDECL: D3dnthalDp2operation = 73

public val D3DNTDP2OP_SETVERTEXSHADERFUNC: D3dnthalDp2operation = 76

public val D3DNTDP2OP_STATESET: D3dnthalDp2operation = 39

public val D3DNTDP2OP_SURFACEBLT: D3dnthalDp2operation = 96

public val D3DNTDP2OP_TEXBLT: D3dnthalDp2operation = 38

public val D3DNTDP2OP_TEXTURESTAGESTATE: D3dnthalDp2operation = 25

public val D3DNTDP2OP_TRIANGLEFAN: D3dnthalDp2operation = 21

public val D3DNTDP2OP_TRIANGLEFAN_IMM: D3dnthalDp2operation = 23

public val D3DNTDP2OP_TRIANGLELIST: D3dnthalDp2operation = 18

public val D3DNTDP2OP_TRIANGLESTRIP: D3dnthalDp2operation = 19

public val D3DNTDP2OP_UPDATEPALETTE: D3dnthalDp2operation = 31

public val D3DNTDP2OP_VIEWPORTINFO: D3dnthalDp2operation = 28

public val D3DNTDP2OP_VOLUMEBLT: D3dnthalDp2operation = 63

public val D3DNTDP2OP_WINFO: D3dnthalDp2operation = 29

public val D3DNTDP2OP_ZRANGE: D3dnthalDp2operation = 32

public val D3DNTHAL2_CB32_SETRENDERTARGET: Int = 1

public val D3DNTHAL3_CB32_CLEAR2: Int = 1

public val D3DNTHAL3_CB32_DRAWPRIMITIVES2: Int = 8

public val D3DNTHAL3_CB32_RESERVED: Int = 2

public val D3DNTHAL3_CB32_VALIDATETEXTURESTAGESTATE: Int = 4

public val D3DNTHALDP2_EXECUTEBUFFER: Int = 2

public val D3DNTHALDP2_REQCOMMANDBUFSIZE: Int = 32

public val D3DNTHALDP2_REQVERTEXBUFSIZE: Int = 16

public val D3DNTHALDP2_SWAPCOMMANDBUFFER: Int = 8

public val D3DNTHALDP2_SWAPVERTEXBUFFER: Int = 4

public val D3DNTHALDP2_USERMEMVERTICES: Int = 1

public val D3DNTHALDP2_VIDMEMCOMMANDBUF: Int = 128

public val D3DNTHALDP2_VIDMEMVERTEXBUF: Int = 64

public val D3DNTHAL_COL_WEIGHTS: UInt = 2u

public val D3DNTHAL_CONTEXT_BAD: Long = 512L

public val D3DNTHAL_NUMCLIPVERTICES: UInt = 20u

public val D3DNTHAL_OUTOFCONTEXTS: Long = 513L

public val D3DNTHAL_ROW_WEIGHTS: UInt = 1u

public val D3DNTHAL_SCENE_CAPTURE_END: Int = 1

public val D3DNTHAL_SCENE_CAPTURE_START: Int = 0

public val D3DNTHAL_STATESETCREATE: UInt = 5u

public val D3DNTHAL_TSS_MAXSTAGES: UInt = 8u

public val D3DNTHAL_TSS_RENDERSTATEBASE: UInt = 256u

public val D3DNTHAL_TSS_STATESPERSTAGE: UInt = 64u

public val D3DPMISCCAPS_FOGINFVF: Int = 8192

public val D3DPMISCCAPS_LINEPATTERNREP: Int = 4

public val D3DPRASTERCAPS_PAT: Int = 8

public val D3DPRASTERCAPS_STRETCHBLTMULTISAMPLE: Int = 8388608

public val D3DPS_COLOROUT_MAX_V2_0: UInt = 4u

public val D3DPS_COLOROUT_MAX_V2_1: UInt = 4u

public val D3DPS_COLOROUT_MAX_V3_0: UInt = 4u

public val D3DPS_CONSTBOOLREG_MAX_SW_DX9: UInt = 2048u

public val D3DPS_CONSTBOOLREG_MAX_V2_1: UInt = 16u

public val D3DPS_CONSTBOOLREG_MAX_V3_0: UInt = 16u

public val D3DPS_CONSTINTREG_MAX_SW_DX9: UInt = 2048u

public val D3DPS_CONSTINTREG_MAX_V2_1: UInt = 16u

public val D3DPS_CONSTINTREG_MAX_V3_0: UInt = 16u

public val D3DPS_CONSTREG_MAX_DX8: UInt = 8u

public val D3DPS_CONSTREG_MAX_SW_DX9: UInt = 8192u

public val D3DPS_CONSTREG_MAX_V1_1: UInt = 8u

public val D3DPS_CONSTREG_MAX_V1_2: UInt = 8u

public val D3DPS_CONSTREG_MAX_V1_3: UInt = 8u

public val D3DPS_CONSTREG_MAX_V1_4: UInt = 8u

public val D3DPS_CONSTREG_MAX_V2_0: UInt = 32u

public val D3DPS_CONSTREG_MAX_V2_1: UInt = 32u

public val D3DPS_CONSTREG_MAX_V3_0: UInt = 224u

public val D3DPS_INPUTREG_MAX_DX8: UInt = 8u

public val D3DPS_INPUTREG_MAX_SW_DX9: UInt = 14u

public val D3DPS_INPUTREG_MAX_V1_1: UInt = 2u

public val D3DPS_INPUTREG_MAX_V1_2: UInt = 2u

public val D3DPS_INPUTREG_MAX_V1_3: UInt = 2u

public val D3DPS_INPUTREG_MAX_V1_4: UInt = 2u

public val D3DPS_INPUTREG_MAX_V2_0: UInt = 2u

public val D3DPS_INPUTREG_MAX_V2_1: UInt = 2u

public val D3DPS_INPUTREG_MAX_V3_0: UInt = 10u

public val D3DPS_MAXLOOPINITVALUE_V2_1: UInt = 255u

public val D3DPS_MAXLOOPINITVALUE_V3_0: UInt = 255u

public val D3DPS_MAXLOOPITERATIONCOUNT_V2_1: UInt = 255u

public val D3DPS_MAXLOOPITERATIONCOUNT_V3_0: UInt = 255u

public val D3DPS_MAXLOOPSTEP_V2_1: UInt = 128u

public val D3DPS_MAXLOOPSTEP_V3_0: UInt = 128u

public val D3DPS_PREDICATE_MAX_V2_1: UInt = 1u

public val D3DPS_PREDICATE_MAX_V3_0: UInt = 1u

public val D3DPS_TEMPREG_MAX_DX8: UInt = 8u

public val D3DPS_TEMPREG_MAX_V1_1: UInt = 2u

public val D3DPS_TEMPREG_MAX_V1_2: UInt = 2u

public val D3DPS_TEMPREG_MAX_V1_3: UInt = 2u

public val D3DPS_TEMPREG_MAX_V1_4: UInt = 6u

public val D3DPS_TEMPREG_MAX_V2_0: UInt = 12u

public val D3DPS_TEMPREG_MAX_V2_1: UInt = 32u

public val D3DPS_TEMPREG_MAX_V3_0: UInt = 32u

public val D3DPS_TEXTUREREG_MAX_DX8: UInt = 8u

public val D3DPS_TEXTUREREG_MAX_V1_1: UInt = 4u

public val D3DPS_TEXTUREREG_MAX_V1_2: UInt = 4u

public val D3DPS_TEXTUREREG_MAX_V1_3: UInt = 4u

public val D3DPS_TEXTUREREG_MAX_V1_4: UInt = 6u

public val D3DPS_TEXTUREREG_MAX_V2_0: UInt = 8u

public val D3DPS_TEXTUREREG_MAX_V2_1: UInt = 8u

public val D3DPS_TEXTUREREG_MAX_V3_0: UInt = 0u

public val D3DRENDERSTATE_EVICTMANAGEDTEXTURES: UInt = 61u

public val D3DRENDERSTATE_SCENECAPTURE: UInt = 62u

public val D3DRS_DELETERTPATCH: UInt = 169u

public val D3DRS_MAXPIXELSHADERINST: UInt = 197u

public val D3DRS_MAXVERTEXSHADERINST: UInt = 196u

public val D3DTEXF_FLATCUBIC: UInt = 4u

public val D3DTEXF_GAUSSIANCUBIC: UInt = 5u

public val D3DTRANSFORMSTATE_WORLD1_DX7: UInt = 4u

public val D3DTRANSFORMSTATE_WORLD2_DX7: UInt = 5u

public val D3DTRANSFORMSTATE_WORLD3_DX7: UInt = 6u

public val D3DTRANSFORMSTATE_WORLD_DX7: UInt = 1u

public val D3DTSS_TEXTUREMAP: UInt = 0u

public val D3DVSDE_BLENDINDICES: UInt = 2u

public val D3DVSDE_BLENDWEIGHT: UInt = 1u

public val D3DVSDE_DIFFUSE: UInt = 5u

public val D3DVSDE_NORMAL: UInt = 3u

public val D3DVSDE_NORMAL2: UInt = 16u

public val D3DVSDE_POSITION: UInt = 0u

public val D3DVSDE_POSITION2: UInt = 15u

public val D3DVSDE_PSIZE: UInt = 4u

public val D3DVSDE_SPECULAR: UInt = 6u

public val D3DVSDE_TEXCOORD0: UInt = 7u

public val D3DVSDE_TEXCOORD1: UInt = 8u

public val D3DVSDE_TEXCOORD2: UInt = 9u

public val D3DVSDE_TEXCOORD3: UInt = 10u

public val D3DVSDE_TEXCOORD4: UInt = 11u

public val D3DVSDE_TEXCOORD5: UInt = 12u

public val D3DVSDE_TEXCOORD6: UInt = 13u

public val D3DVSDE_TEXCOORD7: UInt = 14u

public val D3DVSDT_D3DCOLOR: UInt = 4u

public val D3DVSDT_FLOAT1: UInt = 0u

public val D3DVSDT_FLOAT2: UInt = 1u

public val D3DVSDT_FLOAT3: UInt = 2u

public val D3DVSDT_FLOAT4: UInt = 3u

public val D3DVSDT_SHORT2: UInt = 6u

public val D3DVSDT_SHORT4: UInt = 7u

public val D3DVSDT_UBYTE4: UInt = 5u

public val D3DVSD_CONSTADDRESSSHIFT: UInt = 0u

public val D3DVSD_CONSTCOUNTSHIFT: UInt = 25u

public val D3DVSD_CONSTRSSHIFT: UInt = 16u

public val D3DVSD_DATALOADTYPESHIFT: UInt = 28u

public val D3DVSD_DATATYPESHIFT: UInt = 16u

public val D3DVSD_EXTCOUNTSHIFT: UInt = 24u

public val D3DVSD_EXTINFOSHIFT: UInt = 0u

public val D3DVSD_SKIPCOUNTSHIFT: UInt = 16u

public val D3DVSD_STREAMNUMBERSHIFT: UInt = 0u

public val D3DVSD_STREAMTESSSHIFT: UInt = 28u

public val D3DVSD_TOKENTYPESHIFT: UInt = 29u

public val D3DVSD_TOKEN_CONSTMEM: D3dvsdTokentype = 4

public val D3DVSD_TOKEN_END: D3dvsdTokentype = 7

public val D3DVSD_TOKEN_EXT: D3dvsdTokentype = 5

public val D3DVSD_TOKEN_NOP: D3dvsdTokentype = 0

public val D3DVSD_TOKEN_STREAM: D3dvsdTokentype = 1

public val D3DVSD_TOKEN_STREAMDATA: D3dvsdTokentype = 2

public val D3DVSD_TOKEN_TESSELLATOR: D3dvsdTokentype = 3

public val D3DVSD_VERTEXREGINSHIFT: UInt = 20u

public val D3DVSD_VERTEXREGSHIFT: UInt = 0u

public val D3DVS_ADDRREG_MAX_V1_1: UInt = 1u

public val D3DVS_ADDRREG_MAX_V2_0: UInt = 1u

public val D3DVS_ADDRREG_MAX_V2_1: UInt = 1u

public val D3DVS_ADDRREG_MAX_V3_0: UInt = 1u

public val D3DVS_ATTROUTREG_MAX_V1_1: UInt = 2u

public val D3DVS_ATTROUTREG_MAX_V2_0: UInt = 2u

public val D3DVS_ATTROUTREG_MAX_V2_1: UInt = 2u

public val D3DVS_CONSTBOOLREG_MAX_SW_DX9: UInt = 2048u

public val D3DVS_CONSTBOOLREG_MAX_V2_0: UInt = 16u

public val D3DVS_CONSTBOOLREG_MAX_V2_1: UInt = 16u

public val D3DVS_CONSTBOOLREG_MAX_V3_0: UInt = 16u

public val D3DVS_CONSTINTREG_MAX_SW_DX9: UInt = 2048u

public val D3DVS_CONSTINTREG_MAX_V2_0: UInt = 16u

public val D3DVS_CONSTINTREG_MAX_V2_1: UInt = 16u

public val D3DVS_CONSTINTREG_MAX_V3_0: UInt = 16u

public val D3DVS_CONSTREG_MAX_V1_1: UInt = 96u

public val D3DVS_CONSTREG_MAX_V2_0: UInt = 8192u

public val D3DVS_CONSTREG_MAX_V2_1: UInt = 8192u

public val D3DVS_CONSTREG_MAX_V3_0: UInt = 8192u

public val D3DVS_INPUTREG_MAX_V1_1: UInt = 16u

public val D3DVS_INPUTREG_MAX_V2_0: UInt = 16u

public val D3DVS_INPUTREG_MAX_V2_1: UInt = 16u

public val D3DVS_INPUTREG_MAX_V3_0: UInt = 16u

public val D3DVS_LABEL_MAX_V3_0: UInt = 2048u

public val D3DVS_MAXINSTRUCTIONCOUNT_V1_1: UInt = 128u

public val D3DVS_MAXLOOPINITVALUE_V2_0: UInt = 255u

public val D3DVS_MAXLOOPINITVALUE_V2_1: UInt = 255u

public val D3DVS_MAXLOOPINITVALUE_V3_0: UInt = 255u

public val D3DVS_MAXLOOPITERATIONCOUNT_V2_0: UInt = 255u

public val D3DVS_MAXLOOPITERATIONCOUNT_V2_1: UInt = 255u

public val D3DVS_MAXLOOPITERATIONCOUNT_V3_0: UInt = 255u

public val D3DVS_MAXLOOPSTEP_V2_0: UInt = 128u

public val D3DVS_MAXLOOPSTEP_V2_1: UInt = 128u

public val D3DVS_MAXLOOPSTEP_V3_0: UInt = 128u

public val D3DVS_OUTPUTREG_MAX_SW_DX9: UInt = 16u

public val D3DVS_OUTPUTREG_MAX_V3_0: UInt = 12u

public val D3DVS_PREDICATE_MAX_V2_1: UInt = 1u

public val D3DVS_PREDICATE_MAX_V3_0: UInt = 1u

public val D3DVS_TCRDOUTREG_MAX_V1_1: UInt = 8u

public val D3DVS_TCRDOUTREG_MAX_V2_0: UInt = 8u

public val D3DVS_TCRDOUTREG_MAX_V2_1: UInt = 8u

public val D3DVS_TEMPREG_MAX_V1_1: UInt = 12u

public val D3DVS_TEMPREG_MAX_V2_0: UInt = 12u

public val D3DVS_TEMPREG_MAX_V2_1: UInt = 32u

public val D3DVS_TEMPREG_MAX_V3_0: UInt = 32u

public val D3DVTXPCAPS_NO_VSDT_UBYTE4: Int = 128

public val D3D_UMD_INTERFACE_VERSION: UInt = 65536u

public val D3D_UMD_INTERFACE_VERSION_VISTA: UInt = 12u

public val D3D_UMD_INTERFACE_VERSION_WDDM1_3: UInt = 16386u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_0: UInt = 20482u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_0_M1: UInt = 20480u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_0_M1_3: UInt = 20481u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_0_M2_2: UInt = 20482u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_1: UInt = 24579u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_1_1: UInt = 24576u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_1_2: UInt = 24577u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_1_3: UInt = 24578u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_1_4: UInt = 24579u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_2: UInt = 28673u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_2_1: UInt = 28672u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_2_2: UInt = 28673u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_3: UInt = 32769u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_3_1: UInt = 32768u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_3_2: UInt = 32769u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_4: UInt = 36865u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_4_1: UInt = 36864u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_4_2: UInt = 36865u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_5: UInt = 40962u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_5_1: UInt = 40960u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_5_2: UInt = 40961u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_5_3: UInt = 40962u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_6: UInt = 45059u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_6_1: UInt = 45056u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_6_2: UInt = 45057u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_6_3: UInt = 45058u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_6_4: UInt = 45059u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_7: UInt = 49153u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_7_1: UInt = 49152u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_7_2: UInt = 49153u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_8: UInt = 53248u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_8_1: UInt = 53248u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_9: UInt = 57344u

public val D3D_UMD_INTERFACE_VERSION_WDDM2_9_1: UInt = 57344u

public val D3D_UMD_INTERFACE_VERSION_WDDM3_0: UInt = 61440u

public val D3D_UMD_INTERFACE_VERSION_WDDM3_0_1: UInt = 61440u

public val D3D_UMD_INTERFACE_VERSION_WDDM3_1: UInt = 65536u

public val D3D_UMD_INTERFACE_VERSION_WDDM3_1_1: UInt = 65536u

public val D3D_UMD_INTERFACE_VERSION_WIN7: UInt = 8195u

public val D3D_UMD_INTERFACE_VERSION_WIN8: UInt = 12292u

public val D3D_UMD_INTERFACE_VERSION_WIN8_CP: UInt = 12290u

public val D3D_UMD_INTERFACE_VERSION_WIN8_M3: UInt = 12289u

public val D3D_UMD_INTERFACE_VERSION_WIN8_RC: UInt = 12291u

public val DDBLT_EXTENDED_PRESENTATION_STRETCHFACTOR: Int = 16

public val DIDDT1_ASPECT_RATIO_15X9: DisplayidDetailedTimingTypeIAspectRatio = 3

public val DIDDT1_ASPECT_RATIO_16X10: DisplayidDetailedTimingTypeIAspectRatio = 5

public val DIDDT1_ASPECT_RATIO_16X9: DisplayidDetailedTimingTypeIAspectRatio = 4

public val DIDDT1_ASPECT_RATIO_1X1: DisplayidDetailedTimingTypeIAspectRatio = 0

public val DIDDT1_ASPECT_RATIO_4X3: DisplayidDetailedTimingTypeIAspectRatio = 2

public val DIDDT1_ASPECT_RATIO_5X4: DisplayidDetailedTimingTypeIAspectRatio = 1

public val DIDDT1_DEPENDENT: DisplayidDetailedTimingTypeIStereoMode = 2

public val DIDDT1_INTERLACED: DisplayidDetailedTimingTypeIScanningMode = 1

public val DIDDT1_MONOSCOPIC: DisplayidDetailedTimingTypeIStereoMode = 0

public val DIDDT1_PROGRESSIVE: DisplayidDetailedTimingTypeIScanningMode = 0

public val DIDDT1_STEREO: DisplayidDetailedTimingTypeIStereoMode = 1

public val DIDDT1_SYNC_NEGATIVE: DisplayidDetailedTimingTypeISyncPolarity = 1

public val DIDDT1_SYNC_POSITIVE: DisplayidDetailedTimingTypeISyncPolarity = 0

public val DISPLAYID_DETAILED_TIMING_TYPE_I_SIZE: UInt = 20u

public val DP2BLT_LINEAR: Int = 2

public val DP2BLT_POINT: Int = 1

public val DX9_DDI_VERSION: UInt = 4u

public val DXGKDDI_INTERFACE_VERSION: UInt = 65540u

public val DXGKDDI_INTERFACE_VERSION_VISTA: UInt = 4178u

public val DXGKDDI_INTERFACE_VERSION_VISTA_SP1: UInt = 4179u

public val DXGKDDI_INTERFACE_VERSION_WDDM1_3: UInt = 16386u

public val DXGKDDI_INTERFACE_VERSION_WDDM1_3_PATH_INDEPENDENT_ROTATION: UInt = 16387u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_0: UInt = 20515u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_1: UInt = 24579u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_1_5: UInt = 24592u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_1_6: UInt = 24593u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_2: UInt = 28682u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_3: UInt = 32769u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_4: UInt = 36870u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_5: UInt = 40971u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_6: UInt = 45060u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_7: UInt = 49156u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_8: UInt = 53249u

public val DXGKDDI_INTERFACE_VERSION_WDDM2_9: UInt = 57347u

public val DXGKDDI_INTERFACE_VERSION_WDDM3_0: UInt = 61443u

public val DXGKDDI_INTERFACE_VERSION_WDDM3_1: UInt = 65540u

public val DXGKDDI_INTERFACE_VERSION_WIN7: UInt = 8197u

public val DXGKDDI_INTERFACE_VERSION_WIN8: UInt = 12302u

public val DXGKMDT_COPP_CERTIFICATE: DxgkmdtCertificateType = 1

public val DXGKMDT_I2C_DEVICE_TRANSMITS_DATA_LENGTH: UInt = 1u

public val DXGKMDT_I2C_NO_FLAGS: UInt = 0u

public val DXGKMDT_INDIRECT_DISPLAY_CERTIFICATE: DxgkmdtCertificateType = 3

public val DXGKMDT_OPM_128_BIT_RANDOM_NUMBER_SIZE: UInt = 16u

public val DXGKMDT_OPM_ACP_LEVEL_ONE: DxgkmdtOpmAcpProtectionLevel = 1

public val DXGKMDT_OPM_ACP_LEVEL_THREE: DxgkmdtOpmAcpProtectionLevel = 3

public val DXGKMDT_OPM_ACP_LEVEL_TWO: DxgkmdtOpmAcpProtectionLevel = 2

public val DXGKMDT_OPM_ACP_OFF: DxgkmdtOpmAcpProtectionLevel = 0

public val DXGKMDT_OPM_ASPECT_RATIO_EN300294_BOX_14_BY_9_CENTER: DxgkmdtOpmImageAspectRatioEn300294 = 1

public val DXGKMDT_OPM_ASPECT_RATIO_EN300294_BOX_14_BY_9_TOP: DxgkmdtOpmImageAspectRatioEn300294 = 2

public val DXGKMDT_OPM_ASPECT_RATIO_EN300294_BOX_16_BY_9_CENTER: DxgkmdtOpmImageAspectRatioEn300294 = 3

public val DXGKMDT_OPM_ASPECT_RATIO_EN300294_BOX_16_BY_9_TOP: DxgkmdtOpmImageAspectRatioEn300294 = 4

public val DXGKMDT_OPM_ASPECT_RATIO_EN300294_BOX_GT_16_BY_9_CENTER: DxgkmdtOpmImageAspectRatioEn300294 = 5

public val DXGKMDT_OPM_ASPECT_RATIO_EN300294_FULL_FORMAT_16_BY_9_ANAMORPHIC: DxgkmdtOpmImageAspectRatioEn300294 = 7

public val DXGKMDT_OPM_ASPECT_RATIO_EN300294_FULL_FORMAT_4_BY_3: DxgkmdtOpmImageAspectRatioEn300294 = 0

public val DXGKMDT_OPM_ASPECT_RATIO_EN300294_FULL_FORMAT_4_BY_3_PROTECTED_CENTER: DxgkmdtOpmImageAspectRatioEn300294 = 6

public val DXGKMDT_OPM_BUS_IMPLEMENTATION_MODIFIER_DAUGHTER_BOARD_CONNECTOR: DxgkmdtOpmBusTypeAndImplementation = 262144

public val DXGKMDT_OPM_BUS_IMPLEMENTATION_MODIFIER_DAUGHTER_BOARD_CONNECTOR_INSIDE_OF_NUAE: DxgkmdtOpmBusTypeAndImplementation = 327680

public val DXGKMDT_OPM_BUS_IMPLEMENTATION_MODIFIER_INSIDE_OF_CHIPSET: DxgkmdtOpmBusTypeAndImplementation = 65536

public val DXGKMDT_OPM_BUS_IMPLEMENTATION_MODIFIER_NON_STANDARD: DxgkmdtOpmBusTypeAndImplementation = -2147483648.toInt()

public val DXGKMDT_OPM_BUS_IMPLEMENTATION_MODIFIER_TRACKS_ON_MOTHER_BOARD_TO_CHIP: DxgkmdtOpmBusTypeAndImplementation = 131072

public val DXGKMDT_OPM_BUS_IMPLEMENTATION_MODIFIER_TRACKS_ON_MOTHER_BOARD_TO_SOCKET: DxgkmdtOpmBusTypeAndImplementation = 196608

public val DXGKMDT_OPM_BUS_TYPE_AGP: DxgkmdtOpmBusTypeAndImplementation = 4

public val DXGKMDT_OPM_BUS_TYPE_OTHER: DxgkmdtOpmBusTypeAndImplementation = 0

public val DXGKMDT_OPM_BUS_TYPE_PCI: DxgkmdtOpmBusTypeAndImplementation = 1

public val DXGKMDT_OPM_BUS_TYPE_PCIEXPRESS: DxgkmdtOpmBusTypeAndImplementation = 3

public val DXGKMDT_OPM_BUS_TYPE_PCIX: DxgkmdtOpmBusTypeAndImplementation = 2

public val DXGKMDT_OPM_CERTIFICATE: DxgkmdtCertificateType = 0

public val DXGKMDT_OPM_CGMSA_COPY_FREELY: DxgkmdtOpmCgmsa = 1

public val DXGKMDT_OPM_CGMSA_COPY_NEVER: DxgkmdtOpmCgmsa = 4

public val DXGKMDT_OPM_CGMSA_COPY_NO_MORE: DxgkmdtOpmCgmsa = 2

public val DXGKMDT_OPM_CGMSA_COPY_ONE_GENERATION: DxgkmdtOpmCgmsa = 3

public val DXGKMDT_OPM_CGMSA_OFF: DxgkmdtOpmCgmsa = 0

public val DXGKMDT_OPM_CONFIGURE_SETTING_DATA_SIZE: UInt = 4056u

public val DXGKMDT_OPM_CONNECTOR_TYPE_COMPONENT_VIDEO: DxgkmdtOpmConnectorType = 3

public val DXGKMDT_OPM_CONNECTOR_TYPE_COMPOSITE_VIDEO: DxgkmdtOpmConnectorType = 2

public val DXGKMDT_OPM_CONNECTOR_TYPE_DISPLAYPORT_EMBEDDED: DxgkmdtOpmConnectorType = 11

public val DXGKMDT_OPM_CONNECTOR_TYPE_DISPLAYPORT_EXTERNAL: DxgkmdtOpmConnectorType = 10

public val DXGKMDT_OPM_CONNECTOR_TYPE_DVI: DxgkmdtOpmConnectorType = 4

public val DXGKMDT_OPM_CONNECTOR_TYPE_D_JPN: DxgkmdtOpmConnectorType = 8

public val DXGKMDT_OPM_CONNECTOR_TYPE_HD15: DxgkmdtOpmConnectorType = 0

public val DXGKMDT_OPM_CONNECTOR_TYPE_HDMI: DxgkmdtOpmConnectorType = 5

public val DXGKMDT_OPM_CONNECTOR_TYPE_LVDS: DxgkmdtOpmConnectorType = 6

public val DXGKMDT_OPM_CONNECTOR_TYPE_MIRACAST: DxgkmdtOpmConnectorType = 15

public val DXGKMDT_OPM_CONNECTOR_TYPE_OTHER: DxgkmdtOpmConnectorType = -1

public val DXGKMDT_OPM_CONNECTOR_TYPE_RESERVED: DxgkmdtOpmConnectorType = 14

public val DXGKMDT_OPM_CONNECTOR_TYPE_SDI: DxgkmdtOpmConnectorType = 9

public val DXGKMDT_OPM_CONNECTOR_TYPE_SVIDEO: DxgkmdtOpmConnectorType = 1

public val DXGKMDT_OPM_CONNECTOR_TYPE_TRANSPORT_AGNOSTIC_DIGITAL_MODE_A: DxgkmdtOpmConnectorType = 16

public val DXGKMDT_OPM_CONNECTOR_TYPE_TRANSPORT_AGNOSTIC_DIGITAL_MODE_B: DxgkmdtOpmConnectorType = 17

public val DXGKMDT_OPM_CONNECTOR_TYPE_UDI_EMBEDDED: DxgkmdtOpmConnectorType = 13

public val DXGKMDT_OPM_CONNECTOR_TYPE_UDI_EXTERNAL: DxgkmdtOpmConnectorType = 12

public val DXGKMDT_OPM_COPP_COMPATIBLE_BUS_TYPE_INTEGRATED: DxgkmdtOpmBusTypeAndImplementation = -2147483648.toInt()

public val DXGKMDT_OPM_COPP_COMPATIBLE_CONNECTOR_TYPE_INTERNAL: DxgkmdtOpmConnectorType = -2147483648.toInt()

public val DXGKMDT_OPM_DPCP_OFF: DxgkmdtOpmDpcpProtectionLevel = 0

public val DXGKMDT_OPM_DPCP_ON: DxgkmdtOpmDpcpProtectionLevel = 1

public val DXGKMDT_OPM_DVI_CHARACTERISTIC_1_0: DxgkdtOpmDviCharacteristics = 1

public val DXGKMDT_OPM_DVI_CHARACTERISTIC_1_1_OR_ABOVE: DxgkdtOpmDviCharacteristics = 2

public val DXGKMDT_OPM_ENCRYPTED_PARAMETERS_SIZE: UInt = 256u

public val DXGKMDT_OPM_GET_ACP_AND_CGMSA_SIGNALING: Guid = Guid.fromU128(U128(0x6629a5913b794cf3uL, 0x924a11e8e7811671uL))

public val DXGKMDT_OPM_GET_ACTUAL_OUTPUT_FORMAT: Guid = Guid.fromU128(U128(0xd7bf1ba3ad134f8euL, 0xaf980dcb3ca204ccuL))

public val DXGKMDT_OPM_GET_ACTUAL_PROTECTION_LEVEL: Guid = Guid.fromU128(U128(0x1957210a7766452auL, 0xb99ad27aed54f03auL))

public val DXGKMDT_OPM_GET_ADAPTER_BUS_TYPE: Guid = Guid.fromU128(U128(0xc6f4d67361744184uL, 0x8e35f6db5200bcbauL))

public val DXGKMDT_OPM_GET_CODEC_INFO: Guid = Guid.fromU128(U128(0x4f3744918f5f4445uL, 0x9dba95588f6b58b4uL))

public val DXGKMDT_OPM_GET_CONNECTED_HDCP_DEVICE_INFORMATION: Guid = Guid.fromU128(U128(0xdb59d74a992492euL, 0xa0bdc23fda564e00uL))

public val DXGKMDT_OPM_GET_CONNECTOR_TYPE: Guid = Guid.fromU128(U128(0x81d0bfd56afe48c2uL, 0x99c095a08f97c5dauL))

public val DXGKMDT_OPM_GET_CURRENT_HDCP_SRM_VERSION: Guid = Guid.fromU128(U128(0x99c5ceff5f1d4879uL, 0x81c1c52443c9482buL))

public val DXGKMDT_OPM_GET_DVI_CHARACTERISTICS: Guid = Guid.fromU128(U128(0xa470b3bb5dd74172uL, 0x839c3d3776e0ebf5uL))

public val DXGKMDT_OPM_GET_INFORMATION_PARAMETERS_SIZE: UInt = 4056u

public val DXGKMDT_OPM_GET_OUTPUT_HARDWARE_PROTECTION_SUPPORT: Guid = Guid.fromU128(U128(0x3b1295892af84ef0uL, 0x96a2704a845a218euL))

public val DXGKMDT_OPM_GET_OUTPUT_ID: Guid = Guid.fromU128(U128(0x72cb6df3244f40ceuL, 0xb09e20506af6302fuL))

public val DXGKMDT_OPM_GET_SUPPORTED_PROTECTION_TYPES: Guid = Guid.fromU128(U128(0x38f2a8019a6c48bbuL, 0x9107b6696e6f1797uL))

public val DXGKMDT_OPM_GET_VIRTUAL_PROTECTION_LEVEL: Guid = Guid.fromU128(U128(0xb20758573eda4d5duL, 0x88db748f8c1a0549uL))

public val DXGKMDT_OPM_HDCP_FLAG_NONE: DxgkmdtOpmHdcpFlag = 0

public val DXGKMDT_OPM_HDCP_FLAG_REPEATER: DxgkmdtOpmHdcpFlag = 1

public val DXGKMDT_OPM_HDCP_KEY_SELECTION_VECTOR_SIZE: UInt = 5u

public val DXGKMDT_OPM_HDCP_OFF: DxgkmdtOpmHdcpProtectionLevel = 0

public val DXGKMDT_OPM_HDCP_ON: DxgkmdtOpmHdcpProtectionLevel = 1

public val DXGKMDT_OPM_INTERLEAVE_FORMAT_INTERLEAVED_EVEN_FIRST: DxgkmdtOpmInterleaveFormat = 3

public val DXGKMDT_OPM_INTERLEAVE_FORMAT_INTERLEAVED_ODD_FIRST: DxgkmdtOpmInterleaveFormat = 4

public val DXGKMDT_OPM_INTERLEAVE_FORMAT_OTHER: DxgkmdtOpmInterleaveFormat = 0

public val DXGKMDT_OPM_INTERLEAVE_FORMAT_PROGRESSIVE: DxgkmdtOpmInterleaveFormat = 2

public val DXGKMDT_OPM_OMAC_SIZE: UInt = 16u

public val DXGKMDT_OPM_OUTPUT_HARDWARE_PROTECTION_NOT_SUPPORTED: DxgkmdtOpmOutputHardwareProtection = 0

public val DXGKMDT_OPM_OUTPUT_HARDWARE_PROTECTION_SUPPORTED: DxgkmdtOpmOutputHardwareProtection = 1

public val DXGKMDT_OPM_PROTECTION_STANDARD_ARIBTRB15_1125I: DxgkmdtOpmProtectionStandard = 16384

public val DXGKMDT_OPM_PROTECTION_STANDARD_ARIBTRB15_525I: DxgkmdtOpmProtectionStandard = 2048

public val DXGKMDT_OPM_PROTECTION_STANDARD_ARIBTRB15_525P: DxgkmdtOpmProtectionStandard = 4096

public val DXGKMDT_OPM_PROTECTION_STANDARD_ARIBTRB15_750P: DxgkmdtOpmProtectionStandard = 8192

public val DXGKMDT_OPM_PROTECTION_STANDARD_CEA805A_TYPEA_1125I: DxgkmdtOpmProtectionStandard = 128

public val DXGKMDT_OPM_PROTECTION_STANDARD_CEA805A_TYPEA_525P: DxgkmdtOpmProtectionStandard = 32

public val DXGKMDT_OPM_PROTECTION_STANDARD_CEA805A_TYPEA_750P: DxgkmdtOpmProtectionStandard = 64

public val DXGKMDT_OPM_PROTECTION_STANDARD_CEA805A_TYPEB_1125I: DxgkmdtOpmProtectionStandard = 1024

public val DXGKMDT_OPM_PROTECTION_STANDARD_CEA805A_TYPEB_525P: DxgkmdtOpmProtectionStandard = 256

public val DXGKMDT_OPM_PROTECTION_STANDARD_CEA805A_TYPEB_750P: DxgkmdtOpmProtectionStandard = 512

public val DXGKMDT_OPM_PROTECTION_STANDARD_EIA608B_525: DxgkmdtOpmProtectionStandard = 8

public val DXGKMDT_OPM_PROTECTION_STANDARD_EN300294_625I: DxgkmdtOpmProtectionStandard = 16

public val DXGKMDT_OPM_PROTECTION_STANDARD_IEC61880_2_525I: DxgkmdtOpmProtectionStandard = 2

public val DXGKMDT_OPM_PROTECTION_STANDARD_IEC61880_525I: DxgkmdtOpmProtectionStandard = 1

public val DXGKMDT_OPM_PROTECTION_STANDARD_IEC62375_625P: DxgkmdtOpmProtectionStandard = 4

public val DXGKMDT_OPM_PROTECTION_STANDARD_NONE: DxgkmdtOpmProtectionStandard = 0

public val DXGKMDT_OPM_PROTECTION_STANDARD_OTHER: DxgkmdtOpmProtectionStandard = -2147483648.toInt()

public val DXGKMDT_OPM_PROTECTION_TYPE_ACP: DxgkmdtOpmProtectionType = 2

public val DXGKMDT_OPM_PROTECTION_TYPE_CGMSA: DxgkmdtOpmProtectionType = 4

public val DXGKMDT_OPM_PROTECTION_TYPE_COPP_COMPATIBLE_HDCP: DxgkmdtOpmProtectionType = 1

public val DXGKMDT_OPM_PROTECTION_TYPE_DPCP: DxgkmdtOpmProtectionType = 16

public val DXGKMDT_OPM_PROTECTION_TYPE_HDCP: DxgkmdtOpmProtectionType = 8

public val DXGKMDT_OPM_PROTECTION_TYPE_MASK: DxgkmdtOpmProtectionType = -2147483585

public val DXGKMDT_OPM_PROTECTION_TYPE_NONE: DxgkmdtOpmProtectionType = 0

public val DXGKMDT_OPM_PROTECTION_TYPE_OTHER: DxgkmdtOpmProtectionType = -2147483648.toInt()

public val DXGKMDT_OPM_PROTECTION_TYPE_SIZE: UInt = 4u

public val DXGKMDT_OPM_PROTECTION_TYPE_TYPE_ENFORCEMENT_HDCP: DxgkmdtOpmProtectionType = 32

public val DXGKMDT_OPM_REDISTRIBUTION_CONTROL_REQUIRED: DxgkmdtOpmCgmsa = 8

public val DXGKMDT_OPM_REQUESTED_INFORMATION_SIZE: UInt = 4076u

public val DXGKMDT_OPM_SET_ACP_AND_CGMSA_SIGNALING: Guid = Guid.fromU128(U128(0x9a631a5d6844c60uL, 0x8e4dd3bb0f0be3eeuL))

public val DXGKMDT_OPM_SET_HDCP_SRM: Guid = Guid.fromU128(U128(0x8b5ef5d1c30d44ffuL, 0x84a5ea71dce78f13uL))

public val DXGKMDT_OPM_SET_PROTECTION_LEVEL: Guid = Guid.fromU128(U128(0x9bb9327c4eb54727uL, 0x9f00b42b0919c0dauL))

public val DXGKMDT_OPM_SET_PROTECTION_LEVEL_ACCORDING_TO_CSS_DVD: Guid = Guid.fromU128(U128(0x39ce333e4cc044aeuL, 0xbfccda50b5f82e72uL))

public val DXGKMDT_OPM_STATUS_LINK_LOST: DxgkmdtOpmStatus = 1

public val DXGKMDT_OPM_STATUS_NORMAL: DxgkmdtOpmStatus = 0

public val DXGKMDT_OPM_STATUS_RENEGOTIATION_REQUIRED: DxgkmdtOpmStatus = 2

public val DXGKMDT_OPM_STATUS_REVOKED_HDCP_DEVICE_ATTACHED: DxgkmdtOpmStatus = 8

public val DXGKMDT_OPM_STATUS_TAMPERING_DETECTED: DxgkmdtOpmStatus = 4

public val DXGKMDT_OPM_TYPE_ENFORCEMENT_HDCP_OFF: DxgkmdtOpmTypeEnforcementHdcpProtectionLevel = 0

public val DXGKMDT_OPM_TYPE_ENFORCEMENT_HDCP_ON_WITH_NO_TYPE_RESTRICTION: DxgkmdtOpmTypeEnforcementHdcpProtectionLevel = 1

public val DXGKMDT_OPM_TYPE_ENFORCEMENT_HDCP_ON_WITH_TYPE1_RESTRICTION: DxgkmdtOpmTypeEnforcementHdcpProtectionLevel = 2

public val DXGKMDT_OPM_VOS_COPP_SEMANTICS: DxgkmdtOpmVideoOutputSemantics = 0

public val DXGKMDT_OPM_VOS_OPM_INDIRECT_DISPLAY: DxgkmdtOpmVideoOutputSemantics = 2

public val DXGKMDT_OPM_VOS_OPM_SEMANTICS: DxgkmdtOpmVideoOutputSemantics = 1

public val DXGKMDT_UAB_CERTIFICATE: DxgkmdtCertificateType = 2

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FLIP_FRAME0: DxgkmtMultiplaneOverlayStereoFlipMode = 1

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FLIP_FRAME1: DxgkmtMultiplaneOverlayStereoFlipMode = 2

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FLIP_NONE: DxgkmtMultiplaneOverlayStereoFlipMode = 0

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT_CHECKERBOARD: D3dkmtMultiplaneOverlayStereoFormat = 7

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT_COLUMN_INTERLEAVED: D3dkmtMultiplaneOverlayStereoFormat = 6

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT_MONO: D3dkmtMultiplaneOverlayStereoFormat = 0

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT_MONO_OFFSET: D3dkmtMultiplaneOverlayStereoFormat = 4

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT_ROW_INTERLEAVED: D3dkmtMultiplaneOverlayStereoFormat = 5

public val DXGKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT_SEPARATE: D3dkmtMultiplaneOverlayStereoFormat = 3

public val DXGKMT_MULTIPLANE_OVERLAY_STRETCH_QUALITY_BILINEAR: DxgkmtMultiplaneOverlayStretchQuality = 1

public val DXGKMT_MULTIPLANE_OVERLAY_STRETCH_QUALITY_HIGH: DxgkmtMultiplaneOverlayStretchQuality = 2

public val DXGKMT_POWER_SHARED_TYPE_AUDIO: DxgkmtPowerSharedType = 0

public val DXGKVGPU_ESCAPE_TYPE_GET_VGPU_TYPE: DxgkvgpuEscapeType = 4

public val DXGKVGPU_ESCAPE_TYPE_INITIALIZE: DxgkvgpuEscapeType = 2

public val DXGKVGPU_ESCAPE_TYPE_PAUSE: DxgkvgpuEscapeType = 6

public val DXGKVGPU_ESCAPE_TYPE_POWERTRANSITIONCOMPLETE: DxgkvgpuEscapeType = 5

public val DXGKVGPU_ESCAPE_TYPE_READ_PCI_CONFIG: DxgkvgpuEscapeType = 0

public val DXGKVGPU_ESCAPE_TYPE_RELEASE: DxgkvgpuEscapeType = 3

public val DXGKVGPU_ESCAPE_TYPE_RESUME: DxgkvgpuEscapeType = 7

public val DXGKVGPU_ESCAPE_TYPE_WRITE_PCI_CONFIG: DxgkvgpuEscapeType = 1

public val DXGK_BRIGHTNESS_MAXIMUM_NIT_RANGE_COUNT: UInt = 16u

public val DXGK_DDT_DISPLAYID: DxgkDisplayDescriptorType = 2u.toUByte()

public val DXGK_DDT_EDID: DxgkDisplayDescriptorType = 1u.toUByte()

public val DXGK_DDT_INVALID: DxgkDisplayDescriptorType = 0u.toUByte()

public val DXGK_DIAG_PROCESS_NAME_LENGTH: UInt = 16u

public val DXGK_DT_INVALID: DxgkDisplayTechnology = 0u.toUByte()

public val DXGK_DT_LCD: DxgkDisplayTechnology = 2u.toUByte()

public val DXGK_DT_MAX: DxgkDisplayTechnology = 5u.toUByte()

public val DXGK_DT_OLED: DxgkDisplayTechnology = 3u.toUByte()

public val DXGK_DT_OTHER: DxgkDisplayTechnology = 1u.toUByte()

public val DXGK_DT_PROJECTOR: DxgkDisplayTechnology = 4u.toUByte()

public val DXGK_DU_ACCESSORY: DxgkDisplayUsage = 5u.toUByte()

public val DXGK_DU_AR: DxgkDisplayUsage = 2u.toUByte()

public val DXGK_DU_GENERIC: DxgkDisplayUsage = 1u.toUByte()

public val DXGK_DU_INVALID: DxgkDisplayUsage = 0u.toUByte()

public val DXGK_DU_MAX: DxgkDisplayUsage = 6u.toUByte()

public val DXGK_DU_MEDICAL_IMAGING: DxgkDisplayUsage = 4u.toUByte()

public val DXGK_DU_VR: DxgkDisplayUsage = 3u.toUByte()

public val DXGK_ENGINE_TYPE_3D: DxgkEngineType = 1

public val DXGK_ENGINE_TYPE_COPY: DxgkEngineType = 6

public val DXGK_ENGINE_TYPE_CRYPTO: DxgkEngineType = 8

public val DXGK_ENGINE_TYPE_MAX: DxgkEngineType = 9

public val DXGK_ENGINE_TYPE_OTHER: DxgkEngineType = 0

public val DXGK_ENGINE_TYPE_OVERLAY: DxgkEngineType = 7

public val DXGK_ENGINE_TYPE_SCENE_ASSEMBLY: DxgkEngineType = 5

public val DXGK_ENGINE_TYPE_VIDEO_DECODE: DxgkEngineType = 2

public val DXGK_ENGINE_TYPE_VIDEO_ENCODE: DxgkEngineType = 3

public val DXGK_ENGINE_TYPE_VIDEO_PROCESSING: DxgkEngineType = 4

public val DXGK_GENERAL_ERROR_INVALID_INSTRUCTION: DxgkGeneralErrorCode = 1

public val DXGK_GENERAL_ERROR_PAGE_FAULT: DxgkGeneralErrorCode = 0

public val DXGK_GRAPHICSPOWER_VERSION: UInt = 4098u

public val DXGK_GRAPHICSPOWER_VERSION_1_0: UInt = 4096u

public val DXGK_GRAPHICSPOWER_VERSION_1_1: UInt = 4097u

public val DXGK_GRAPHICSPOWER_VERSION_1_2: UInt = 4098u

public val DXGK_MAX_GPUVERSION_NAME_LENGTH: UInt = 32u
