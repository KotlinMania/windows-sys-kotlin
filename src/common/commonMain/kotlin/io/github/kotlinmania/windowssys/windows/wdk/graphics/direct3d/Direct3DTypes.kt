package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT

public typealias D3DDDIFORMAT = UInt

public typealias D3DDDIGPUVIRTUALADDRESS_RESERVATION_TYPE = Int

public typealias D3DDDIMULTISAMPLE_TYPE = Int

public typealias D3DDDI_COLOR_SPACE_TYPE = Int

public typealias D3DDDI_DOORBELLSTATUS = Int

public typealias D3DDDI_DRIVERESCAPETYPE = Int

public typealias D3DDDI_FLIPINTERVAL_TYPE = Int

public typealias D3DDDI_GAMMARAMP_TYPE = Int

public typealias D3DDDI_HDR_METADATA_TYPE = Int

public typealias D3DDDI_OFFER_PRIORITY = Int

public typealias D3DDDI_OUTPUT_WIRE_COLOR_SPACE_TYPE = Int

public typealias D3DDDI_PAGINGQUEUE_PRIORITY = Int

public typealias D3DDDI_POOL = Int

public typealias D3DDDI_QUERYREGISTRY_STATUS = Int

public typealias D3DDDI_QUERYREGISTRY_TYPE = Int

public typealias D3DDDI_RECLAIM_RESULT = Int

public typealias D3DDDI_ROTATION = Int

public typealias D3DDDI_SCANLINEORDERING = Int

public typealias D3DDDI_SYNCHRONIZATIONOBJECT_TYPE = Int

public typealias D3DDDI_UPDATEGPUVIRTUALADDRESS_OPERATION_TYPE = Int

public typealias D3DDDI_VIDEO_SIGNAL_SCANLINE_ORDERING = Int

public typealias D3DHAL_DP2OPERATION = Int

public typealias D3DKMDT_COLORSPACE_TRANSFORM_STAGE_CONTROL = Int

public typealias D3DKMDT_COLOR_BASIS = Int

public typealias D3DKMDT_COMPUTE_PREEMPTION_GRANULARITY = Int

public typealias D3DKMDT_ENUMCOFUNCMODALITY_PIVOT_TYPE = Int

public typealias D3DKMDT_GDISURFACETYPE = Int

public typealias D3DKMDT_GRAPHICS_PREEMPTION_GRANULARITY = Int

public typealias D3DKMDT_GTFCOMPLIANCE = Int

public typealias D3DKMDT_MODE_PREFERENCE = Int

public typealias D3DKMDT_MODE_PRUNING_REASON = Int

public typealias D3DKMDT_MONITOR_CAPABILITIES_ORIGIN = Int

public typealias D3DKMDT_MONITOR_CONNECTIVITY_CHECKS = Int

public typealias D3DKMDT_MONITOR_DESCRIPTOR_TYPE = Int

public typealias D3DKMDT_MONITOR_FREQUENCY_RANGE_CONSTRAINT = Int

public typealias D3DKMDT_MONITOR_ORIENTATION = Int

public typealias D3DKMDT_MONITOR_ORIENTATION_AWARENESS = Int

public typealias D3DKMDT_MONITOR_TIMING_TYPE = Int

public typealias D3DKMDT_PIXEL_VALUE_ACCESS_MODE = Int

public typealias D3DKMDT_STANDARDALLOCATION_TYPE = Int

public typealias D3DKMDT_TEXT_RENDERING_FORMAT = Int

public typealias D3DKMDT_VIDEO_OUTPUT_TECHNOLOGY = Int

public typealias D3DKMDT_VIDEO_SIGNAL_STANDARD = Int

public typealias D3DKMDT_VIDPN_PRESENT_PATH_CONTENT = Int

public typealias D3DKMDT_VIDPN_PRESENT_PATH_COPYPROTECTION_TYPE = Int

public typealias D3DKMDT_VIDPN_PRESENT_PATH_IMPORTANCE = Int

public typealias D3DKMDT_VIDPN_PRESENT_PATH_ROTATION = Int

public typealias D3DKMDT_VIDPN_PRESENT_PATH_SCALING = Int

public typealias D3DKMDT_VIDPN_SOURCE_MODE_TYPE = Int

public typealias D3DKMT_ACTIVATE_SPECIFIC_DIAG_TYPE = Int

public typealias D3DKMT_ADAPTER_VERIFIER_OPTION_TYPE = Int

public typealias D3DKMT_ALLOCATIONRESIDENCYSTATUS = Int

public typealias D3DKMT_AUXILIARYPRESENTINFO_TYPE = Int

public typealias D3DKMT_BRIGHTNESS_INFO_TYPE = Int

public typealias D3DKMT_CANCEL_PRESENTS_OPERATION = Int

public typealias D3DKMT_CLIENTHINT = Int

public typealias D3DKMT_CROSSADAPTERRESOURCE_SUPPORT_TIER = Int

public typealias D3DKMT_DEFRAG_ESCAPE_OPERATION = Int

public typealias D3DKMT_DEVICEESCAPE_TYPE = Int

public typealias D3DKMT_DEVICEEXECUTION_STATE = Int

public typealias D3DKMT_DEVICESTATE_TYPE = Int

public typealias D3DKMT_DEVICE_ERROR_REASON = Int

public typealias D3DKMT_DMMESCAPETYPE = Int

public typealias D3DKMT_DRIVERVERSION = Int

public typealias D3DKMT_ESCAPETYPE = Int

public typealias D3DKMT_ESCAPE_PFN_CONTROL_COMMAND = Int

public typealias D3DKMT_ESCAPE_VIRTUAL_REFRESH_RATE_TYPE = Int

public typealias D3DKMT_FLIPMODEL_INDEPENDENT_FLIP_STAGE = Int

public typealias D3DKMT_GPU_PREFERENCE_QUERY_STATE = Int

public typealias D3DKMT_GPU_PREFERENCE_QUERY_TYPE = Int

public typealias D3DKMT_MEMORY_SEGMENT_GROUP = Int

public typealias D3DKMT_MIRACAST_DEVICE_STATUS = Int

public typealias D3DKMT_MIRACAST_DISPLAY_DEVICE_STATE = Int

public typealias D3DKMT_MIRACAST_DRIVER_TYPE = Int

public typealias D3DKMT_MULTIPLANE_OVERLAY_BLEND = Int

public typealias D3DKMT_MULTIPLANE_OVERLAY_FLAGS = Int

public typealias D3DKMT_MULTIPLANE_OVERLAY_STEREO_FORMAT = Int

public typealias D3DKMT_MULTIPLANE_OVERLAY_VIDEO_FRAME_FORMAT = Int

