package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT

public typealias ACC_UTILITY_STATE_FLAGS = UInt

public typealias ActiveEnd = Int

public typealias AnimationStyle = Int

public typealias AnnoScope = Int

public typealias AsyncContentLoadedState = Int

public typealias AutomationElementMode = Int

public typealias AutomationIdentifierType = Int

public typealias BulletStyle = Int

public typealias CapStyle = Int

public typealias CaretBidiMode = Int

public typealias CaretPosition = Int

public typealias CoalesceEventsOptions = Int

public typealias ConditionType = Int

public typealias ConnectionRecoveryBehaviorOptions = Int

public typealias DockPosition = Int

public typealias EventArgsType = Int

public typealias ExpandCollapseState = Int

public typealias FillType = Int

public typealias FlowDirections = Int

public typealias HIGHCONTRASTW_FLAGS = UInt

public typealias HUIAEVENT = Long

public typealias HUIANODE = Long

public typealias HUIAPATTERNOBJECT = Long

public typealias HUIATEXTRANGE = Long

public typealias HWINEVENTHOOK = Long

public typealias HorizontalTextAlignment = Int

public fun interface LPFNACCESSIBLECHILDRENFn {
    public operator fun invoke(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): HRESULT
}

public typealias LPFNACCESSIBLECHILDREN = LPFNACCESSIBLECHILDRENFn?

public fun interface LPFNACCESSIBLEOBJECTFROMPOINTFn {
    public operator fun invoke(ptscreen: Foundation.POINT, ppacc: Long, pvarchild: Long): HRESULT
}

public typealias LPFNACCESSIBLEOBJECTFROMPOINT = LPFNACCESSIBLEOBJECTFROMPOINTFn?

public fun interface LPFNACCESSIBLEOBJECTFROMWINDOWFn {
    public operator fun invoke(hwnd: Foundation.HWND, dwid: UInt, riid: Long, ppvobject: Long): HRESULT
}

public typealias LPFNACCESSIBLEOBJECTFROMWINDOW = LPFNACCESSIBLEOBJECTFROMWINDOWFn?

public fun interface LPFNCREATESTDACCESSIBLEOBJECTFn {
    public operator fun invoke(hwnd: Foundation.HWND, idobject: Int, riid: Long, ppvobject: Long): HRESULT
}

public typealias LPFNCREATESTDACCESSIBLEOBJECT = LPFNCREATESTDACCESSIBLEOBJECTFn?

public fun interface LPFNLRESULTFROMOBJECTFn {
    public operator fun invoke(riid: Long, wparam: Foundation.WPARAM, punk: Long): Foundation.LRESULT
}

public typealias LPFNLRESULTFROMOBJECT = LPFNLRESULTFROMOBJECTFn?

public fun interface LPFNOBJECTFROMLRESULTFn {
    public operator fun invoke(lresult: Foundation.LRESULT, riid: Long, wparam: Foundation.WPARAM, ppvobject: Long): HRESULT
}

public typealias LPFNOBJECTFROMLRESULT = LPFNOBJECTFROMLRESULTFn?

public typealias LiveSetting = Int

public typealias NavigateDirection = Int

public typealias NormalizeState = Int

public typealias NotificationKind = Int

public typealias NotificationProcessing = Int

public typealias OrientationType = Int

public typealias OutlineStyles = Int

public typealias PropertyConditionFlags = Int

public typealias ProviderOptions = Int

public typealias ProviderType = Int

public typealias RowOrColumnMajor = Int

public typealias SERIALKEYS_FLAGS = UInt

public typealias SOUNDSENTRY_FLAGS = UInt

public typealias SOUNDSENTRY_TEXT_EFFECT = UInt

public typealias SOUNDSENTRY_WINDOWS_EFFECT = UInt

public typealias SOUND_SENTRY_GRAPHICS_EFFECT = UInt

public typealias STICKYKEYS_FLAGS = UInt

public typealias SayAsInterpretAs = Int

public typealias ScrollAmount = Int

public typealias StructureChangeType = Int

public typealias SupportedTextSelection = Int

public typealias SynchronizedInputType = Int

public typealias TextDecorationLineStyle = Int

public typealias TextEditChangeType = Int

public typealias TextPatternRangeEndpoint = Int

public typealias TextUnit = Int

public typealias ToggleState = Int

public typealias TreeScope = Int

public typealias TreeTraversalOptions = Int

public typealias UIA_ANNOTATIONTYPE = Int

public typealias UIA_CHANGE_ID = Int

public typealias UIA_CONTROLTYPE_ID = Int

public typealias UIA_EVENT_ID = Int

public typealias UIA_HEADINGLEVEL_ID = Int

public typealias UIA_LANDMARKTYPE_ID = Int

public typealias UIA_METADATA_ID = Int

public typealias UIA_PATTERN_ID = Int

public typealias UIA_PROPERTY_ID = Int

public typealias UIA_STYLE_ID = Int

public typealias UIA_TEXTATTRIBUTE_ID = Int

public typealias UIAutomationType = Int

public fun interface UiaEventCallbackFn {
    public operator fun invoke(pargs: Long, prequesteddata: Long, ptreestructure: BSTR)
}

public typealias UiaEventCallback = UiaEventCallbackFn?

public fun interface UiaProviderCallbackFn {
    public operator fun invoke(hwnd: Foundation.HWND, providertype: ProviderType): Long
}

public typealias UiaProviderCallback = UiaProviderCallbackFn?

public typealias VisualEffects = Int

public fun interface WINEVENTPROCFn {
    public operator fun invoke(hwineventhook: HWINEVENTHOOK, event: UInt, hwnd: Foundation.HWND, idobject: Int, idchild: Int, ideventthread: UInt, dwmseventtime: UInt)
}

public typealias WINEVENTPROC = WINEVENTPROCFn?

public typealias WindowInteractionState = Int

public typealias WindowVisualState = Int

public typealias ZoomUnit = Int
