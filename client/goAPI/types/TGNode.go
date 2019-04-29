/**
 * Copyright 2018-19 TIBCO Software Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not use this file except
 * in compliance with the License.
 * A copy of the License is included in the distribution package with this file.
 * You also may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF DirectionAny KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * File name: TGNode.go
 * Created on: Oct 13, 2018
 * Created by: achavan
 * SVN id: $id: $
 *
 */

package types

type TGNode interface {
	TGEntity
	// Add another Edge to Node
	AddEdge(edge TGEdge)
	// Add another Edge with direction to Node
	AddEdgeWithDirectionType(node TGNode, edgeType TGEdgeType, directionType TGDirectionType) TGEdge
	// Return entire collection edges
	GetEdges() []TGEdge
	// Return collection edges for the direction desc
	GetEdgesForDirectionType(directionType TGDirectionType) []TGEdge
	// Return collection filtered edges
	GetEdgesForEdgeType(edgeType TGEdgeType, direction TGDirection) []TGEdge
}