public typealias D3DKMT_MULTIPLANE_OVERLAY_YCbCr_FLAGS = Int

public typealias D3DKMT_OFFER_PRIORITY = Int

public typealias D3DKMT_OUTDUPL_POINTER_SHAPE_TYPE = Int

public typealias D3DKMT_OUTPUTDUPL_METADATATYPE = Int

public typealias D3DKMT_PNP_KEY_TYPE = Int

public typealias D3DKMT_PRESENT_MODEL = Int

public typealias D3DKMT_PROCESS_VERIFIER_OPTION_TYPE = Int

public typealias D3DKMT_PROTECTED_SESSION_STATUS = Int

public typealias D3DKMT_QUERYRESULT_PREEMPTION_ATTEMPT_RESULT = Int

public typealias D3DKMT_QUERYSTATISTICS_ALLOCATION_PRIORITY_CLASS = Int

public typealias D3DKMT_QUERYSTATISTICS_DMA_PACKET_TYPE = Int

public typealias D3DKMT_QUERYSTATISTICS_QUEUE_PACKET_TYPE = Int

public typealias D3DKMT_QUERYSTATISTICS_SEGMENT_TYPE = Int

public typealias D3DKMT_QUERYSTATISTICS_TYPE = Int

public typealias D3DKMT_QUEUEDLIMIT_TYPE = Int

public typealias D3DKMT_SCHEDULINGPRIORITYCLASS = Int

public typealias D3DKMT_STANDARDALLOCATIONTYPE = Int

public typealias D3DKMT_TDRDBGCTRLTYPE = Int

public typealias D3DKMT_VAD_ESCAPE_COMMAND = Int

public typealias D3DKMT_VERIFIER_OPTION_MODE = Int

public typealias D3DKMT_VIDMMESCAPETYPE = Int

public typealias D3DKMT_VIDPNSOURCEOWNER_TYPE = Int

public typealias D3DKMT_VIDSCHESCAPETYPE = Int

public typealias D3DNTHAL_DP2OPERATION = Int

public typealias D3DVSD_TOKENTYPE = Int

public typealias DISPLAYID_DETAILED_TIMING_TYPE_I_ASPECT_RATIO = Int

public typealias DISPLAYID_DETAILED_TIMING_TYPE_I_SCANNING_MODE = Int

public typealias DISPLAYID_DETAILED_TIMING_TYPE_I_STEREO_MODE = Int

public typealias DISPLAYID_DETAILED_TIMING_TYPE_I_SYNC_POLARITY = Int

public typealias DXGKDT_OPM_DVI_CHARACTERISTICS = Int

public typealias DXGKMDT_CERTIFICATE_TYPE = Int

public typealias DXGKMDT_OPM_ACP_PROTECTION_LEVEL = Int

public typealias DXGKMDT_OPM_BUS_TYPE_AND_IMPLEMENTATION = Int

public typealias DXGKMDT_OPM_CGMSA = Int

public typealias DXGKMDT_OPM_CONNECTOR_TYPE = Int

public typealias DXGKMDT_OPM_DPCP_PROTECTION_LEVEL = Int

public typealias DXGKMDT_OPM_HDCP_FLAG = Int

public typealias DXGKMDT_OPM_HDCP_PROTECTION_LEVEL = Int

public typealias DXGKMDT_OPM_IMAGE_ASPECT_RATIO_EN300294 = Int

public typealias DXGKMDT_OPM_INTERLEAVE_FORMAT = Int

public typealias DXGKMDT_OPM_OUTPUT_HARDWARE_PROTECTION = Int

public typealias DXGKMDT_OPM_PROTECTION_STANDARD = Int

public typealias DXGKMDT_OPM_PROTECTION_TYPE = Int

public typealias DXGKMDT_OPM_STATUS = Int

public typealias DXGKMDT_OPM_TYPE_ENFORCEMENT_HDCP_PROTECTION_LEVEL = Int

public typealias DXGKMDT_OPM_VIDEO_OUTPUT_SEMANTICS = Int

public typealias DXGKMT_MULTIPLANE_OVERLAY_STEREO_FLIP_MODE = Int

public typealias DXGKMT_MULTIPLANE_OVERLAY_STRETCH_QUALITY = Int

public typealias DXGKMT_POWER_SHARED_TYPE = Int

public typealias DXGKVGPU_ESCAPE_TYPE = Int

public typealias DXGK_BACKLIGHT_OPTIMIZATION_LEVEL = Int

public typealias DXGK_CHILD_DEVICE_HPD_AWARENESS = Int

public typealias DXGK_DISPLAY_DESCRIPTOR_TYPE = UByte

public typealias DXGK_DISPLAY_TECHNOLOGY = UByte

public typealias DXGK_DISPLAY_USAGE = UByte

public typealias DXGK_ENGINE_TYPE = Int

public typealias DXGK_GENERAL_ERROR_CODE = Int

public typealias DXGK_MIRACAST_CHUNK_TYPE = Int

public typealias DXGK_PAGE_FAULT_FLAGS = Int

public typealias DXGK_PTE_PAGE_SIZE = Int

public typealias DXGK_RENDER_PIPELINE_STAGE = Int

public typealias KMTQUERYADAPTERINFOTYPE = Int

public typealias KMTUMDVERSION = Int

public typealias KMT_DISPLAY_UMD_VERSION = Int

public fun interface LPD3DHAL_CONTEXTDESTROYALLCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DHAL_CONTEXTDESTROYALLCB = LPD3DHAL_CONTEXTDESTROYALLCBFn?

public fun interface LPD3DHAL_CONTEXTDESTROYCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DHAL_CONTEXTDESTROYCB = LPD3DHAL_CONTEXTDESTROYCBFn?

public fun interface LPD3DHAL_DRAWPRIMITIVESCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DHAL_DRAWPRIMITIVESCB = LPD3DHAL_DRAWPRIMITIVESCBFn?

public fun interface LPD3DHAL_SCENECAPTURECBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DHAL_SCENECAPTURECB = LPD3DHAL_SCENECAPTURECBFn?

public fun interface LPD3DHAL_TEXTUREDESTROYCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DHAL_TEXTUREDESTROYCB = LPD3DHAL_TEXTUREDESTROYCBFn?

public fun interface LPD3DHAL_TEXTUREGETSURFCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DHAL_TEXTUREGETSURFCB = LPD3DHAL_TEXTUREGETSURFCBFn?

public fun interface LPD3DHAL_TEXTURESWAPCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DHAL_TEXTURESWAPCB = LPD3DHAL_TEXTURESWAPCBFn?

