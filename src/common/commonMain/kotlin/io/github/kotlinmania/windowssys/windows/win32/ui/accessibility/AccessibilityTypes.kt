package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public typealias AccUtilityStateFlags = UInt

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

public typealias HighcontrastwFlags = UInt

public typealias Huiaevent = COpaquePointer?

public typealias Huianode = COpaquePointer?

public typealias Huiapatternobject = COpaquePointer?

public typealias Huiatextrange = COpaquePointer?

public typealias Hwineventhook = COpaquePointer?

public typealias HorizontalTextAlignment = Int

public fun interface LpfnaccessiblechildrenFn {
    public operator fun invoke(pacccontainer: COpaquePointer?, ichildstart: Int, cchildren: Int, rgvarchildren: COpaquePointer?, pcobtained: COpaquePointer?): Hresult
}

public typealias Lpfnaccessiblechildren = LpfnaccessiblechildrenFn?

public fun interface LpfnaccessibleobjectfrompointFn {
    public operator fun invoke(ptscreen: Point, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult
}

public typealias Lpfnaccessibleobjectfrompoint = LpfnaccessibleobjectfrompointFn?

public fun interface LpfnaccessibleobjectfromwindowFn {
    public operator fun invoke(hwnd: Hwnd, dwid: UInt, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult
}

public typealias Lpfnaccessibleobjectfromwindow = LpfnaccessibleobjectfromwindowFn?

public fun interface LpfncreatestdaccessibleobjectFn {
    public operator fun invoke(hwnd: Hwnd, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult
}

public typealias Lpfncreatestdaccessibleobject = LpfncreatestdaccessibleobjectFn?

public fun interface LpfnlresultfromobjectFn {
    public operator fun invoke(riid: COpaquePointer?, wparam: Wparam, punk: COpaquePointer?): Lresult
}

public typealias Lpfnlresultfromobject = LpfnlresultfromobjectFn?

public fun interface LpfnobjectfromlresultFn {
    public operator fun invoke(lresult: Lresult, riid: COpaquePointer?, wparam: Wparam, ppvobject: COpaquePointer?): Hresult
}

public typealias Lpfnobjectfromlresult = LpfnobjectfromlresultFn?

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

public typealias SerialkeysFlags = UInt

public typealias SoundsentryFlags = UInt

public typealias SoundsentryTextEffect = UInt

public typealias SoundsentryWindowsEffect = UInt

public typealias SoundSentryGraphicsEffect = UInt

public typealias StickykeysFlags = UInt

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

public typealias UiaAnnotationtype = Int

public typealias UiaChangeId = Int

public typealias UiaControltypeId = Int

public typealias UiaEventId = Int

public typealias UiaHeadinglevelId = Int

public typealias UiaLandmarktypeId = Int

public typealias UiaMetadataId = Int

public typealias UiaPatternId = Int

public typealias UiaPropertyId = Int

public typealias UiaStyleId = Int

public typealias UiaTextattributeId = Int

public typealias UIAutomationType = Int

public fun interface UiaEventCallbackFn {
    public operator fun invoke(pargs: COpaquePointer?, prequesteddata: COpaquePointer?, ptreestructure: Bstr)
}

public typealias UiaEventCallback = UiaEventCallbackFn?

public fun interface UiaProviderCallbackFn {
    public operator fun invoke(hwnd: Hwnd, providertype: ProviderType): COpaquePointer?
}

public typealias UiaProviderCallback = UiaProviderCallbackFn?

public typealias VisualEffects = Int

public fun interface WineventprocFn {
    public operator fun invoke(hwineventhook: Hwineventhook, event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int, ideventthread: UInt, dwmseventtime: UInt)
}

public typealias Wineventproc = WineventprocFn?

public typealias WindowInteractionState = Int

public typealias WindowVisualState = Int

public typealias ZoomUnit = Int