public fun interface LPD3DHAL_VALIDATETEXTURESTAGESTATECBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DHAL_VALIDATETEXTURESTAGESTATECB = LPD3DHAL_VALIDATETEXTURESTAGESTATECBFn?

public fun interface LPD3DNTHAL_CONTEXTDESTROYALLCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DNTHAL_CONTEXTDESTROYALLCB = LPD3DNTHAL_CONTEXTDESTROYALLCBFn?

public fun interface LPD3DNTHAL_CONTEXTDESTROYCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DNTHAL_CONTEXTDESTROYCB = LPD3DNTHAL_CONTEXTDESTROYCBFn?

public fun interface LPD3DNTHAL_SCENECAPTURECBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DNTHAL_SCENECAPTURECB = LPD3DNTHAL_SCENECAPTURECBFn?

public fun interface LPD3DNTHAL_TEXTURECREATECBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DNTHAL_TEXTURECREATECB = LPD3DNTHAL_TEXTURECREATECBFn?

public fun interface LPD3DNTHAL_TEXTUREDESTROYCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DNTHAL_TEXTUREDESTROYCB = LPD3DNTHAL_TEXTUREDESTROYCBFn?

public fun interface LPD3DNTHAL_TEXTUREGETSURFCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DNTHAL_TEXTUREGETSURFCB = LPD3DNTHAL_TEXTUREGETSURFCBFn?

public fun interface LPD3DNTHAL_TEXTURESWAPCBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DNTHAL_TEXTURESWAPCB = LPD3DNTHAL_TEXTURESWAPCBFn?

public fun interface LPD3DNTHAL_VALIDATETEXTURESTAGESTATECBFn {
    public operator fun invoke(param0: Long): UInt
}

public typealias LPD3DNTHAL_VALIDATETEXTURESTAGESTATECB = LPD3DNTHAL_VALIDATETEXTURESTAGESTATECBFn?

public typealias OUTPUTDUPL_CONTEXT_DEBUG_STATUS = Int

public fun interface PDXGK_FSTATE_NOTIFICATIONFn {
    public operator fun invoke(graphicsdevicehandle: Long, componentindex: UInt, newfstate: UInt, prenotification: Boolean, privatehandle: Long)
}

public typealias PDXGK_FSTATE_NOTIFICATION = PDXGK_FSTATE_NOTIFICATIONFn?

public fun interface PDXGK_GRAPHICSPOWER_UNREGISTERFn {
    public operator fun invoke(devicehandle: Long, privatehandle: Long): Win32.Foundation.NTSTATUS
}

public typealias PDXGK_GRAPHICSPOWER_UNREGISTER = PDXGK_GRAPHICSPOWER_UNREGISTERFn?

public fun interface PDXGK_INITIAL_COMPONENT_STATEFn {
    public operator fun invoke(graphicsdevicehandle: Long, privatehandle: Long, componentindex: UInt, isblockingtype: Boolean, initialfstate: UInt, componentguid: GUID, powercomponentmappingflag: UInt)
}

public typealias PDXGK_INITIAL_COMPONENT_STATE = PDXGK_INITIAL_COMPONENT_STATEFn?

public fun interface PDXGK_POWER_NOTIFICATIONFn {
    public operator fun invoke(graphicsdevicehandle: Long, newgrfxpowerstate: Win32.System.Power.DEVICE_POWER_STATE, prenotification: Boolean, privatehandle: Long)
}

public typealias PDXGK_POWER_NOTIFICATION = PDXGK_POWER_NOTIFICATIONFn?

public fun interface PDXGK_REMOVAL_NOTIFICATIONFn {
    public operator fun invoke(graphicsdevicehandle: Long, privatehandle: Long)
}

public typealias PDXGK_REMOVAL_NOTIFICATION = PDXGK_REMOVAL_NOTIFICATIONFn?

public fun interface PDXGK_SET_SHARED_POWER_COMPONENT_STATEFn {
    public operator fun invoke(devicehandle: Long, privatehandle: Long, componentindex: UInt, active: Boolean): Win32.Foundation.NTSTATUS
}

public typealias PDXGK_SET_SHARED_POWER_COMPONENT_STATE = PDXGK_SET_SHARED_POWER_COMPONENT_STATEFn?

public fun interface PFND3DKMT_ACQUIREKEYEDMUTEXFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_ACQUIREKEYEDMUTEX = PFND3DKMT_ACQUIREKEYEDMUTEXFn?

public fun interface PFND3DKMT_ACQUIREKEYEDMUTEX2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_ACQUIREKEYEDMUTEX2 = PFND3DKMT_ACQUIREKEYEDMUTEX2Fn?

public fun interface PFND3DKMT_ADJUSTFULLSCREENGAMMAFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_ADJUSTFULLSCREENGAMMA = PFND3DKMT_ADJUSTFULLSCREENGAMMAFn?

public fun interface PFND3DKMT_BUDGETCHANGENOTIFICATIONCALLBACKFn {
    public operator fun invoke(param0: Long)
}

public typealias PFND3DKMT_BUDGETCHANGENOTIFICATIONCALLBACK = PFND3DKMT_BUDGETCHANGENOTIFICATIONCALLBACKFn?

public fun interface PFND3DKMT_CANCELPRESENTSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CANCELPRESENTS = PFND3DKMT_CANCELPRESENTSFn?

public fun interface PFND3DKMT_CHANGESURFACEPOINTERFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHANGESURFACEPOINTER = PFND3DKMT_CHANGESURFACEPOINTERFn?

public fun interface PFND3DKMT_CHANGEVIDEOMEMORYRESERVATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHANGEVIDEOMEMORYRESERVATION = PFND3DKMT_CHANGEVIDEOMEMORYRESERVATIONFn?

public fun interface PFND3DKMT_CHECKEXCLUSIVEOWNERSHIPFn {
    public operator fun invoke(): Boolean
}

public typealias PFND3DKMT_CHECKEXCLUSIVEOWNERSHIP = PFND3DKMT_CHECKEXCLUSIVEOWNERSHIPFn?

public fun interface PFND3DKMT_CHECKMONITORPOWERSTATEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHECKMONITORPOWERSTATE = PFND3DKMT_CHECKMONITORPOWERSTATEFn?

public fun interface PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT = PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORTFn?

public fun interface PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT2 = PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT2Fn?

public fun interface PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT3Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT3 = PFND3DKMT_CHECKMULTIPLANEOVERLAYSUPPORT3Fn?

public fun interface PFND3DKMT_CHECKOCCLUSIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHECKOCCLUSION = PFND3DKMT_CHECKOCCLUSIONFn?

public fun interface PFND3DKMT_CHECKSHAREDRESOURCEACCESSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHECKSHAREDRESOURCEACCESS = PFND3DKMT_CHECKSHAREDRESOURCEACCESSFn?

public fun interface PFND3DKMT_CHECKVIDPNEXCLUSIVEOWNERSHIPFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CHECKVIDPNEXCLUSIVEOWNERSHIP = PFND3DKMT_CHECKVIDPNEXCLUSIVEOWNERSHIPFn?

public fun interface PFND3DKMT_CLOSEADAPTERFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CLOSEADAPTER = PFND3DKMT_CLOSEADAPTERFn?

public fun interface PFND3DKMT_CONFIGURESHAREDRESOURCEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CONFIGURESHAREDRESOURCE = PFND3DKMT_CONFIGURESHAREDRESOURCEFn?

public fun interface PFND3DKMT_CONNECTDOORBELLFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CONNECTDOORBELL = PFND3DKMT_CONNECTDOORBELLFn?

public fun interface PFND3DKMT_CREATEALLOCATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEALLOCATION = PFND3DKMT_CREATEALLOCATIONFn?

public fun interface PFND3DKMT_CREATEALLOCATION2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEALLOCATION2 = PFND3DKMT_CREATEALLOCATION2Fn?

public fun interface PFND3DKMT_CREATECONTEXTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATECONTEXT = PFND3DKMT_CREATECONTEXTFn?

public fun interface PFND3DKMT_CREATECONTEXTVIRTUALFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATECONTEXTVIRTUAL = PFND3DKMT_CREATECONTEXTVIRTUALFn?

public fun interface PFND3DKMT_CREATEDCFROMMEMORYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEDCFROMMEMORY = PFND3DKMT_CREATEDCFROMMEMORYFn?

public fun interface PFND3DKMT_CREATEDEVICEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEDEVICE = PFND3DKMT_CREATEDEVICEFn?

public fun interface PFND3DKMT_CREATEDOORBELLFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEDOORBELL = PFND3DKMT_CREATEDOORBELLFn?

public fun interface PFND3DKMT_CREATEHWQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEHWQUEUE = PFND3DKMT_CREATEHWQUEUEFn?

public fun interface PFND3DKMT_CREATEKEYEDMUTEXFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEKEYEDMUTEX = PFND3DKMT_CREATEKEYEDMUTEXFn?

public fun interface PFND3DKMT_CREATEKEYEDMUTEX2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEKEYEDMUTEX2 = PFND3DKMT_CREATEKEYEDMUTEX2Fn?

public fun interface PFND3DKMT_CREATENATIVEFENCEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATENATIVEFENCE = PFND3DKMT_CREATENATIVEFENCEFn?

public fun interface PFND3DKMT_CREATEOUTPUTDUPLFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEOUTPUTDUPL = PFND3DKMT_CREATEOUTPUTDUPLFn?

public fun interface PFND3DKMT_CREATEOVERLAYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEOVERLAY = PFND3DKMT_CREATEOVERLAYFn?

public fun interface PFND3DKMT_CREATEPAGINGQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEPAGINGQUEUE = PFND3DKMT_CREATEPAGINGQUEUEFn?

public fun interface PFND3DKMT_CREATEPROTECTEDSESSIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATEPROTECTEDSESSION = PFND3DKMT_CREATEPROTECTEDSESSIONFn?

public fun interface PFND3DKMT_CREATESYNCHRONIZATIONOBJECTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATESYNCHRONIZATIONOBJECT = PFND3DKMT_CREATESYNCHRONIZATIONOBJECTFn?

public fun interface PFND3DKMT_CREATESYNCHRONIZATIONOBJECT2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_CREATESYNCHRONIZATIONOBJECT2 = PFND3DKMT_CREATESYNCHRONIZATIONOBJECT2Fn?

public fun interface PFND3DKMT_DESTROYALLOCATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYALLOCATION = PFND3DKMT_DESTROYALLOCATIONFn?

public fun interface PFND3DKMT_DESTROYALLOCATION2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYALLOCATION2 = PFND3DKMT_DESTROYALLOCATION2Fn?

public fun interface PFND3DKMT_DESTROYCONTEXTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYCONTEXT = PFND3DKMT_DESTROYCONTEXTFn?

public fun interface PFND3DKMT_DESTROYDCFROMMEMORYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYDCFROMMEMORY = PFND3DKMT_DESTROYDCFROMMEMORYFn?

public fun interface PFND3DKMT_DESTROYDEVICEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYDEVICE = PFND3DKMT_DESTROYDEVICEFn?

public fun interface PFND3DKMT_DESTROYDOORBELLFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYDOORBELL = PFND3DKMT_DESTROYDOORBELLFn?

public fun interface PFND3DKMT_DESTROYHWQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYHWQUEUE = PFND3DKMT_DESTROYHWQUEUEFn?

public fun interface PFND3DKMT_DESTROYKEYEDMUTEXFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYKEYEDMUTEX = PFND3DKMT_DESTROYKEYEDMUTEXFn?

public fun interface PFND3DKMT_DESTROYOUTPUTDUPLFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYOUTPUTDUPL = PFND3DKMT_DESTROYOUTPUTDUPLFn?

public fun interface PFND3DKMT_DESTROYOVERLAYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYOVERLAY = PFND3DKMT_DESTROYOVERLAYFn?

public fun interface PFND3DKMT_DESTROYPAGINGQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYPAGINGQUEUE = PFND3DKMT_DESTROYPAGINGQUEUEFn?

public fun interface PFND3DKMT_DESTROYPROTECTEDSESSIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYPROTECTEDSESSION = PFND3DKMT_DESTROYPROTECTEDSESSIONFn?

public fun interface PFND3DKMT_DESTROYSYNCHRONIZATIONOBJECTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_DESTROYSYNCHRONIZATIONOBJECT = PFND3DKMT_DESTROYSYNCHRONIZATIONOBJECTFn?

public fun interface PFND3DKMT_ENUMADAPTERSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_ENUMADAPTERS = PFND3DKMT_ENUMADAPTERSFn?

public fun interface PFND3DKMT_ENUMADAPTERS2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_ENUMADAPTERS2 = PFND3DKMT_ENUMADAPTERS2Fn?

public fun interface PFND3DKMT_ENUMADAPTERS3Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_ENUMADAPTERS3 = PFND3DKMT_ENUMADAPTERS3Fn?

public fun interface PFND3DKMT_ESCAPEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_ESCAPE = PFND3DKMT_ESCAPEFn?

public fun interface PFND3DKMT_EVICTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_EVICT = PFND3DKMT_EVICTFn?

public fun interface PFND3DKMT_FLIPOVERLAYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_FLIPOVERLAY = PFND3DKMT_FLIPOVERLAYFn?

public fun interface PFND3DKMT_FLUSHHEAPTRANSITIONSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_FLUSHHEAPTRANSITIONS = PFND3DKMT_FLUSHHEAPTRANSITIONSFn?

public fun interface PFND3DKMT_FREEGPUVIRTUALADDRESSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_FREEGPUVIRTUALADDRESS = PFND3DKMT_FREEGPUVIRTUALADDRESSFn?

public fun interface PFND3DKMT_GETALLOCATIONPRIORITYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETALLOCATIONPRIORITY = PFND3DKMT_GETALLOCATIONPRIORITYFn?

public fun interface PFND3DKMT_GETCONTEXTINPROCESSSCHEDULINGPRIORITYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETCONTEXTINPROCESSSCHEDULINGPRIORITY = PFND3DKMT_GETCONTEXTINPROCESSSCHEDULINGPRIORITYFn?

public fun interface PFND3DKMT_GETCONTEXTSCHEDULINGPRIORITYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETCONTEXTSCHEDULINGPRIORITY = PFND3DKMT_GETCONTEXTSCHEDULINGPRIORITYFn?

public fun interface PFND3DKMT_GETDEVICESTATEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETDEVICESTATE = PFND3DKMT_GETDEVICESTATEFn?

public fun interface PFND3DKMT_GETDISPLAYMODELISTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETDISPLAYMODELIST = PFND3DKMT_GETDISPLAYMODELISTFn?

public fun interface PFND3DKMT_GETDWMVERTICALBLANKEVENTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETDWMVERTICALBLANKEVENT = PFND3DKMT_GETDWMVERTICALBLANKEVENTFn?

public fun interface PFND3DKMT_GETMULTIPLANEOVERLAYCAPSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETMULTIPLANEOVERLAYCAPS = PFND3DKMT_GETMULTIPLANEOVERLAYCAPSFn?

public fun interface PFND3DKMT_GETMULTISAMPLEMETHODLISTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETMULTISAMPLEMETHODLIST = PFND3DKMT_GETMULTISAMPLEMETHODLISTFn?

public fun interface PFND3DKMT_GETOVERLAYSTATEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETOVERLAYSTATE = PFND3DKMT_GETOVERLAYSTATEFn?

public fun interface PFND3DKMT_GETPOSTCOMPOSITIONCAPSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETPOSTCOMPOSITIONCAPS = PFND3DKMT_GETPOSTCOMPOSITIONCAPSFn?

public fun interface PFND3DKMT_GETPRESENTHISTORYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETPRESENTHISTORY = PFND3DKMT_GETPRESENTHISTORYFn?

public fun interface PFND3DKMT_GETPROCESSDEVICEREMOVALSUPPORTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETPROCESSDEVICEREMOVALSUPPORT = PFND3DKMT_GETPROCESSDEVICEREMOVALSUPPORTFn?

public fun interface PFND3DKMT_GETPROCESSSCHEDULINGPRIORITYCLASSFn {
    public operator fun invoke(param0: Win32.Foundation.HANDLE, param1: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETPROCESSSCHEDULINGPRIORITYCLASS = PFND3DKMT_GETPROCESSSCHEDULINGPRIORITYCLASSFn?

public fun interface PFND3DKMT_GETRESOURCEPRESENTPRIVATEDRIVERDATAFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETRESOURCEPRESENTPRIVATEDRIVERDATA = PFND3DKMT_GETRESOURCEPRESENTPRIVATEDRIVERDATAFn?

public fun interface PFND3DKMT_GETRUNTIMEDATAFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETRUNTIMEDATA = PFND3DKMT_GETRUNTIMEDATAFn?

public fun interface PFND3DKMT_GETSCANLINEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETSCANLINE = PFND3DKMT_GETSCANLINEFn?

public fun interface PFND3DKMT_GETSHAREDPRIMARYHANDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETSHAREDPRIMARYHANDLE = PFND3DKMT_GETSHAREDPRIMARYHANDLEFn?

public fun interface PFND3DKMT_GETSHAREDRESOURCEADAPTERLUIDFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_GETSHAREDRESOURCEADAPTERLUID = PFND3DKMT_GETSHAREDRESOURCEADAPTERLUIDFn?

public fun interface PFND3DKMT_INVALIDATEACTIVEVIDPNFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_INVALIDATEACTIVEVIDPN = PFND3DKMT_INVALIDATEACTIVEVIDPNFn?

public fun interface PFND3DKMT_INVALIDATECACHEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_INVALIDATECACHE = PFND3DKMT_INVALIDATECACHEFn?

public fun interface PFND3DKMT_LOCKFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_LOCK = PFND3DKMT_LOCKFn?

public fun interface PFND3DKMT_LOCK2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_LOCK2 = PFND3DKMT_LOCK2Fn?

public fun interface PFND3DKMT_MAKERESIDENTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_MAKERESIDENT = PFND3DKMT_MAKERESIDENTFn?

public fun interface PFND3DKMT_MAPGPUVIRTUALADDRESSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_MAPGPUVIRTUALADDRESS = PFND3DKMT_MAPGPUVIRTUALADDRESSFn?

public fun interface PFND3DKMT_MARKDEVICEASERRORFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_MARKDEVICEASERROR = PFND3DKMT_MARKDEVICEASERRORFn?

public fun interface PFND3DKMT_NOTIFYWORKSUBMISSIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_NOTIFYWORKSUBMISSION = PFND3DKMT_NOTIFYWORKSUBMISSIONFn?

public fun interface PFND3DKMT_OFFERALLOCATIONSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OFFERALLOCATIONS = PFND3DKMT_OFFERALLOCATIONSFn?

public fun interface PFND3DKMT_OPENADAPTERFROMDEVICENAMEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENADAPTERFROMDEVICENAME = PFND3DKMT_OPENADAPTERFROMDEVICENAMEFn?

public fun interface PFND3DKMT_OPENADAPTERFROMGDIDISPLAYNAMEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENADAPTERFROMGDIDISPLAYNAME = PFND3DKMT_OPENADAPTERFROMGDIDISPLAYNAMEFn?

public fun interface PFND3DKMT_OPENADAPTERFROMHDCFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENADAPTERFROMHDC = PFND3DKMT_OPENADAPTERFROMHDCFn?

public fun interface PFND3DKMT_OPENADAPTERFROMLUIDFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENADAPTERFROMLUID = PFND3DKMT_OPENADAPTERFROMLUIDFn?

public fun interface PFND3DKMT_OPENKEYEDMUTEXFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENKEYEDMUTEX = PFND3DKMT_OPENKEYEDMUTEXFn?

public fun interface PFND3DKMT_OPENKEYEDMUTEX2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENKEYEDMUTEX2 = PFND3DKMT_OPENKEYEDMUTEX2Fn?

public fun interface PFND3DKMT_OPENKEYEDMUTEXFROMNTHANDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENKEYEDMUTEXFROMNTHANDLE = PFND3DKMT_OPENKEYEDMUTEXFROMNTHANDLEFn?

public fun interface PFND3DKMT_OPENNATIVEFENCEFROMNTHANDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENNATIVEFENCEFROMNTHANDLE = PFND3DKMT_OPENNATIVEFENCEFROMNTHANDLEFn?

public fun interface PFND3DKMT_OPENNTHANDLEFROMNAMEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENNTHANDLEFROMNAME = PFND3DKMT_OPENNTHANDLEFROMNAMEFn?

public fun interface PFND3DKMT_OPENPROTECTEDSESSIONFROMNTHANDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENPROTECTEDSESSIONFROMNTHANDLE = PFND3DKMT_OPENPROTECTEDSESSIONFROMNTHANDLEFn?

public fun interface PFND3DKMT_OPENRESOURCEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENRESOURCE = PFND3DKMT_OPENRESOURCEFn?

public fun interface PFND3DKMT_OPENRESOURCE2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENRESOURCE2 = PFND3DKMT_OPENRESOURCE2Fn?

public fun interface PFND3DKMT_OPENRESOURCEFROMNTHANDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENRESOURCEFROMNTHANDLE = PFND3DKMT_OPENRESOURCEFROMNTHANDLEFn?

public fun interface PFND3DKMT_OPENSYNCHRONIZATIONOBJECTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENSYNCHRONIZATIONOBJECT = PFND3DKMT_OPENSYNCHRONIZATIONOBJECTFn?

public fun interface PFND3DKMT_OPENSYNCOBJECTFROMNTHANDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENSYNCOBJECTFROMNTHANDLE = PFND3DKMT_OPENSYNCOBJECTFROMNTHANDLEFn?

public fun interface PFND3DKMT_OPENSYNCOBJECTFROMNTHANDLE2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENSYNCOBJECTFROMNTHANDLE2 = PFND3DKMT_OPENSYNCOBJECTFROMNTHANDLE2Fn?

public fun interface PFND3DKMT_OPENSYNCOBJECTNTHANDLEFROMNAMEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OPENSYNCOBJECTNTHANDLEFROMNAME = PFND3DKMT_OPENSYNCOBJECTNTHANDLEFROMNAMEFn?

public fun interface PFND3DKMT_OUTPUTDUPLGETFRAMEINFOFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OUTPUTDUPLGETFRAMEINFO = PFND3DKMT_OUTPUTDUPLGETFRAMEINFOFn?

public fun interface PFND3DKMT_OUTPUTDUPLGETMETADATAFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OUTPUTDUPLGETMETADATA = PFND3DKMT_OUTPUTDUPLGETMETADATAFn?

public fun interface PFND3DKMT_OUTPUTDUPLGETPOINTERSHAPEDATAFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OUTPUTDUPLGETPOINTERSHAPEDATA = PFND3DKMT_OUTPUTDUPLGETPOINTERSHAPEDATAFn?

public fun interface PFND3DKMT_OUTPUTDUPLPRESENTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OUTPUTDUPLPRESENT = PFND3DKMT_OUTPUTDUPLPRESENTFn?

public fun interface PFND3DKMT_OUTPUTDUPLPRESENTTOHWQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OUTPUTDUPLPRESENTTOHWQUEUE = PFND3DKMT_OUTPUTDUPLPRESENTTOHWQUEUEFn?

public fun interface PFND3DKMT_OUTPUTDUPLRELEASEFRAMEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_OUTPUTDUPLRELEASEFRAME = PFND3DKMT_OUTPUTDUPLRELEASEFRAMEFn?

public fun interface PFND3DKMT_PINDIRECTFLIPRESOURCESFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_PINDIRECTFLIPRESOURCES = PFND3DKMT_PINDIRECTFLIPRESOURCESFn?

public fun interface PFND3DKMT_POLLDISPLAYCHILDRENFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_POLLDISPLAYCHILDREN = PFND3DKMT_POLLDISPLAYCHILDRENFn?

public fun interface PFND3DKMT_PRESENTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_PRESENT = PFND3DKMT_PRESENTFn?

public fun interface PFND3DKMT_PRESENTMULTIPLANEOVERLAYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_PRESENTMULTIPLANEOVERLAY = PFND3DKMT_PRESENTMULTIPLANEOVERLAYFn?

public fun interface PFND3DKMT_PRESENTMULTIPLANEOVERLAY2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_PRESENTMULTIPLANEOVERLAY2 = PFND3DKMT_PRESENTMULTIPLANEOVERLAY2Fn?

public fun interface PFND3DKMT_PRESENTMULTIPLANEOVERLAY3Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_PRESENTMULTIPLANEOVERLAY3 = PFND3DKMT_PRESENTMULTIPLANEOVERLAY3Fn?

public fun interface PFND3DKMT_QUERYADAPTERINFOFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYADAPTERINFO = PFND3DKMT_QUERYADAPTERINFOFn?

public fun interface PFND3DKMT_QUERYALLOCATIONRESIDENCYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYALLOCATIONRESIDENCY = PFND3DKMT_QUERYALLOCATIONRESIDENCYFn?

public fun interface PFND3DKMT_QUERYCLOCKCALIBRATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYCLOCKCALIBRATION = PFND3DKMT_QUERYCLOCKCALIBRATIONFn?

public fun interface PFND3DKMT_QUERYFSEBLOCKFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYFSEBLOCK = PFND3DKMT_QUERYFSEBLOCKFn?

public fun interface PFND3DKMT_QUERYHYBRIDLISTVALUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYHYBRIDLISTVALUE = PFND3DKMT_QUERYHYBRIDLISTVALUEFn?

public fun interface PFND3DKMT_QUERYPROCESSOFFERINFOFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYPROCESSOFFERINFO = PFND3DKMT_QUERYPROCESSOFFERINFOFn?

public fun interface PFND3DKMT_QUERYPROTECTEDSESSIONINFOFROMNTHANDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYPROTECTEDSESSIONINFOFROMNTHANDLE = PFND3DKMT_QUERYPROTECTEDSESSIONINFOFROMNTHANDLEFn?

public fun interface PFND3DKMT_QUERYPROTECTEDSESSIONSTATUSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYPROTECTEDSESSIONSTATUS = PFND3DKMT_QUERYPROTECTEDSESSIONSTATUSFn?

public fun interface PFND3DKMT_QUERYREMOTEVIDPNSOURCEFROMGDIDISPLAYNAMEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYREMOTEVIDPNSOURCEFROMGDIDISPLAYNAME = PFND3DKMT_QUERYREMOTEVIDPNSOURCEFROMGDIDISPLAYNAMEFn?

public fun interface PFND3DKMT_QUERYRESOURCEINFOFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYRESOURCEINFO = PFND3DKMT_QUERYRESOURCEINFOFn?

public fun interface PFND3DKMT_QUERYRESOURCEINFOFROMNTHANDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYRESOURCEINFOFROMNTHANDLE = PFND3DKMT_QUERYRESOURCEINFOFROMNTHANDLEFn?

public fun interface PFND3DKMT_QUERYSTATISTICSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYSTATISTICS = PFND3DKMT_QUERYSTATISTICSFn?

public fun interface PFND3DKMT_QUERYVIDEOMEMORYINFOFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYVIDEOMEMORYINFO = PFND3DKMT_QUERYVIDEOMEMORYINFOFn?

public fun interface PFND3DKMT_QUERYVIDPNEXCLUSIVEOWNERSHIPFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_QUERYVIDPNEXCLUSIVEOWNERSHIP = PFND3DKMT_QUERYVIDPNEXCLUSIVEOWNERSHIPFn?

public fun interface PFND3DKMT_RECLAIMALLOCATIONSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_RECLAIMALLOCATIONS = PFND3DKMT_RECLAIMALLOCATIONSFn?

public fun interface PFND3DKMT_RECLAIMALLOCATIONS2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_RECLAIMALLOCATIONS2 = PFND3DKMT_RECLAIMALLOCATIONS2Fn?

public fun interface PFND3DKMT_REGISTERBUDGETCHANGENOTIFICATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_REGISTERBUDGETCHANGENOTIFICATION = PFND3DKMT_REGISTERBUDGETCHANGENOTIFICATIONFn?

public fun interface PFND3DKMT_REGISTERTRIMNOTIFICATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_REGISTERTRIMNOTIFICATION = PFND3DKMT_REGISTERTRIMNOTIFICATIONFn?

public fun interface PFND3DKMT_RELEASEKEYEDMUTEXFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_RELEASEKEYEDMUTEX = PFND3DKMT_RELEASEKEYEDMUTEXFn?

public fun interface PFND3DKMT_RELEASEKEYEDMUTEX2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_RELEASEKEYEDMUTEX2 = PFND3DKMT_RELEASEKEYEDMUTEX2Fn?

public fun interface PFND3DKMT_RELEASEPROCESSVIDPNSOURCEOWNERSFn {
    public operator fun invoke(param0: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_RELEASEPROCESSVIDPNSOURCEOWNERS = PFND3DKMT_RELEASEPROCESSVIDPNSOURCEOWNERSFn?

public fun interface PFND3DKMT_RENDERFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_RENDER = PFND3DKMT_RENDERFn?

public fun interface PFND3DKMT_RESERVEGPUVIRTUALADDRESSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_RESERVEGPUVIRTUALADDRESS = PFND3DKMT_RESERVEGPUVIRTUALADDRESSFn?

public fun interface PFND3DKMT_SETALLOCATIONPRIORITYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETALLOCATIONPRIORITY = PFND3DKMT_SETALLOCATIONPRIORITYFn?

public fun interface PFND3DKMT_SETCONTEXTINPROCESSSCHEDULINGPRIORITYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETCONTEXTINPROCESSSCHEDULINGPRIORITY = PFND3DKMT_SETCONTEXTINPROCESSSCHEDULINGPRIORITYFn?

public fun interface PFND3DKMT_SETCONTEXTSCHEDULINGPRIORITYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETCONTEXTSCHEDULINGPRIORITY = PFND3DKMT_SETCONTEXTSCHEDULINGPRIORITYFn?

public fun interface PFND3DKMT_SETDISPLAYMODEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETDISPLAYMODE = PFND3DKMT_SETDISPLAYMODEFn?

public fun interface PFND3DKMT_SETDISPLAYPRIVATEDRIVERFORMATFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETDISPLAYPRIVATEDRIVERFORMAT = PFND3DKMT_SETDISPLAYPRIVATEDRIVERFORMATFn?

public fun interface PFND3DKMT_SETFSEBLOCKFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETFSEBLOCK = PFND3DKMT_SETFSEBLOCKFn?

public fun interface PFND3DKMT_SETGAMMARAMPFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETGAMMARAMP = PFND3DKMT_SETGAMMARAMPFn?

public fun interface PFND3DKMT_SETHWPROTECTIONTEARDOWNRECOVERYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETHWPROTECTIONTEARDOWNRECOVERY = PFND3DKMT_SETHWPROTECTIONTEARDOWNRECOVERYFn?

public fun interface PFND3DKMT_SETHYBRIDLISTVVALUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETHYBRIDLISTVVALUE = PFND3DKMT_SETHYBRIDLISTVVALUEFn?

public fun interface PFND3DKMT_SETPROCESSSCHEDULINGPRIORITYCLASSFn {
    public operator fun invoke(param0: Win32.Foundation.HANDLE, param1: D3DKMT_SCHEDULINGPRIORITYCLASS): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETPROCESSSCHEDULINGPRIORITYCLASS = PFND3DKMT_SETPROCESSSCHEDULINGPRIORITYCLASSFn?

public fun interface PFND3DKMT_SETQUEUEDLIMITFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETQUEUEDLIMIT = PFND3DKMT_SETQUEUEDLIMITFn?

public fun interface PFND3DKMT_SETSTABLEPOWERSTATEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETSTABLEPOWERSTATE = PFND3DKMT_SETSTABLEPOWERSTATEFn?

public fun interface PFND3DKMT_SETSTEREOENABLEDFn {
    public operator fun invoke(param0: BOOL): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETSTEREOENABLED = PFND3DKMT_SETSTEREOENABLEDFn?

public fun interface PFND3DKMT_SETSYNCREFRESHCOUNTWAITTARGETFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETSYNCREFRESHCOUNTWAITTARGET = PFND3DKMT_SETSYNCREFRESHCOUNTWAITTARGETFn?

public fun interface PFND3DKMT_SETVIDPNSOURCEHWPROTECTIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETVIDPNSOURCEHWPROTECTION = PFND3DKMT_SETVIDPNSOURCEHWPROTECTIONFn?

public fun interface PFND3DKMT_SETVIDPNSOURCEOWNERFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETVIDPNSOURCEOWNER = PFND3DKMT_SETVIDPNSOURCEOWNERFn?

public fun interface PFND3DKMT_SETVIDPNSOURCEOWNER1Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETVIDPNSOURCEOWNER1 = PFND3DKMT_SETVIDPNSOURCEOWNER1Fn?

public fun interface PFND3DKMT_SETVIDPNSOURCEOWNER2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SETVIDPNSOURCEOWNER2 = PFND3DKMT_SETVIDPNSOURCEOWNER2Fn?

public fun interface PFND3DKMT_SHAREDPRIMARYLOCKNOTIFICATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SHAREDPRIMARYLOCKNOTIFICATION = PFND3DKMT_SHAREDPRIMARYLOCKNOTIFICATIONFn?

public fun interface PFND3DKMT_SHAREDPRIMARYUNLOCKNOTIFICATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SHAREDPRIMARYUNLOCKNOTIFICATION = PFND3DKMT_SHAREDPRIMARYUNLOCKNOTIFICATIONFn?

public fun interface PFND3DKMT_SHAREOBJECTSFn {
    public operator fun invoke(cobjects: UInt, hobjects: Long, pobjectattributes: Long, dwdesiredaccess: UInt, phsharednthandle: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SHAREOBJECTS = PFND3DKMT_SHAREOBJECTSFn?

public fun interface PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECT = PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFn?

public fun interface PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECT2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECT2 = PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECT2Fn?

public fun interface PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMCPUFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMCPU = PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMCPUFn?

public fun interface PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPUFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU = PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPUFn?

public fun interface PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU2 = PFND3DKMT_SIGNALSYNCHRONIZATIONOBJECTFROMGPU2Fn?

public fun interface PFND3DKMT_SUBMITCOMMANDFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SUBMITCOMMAND = PFND3DKMT_SUBMITCOMMANDFn?

public fun interface PFND3DKMT_SUBMITCOMMANDTOHWQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SUBMITCOMMANDTOHWQUEUE = PFND3DKMT_SUBMITCOMMANDTOHWQUEUEFn?

public fun interface PFND3DKMT_SUBMITPRESENTBLTTOHWQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SUBMITPRESENTBLTTOHWQUEUE = PFND3DKMT_SUBMITPRESENTBLTTOHWQUEUEFn?

public fun interface PFND3DKMT_SUBMITPRESENTTOHWQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SUBMITPRESENTTOHWQUEUE = PFND3DKMT_SUBMITPRESENTTOHWQUEUEFn?

public fun interface PFND3DKMT_SUBMITSIGNALSYNCOBJECTSTOHWQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SUBMITSIGNALSYNCOBJECTSTOHWQUEUE = PFND3DKMT_SUBMITSIGNALSYNCOBJECTSTOHWQUEUEFn?

public fun interface PFND3DKMT_SUBMITWAITFORSYNCOBJECTSTOHWQUEUEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_SUBMITWAITFORSYNCOBJECTSTOHWQUEUE = PFND3DKMT_SUBMITWAITFORSYNCOBJECTSTOHWQUEUEFn?

public fun interface PFND3DKMT_TRIMNOTIFICATIONCALLBACKFn {
    public operator fun invoke(param0: Long)
}

public typealias PFND3DKMT_TRIMNOTIFICATIONCALLBACK = PFND3DKMT_TRIMNOTIFICATIONCALLBACKFn?

public fun interface PFND3DKMT_TRIMPROCESSCOMMITMENTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_TRIMPROCESSCOMMITMENT = PFND3DKMT_TRIMPROCESSCOMMITMENTFn?

public fun interface PFND3DKMT_UNLOCKFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_UNLOCK = PFND3DKMT_UNLOCKFn?

public fun interface PFND3DKMT_UNLOCK2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_UNLOCK2 = PFND3DKMT_UNLOCK2Fn?

public fun interface PFND3DKMT_UNPINDIRECTFLIPRESOURCESFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_UNPINDIRECTFLIPRESOURCES = PFND3DKMT_UNPINDIRECTFLIPRESOURCESFn?

public fun interface PFND3DKMT_UNREGISTERBUDGETCHANGENOTIFICATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_UNREGISTERBUDGETCHANGENOTIFICATION = PFND3DKMT_UNREGISTERBUDGETCHANGENOTIFICATIONFn?

public fun interface PFND3DKMT_UNREGISTERTRIMNOTIFICATIONFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_UNREGISTERTRIMNOTIFICATION = PFND3DKMT_UNREGISTERTRIMNOTIFICATIONFn?

public fun interface PFND3DKMT_UPDATEALLOCATIONPROPERTYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_UPDATEALLOCATIONPROPERTY = PFND3DKMT_UPDATEALLOCATIONPROPERTYFn?

public fun interface PFND3DKMT_UPDATEGPUVIRTUALADDRESSFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_UPDATEGPUVIRTUALADDRESS = PFND3DKMT_UPDATEGPUVIRTUALADDRESSFn?

public fun interface PFND3DKMT_UPDATEOVERLAYFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_UPDATEOVERLAY = PFND3DKMT_UPDATEOVERLAYFn?

public fun interface PFND3DKMT_WAITFORIDLEFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_WAITFORIDLE = PFND3DKMT_WAITFORIDLEFn?

public fun interface PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECT = PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECTFn?

public fun interface PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECT2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECT2 = PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECT2Fn?

public fun interface PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMCPUFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMCPU = PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMCPUFn?

public fun interface PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMGPUFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMGPU = PFND3DKMT_WAITFORSYNCHRONIZATIONOBJECTFROMGPUFn?

public fun interface PFND3DKMT_WAITFORVERTICALBLANKEVENTFn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_WAITFORVERTICALBLANKEVENT = PFND3DKMT_WAITFORVERTICALBLANKEVENTFn?

public fun interface PFND3DKMT_WAITFORVERTICALBLANKEVENT2Fn {
    public operator fun invoke(param0: Long): Win32.Foundation.NTSTATUS
}

public typealias PFND3DKMT_WAITFORVERTICALBLANKEVENT2 = PFND3DKMT_WAITFORVERTICALBLANKEVENT2Fn?

public fun interface PFND3DNTPARSEUNKNOWNCOMMANDFn {
    public operator fun invoke(lpvcommands: Long, lplpvreturnedcommand: Long): HRESULT
}

public typealias PFND3DNTPARSEUNKNOWNCOMMAND = PFND3DNTPARSEUNKNOWNCOMMANDFn?

public fun interface PFND3DPARSEUNKNOWNCOMMANDFn {
    public operator fun invoke(lpvcommands: Long, lplpvreturnedcommand: Long): HRESULT
}

public typealias PFND3DPARSEUNKNOWNCOMMAND = PFND3DPARSEUNKNOWNCOMMANDFn?
